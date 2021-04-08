package co.unicauca.restauranteonline.server.access;

import co.unicauca.restauranteonline.commons.domain.Customer;

/**
 * Interface del respositorio de clientes
 * @author Libardo Pantoja
 */
public interface ICustomerRepository {
    /**
     * Busca un Customer por su ceduka
     * @param id cedula del cliente
     * @return  objeto de tipo Customer
     */
    public Customer findCustomer(String id);
    
    public String createCustomer(Customer customer);
    
    public boolean autenticarCustomer(String username, String userpassword);

}
