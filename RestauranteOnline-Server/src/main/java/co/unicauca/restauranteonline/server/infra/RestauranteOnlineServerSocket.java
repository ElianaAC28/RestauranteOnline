package co.unicauca.restauranteonline.server.infra;

import co.unicauca.restauranteonline.commons.domain.Almuerzo;
import co.unicauca.restauranteonline.commons.domain.Usuario;
import co.unicauca.restauranteonline.commons.domain.Componente;
import co.unicauca.restauranteonline.commons.domain.Restaurante;
import co.unicauca.restauranteonline.commons.infra.JsonError;
import co.unicauca.restauranteonline.commons.infra.Protocol;
import co.unicauca.restauranteonline.commons.infra.Utilities;
import co.unicauca.restauranteonline.server.access.Factory;
import co.unicauca.restauranteonline.server.access.IAlmuerzoRepository;
import co.unicauca.restauranteonline.server.access.IComponenteRepository;
import co.unicauca.restauranteonline.server.domain.services.ComponenteService;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import co.unicauca.restauranteonline.server.domain.services.UsuarioService;
import co.unicauca.restauranteonline.server.access.IUsuarioRepository;
import co.unicauca.restauranteonline.server.access.IRestauranteRepository;
import co.unicauca.restauranteonline.server.domain.services.AlmuerzoService;
import co.unicauca.restauranteonline.server.domain.services.RestauranteService;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 * Servidor Socket que está escuchando permanentemente solicitudes de los
 * clientes. Cada solicitud la atiende en un hilo de ejecución
 *
 * @author Libardo, Julio
 */
public class RestauranteOnlineServerSocket implements Runnable {

    /**
     * Servicio de clientes
     */
    private final UsuarioService service;

    private final ComponenteService serviceComponente;
    private final AlmuerzoService serviceAlm;
    private final RestauranteService serviceRestaurante;
    /**
     * Server Socket, la orejita
     */
    private static ServerSocket ssock;
    /**
     * Socket por donde se hace la petición/respuesta
     */
    private static Socket socket;
    /**
     * Permite leer un flujo de datos del socket
     */
    private Scanner input;
    /**
     * Permite escribir un flujo de datos del scoket
     */
    private PrintStream output;
    /**
     * Puerto por donde escucha el server socket
     */
    private static final int PORT = Integer.parseInt(Utilities.loadProperty("server.port"));

    /**
     * Constructor
     */
    public RestauranteOnlineServerSocket() {
        // Se hace la inyección de dependencia
        IUsuarioRepository repository = Factory.getInstance().getRepository();
        service = new UsuarioService(repository);

        IComponenteRepository repositoryComponente = Factory.getInstance().getRepositoryComponente();
        serviceComponente = new ComponenteService(repositoryComponente);
        
        IAlmuerzoRepository repositoryAlm = Factory.getInstance().getRepositoryAlmuerzo();
        serviceAlm = new AlmuerzoService(repositoryAlm);
        
        IRestauranteRepository repositoryRestaurante = Factory.getInstance().getRepositoryRestaurante();
        serviceRestaurante = new RestauranteService();
    }

    /**
     * Arranca el servidor y hace la estructura completa
     */
    public void start() {
        openPort();

        while (true) {
            waitToClient();
            throwThread();
        }
    }

    /**
     * Lanza el hilo
     */
    private static void throwThread() {
        new Thread(new RestauranteOnlineServerSocket()).start();
    }

    /**
     * Instancia el server socket y abre el puerto respectivo
     */
    private static void openPort() {
        try {
            ssock = new ServerSocket(PORT);
            Logger.getLogger("Server").log(Level.INFO, "Servidor iniciado, escuchando por el puerto {0}", PORT);
        } catch (IOException ex) {
            Logger.getLogger(RestauranteOnlineServerSocket.class.getName()).log(Level.SEVERE, "Error del server socket al abrir el puerto", ex);
        }
    }

    /**
     * Espera que el cliente se conecta y le devuelve un socket
     */
    private static void waitToClient() {
        try {
            socket = ssock.accept();
            Logger.getLogger("Socket").log(Level.INFO, "Socket conectado");
        } catch (IOException ex) {
            Logger.getLogger(RestauranteOnlineServerSocket.class.getName()).log(Level.SEVERE, "Eror al abrir un socket", ex);
        }
    }

    /**
     * Cuerpo del hilo
     */
    @Override
    public void run() {
        try {
            createStreams();
            readStream();
            closeStream();

        } catch (IOException ex) {
            Logger.getLogger(RestauranteOnlineServerSocket.class.getName()).log(Level.SEVERE, "Eror al leer el flujo", ex);
        }
    }

