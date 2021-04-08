package co.unicauca.restauranteonline.client.domain.services;

import co.unicauca.restauranteonline.commons.domain.Usuario;
import co.unicauca.restauranteonline.client.access.IUsuarioAccess;

/**
 * Es una fachada para comunicar la presentación con el
 * dominio
 *
 * @author Libardo Pantoja, Julio Hurtado
 */
public class UsuarioService {

    private final IUsuarioAccess service;

    /**
     * Constructor privado que evita que otros objetos instancien
     * @param service implementacion de tipo ICustomerService
     */
    public UsuarioService(IUsuarioAccess service) {
        this.service = service;
    }

    /**
     * Busca un cliente en el servidor remoto
     *
     * @param userId id del usuario
     * @return Objeto tipo Usuario, null si no lo encuentra
     * @throws java.lang.Exception la excepcio se lanza cuando no logra conexión
     * con el servidor
     */
    public Usuario findUsuario(String userId) throws Exception {
        return service.findUsuario(userId);

    }
    
    public String createUsuario(Usuario usuario) throws Exception {
        return service.createUsuario(usuario);

    }    
    public boolean autenticarUsuario(String username, String userpassword) throws Exception {
        return service.autenticarUsuario(username, userpassword);

    }  
}
