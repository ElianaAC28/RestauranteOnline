
package co.unicauca.restauranteonline.client.domain.services;

import co.unicauca.restauranteonline.commons.domain.Componente;
import co.unicauca.restauranteonline.client.access.IComponentesAccess;
import java.util.List;

/**
 * Servicio de Componentes del sistema
 * @author SoftwareTeam
 */
public class ComponenteService {
    private final IComponentesAccess service;
    /**
     * Constructor privado que evita que otros objetos instancien
     * @param service implementacion de tipo IComponenteService
     */
    public ComponenteService(IComponentesAccess service) {
        this.service = service;
    }
      /**
     * Busca un componente en el servidor remoto
     *
     * @param id identificador del componente
     * @return Objeto tipo Componente
     * @throws java.lang.Exception la excepcio se lanza cuando no logra conexión
     * con el servidor
     */
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
}
