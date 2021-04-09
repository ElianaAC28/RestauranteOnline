package co.unicauca.restauranteonline.server.access;

import co.unicauca.restauranteonline.commons.domain.Customer;

/**
 * Interface del respositorio de clientes
 * @author SoftwareTeam
 */
public interface ICustomerRepository {
    /**
     * Busca un Customer por su ceduka
     * @param id cedula del cliente
     * @return  objeto de tipo Customer
     */
    public Customer findCustomer(String id);
    
    /**
     * Crea cliente
     * @param customer
     * @return
     */
    public String createCustomer(Customer customer);
    
    /**
     * Autentica cliente
     * @param username
     * @param userpassword
     * @return
     */
    public boolean autenticarCustomer(String username, String userpassword);

}
