package co.unicauca.restauranteonline.client.access;

import co.unicauca.restauranteonline.commons.domain.Customer;

/**
 * Interface que define los servicios de persistencia de Customer
 *
 * @author SoftwareTeam
 */
public interface ICustomerAccess {

    /**
     * Buscar un cliente utilizando un socket
     *
     * @param id idenficación de customer
     * @return objeto Customer
     * @throws Exception error al buscar un usuario
     */
    public Customer findCustomer(String id) throws Exception;

    /**
     * Crea un Customer
     *
     * @param customer usuario de OnlineRestaurant
     * @return devuelve 
     * @throws Exception error crear el usuario
     */

    public String createCustomer(Customer customer) throws Exception;
    
     /**
     * Auntenticar un Costumer
     *
     * @param customer usuario de OnlineRestaurant
     * @return devuelve 
     * @throws Exception error crear el usuario
     */
    public boolean autenticarCustomer(String username, String userpassword) throws Exception;
}
