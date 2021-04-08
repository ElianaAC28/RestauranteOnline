/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.unicauca.restauranteonline.client.domain.services;

import co.unicauca.restauranteonline.client.access.IRestauranteAccess;
import co.unicauca.restauranteonline.commons.domain.Restaurante;
import java.util.List;

/**
 * 
 * @author GRUPO 5
 */
public class RestauranteService {
    
    private final IRestauranteAccess service;
   
    public RestauranteService(IRestauranteAccess service) {
        this.service = service;
    }
     
    public Restaurante findRestaurante(String restId) throws Exception {
        return service.findRestaurante(restId);
    }
   
    public String createRestaurante(Restaurante restaurante) throws Exception {
        return service.createRestaurante(restaurante);
    }
    
    /**
     * Obtiene una lista de restaurante donde se encuentran todas las listas del servidor
     * @return lista de restaurante 
     * @throws Exception 
     */
    public List<Restaurante> listRestaurante() throws Exception {
        return service.ListRestaurante();
    }

}
