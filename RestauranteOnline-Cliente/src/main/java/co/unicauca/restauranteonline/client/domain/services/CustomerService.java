package co.unicauca.restauranteonline.client.domain.services;

import co.unicauca.restauranteonline.commons.domain.Customer;
import co.unicauca.restauranteonline.client.access.ICustomerAccess;

/**
 * Es una fachada para comunicar la presentación con el
 * dominio
 *
 * @author Libardo Pantoja, Julio Hurtado
 */
public class CustomerService {

    private final ICustomerAccess service;

    /**
     * Constructor privado que evita que otros objetos instancien
     * @param service implementacion de tipo ICustomerService
     */
    public CustomerService(ICustomerAccess service) {
        this.service = service;
    }

    /**
     * Busca un Customer en el servidor remoto
     *
     * @param id identificador del customer
     * @return 
     * @throws java.lang.Exception la excepcio se lanza cuando no logra conexión
     * con el servidor
     */
    public Customer findCustomer(String id) throws Exception {
        return service.findCustomer(id);

    }
     /**
     * Crea un componente en el servidor remoto
     *
     * @param id identificador del componente
     * @return Objeto tipo componente
     * @throws java.lang.Exception la excepcio se lanza cuando no logra conexión
     * con el servidor
     */
    
    public String createCustomer(Customer customer) throws Exception {
        return service.createCustomer(customer);

    }    
    
     /**
     * Autenticar un componente en el servidor remoto
     *
     * @param username
     * @param userpassword 
     * @return Objeto tipo componente
     * @throws java.lang.Exception la excepcio se lanza cuando no logra conexión
     * con el servidor
     */
    public boolean autenticarCustomer(String username, String userpassword) throws Exception {
        return service.autenticarCustomer(username, userpassword);

    }  
}
