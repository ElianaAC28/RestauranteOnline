
package co.unicauca.restauranteonline.client.domain.services;

import co.unicauca.restauranteonline.commons.domain.Componente;
import co.unicauca.restauranteonline.client.access.IComponentesAccess;
import java.util.List;

/**
 * Servicio de usuarios del sistema
 * @author Libardo, Julio
 */
public class ComponenteService {
    private final IComponentesAccess service;
   
    public ComponenteService(IComponentesAccess service) {
        this.service = service;
    }
     
    public Componente findComponente(String id) throws Exception {
        return service.findComponente(id);
    }
   
    public String createComponente(Componente componente) throws Exception {
        return service.createComponente(componente);
    }
    
    /**
     * Obtiene una lista de componentes donde se encuentran todas las listas del servidor
     * @return lista de componentes 
     * @throws Exception 
     */
    public List<Componente> listComponentes() throws Exception {
        return service.ListComponentes();
    }
    
    /**
     * Obtiene una lista de componentes de un almuerzo donde se encuentran todas las listas del servidor
     * @return lista de componentes 
     * @throws Exception 
     */
    public List<Componente> listComponentesAlmuerzo(String almuId) throws Exception {
        return service.ListComponentesAlmuerzo(almuId);
    }
}
