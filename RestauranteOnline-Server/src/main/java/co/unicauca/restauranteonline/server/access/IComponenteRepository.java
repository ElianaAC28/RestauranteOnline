package co.unicauca.restauranteonline.server.access;

import co.unicauca.restauranteonline.commons.domain.Componente;
import java.util.List;

/**
 * Interface del repositorio de Componentes.
 *
 * @author SoftwareTeam
 */
public interface IComponenteRepository {

    /**
     * Crea un nuevo Componente.
     *
     * @param parComponente Objeto de tipo Componente.
     * @return valor especifico (idComponente)
     */
    public String createComponente(Componente parComponente);

    public String deleteComponente();

    public String uptadeComponente();

    public String findComponente();
    
    public List<Componente> findAllComponentes();
}
