/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.unicauca.restauranteonline.server.domain.services;

import co.unicauca.restauranteonline.commons.domain.Restaurante;
import co.unicauca.restauranteonline.commons.infra.JsonError;
import co.unicauca.restauranteonline.server.access.IRestauranteRepository;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author GRUPO 5
 */
public class RestauranteService {
    
    IRestauranteRepository repoRestaurante;
    
    /**
     * Constructor por defecto.
     */
    public RestauranteService() {
    }
    
    public String CreateRestaurante(Restaurante parRestaurante) {
        List<JsonError> errors = new ArrayList<>();
        if (parRestaurante.getRestId().isEmpty() || parRestaurante.getRestNombre().isEmpty() || parRestaurante.getRestEslogan().isEmpty() 
            || parRestaurante.getRestPropietario().isEmpty() || parRestaurante.getRestDireccion().isEmpty()
            || parRestaurante.getRestTelefono().isEmpty() || parRestaurante.getRestCiudad().isEmpty()
            || parRestaurante.getRestAdmin().isEmpty()) {
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
     * existentes.
     *
     * @return llamado a metodo findAllRestaurantes.
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
