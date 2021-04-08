/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.unicauca.restauranteonline.client.access;

import co.unicauca.restauranteonline.client.infra.RestauranteSocket;
import co.unicauca.restauranteonline.commons.domain.Restaurante;
import co.unicauca.restauranteonline.commons.infra.JsonError;
import co.unicauca.restauranteonline.commons.infra.Protocol;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author GRUPO 5
 */
public class RestauranteAccessImplSockets implements IRestauranteAccess{
    
    /**
     * El servicio utiliza un socket para comunicarse con la aplicación server
     */
    private RestauranteSocket mySocket;

    public RestauranteAccessImplSockets() {
        mySocket = new RestauranteSocket();
    }

    /**
     * Busca un Restaurante. Utiliza socket para pedir el servicio al servidor
     *
     * @param restId id del restaurante
     * @return Objeto Restaurante
     * @throws Exception cuando no pueda conectarse con el servidor
     */
    @Override
    public Restaurante findRestaurante(String restId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Crea un Restaurante. Utiliza socket para pedir el servicio al servidor
     *
     * @param restaurante restaurante
     */
    @Override
    public String createRestaurante(Restaurante restaurante) throws Exception {
        String jsonResponse = null;
        String requestJson = createRestauranteRequestJson(restaurante);
        try {
            mySocket.connect();
            jsonResponse = mySocket.sendStream(requestJson);
            mySocket.closeStream();
            mySocket.disconnect();
        } catch (IOException ex) {
            Logger.getLogger(RestauranteAccessImplSockets.class.getName()).log(Level.SEVERE, "No hubo conexión con el servidor", ex);
        }
        if (jsonResponse == null) {
            throw new Exception("No se pudo conectar con el servidor");
        } else {

            if (jsonResponse.contains("error")) {
                //Devolvió algún error                
                Logger.getLogger(ComponenteAccessImplSockets.class.getName()).log(Level.INFO, jsonResponse);
                throw new Exception(extractMessages(jsonResponse));
            } else {
                
                return restaurante.getRestNombre();
            }
        }
        
    }

    @Override
    public List<Restaurante> ListRestaurante() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Convierte el jsonError a un array de objetos jsonError
     *
     * @param jsonError
     * @return objeto MyError
     */
    private JsonError[] jsonToErrors(String jsonError) {
        Gson gson = new Gson();
        JsonError[] error = gson.fromJson(jsonError, JsonError[].class);
        return error;
    }
    
    /**
     * Extra los mensajes de la lista de errores
     * @param jsonResponse lista de mensajes json
     * @return Mensajes de error
     */
    private String extractMessages(String jsonResponse) {
        JsonError[] errors = jsonToErrors(jsonResponse);
        String msjs = "";
        for (JsonError error : errors) {
            msjs += error.getMessage();
        }
        return msjs;
    }
    
    /**
     * Crea la solicitud json de creación del customer para ser enviado por el
     * socket
     *
     * @param restaurante objeto restaurante
     * @return devulve algo como:
     * // actializar{"resource":"restaurante","action":"post","parameters":[{"name":"id","value":"980000012"},{"name":"fistName","value":"Juan"},...}]}
     */
    private String createRestauranteRequestJson(Restaurante restaurante) {

        Protocol protocol = new Protocol();
        protocol.setResource("Restaurante");
        protocol.setAction("post");
        protocol.addParameter("restId", restaurante.getRestId());
        protocol.addParameter("restNombre", restaurante.getRestNombre());
        protocol.addParameter("restEslogan", restaurante.getRestEslogan());
        protocol.addParameter("restPropietario", restaurante.getRestPropietario());
        protocol.addParameter("restDireccion", restaurante.getRestDireccion());
        protocol.addParameter("restTelefono", restaurante.getRestTelefono());
        protocol.addParameter("restCiudad", restaurante.getRestCiudad());
        protocol.addParameter("restAdmin", restaurante.getRestAdmin());
        Gson gson = new Gson();
        String requestJson = gson.toJson(protocol);
        System.out.println("json: " + requestJson);

        return requestJson;
    }

}
