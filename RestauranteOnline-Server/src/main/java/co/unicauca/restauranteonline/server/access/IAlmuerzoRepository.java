/**
 * Interface del repositorio de Almuerzos.
 *
 * @author 
 */
package co.unicauca.restauranteonline.server.access;

import co.unicauca.restauranteonline.commons.domain.Almuerzo;
import co.unicauca.restauranteonline.commons.domain.Componente;

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
   

    public String uptadeAlmuerzo();

    public Almuerzo findAlmuerzo(String idAlmuerzo);
}
