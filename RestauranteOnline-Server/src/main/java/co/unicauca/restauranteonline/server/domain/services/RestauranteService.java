package co.unicauca.restauranteonline.server.domain.services;

import co.unicauca.restauranteonline.commons.domain.Restaurante;
import co.unicauca.restauranteonline.commons.infra.JsonError;
import co.unicauca.restauranteonline.server.access.IRestauranteRepository;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author SoftwareTeam
 * 
 */
public class RestauranteService 
{ 
    IRestauranteRepository repoRestaurante;
    
    /**
     * Constructor por defecto.
     */
    public RestauranteService() {
    }
    
    /**
     * Crear restaurante.
     */
    public String CreateRestaurante(Restaurante parRestaurante) {
        List<JsonError> errors = new ArrayList<>();
        if (parRestaurante.getNit().isEmpty() || parRestaurante.getNombreRestaurante().isEmpty() || parRestaurante.getEslogan().isEmpty() 
            || parRestaurante.getPropietario().isEmpty() || parRestaurante.getDireccion().isEmpty()
            || parRestaurante.getDireccion().isEmpty() || parRestaurante.getCiudad().isEmpty()
            || parRestaurante.getAdministrador().isEmpty()) {
            errors.add(new JsonError("400", "BAD_REQUEST", "LA INFORMACION  ES OBLIGATORIA "));
        }
        if (!errors.isEmpty()) {
            Gson gson = new Gson();
            String errorJson = gson.toJson(errors);
            return errorJson;
        }
        return repoRestaurante.createRestaurante(parRestaurante);
    }
    
    /**
     * Metodo encargado de obtener una lista de todos los restaurantes
     * existentes
     * 
     */
    public List<Restaurante> ListRestaurantes() {
        List<JsonError> errors = new ArrayList<>();
        if (!repoRestaurante.findAllRestaurantes().isEmpty()) {
            if (!errors.isEmpty()) {
                errors.add(new JsonError("400", "BAD_REQUEST", "ERROR AL GENERAR PEDIDO SQL"));
            }
        }
        return repoRestaurante.findAllRestaurantes();
    }

}
