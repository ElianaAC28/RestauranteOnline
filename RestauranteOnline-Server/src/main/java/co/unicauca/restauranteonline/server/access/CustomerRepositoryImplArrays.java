package co.unicauca.restauranteonline.server.access;

import co.unicauca.restauranteonline.commons.domain.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementación de ICustomerRepository. Utilliza arreglos en memoria
 *
 * @author Libardo Pantoja, Julio Hurtado
 */
public final class CustomerRepositoryImplArrays implements ICustomerRepository {

    /**
     * Array List de clientes
     */
    private static List<Customer> customers;

    public CustomerRepositoryImplArrays() {
        if (customers == null){
            customers = new ArrayList();
        }
        
        if (customers.size() == 0){
            inicializar();
        }
    }

    public void inicializar() {
       // customers.add(new Customer("98000001", "Andrea", "Sanchez", "Calle 14 No 11-12 Popayan", "3145878752", "andrea@hotmail.com", "Femenino"));

    }

    @Override
    public Customer findCustomer(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String createCustomer(Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Busca u Customer en el arreglo
     *
     * @param id cedula del customer
     * @return objeto Customer
     */
   
  /*  public Customer findCustomer(String id) {
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public String createCustomer(Customer customer) {
        customers.add(customer);
        return customer.getId();
    }
*/
}
