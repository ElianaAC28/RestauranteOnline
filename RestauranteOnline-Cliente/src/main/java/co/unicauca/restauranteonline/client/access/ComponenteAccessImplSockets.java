package co.unicauca.restauranteonline.client.access;

import co.unicauca.restauranteonline.commons.infra.Protocol;
import co.unicauca.restauranteonline.commons.domain.Componente;
import co.unicauca.restauranteonline.commons.infra.JsonError;
import co.unicauca.restauranteonline.client.infra.ComponenteSocket;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Servicio de Cliente. Permite hacer el CRUD de clientes solicitando los
 * servicios con la aplicación server. Maneja los errores devueltos
 *
 * @author Libardo Pantoja, Julio A. Hurtado
 */
public class ComponenteAccessImplSockets implements IComponentesAccess{

    /**
     * El servicio utiliza un socket para comunicarse con la aplicación server
     */
    private ComponenteSocket mySocket;

    public ComponenteAccessImplSockets() {
        mySocket = new ComponenteSocket();
    }

    /**
     * Busca un Customer. Utiliza socket para pedir el servicio al servidor
     *
     * @param id cedula del cliente
     * @return Objeto Customer
     * @throws Exception cuando no pueda conectarse con el servidor
     */
    @Override
    public Componente findComponente(String id) throws Exception {
        //{"id"="9800001", "nombres":"juan", "apellidos":"perez", "direcciones":"[{}, {}, {}]"}
        String jsonResponse = null;
        String requestJson = findComponenteRequestJson(id);
        try {
            mySocket.connect();
            jsonResponse = mySocket.sendStream(requestJson);
            mySocket.closeStream();
            mySocket.disconnect();

        } catch (IOException ex) {
            Logger.getLogger(ComponenteAccessImplSockets.class.getName()).log(Level.SEVERE, "No hubo conexión con el servidor", ex);
        }
        if (jsonResponse == null) {
            throw new Exception("No se pudo conectar con el servidor. Revise la red o que el servidor esté escuchando. ");
        } else {
            if (jsonResponse.contains("error")) {
                //Devolvió algún error
                Logger.getLogger(ComponenteAccessImplSockets.class.getName()).log(Level.INFO, jsonResponse);
                throw new Exception(extractMessages(jsonResponse));
            } else {
                //Encontró el customer
                Componente componente = jsonToComponente(jsonResponse);
                return componente;
            }
        }

    }

    /**
     * Crea un Componente. Utiliza socket para pedir el servicio al servidor
     *
     * @param componente Componente del almuerzo
     */
    @Override
    public String createComponente(Componente componente) throws Exception {
        String jsonResponse = null;
        String requestJson = createComponenteRequestJson(componente);
        try {
            mySocket.connect();
            jsonResponse = mySocket.sendStream(requestJson);
            mySocket.closeStream();
            mySocket.disconnect();

        } catch (IOException ex) {
            Logger.getLogger(ComponenteAccessImplSockets.class.getName()).log(Level.SEVERE, "No hubo conexión con el servidor", ex);
        }
        if (jsonResponse == null) {
            throw new Exception("No se pudo conectar con el servidor");
        } else {

            if (jsonResponse.contains("error")) {
                //Devolvió algún error                
                Logger.getLogger(ComponenteAccessImplSockets.class.getName()).log(Level.INFO, jsonResponse);
                throw new Exception(extractMessages(jsonResponse));
            } else {
                
                return componente.getNombreComponente();
                    //    customer.getId();
            }

        }

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
     * Crea una solicitud json para ser enviada por el socket
     *
     *
     * @param idComponente identificación del componente
     * @return solicitud de consulta del Componente en formato Json, algo como:
     * 
     */
    private String findComponenteRequestJson(String idComponente) {
        Protocol protocol = new Protocol();
        protocol.setResource("componente");
        protocol.setAction("get");
        protocol.addParameter("id", idComponente);

        Gson gson = new Gson();
        String requestJson = gson.toJson(protocol);

        return requestJson;
    }

    /**
     * Crea la solicitud json de creación del customer para ser enviado por el
     * socket
     *
     * @param Componente objeto componente
     * @return devulve algo como:
     * // actializar{"resource":"customer","action":"post","parameters":[{"name":"id","value":"980000012"},{"name":"fistName","value":"Juan"},...}]}
     */
    private String createComponenteRequestJson(Componente componente) {

        Protocol protocol = new Protocol();
        protocol.setResource("Componente");
        protocol.setAction("post");
        protocol.addParameter("idComponente", componente.getIdComponente());
        protocol.addParameter("nombreComponente", componente.getNombreComponente());
        protocol.addParameter("tipoComponente", componente.getTipoComponente());
        Gson gson = new Gson();
        String requestJson = gson.toJson(protocol);
        System.out.println("json: " + requestJson);

        return requestJson;
    }

    /**
     * Convierte jsonComponente, proveniente del server socket, de json a un
     * objeto componente
     *
     * @param jsonComponente objeto componente en formato json
     */
    private Componente jsonToComponente(String jsonComponente) {

        Gson gson = new Gson();
        Componente componente = gson.fromJson(jsonComponente, Componente.class);

        return componente;

    }

}
