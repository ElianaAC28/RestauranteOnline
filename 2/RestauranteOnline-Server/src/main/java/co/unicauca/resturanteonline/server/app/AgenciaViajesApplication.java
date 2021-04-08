package co.unicauca.resturanteonline.server.app;

import co.unicauca.restauranteonline.server.infra.TravelAgencyServerSocket;



/**
 * Aplicación principal que lanza el servidor en un hilo
 * @author Libardo, Julio
 */
public class AgenciaViajesApplication {
    public static void main(String args[]){
        TravelAgencyServerSocket server = new TravelAgencyServerSocket();
        server.start();
    }
}
