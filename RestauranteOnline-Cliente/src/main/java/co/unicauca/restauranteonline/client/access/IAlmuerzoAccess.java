/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restauranteonline.client.access;

import co.unicauca.restauranteonline.commons.domain.Almuerzo;

/**
 *
 * @author AC
 */

public interface IAlmuerzoAccess {

   public String uptadeAlmuerzo()throws Exception;

    public Almuerzo findAlmuerzo(String idAlmuerzo)throws Exception;

}