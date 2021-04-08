package co.unicauca.restauranteonline.server.access;

import co.unicauca.restauranteonline.commons.domain.Usuario;

/**
 * Interface del respositorio de clientes
 * @author Libardo Pantoja
 */
public interface IUsuarioRepository {
    /**
     * Busca un Usuario por su id
     * @param userId id del usuario
     * @return  objeto de tipo Usuario
     */
    public Usuario findUsuario(String userId);
    
    public String createUsuario(Usuario usuario);
    
    public boolean autenticarUsuario(String username, String userpassword);

}
