package co.unicauca.restauranteonline.server.domain.services;

import co.unicauca.restauranteonline.commons.domain.Usuario;
import co.unicauca.restauranteonline.commons.infra.JsonError;
import co.unicauca.restauranteonline.commons.infra.Utilities;
import co.unicauca.restauranteonline.server.access.IUsuarioRepository;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 * Servicio de Usuarios. Da acceso a la lógica de negocio
 *
 * @author SoftwareTeam
 * 
 */
public class UsuarioService 
{

    /**
     * Repositorio de usuarios
     */
    IUsuarioRepository repo;

    /**
     * Constructor parametrizado. Hace inyeccion de dependencias
     * 
     */
    public UsuarioService(IUsuarioRepository repo) 
    {
        this.repo = repo;
    }

    /**
     * Busca un usuario
     */
    public Usuario findUsuario(String userId) 
    {
        return repo.findUsuario(userId);
    }
    
    /**
     * Autentica usuario
     */
    public boolean autenticarUsuario(String username, String userpassword){
        List<JsonError> errors = new ArrayList<>();
        if (username.isEmpty() || userpassword.isEmpty()) {
            errors.add(new JsonError("400", "BAD_REQUEST", "Nombre de usuario y password son requeridos"));
        }
        //Validacion con reglas de negocio
        return repo.autenticarUsuario(username,userpassword);
    }
    /**
     * Crea un nuevo usuario. Aplica validaciones de negocio
     * 
     */
    public String createUsuario(Usuario usuario) {
        List<JsonError> errors = new ArrayList<>();
  
        // Validaciones y reglas de negocio
       if (
               usuario.getUserId().isEmpty() ||
               usuario.getUserName().isEmpty() ||
               usuario.getUserEmail().isEmpty() ||
               usuario.getUserPassword().isEmpty() ||
               usuario.getUserNombre().isEmpty() ||
               usuario.getUserApellido().isEmpty())
       {
           errors.add(new JsonError("400", "BAD_REQUEST","id, nombres, apellidos, email y género son obligatorios. "));
        } else {
       }
        
        if (!usuario.getUserEmail().contains("@")){
            errors.add(new JsonError("400", "BAD_REQUEST","Email debe tener una @. "));
        }    
        // Verifica que no se encuentre repetido repetido
        
        Usuario customerSearched = this.findUsuario(usuario.getUserId());
        if (customerSearched != null){
            errors.add(new JsonError("400", "BAD_REQUEST","La cédula ya existe. "));
        }
        
       if (!errors.isEmpty()) {
            Gson gson = new Gson();
            String errorsJson = gson.toJson(errors);
            return errorsJson;
        }         
        return repo.createUsuario(usuario);
   }
}
