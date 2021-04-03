
package co.unicauca.restauranteonline.client.domain.services;

import co.unicauca.restauranteonline.commons.domain.Componente;
import co.unicauca.restauranteonline.client.access.IComponentesAccess;

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
}
