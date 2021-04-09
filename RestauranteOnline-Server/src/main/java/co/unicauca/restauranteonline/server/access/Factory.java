package co.unicauca.restauranteonline.server.access;

import co.unicauca.restauranteonline.commons.infra.Utilities;
import co.unicauca.restauranteonline.server.access.ComponenteRepositoryImplMysql;
import co.unicauca.restauranteonline.server.access.IComponenteRepository;
import co.unicauca.restauranteonline.server.access.CustomerRepositoryImplMysql;
/**
 * Fabrica que se encarga de instanciar un repositorio concreto
 *
 * @author SoftwareTeam
 */
public class Factory {

    private static Factory instance;

    private Factory() {
    }

    /**
     * Clase singleton
     *
     * @return
     */
    public static Factory getInstance() {

        if (instance == null) {
            instance = new Factory();
        }
        return instance;

    }

    /**
     * Método que crea una instancia concreta de la jerarquia
     * ICustomerRepository
     *
     * @return una clase hija de la abstracción IRepositorioClientes
     */
    public ICustomerRepository getRepository() {
        String type = Utilities.loadProperty("customer.repository");
        if (type.isEmpty()) {
            type = "default";
        }
        ICustomerRepository result = null;

        switch (type) {
//            case "default":
//    //            result = new CustomerRepositoryImplArrays();
//                break;
            case "mysql":
                result = new CustomerRepositoryImplMysql();
                break;
        }

        return result;

    }
    
    /**
     * Método que crea una instancia concreta de la jerarquia IComponenterepository.
     *
     * @return una clase hija de la abstracción IComponenterepository.
     */
    public IComponenteRepository getRepositoryComponente() {
        String type = Utilities.loadProperty("customer.repository");
        if (type.isEmpty()) {
            type = "mysql";
        }
        IComponenteRepository result = null;
        switch (type) {
            case "mysql":
                result = new ComponenteRepositoryImplMysql();
                break;
        }
        return result;
    }
    
     /**
     * Método que crea una instancia concreta de la jerarquia IComponenterepository.
     *
     * @return una clase hija de la abstracción IComponenterepository.
     */
    
    
    public IAlmuerzoRepository getRepositoryAlmuerzo() {
       String type = Utilities.loadProperty("customer.repository");
        if (type.isEmpty()) {
            type = "default";
        }
        IAlmuerzoRepository result = null;

        switch (type) {
         
            case "mysql":
                result = new AlmuerzoRepositoryImplMysql();
                break;
        }

        return result;
    }
}
