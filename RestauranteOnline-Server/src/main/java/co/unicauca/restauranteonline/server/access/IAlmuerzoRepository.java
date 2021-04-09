/**
 * Interface del repositorio de Almuerzos.
 *
 * @author 
 */
package co.unicauca.restauranteonline.server.access;

import co.unicauca.restauranteonline.commons.domain.Almuerzo;

import java.util.List;

/**
 *
 * @author AC
 */
public interface IAlmuerzoRepository {
      /**
     * Crea un nuevo Almuerzo.
     *
     * @param parAlmuerzo Objeto de tipo Almuerzo.
     * @return valor especifico (idAlmuerzo)
     */
   
 public String createAlmuerzo(Almuerzo parAlmuerzo);
    public Almuerzo updateAlmuerzo(String idAlmuerzo);

    public Almuerzo findAlmuerzo(String idAlmuerzo);
      public List<Almuerzo> findAllAlmuerzos();
      public String createAlmuerzoID(Almuerzo parAlmuerzo);
}
