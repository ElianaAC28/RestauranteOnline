package co.unicauca.restauranteonline.client.access;

import co.unicauca.restauranteonline.client.infra.AlmuerzoSocket;
import co.unicauca.restauranteonline.commons.infra.Protocol;
import co.unicauca.restauranteonline.commons.domain.Componente;
import co.unicauca.restauranteonline.commons.infra.JsonError;
import co.unicauca.restauranteonline.client.infra.ComponenteSocket;
import co.unicauca.restauranteonline.commons.domain.Almuerzo;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Servicio de Cliente. Permite hacer el CRUD de clientes solicitando los
 * servicios con la aplicación server. Maneja los errores devueltos
 *
 * @author Libardo Pantoja, Julio A. Hurtado
 */
public class AlmuerzoAccessImplSockets implements IAlmuerzoAccess {

    /**
     * El servicio utiliza un socket para comunicarse con la aplicación server
     */
    private AlmuerzoSocket mySocket;

    public AlmuerzoAccessImplSockets() {
        mySocket = new AlmuerzoSocket();
    }

    @Override
    public Almuerzo findAlmuerzo(String idAlmuerzo) throws Exception {
        //{"id"="9800001", "nombres":"juan", "apellidos":"perez", "direcciones":"[{}, {}, {}]"}
        String jsonResponse = null;
        String requestJson = findAlmuerzoRequestJson(idAlmuerzo);
        try {
            mySocket.connect();
            jsonResponse = mySocket.sendStream(requestJson);
            mySocket.closeStream();
            mySocket.disconnect();

        } catch (IOException ex) {
            Logger.getLogger(AlmuerzoAccessImplSockets.class.getName()).log(Level.SEVERE, "No hubo conexión con el servidor", ex);
        }
        if (jsonResponse == null) {
            throw new Exception("No se pudo conectar con el servidor. Revise la red o que el servidor esté escuchando. ");
        } else {
            if (jsonResponse.contains("error")) {
                //Devolvió algún error
                Logger.getLogger(AlmuerzoAccessImplSockets.class.getName()).log(Level.INFO, jsonResponse);
                throw new Exception(extractMessages(jsonResponse));
            } else {
                //Encontró el customer
                Almuerzo alm = jsonToAlmuerzo(jsonResponse);
                return alm;
            }
        }

    }

    private String extractMessages(String jsonResponse) {
        JsonError[] errors = jsonToErrors(jsonResponse);
        String msjs = "";
        for (JsonError error : errors) {
            msjs += error.getMessage();
        }
        return msjs;
    }

    private JsonError[] jsonToErrors(String jsonError) {
        Gson gson = new Gson();
        JsonError[] error = gson.fromJson(jsonError, JsonError[].class);
        return error;
    }

    private String findAlmuerzoRequestJson(String idAlmuerzo) {
        //{"recource":"customer", "action":"get", "parametrers":"[{"name": "id", "value": 9800001"},{}]"}
        Protocol protocol = new Protocol();
        protocol.setResource("almuerzo");
        protocol.setAction("get");
        protocol.addParameter("ALMUID", idAlmuerzo);

        Gson gson = new Gson();
        String requestJson = gson.toJson(protocol);

        return requestJson;
    }

    private Almuerzo jsonToAlmuerzo(String jsonAlmuerzo) {

        Gson gson = new Gson();
        Almuerzo al = gson.fromJson(jsonAlmuerzo, Almuerzo.class);

        return al;

    }

    /**
     * Trasforma un jsonAlmuerzos a una lista de Almuerzos
     *
     * @param jsonAlmuerzo
     * @return lista de componentes
     */
    private List<Almuerzo> jsonToListAlmuerzos(String jsonAlmuerzo) {
        Gson gson = new Gson();

        java.lang.reflect.Type listType = new TypeToken<List<Almuerzo>>() {
        }.getType();

        List<Almuerzo> listAlmuerzo = gson.fromJson(jsonAlmuerzo, listType);

        return listAlmuerzo;
    }

    /**
     * Crea una solicitud json para ser enviada por el socket
     *
     *
     * @return solicitud de consulta de restaurantes en formato Json, algo como:
     * {"resource":"Componentes","action":"gets","parameters":[]}
     */
    private String findAllAlmuerzosRequestJson() {

        Protocol protocol = new Protocol();
        protocol.setResource("Almuerzo");
        protocol.setAction("gets");
        Gson gson = new Gson();
        String requestJson = gson.toJson(protocol);
        System.out.println("json: " + requestJson);

        return requestJson;
    }

    @Override
    public String uptadeAlmuerzo() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Busca todos los Componentes. Utiliza socket para pedir el servicio al
     * servidor
     *
     * @return Lista de Componentes.
     * @throws Exception cuando no pueda conectarse con el servidor
     */
    @Override
    public List<Almuerzo> ListAlmuerzos() throws Exception {
        String jsonResponse = null;
        String requestJson = findAllAlmuerzosRequestJson();

        try {
            mySocket.connect();
            jsonResponse = mySocket.sendStream(requestJson);
            mySocket.closeStream();
            mySocket.disconnect();
        } catch (IOException ex) {
            Logger.getLogger(AlmuerzoAccessImplSockets.class.getName()).log(Level.SEVERE, "No hubo conexión con el servidor", ex);
        }
        if (jsonResponse == null) {
            throw new Exception("No se pudo conectar con el servidor. Revise la red o que el servidor este escuchando");
        } else {
            if (jsonResponse.contains("error")) {
                //Devolvio algun error
                Logger.getLogger(AlmuerzoAccessImplSockets.class.getName()).log(Level.INFO, jsonResponse);
                throw new Exception(extractMessages(jsonResponse));
            } else {
                //Encontro el Componente
                List<Almuerzo> almuerzo = jsonToListAlmuerzos(jsonResponse);
                return almuerzo;
            }
        }

    }

}
