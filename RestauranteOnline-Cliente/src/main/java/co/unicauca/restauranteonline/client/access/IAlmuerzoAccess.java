
package co.unicauca.restauranteonline.client.access;

import co.unicauca.restauranteonline.commons.domain.Almuerzo;
import co.unicauca.restauranteonline.commons.domain.Componente;
import java.util.List;

/**
 *
 * @author SoftwareTeam
 */
public interface IAlmuerzoAccess {

    /**
     * Crear un almuerzo utilizando un socket
     *
     * @param almuerzo parametro detipo Almuerzo
     * @return objeto Customer
     * @throws Exception error al buscar un usuario
     */
    public String createAlmuerzo(Almuerzo almuerzo) throws Exception;

    /**
     * Actualizar un almuerzo utilizando un socket
     *
     * @param id idenficación de Almuerzo
     * @return objeto Customer
     * @throws Exception error al buscar un usuario
     */
    public Almuerzo updateAlmuerzo(String idAlmuerzo) throws Exception;

    /**
     * Buscar un almuerzo utilizando un socket
     *
     * @param id idenficación de Almuerzo
     * @return objeto Customer
     * @throws Exception error al buscar un almuerzo
     */
    public Almuerzo findAlmuerzo(String idAlmuerzo) throws Exception;

    /**
     * Retorna una lista con todos los almuerzos registrados previamente.
     *
     * @return List<Almuerzos> Lista de almuerzos
     * @throws Exception
     */
    public List<Almuerzo> ListAlmuerzos() throws Exception;

    /**
     * Crear un almuerzo en la tabla Almuerzo
     *
     * @param almuerzo parametro detipo Almuerzo
     * @return objeto Almuerzo
     * @throws Exception error al crear un almuerzo
     */
    public String createAlmuerzoID(Almuerzo almuerzo) throws Exception;

}