    /**
     * Crea los flujos con el socket
     *
     * @throws IOException
     */
    private void createStreams() throws IOException {
        output = new PrintStream(socket.getOutputStream());
        input = new Scanner(socket.getInputStream());
    }

    /**
     * Lee el flujo del socket
     */
    private void readStream() {
        if (input.hasNextLine()) {
            // Extrae el flujo que envió la aplicación cliente
            String request = input.nextLine();
            processRequest(request);

        } else {
            output.flush();
            String errorJson = generateErrorJson();
            output.println(errorJson);
        }
    }

    /**
     * Procesar la solicitud que proviene de la aplicación cliente
     *
     * @param requestJson petición que proviene del cliente socket en formato
     * json que viene de esta manera:
     * "{"resource":"customer","action":"get","parameters":[{"name":"id","value":"98000001"}]}"
     *
     */
    private void processRequest(String requestJson) {
        // Convertir la solicitud a objeto Protocol para poderlo procesar
        Gson gson = new Gson();
        Protocol protocolRequest = gson.fromJson(requestJson, Protocol.class);

        switch (protocolRequest.getResource()) {
            case "Usuario":
                if (protocolRequest.getAction().equals("get")) {
                    // Consultar un usuario
                    processGetUsuario(protocolRequest);
                }

                if (protocolRequest.getAction().equals("post")) {
                    // Agregar un usuario    
                    processPostUsuario(protocolRequest);
                }
                if (protocolRequest.getAction().equals("aut")) {
                    // Autoriza un usuario    
                    processAutUsuario(protocolRequest);
                }
                break;
            case "Componente":
                if (protocolRequest.getAction().equals("post")) {
                    processPostComponente(protocolRequest);
                }
                if (protocolRequest.getAction().equals("gets")) {
                    // Consultar todos los componentes
                    processGetListComponentes();
                }
                if (protocolRequest.getAction().equals("getsA")){
                    // Consultar todos los componentes de un almuerzo
                    proccessGetListComponentesAlmuerzo(protocolRequest);
                }
                break;
            case "Almuerzo":
                 if (protocolRequest.getAction().equals("gets")) {
                    // Consultar todos los almuerzos
                    processGetListAlmuerzo();
                }
<<<<<<< HEAD
                 if (protocolRequest.getAction().equals("post")) {
                    // Consultar todos los almuerzos
                    processGetListAlmuerzo();
=======
                break;
            case "Restaurante":
                if (protocolRequest.getAction().equals("gets")){
                    //Consultar todos los restaurantes
                    proccessGetListRestaurantes();
>>>>>>> 23c24fed3407ff6c7333d99de02878b1cfe597c9
                }
        }

    }
 
    /**
     * Procesa la solicitud de consultar un usuario
     *
     * @param protocolRequest Protocolo de la solicitud
     */
    private void processGetUsuario(Protocol protocolRequest) {
        // Extraer la cedula del primer parámetro
        String userId = protocolRequest.getParameters().get(0).getValue();
        Usuario usuario = service.findUsuario(userId);
        if (usuario == null) {
            String errorJson = generateNotFoundErrorJson();
            output.println(errorJson);
        } else {
            output.println(objectToJSON(usuario));
        }
    }

    private boolean processAutUsuario(Protocol protocolRequest) {
        // Extraer la cedula del primer parámetro
        String user = protocolRequest.getParameters().get(0).getValue();
        String pass = protocolRequest.getParameters().get(1).getValue();
        boolean usuario = service.autenticarUsuario(user, pass);
        if (usuario == false) {
            String errorJson = generateNotFoundErrorJson();
            output.println(errorJson);
            return false;
        } else {
            return true;
        }
    }

    /**
     * Procesa la solicitud de agregar un Componente.
     */
    private void processPostComponente(Protocol protocolRequest) {
        Componente objComponente = new Componente();

        objComponente.setIdComponente(Integer.parseInt(protocolRequest.getParameters().get(0).getValue()));
        objComponente.setIdRestaurante(Integer.parseInt(protocolRequest.getParameters().get(1).getValue()));
        objComponente.setNombreComponente(protocolRequest.getParameters().get(2).getValue());
        objComponente.setTipoComponente(protocolRequest.getParameters().get(3).getValue());
        objComponente.setIdtipoComponente(Integer.parseInt(protocolRequest.getParameters().get(4).getValue()));
        String response = serviceComponente.CreateComponente(objComponente);
        output.println(response);
    }

    /**
     * Procesa la solicitud de agregar un usuario
     *
     * @param protocolRequest Protocolo de la solicitud
     */
    private void processPostUsuario(Protocol protocolRequest) {
        Usuario usuario = new Usuario();
        // Reconstruir el customer a partid de lo que viene en los parámetros
        usuario.setUserId(protocolRequest.getParameters().get(0).getValue());

        String response = service.createUsuario(usuario);
        output.println(response);
    }

    /**
     * Genera un ErrorJson de cliente no encontrado
     *
     * @return error en formato json
     */
    private String generateNotFoundErrorJson() {
        List<JsonError> errors = new ArrayList<>();
        JsonError error = new JsonError();
        error.setCode("404");
        error.setError("NOT_FOUND");
        error.setMessage("Usuario no encontradoloadProperty.");
        errors.add(error);

        Gson gson = new Gson();
        String errorsJson = gson.toJson(errors);

        return errorsJson;
    }

    /**
     * Genera un ErrorJson genérico
     *
     * @return error en formato json
     */
    private String generateErrorJson() {
        List<JsonError> errors = new ArrayList<>();
        JsonError error = new JsonError();
        error.setCode("400");
        error.setError("BAD_REQUEST");
        error.setMessage("Error en la solicitud");
        errors.add(error);

        Gson gson = new Gson();
        String errorJson = gson.toJson(errors);

        return errorJson;
    }

    /**
     * Cierra los flujos de entrada y salida
     *
     * @throws IOException
     */
    private void closeStream() throws IOException {
        output.close();
        input.close();
        socket.close();
    }

    /**
     * Convierte el objeto Customer a json para que el servidor lo envie como
     * respuesta por el socket
     *
     * @param usuario usuario
     * @return customer en formato json
     */
    private String objectToJSON(Usuario usuario) {
        Gson gson = new Gson();
        String strObject = gson.toJson(usuario);
        return strObject;
    }

    /**
     * Procesa la solicitud para consultar todos los componentes.
     *
     * @param protocolRequest
     */
    private void processGetListComponentes() {
        List<Componente> listaComponentes = serviceComponente.ListComponentes();
        if (!listaComponentes.isEmpty()) {
            output.println(ArrayToJSON(listaComponentes));
        } else {
            String errorJson = generateNotFoundErrorJson();
            output.println(errorJson);
        }
    }
    
     /**
     * Procesa la solicitud para consultar todos los componentes.
     *
     * @param protocolRequest
     */
    private void processGetListAlmuerzo() {
        List<Almuerzo> listaAlmuerzos = serviceAlm.ListAlmuerzos();
        if (!listaAlmuerzos.isEmpty()) {
            output.println(ArrayToJSONAlm(listaAlmuerzos));
        } else {
            String errorJson = generateNotFoundErrorJson();
            output.println(errorJson);
        }

    }


    /**
     * Convierte Una lista de Componentes a json para que el servidor lo envie
     * como respuesta al socket.
     *
     * @param parLista Lista de tipo Componentes.
     * @return Lista de componentes en formato json (String).
     */
    private String ArrayToJSON(List<Componente> parLista) {
        Gson gson = new Gson();
        String strObject = gson.toJson(parLista);
        return strObject;
    }
    private String ArrayToJSONAlm(List<Almuerzo> parLista) {
        Gson gson = new Gson();
        String strObject = gson.toJson(parLista);
        return strObject;
    }

    /**
     * Procesa la solicitud para consultar todos los restaurante.
     *
     * @param protocolRequest
     */
    private void proccessGetListRestaurantes() {
        List<Restaurante> listaRestaurantes = serviceRestaurante.ListRestaurantes();
        if (!listaRestaurantes.isEmpty()) {
            output.println(ArrayToJSONRest(listaRestaurantes));
        } else {
            String errorJson = generateNotFoundErrorJson();
            output.println(errorJson);
        }
    }

    private String ArrayToJSONRest(List<Restaurante> parLista) {
        Gson gson = new Gson();
        String strObject = gson.toJson(parLista);
        return strObject;    
    }

    private void proccessGetListComponentesAlmuerzo(Protocol protocolRequest) {
        String almuId = protocolRequest.getParameters().get(0).getValue();
        List<Componente> listaComponentes = serviceComponente.ListComponentesAlmuerzo(almuId);
        if (!listaComponentes.isEmpty()) {
            output.println(ArrayToJSON(listaComponentes));
        } else {
            String errorJson = generateNotFoundErrorJson();
            output.println(errorJson);
        }
    }

}
