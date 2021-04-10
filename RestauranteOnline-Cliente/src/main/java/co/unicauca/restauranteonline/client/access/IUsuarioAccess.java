package co.unicauca.restauranteonline.client.access;

import co.unicauca.restauranteonline.commons.domain.Usuario;

/**
 * Interface que define los servicios de persistencia de Clientes de la agencia
 *
 * @author Libardo Pantoja, Julio Hurtado
 */
public interface IUsuarioAccess {

    /**
     * Buscar un cliente utilizando un socket
     *
     * @param userId cedula del cliente
     * @return objeto usuario
     * @throws Exception error al buscar un cliente
     */
    public Usuario findUsuario(String userId) throws Exception;

    /**
     * Crea un usuario
     *
     * @param ususario usuario de la base de datos
     * @return devuelve la id del usuario
     * @throws Exception error crear el cliente
     */

    public String createUsuario(Usuario usuario) throws Exception;
     /**
     * Autenticar un usuario
     *
     * @param ususario usuario de la base de datos
     * @return devuelve la id del usuario
     * @throws Exception error autenticar usuario
     */

    public boolean autenticarUsuario(String username, String userpassword) throws Exception;
}
