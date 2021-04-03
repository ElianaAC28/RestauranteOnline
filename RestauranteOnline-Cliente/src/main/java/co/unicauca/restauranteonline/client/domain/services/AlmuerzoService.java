package co.unicauca.restauranteonline.client.domain.services;

import co.unicauca.restauranteonline.commons.domain.Almuerzo;
import co.unicauca.restauranteonline.client.access.IAlmuerzoAccess;

/**
 * Servicio de usuarios del sistema ESTA BIEN Y ESTA EN CLIENTE
 *
 * @author Libardo, Julio
 */
public class AlmuerzoService {

    private final IAlmuerzoAccess service;

    public AlmuerzoService(IAlmuerzoAccess service) {
        this.service = service;
    }

    public Almuerzo findAlmuerzo(String idAlmuerzo) throws Exception {
        return service.findAlmuerzo(idAlmuerzo);
    }

}
