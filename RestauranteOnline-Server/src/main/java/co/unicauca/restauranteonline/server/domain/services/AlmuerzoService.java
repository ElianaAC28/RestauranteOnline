
package co.unicauca.restauranteonline.server.domain.services;

import co.unicauca.restauranteonline.commons.domain.Almuerzo;
import co.unicauca.restauranteonline.server.access.IAlmuerzoRepository;
import co.unicauca.restauranteonline.client.access.IAlmuerzoAccess;
import co.unicauca.restauranteonline.client.access.IComponentesAccess;
import co.unicauca.restauranteonline.commons.domain.Componente;
import co.unicauca.restauranteonline.commons.infra.JsonError;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;




/**
 * Servicio de usuarios del sistema
 * @author SoftwareTeam
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
    
    
    
     /**
      *Crea el identificador de Almuerzo 
      * 
      **/
     public String CreateAlmuerzoID(Almuerzo parAlmuerzo) {
        List<JsonError> errors = new ArrayList<>();
        if (parAlmuerzo.getIdAlmuerzo().isEmpty() || parAlmuerzo.getRestId().isEmpty() || parAlmuerzo.getCostoAlm().isEmpty()){
            errors.add(new JsonError("400", "BAD_REQUEST", "LA INFORMACION X ES OBLIGATORIA "));
        }
        if (!errors.isEmpty()) {
            Gson gson = new Gson();
            String errorJson = gson.toJson(errors);
            return errorJson;
        }
        return repositoryAlm.createAlmuerzoID(parAlmuerzo);
    }
     
     /**
      *Crea Almuerzo 
      * 
      **/
     public String CreateAlmuerzo(Almuerzo parAlmuerzo) {
        List<JsonError> errors = new ArrayList<>();
        if (parAlmuerzo.getIdAlmuerzo().isEmpty() || parAlmuerzo.getComp().isEmpty() || parAlmuerzo.getIdComp().isEmpty()){
            errors.add(new JsonError("400", "BAD_REQUEST", "LA INFORMACION X ES OBLIGATORIA "));
        }
        if (!errors.isEmpty()) {
            Gson gson = new Gson();
            String errorJson = gson.toJson(errors);
            return errorJson;
        }
        return repositoryAlm.createAlmuerzo(parAlmuerzo);
    }
   
}
