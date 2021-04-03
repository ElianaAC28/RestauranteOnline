package co.unicauca.restauranteonline.server.app;

import co.unicauca.restauranteonline.server.infra.RestauranteOnlineServerSocket; 



/**
 * Aplicación principal que lanza el servidor en un hilo
 * @author Libardo, Julio
 */
public class RestauranteOnlineApplication {
    public static void main(String args[]){
        RestauranteOnlineServerSocket server = new RestauranteOnlineServerSocket();
        server.start();
    }
}
