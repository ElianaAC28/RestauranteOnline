package co.unicauca.restauranteonline.client.access;

import co.unicauca.restauranteonline.commons.infra.Protocol;
import co.unicauca.restauranteonline.commons.domain.Customer;
import co.unicauca.restauranteonline.commons.infra.JsonError;
import co.unicauca.restauranteonline.client.infra.restauranteOnlineSocket;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Servicio de Usuario. Permite hacer el crear y buscar usuarios solicitando los
 * servicios con la aplicación server. Maneja los errores devueltos
 *
 * @author SoftwareTeam
 */
public class CustomerAccessImplSockets implements ICustomerAccess {

    /**
     * El servicio utiliza un socket para comunicarse con la aplicación server
     */
    private restauranteOnlineSocket mySocket;

    public CustomerAccessImplSockets() {
        mySocket = new restauranteOnlineSocket();
    }

    /**
     * Busca un Usuario. Utiliza socket para pedir el servicio al servidor
     *
     * @param id identificador de usuario
     * @return Objeto Usuario
     * @throws Exception cuando no pueda conectarse con el servidor
     */
    @Override
    public Customer findCustomer(String id) throws Exception {
       
        String jsonResponse = null;
        String requestJson = findCustomerRequestJson(id);
        try {
            mySocket.connect();
            jsonResponse = mySocket.sendStream(requestJson);
            mySocket.closeStream();
            mySocket.disconnect();

        } catch (IOException ex) {
            Logger.getLogger(CustomerAccessImplSockets.class.getName()).log(Level.SEVERE, "No hubo conexión con el servidor", ex);
        }
        if (jsonResponse == null) {
            throw new Exception("No se pudo conectar con el servidor. Revise la red o que el servidor esté escuchando. ");
        } else {
            if (jsonResponse.contains("error")) {
                //Devolvió algún error
                Logger.getLogger(CustomerAccessImplSockets.class.getName()).log(Level.INFO, jsonResponse);
                throw new Exception(extractMessages(jsonResponse));
            } else {
                //Encontró el customer
                Customer customer = jsonToCustomer(jsonResponse);
                return customer;
            }
        }

    }

    /**
     *
     * @param username
     * @param userpassword
     * @return true cuando se autentica exitosamente
     * @throws Exception
     */
    @Override
    public boolean autenticarCustomer(String username, String userpassword) throws Exception {
        String jsonResponse = null;
        String requestJson = autenticarCustomerRequestJson(username, userpassword);
        try {
            mySocket.connect();
            jsonResponse = mySocket.sendStream(requestJson);
            mySocket.closeStream();
            mySocket.disconnect();

        } catch (IOException ex) {
            Logger.getLogger(CustomerAccessImplSockets.class.getName()).log(Level.SEVERE, "No hubo conexión con el servidor", ex);
        }
        if (jsonResponse == null) {
            throw new Exception("No se pudo conectar con el servidor");
        } else {

            if (jsonResponse.contains("error")) {
                //Devolvió algún error                
                Logger.getLogger(CustomerAccessImplSockets.class.getName()).log(Level.INFO, jsonResponse);
                throw new Exception(extractMessages(jsonResponse));
            } else {

                //Agregó correctamente
                return true;
                //   
            }

        }

    }

    /**
     * Crea un Usuario. Utiliza socket para pedir el servicio al servidor
     *
     * @param customer usuario de OnlineRestaurant
     * @return devuelve e
     * @throws Exception error crear usuario
     */
    @Override
    public String createCustomer(Customer customer) throws Exception {
        String jsonResponse = null;
        String requestJson = createCustomerRequestJson(customer);
        try {
            mySocket.connect();
            jsonResponse = mySocket.sendStream(requestJson);
            mySocket.closeStream();
            mySocket.disconnect();

        } catch (IOException ex) {
            Logger.getLogger(CustomerAccessImplSockets.class.getName()).log(Level.SEVERE, "No hubo conexión con el servidor", ex);
        }
        if (jsonResponse == null) {
            throw new Exception("No se pudo conectar con el servidor");
        } else {

            if (jsonResponse.contains("error")) {
                //Devolvió algún error                
                Logger.getLogger(CustomerAccessImplSockets.class.getName()).log(Level.INFO, jsonResponse);
                throw new Exception(extractMessages(jsonResponse));
            } else {
                String e = null;
                //Agregó correctamente
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
     * @param idCustomer identificación del usuario
     * @return solicitud de consulta del usuario en formato json
     *
     */
    private String findCustomerRequestJson(String idCustomer) {
        Protocol protocol = new Protocol();
        protocol.setResource("customer");
        protocol.setAction("get");
        protocol.addParameter("id", idCustomer);

        Gson gson = new Gson();
        String requestJson = gson.toJson(protocol);

        return requestJson;
    }

    private String autenticarCustomerRequestJson(String username, String userpassword) {
        Protocol protocol = new Protocol();
        protocol.setResource("customer");
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
     * @param customer objeto customer
     * @return devulve formato json
     * 
     */
    private String createCustomerRequestJson(Customer customer) {

        Protocol protocol = new Protocol();
        protocol.setResource("customer");
        protocol.setAction("post");
        Gson gson = new Gson();
        String requestJson = gson.toJson(protocol);
        System.out.println("json: " + requestJson);

        return requestJson;
    }

    /**
     * Convierte jsonCustomer, proveniente del server socket, de json a un
     * objeto Customer
     *
     * @param jsonCustomer objeto usuario en formato json
     */
    private Customer jsonToCustomer(String jsonCustomer) {

        Gson gson = new Gson();
        Customer customer = gson.fromJson(jsonCustomer, Customer.class);

        return customer;

    }

}
