
package co.unicauca.restauranteonline.server.domain.services;

import co.unicauca.restauranteonline.commons.domain.Almuerzo;
import co.unicauca.restauranteonline.server.access.IAlmuerzoRepository;
import co.unicauca.restauranteonline.client.access.IAlmuerzoAccess;
import co.unicauca.restauranteonline.client.access.IComponentesAccess;




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
    
    

   
   
   
}
