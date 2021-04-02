
package co.unicauca.restauranteonline.client.domain.services;

import co.unicauca.restauranteonline.commons.domain.Componente;
import co.unicauca.restauranteonline.client.access.IComponentes;

/**
 * Servicio de usuarios del sistema
 * @author Libardo, Julio
 */
public class ComponenteService {
    private final IComponentes service;
    /**
     * Constructor privado que evita que otros objetos instancien
     * @param service implementacion de tipo IRestaurantAcces
     */
    public ComponenteService(IComponentes service) {
        this.service = service;
    }
     /**
     * Busca un plato en el servidor remoto
     *
     * @param id identificador del restaurante
     * @return Objeto tipo plato, null si no lo encuentra
     * @throws java.lang.Exception la excepcio se lanza cuando no logra conexión
     * con el servidor
     */
    public Componente findComponente(String id) throws Exception {
        return service.findComponente(id);
    }
    /**
     * Crear un obeto Componente en el servidor remoto
     * @param Componente el objeto a crear
     * @return un string con el id del objeto creado
     * @throws Exception 
     */
    public String createComponente(Componente componente) throws Exception {
        return service.createComponente(componente);
    }
}
