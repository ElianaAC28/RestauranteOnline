
package co.unicauca.restauranteonline.server.domain.services;

import co.unicauca.restauranteonline.commons.domain.Almuerzo;
import co.unicauca.restauranteonline.server.access.IAlmuerzoRepository;
import co.unicauca.restauranteonline.client.access.IAlmuerzoAccess;
import co.unicauca.restauranteonline.client.access.IComponentesAccess;
import co.unicauca.restauranteonline.commons.domain.Componente;
import co.unicauca.restauranteonline.commons.infra.JsonError;
import java.util.ArrayList;
import java.util.List;




/**
 * Servicio de usuarios del sistema
 * @author Libardo, Julio
 */
public class AlmuerzoService {
    IAlmuerzoRepository repositoryAlm;
  
    
    public AlmuerzoService( IAlmuerzoRepository repositoryAlm) {
        this.repositoryAlm = repositoryAlm;
    }

public Almuerzo findAlmuerzo(String idAlmuerzo) throws Exception {
        return repositoryAlm.findAlmuerzo(idAlmuerzo);
    }
public Almuerzo updateAlmuerzo(String idAlmuerzo) throws Exception {
        return repositoryAlm.updateAlmuerzo(idAlmuerzo);
    }
  /**
     * Metodo encargado de obtener una lista de todos los componentes
     * existentes.
     *
     * @return llamado a metodo findAllComponentes.
     */
    public List<Almuerzo> ListAlmuerzos() {
        List<JsonError> errors = new ArrayList<>();
        if (!repositoryAlm.findAllAlmuerzos().isEmpty()) {
            if (!errors.isEmpty()) {
                errors.add(new JsonError("400", "BAD_REQUEST", "ERROR AL GENERAR PEDIDO SQL"));
            }
        }
        return repositoryAlm.findAllAlmuerzos();
    }
    

   
   
   
}
