package co.unicauca.restauranteonline.client.access;

import co.unicauca.restauranteonline.client.infra.UsuarioSocket;
import co.unicauca.restauranteonline.commons.infra.Protocol;
import co.unicauca.restauranteonline.commons.domain.Usuario;
import co.unicauca.restauranteonline.commons.infra.JsonError;
import co.unicauca.restauranteonline.client.infra.restauranteOnlineSocket;
import co.unicauca.restauranteonline.commons.domain.Usuario;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Servicio de Usuario. Permite hacer el CRUD de clientes solicitando los
 * servicios con la aplicación server. Maneja los errores devueltos
 *
 * @author Libardo Pantoja, Julio A. Hurtado
 */
public class UsuarioAccessImplSockets implements IUsuarioAccess {

    /**
     * El servicio utiliza un socket para comunicarse con la aplicación server
     */
    private UsuarioSocket mySocket;

    public UsuarioAccessImplSockets() {
        this.mySocket = new UsuarioSocket();
    }

    /**
     * Busca un Usuario. Utiliza socket para pedir el servicio al servidor
     *
     * @param userId id del usuario
     * @return Objeto usuario
     * @throws Exception cuando no pueda conectarse con el servidor
     */
    @Override
    public Usuario findUsuario(String userId) throws Exception {
        //{"id"="9800001", "nombres":"juan", "apellidos":"perez", "direcciones":"[{}, {}, {}]"}
        String jsonResponse = null;
        String requestJson = findUsuarioRequestJson(userId);
        try {
            mySocket.connect();
            jsonResponse = mySocket.sendStream(requestJson);
            mySocket.closeStream();
            mySocket.disconnect();

        } catch (IOException ex) {
            Logger.getLogger(UsuarioAccessImplSockets.class.getName()).log(Level.SEVERE, "No hubo conexión con el servidor", ex);
        }
        if (jsonResponse == null) {
            throw new Exception("No se pudo conectar con el servidor. Revise la red o que el servidor esté escuchando. ");
        } else {
            if (jsonResponse.contains("error")) {
                //Devolvió algún error
                Logger.getLogger(UsuarioAccessImplSockets.class.getName()).log(Level.INFO, jsonResponse);
                throw new Exception(extractMessages(jsonResponse));
            } else {
                //Encontró el customer
                Usuario usuario = jsonToUsuario(jsonResponse);
                return usuario;
            }
        }

    }

    /**
     *
     * @param username
     * @param userpassword
     * @return
     * @throws Exception
     */
    @Override
    public boolean autenticarUsuario(String username, String userpassword) throws Exception {
        String jsonResponse = null;
        String requestJson = autenticarUsuarioRequestJson(username,userpassword);
        try {
            mySocket.connect();
            jsonResponse = mySocket.sendStream(requestJson);
            mySocket.closeStream();
            mySocket.disconnect();

        } catch (IOException ex) {
            Logger.getLogger(UsuarioAccessImplSockets.class.getName()).log(Level.SEVERE, "No hubo conexión con el servidor", ex);
        }
        if (jsonResponse == null) {
            throw new Exception("No se pudo conectar con el servidor");
        } else {

            if (jsonResponse.contains("error")) {
                //Devolvió algún error                
                Logger.getLogger(UsuarioAccessImplSockets.class.getName()).log(Level.INFO, jsonResponse);
                throw new Exception(extractMessages(jsonResponse));
            } else {
                return true;
            }

        }

    }

    /**
     * Crea un usuario. Utiliza socket para pedir el servicio al servidor
     *
     * @param usuario usuario de la base de datos
     * @return devuelve la id del usuario
     * @throws Exception error crear el cliente
     */
    @Override
    public String createUsuario(Usuario usuario) throws Exception {
        String jsonResponse = null;
        String requestJson = createUsuarioRequestJson(usuario);
        try {
            mySocket.connect();
            jsonResponse = mySocket.sendStream(requestJson);
            mySocket.closeStream();
            mySocket.disconnect();

        } catch (IOException ex) {
            Logger.getLogger(UsuarioAccessImplSockets.class.getName()).log(Level.SEVERE, "No hubo conexión con el servidor", ex);
        }
        if (jsonResponse == null) {
            throw new Exception("No se pudo conectar con el servidor");
        } else {

            if (jsonResponse.contains("error")) {
                //Devolvió algún error                
                Logger.getLogger(UsuarioAccessImplSockets.class.getName()).log(Level.INFO, jsonResponse);
                throw new Exception(extractMessages(jsonResponse));
            } else {
                //Agregó correctamente, devuelve la cedula del customer 
                String e = usuario.getUserId();
                return e;
            }

        }

    }

    /**
     * Extra los mensajes de la lista de errores
     *
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
     * @param userId identificación del usuario
     * @return solicitud de consulta del cliente en formato Json, algo como:
     * {"resource":"usuario","action":"get","parameters":[{"name":"id","value":"98000001"}]}
     */
    private String findUsuarioRequestJson(String userId) {
        //{"recource":"Usuario", "action":"get", "parametrers":"[{"name": "id", "value": 9800001"},{}]"}
        Protocol protocol = new Protocol();
        protocol.setResource("Usuario");
        protocol.setAction("get");
        protocol.addParameter("userId", userId);

        Gson gson = new Gson();
        String requestJson = gson.toJson(protocol);

        return requestJson;
    }
    private String autenticarUsuarioRequestJson(String username, String userpassword ) {
        //{"recource":"usuario", "action":"get", "parametrers":"[{"name": "id", "value": 9800001"},{}]"}
        Protocol protocol = new Protocol();
        protocol.setResource("Usuario");
        protocol.setAction("aut");
        protocol.addParameter("userName", username);
        protocol.addParameter("userPassword", userpassword);
        Gson gson = new Gson();
        String requestJson = gson.toJson(protocol);

        return requestJson;
    }
    /**
     * Crea la solicitud json de creación del customer para ser enviado por el
     * socket
     *
     * @param usuario objeto usuario
     * @return devulve algo como:
     * {"resource":"usuario","action":"post","parameters":[{"name":"id","value":"980000012"},{"name":"fistName","value":"Juan"},...}]}
     */
    private String createUsuarioRequestJson(Usuario usuario) {

        Protocol protocol = new Protocol();
        protocol.setResource("Usuario");
        protocol.setAction("post");
        protocol.addParameter("userId", usuario.getUserId());
        protocol.addParameter("userName", usuario.getUserName());
        protocol.addParameter("userPassword", usuario.getUserPassword());
        protocol.addParameter("userNombre", usuario.getUserNombre());
        protocol.addParameter("userApellido", usuario.getUserApellido());
        protocol.addParameter("userCelular", usuario.getUserCelular());
        protocol.addParameter("userEmail", usuario.getUserEmail());
        Gson gson = new Gson();
        String requestJson = gson.toJson(protocol);
        System.out.println("json: " + requestJson);

        return requestJson;
    }

    /**
     * Convierte jsonUsuario, proveniente del server socket, de json a un
     * objeto Customer
     *
     * @param jsonUsuario objeto usuario en formato json
     */
    private Usuario jsonToUsuario(String jsonUsuario) {

        Gson gson = new Gson();
        Usuario usuario= gson.fromJson(jsonUsuario, Usuario.class);

        return usuario;

    }

}
