/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restauranteonline.client.access;
import co.unicauca.restauranteonline.commons.domain.Componente;

/**
 *
 * @author usuario
 */
public interface IComponentesAccess {
    /**
     * Buscar un Plato utlizando un socket
     *
     * @param id Id del restaurante
     * @return Objeto restaurant
     * @throws Exception
     */
    public Componente findComponente(String id) throws Exception;

    /**
     * Crea un Componente
     *
     * @param Componente
     * @return
     * @throws Exception
     */
    public String createComponente(Componente componente) throws Exception;
}