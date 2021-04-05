/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restauranteonline.server.domain.services;

import co.unicauca.restauranteonline.commons.domain.Componente;
import co.unicauca.restauranteonline.commons.infra.JsonError;
import co.unicauca.restauranteonline.server.access.IComponenteRepository;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author usuario
 */
public class ComponenteService {
    IComponenteRepository repoComponente;

    /**
     * Constructor parametrizado, Hace inyeccion de dependencias.
     * @param repoComponente
     */
    public ComponenteService(IComponenteRepository repoComponente) {
        this.repoComponente = repoComponente;
    }

    /**
     * Constructor por defecto.
     */
    public ComponenteService() {
    }
    
    public String CreateComponente(Componente parComponente) {
        List<JsonError> errors = new ArrayList<>();
        if (parComponente.getIdComponente().isEmpty() || parComponente.getNombreComponente().isEmpty() || parComponente.getTipoComponente().isEmpty()) {
            errors.add(new JsonError("400", "BAD_REQUEST", "LA INFORMACION X ES OBLIGATORIA "));
        }
        if (!errors.isEmpty()) {
            Gson gson = new Gson();
            String errorJson = gson.toJson(errors);
            return errorJson;
        }
        return repoComponente.createComponente(parComponente);
    }
    
    /**
     * Metodo encargado de obtener una lista de todos los componentes
     * existentes.
     *
     * @return llamado a metodo findAllComponentes.
     */
    public List<Componente> ListComponentes() {
        List<JsonError> errors = new ArrayList<>();
        if (!repoComponente.findAllComponentes().isEmpty()) {
            if (!errors.isEmpty()) {
                errors.add(new JsonError("400", "BAD_REQUEST", "ERROR AL GENERAR PEDIDO SQL"));
            }
        }
        return repoComponente.findAllComponentes();
    }
}
