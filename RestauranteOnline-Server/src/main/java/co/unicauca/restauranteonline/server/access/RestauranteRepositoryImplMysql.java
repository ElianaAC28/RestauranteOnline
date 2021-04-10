/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.unicauca.restauranteonline.server.access;

import co.unicauca.restauranteonline.commons.domain.Restaurante;
import co.unicauca.restauranteonline.commons.infra.Utilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author SoftwareTeam
 */
public class RestauranteRepositoryImplMysql implements IRestauranteRepository {
    
    /**
     * Objeto de tipo Connection, encargado de realizar la Conexion con Mysql.
     */
    public Connection conn;
    
    /**
     * Metodo que se encarga de realizar la conexion con la base de datos.
     *
     * @return 1, si la conexion fue exitosa, -1 si la conexion fue fallida.
     */
    public int connect() {
        try {
            Class.forName(Utilities.loadProperty("server.db.driver"));
            //crea una instancia de la controlador de la base de datos
            String url = Utilities.loadProperty("server.db.url");
            String username = Utilities.loadProperty("server.db.username");
            String pwd = Utilities.loadProperty("server.db.password");
            conn = DriverManager.getConnection(url, username, pwd);
            return 1;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(RestauranteRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al consultar Componente de la base de datos", ex);
        }
        return -1;
    }

    /**
     * Metodo encargado de desconectar la aplicacion de la base de datos.
     */
    private void disconnect() {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(RestauranteRepositoryImplMysql.class.getName()).log(Level.FINER, "Error al cerrar Connection", ex);
        }
    }

    /**
     * Metodo encargado de crear restaurantes
     * @param parRestaurante
     * @return
     */
    @Override
    public String createRestaurante(Restaurante parRestaurante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Metodo encargado de eliminar restaurantes
     * @return
     */
    @Override
    public String deleteRestaurante() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Metodo encargado de actualizar restaurantes
     * @return
     */
    @Override
    public String uptadeRestaurante() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Metodo encargado de buscar restaurantes
     * @return
     */
    @Override
    public String findRestaurante() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Busca un restaurante de un administrador
     * @return
     */
    @Override
    public Restaurante findRestauranteUser(String userId){
        Restaurante restaurante = new Restaurante();
        this.connect();
        try {
            String sql = "SELECT * FROM restaurante WHERE userId;";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rest = pstmt.executeQuery();
            while (rest.next()) {
                restaurante.setNit(rest.getString("RESTID"));
                restaurante.setNombreRestaurante(rest.getString("RESTNOMBRE"));
                restaurante.setEslogan(rest.getString("RESTESLOGAN"));
                restaurante.setPropietario(rest.getString("RESTPROPIETARIO"));
                restaurante.setDireccion(rest.getString("RESTDIRECCION"));
                restaurante.setTelefono(rest.getString("RESTTELEFONO"));
                restaurante.setCiudad(rest.getString("RESTCIUDAD"));
                restaurante.setAdministrador(rest.getString("RESTADMIN"));
                restaurante = new Restaurante();
            }
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ComponenteRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al consultar el restaurante de la base de datos", ex);
        }
        return restaurante;
    }

    /**
     * Metodo encargado de obtener una lista de todos los restaurantes.
     *
     * @return Se retorna una lista con los resultados de la busqueda.
     */
    @Override
    public List<Restaurante> findAllRestaurantes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
