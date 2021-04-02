package co.unicauca.resturanteonline.server.app;

import co.unicauca.restauranteonline.server.infra.restauranteOlineServerSocket;



/**
 * Aplicación principal que lanza el servidor en un hilo
 * @author Libardo, Julio
 */
public class RestautanteOnlineApplication {
    public static void main(String args[]){
        restauranteOlineServerSocket server = new restauranteOlineServerSocket();
        server.start();
    }
}
