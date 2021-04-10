/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restauranteonline.client.access;

import co.unicauca.restauranteonline.commons.domain.Restaurante;
import java.util.List;

/**
 *
 * @author GRUPO 5
 */
public interface IRestauranteAccess {
    
    /**
     * Buscar un Plato utlizando un socket
     *
     * @param restId Id del restaurante
     * @return Objeto restaurant
     * @throws Exception
     */
    public Restaurante findRestaurante(String restId) throws Exception;

    /**
     * Crea un Restaurante
     *
     * @param restaurante
     * @return
     * @throws Exception
     */
    public String createRestaurante(Restaurante restaurante) throws Exception;
    
    /**
     * Retorna una lista con todos los restaurantes registrados previamente.
     *
     * @return List<Restaurantes> Lista de restaurantes
     * @throws Exception
     */
    public List<Restaurante> ListRestaurante() throws Exception;
    
}
