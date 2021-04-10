/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restauranteonline.server.access;

import co.unicauca.restauranteonline.commons.domain.Restaurante;
import java.util.List;

/**
 *
 * @author GRUPO 5
 */
public interface IRestauranteRepository {
    
    /**
     * Crea un nuevo Restaurante.
     *
     * @param parRestaurante Objeto de tipo Restaurante.
     * @return valor especifico (restId)
     */
    public String createRestaurante(Restaurante parRestaurante);

    public String deleteRestaurante();

    public String uptadeRestaurante();

    public String findRestaurante();
    
    public List<Restaurante> findAllRestaurantes();
    
}
