package co.unicauca.restauranteonline.server.domain.services;

import co.unicauca.restauranteonline.commons.domain.Customer;
import co.unicauca.restauranteonline.commons.infra.JsonError;
import co.unicauca.restauranteonline.commons.infra.Utilities;
import co.unicauca.restauranteonline.server.access.ICustomerRepository;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 * Servicio de clientes. Da acceso a la lógica de negocio
 *
 * @author Libardo, Julio
 */
public class CustomerService {

    /**
     * Repositorio de clientes
     */
    ICustomerRepository repo;

    /**
     * Constructor parametrizado. Hace inyeccion de dependencias
     *
     * @param repo repositorio de tipo ICustomerRepository
     */
    public CustomerService(ICustomerRepository repo) {
        this.repo = repo;
    }

    /**
     * Buscar un cliente
     *
     * @param id cedula
     * @return objeto tipo Customer
     */
    public Customer findCustomer(String id) {
        return repo.findCustomer(id);
    }

    public boolean autenticarCustomer(String username, String userpassword){
        List<JsonError> errors = new ArrayList<>();
        if (username.isEmpty() || userpassword.isEmpty()) {
            errors.add(new JsonError("400", "BAD_REQUEST", "Nombre de usuario y password son requeridos"));
        }
        //Validacion con reglas de negocio
        return repo.autenticarCustomer(username,userpassword);
    }
    /**
     * Crea un nuevo customer. Aplica validaciones de negocio
     *
     * @param customer cliente
     * @return devuelve la cedula del customer creado
     */
    public String createCustomer(Customer customer) {
//        List<JsonError> errors = new ArrayList<>();
//  
//        // Validaciones y reglas de negocio
//       if (
//                customer.getId().isEmpty() ||
//               customer.getNombreCliente().isEmpty() ||
//               customer.getEmail().isEmpty() ||
//               customer.getGenero().isEmpty())
//              
//       {
//           errors.add(new JsonError("400", "BAD_REQUEST","id, nombres, apellidos, email y género son obligatorios. "));
//        } else {
//       }
//        
//        if (!customer.getEmail().contains("@")){
//            errors.add(new JsonError("400", "BAD_REQUEST","Email debe tener una @. "));
//        }
//        
//        if(!(customer.getGenero().equalsIgnoreCase("M") || customer.getGenero().equalsIgnoreCase("F"))){
//            errors.add(new JsonError("400", "BAD_REQUEST","Sexo debo ser M o F. "));
//        }      
//        
//        if(!Utilities.isNumeric(customer.getCelular())){
//            errors.add(new JsonError("400", "BAD_REQUEST","Teléfono móvil debe contener sólo dígitos "));
//            
//        }
//        // Que no esté repetido
//        
//        Customer customerSearched = this.findCustomer(customer.getId());
//        if (customerSearched != null){
//            errors.add(new JsonError("400", "BAD_REQUEST","La cédula ya existe. "));
//        }
//        
//       if (!errors.isEmpty()) {
//            Gson gson = new Gson();
//            String errorsJson = gson.toJson(errors);
//            return errorsJson;
//        }         
        return repo.createCustomer(customer);
   }
}
