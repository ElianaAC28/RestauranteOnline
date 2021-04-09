package co.unicauca.restauranteonline.client.domain.services;

import co.unicauca.restauranteonline.commons.domain.Almuerzo;
import co.unicauca.restauranteonline.client.access.IAlmuerzoAccess;
import co.unicauca.restauranteonline.commons.domain.Componente;
import java.util.List;

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
 public String createAlmuerzo(Almuerzo almuerzo) throws Exception {
        return service.createAlmuerzo(almuerzo);
 }
 public String createAlmuerzoID(Almuerzo almuerzo) throws Exception {
        return service.createAlmuerzoID(almuerzo);
 }
    public Almuerzo findAlmuerzo(String idAlmuerzo) throws Exception {
        return service.findAlmuerzo(idAlmuerzo);
    }
     public List<Almuerzo> listAlmuerzos() throws Exception {
        return service.ListAlmuerzos();
    }
    

}
