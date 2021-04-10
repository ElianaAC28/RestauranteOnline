package co.unicauca.restauranteonline.server.access;

import co.unicauca.restauranteonline.commons.domain.Almuerzo;

import co.unicauca.restauranteonline.commons.infra.Utilities;
import co.unicauca.restauranteonline.presentacion.GUIActualizarAlmuerzo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author
 */
public class AlmuerzoRepositoryImplMysql implements IAlmuerzoRepository {

    /**
     * Objeto de tipo Connection, encargado de realizar la Conexion con Mysql.
     */
    public Connection conn;
    public Connection conn2;
    
 
    @Override
    public Almuerzo findAlmuerzo(String idAlmuerzo) {

        Almuerzo almuerzo = null;

        this.connect();
        try {

            String sql = "SELECT * from Almuerzo;";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet res = pstmt.executeQuery();
            pstmt.setString(1, idAlmuerzo);
            
            if (res.next()) {

                
                almuerzo = new Almuerzo();

                almuerzo.setIdAlmuerzo(res.getString("ALMUID"));
                almuerzo.setEntradaAlm(res.getString("ALMUENTRADA"));
                almuerzo.setPrincipioAlm(res.getString("ALMUPRINCIPIO"));
                almuerzo.setBebidaAlm(res.getString("ALMUBEBIDA"));
                almuerzo.setCostoAlm(res.getString("ALMUCOSTO"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe un almuerzo con ese Id");
            }
            pstmt.close();
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al consultar almuerzo de la base de datos", ex);
        }
        return almuerzo;
    }

    

    public int connect() {
        try {
            Class.forName(Utilities.loadProperty("server.db.driver"));
            //crea una instancia de la controlador de la base de datos
            String url = Utilities.loadProperty("server.db.url");
            String username = Utilities.loadProperty("server.db.username");
            String pwd = Utilities.loadProperty("server.db.password");
            conn = DriverManager.getConnection(url, username, pwd);
            conn2 = DriverManager.getConnection(url, username, pwd);
            return 1;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AlmuerzoRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al consultar almuerzo de la base de datos", ex);
        }
        return -1;
    }

    /**
     * Metodo encargado de desconectar la aplicacion de la base de datos.
     */
    private void disconnect() {
        try {
            conn.close();
            conn2.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlmuerzoRepositoryImplMysql.class.getName()).log(Level.FINER, "Error al cerrar Connection", ex);
        }
    }
@Override
    public Almuerzo updateAlmuerzo(String idAlmuerzo) {
        Almuerzo almuerzo = null;

        this.connect();
        try {

            String sql = "UPDATE ALMUERZO SET ALMUENTRADA='" + almuerzo.getEntradaAlm() + "',ALMUPRINCIPIO='" 
                    + almuerzo.getPrincipioAlm()+"',ALMUPROTEINA='"
                    +almuerzo.getProteinaAlm()+"',ALMUBEBIDA='"
                    +almuerzo.getBebidaAlm()+"' WHERE ALMUIDE = '"+almuerzo.getIdAlmuerzo()+"';'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet res = pstmt.executeQuery();
            pstmt.setString(1, idAlmuerzo);

            if (res.next()) {

                almuerzo = new Almuerzo();

                almuerzo.setIdAlmuerzo(res.getString("ALMUID"));
                almuerzo.setEntradaAlm(res.getString("ALMUENTRADA"));
                almuerzo.setPrincipioAlm(res.getString("ALMUPRINCIPIO"));
                almuerzo.setBebidaAlm(res.getString("ALMUBEBIDA"));
                almuerzo.setCostoAlm(res.getString("ALMUCOSTO"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe un almuerzo con ese Id");
            }
            pstmt.close();
   
            this.disconnect();
        } catch (SQLException ex) {
         Logger.getLogger(AlmuerzoRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al consultar el restaurante de la base de datos", ex);
        }
        return almuerzo;
    }
    


public List<Almuerzo> findAllAlmuerzos() {
        List<Almuerzo> objList = new ArrayList<Almuerzo>();
        this.connect();
        Almuerzo objAlmuerzo = new Almuerzo();
        try {

            String sql = "SELECT * FROM ALMUERZO ;";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet res = pstmt.executeQuery();
            while (res.next()) {

                objAlmuerzo.setEntradaAlm(res.getString("ALMUENTRADA"));
                objAlmuerzo.setPrincipioAlm(res.getString("ALMUPRINCIPIO"));
                objAlmuerzo.setProteinaAlm(res.getString("ALMUPROTEINA"));
                objAlmuerzo.setBebidaAlm(res.getString("ALMUBEBIDA"));
                objAlmuerzo.setCostoAlm(res.getString("ALMUCOSTO"));
                
                objList.add(objAlmuerzo);
                objAlmuerzo = new Almuerzo();

            }
            this.disconnect();

} catch (SQLException ex) {
            Logger.getLogger(AlmuerzoRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al consultar el restaurante de la base de datos", ex);
        }
        return objList;
    }

    @Override
    public String createAlmuerzo(Almuerzo parAlmuerzo) {
        try {
            this.connect();
            String sql = "INSERT INTO ALMUERZO (ALMUID, RESTID, ALMUCOSTO) VALUES (?,?,?); ";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, parAlmuerzo.getIdAlmuerzo());
            pstmt.setString(2, "1");
            pstmt.setString(3, parAlmuerzo.getCostoAlm());
            pstmt.executeUpdate();
            
            String sql2 = "INSERT INTO TIENE (ALMUID, COMPID, COMPIDTIPO) VALUES (?,?,?),(?,?,?),(?,?,?),(?,?,?)";
            PreparedStatement pstmt2 = conn2.prepareStatement(sql2);
            pstmt2.setString(1, parAlmuerzo.getIdAlmuerzo());
            pstmt2.setString(2, parAlmuerzo.getEntradaAlm());
            pstmt2.setString(3, "1");
            
            pstmt2.setString(4, parAlmuerzo.getIdAlmuerzo());
            pstmt2.setString(5, parAlmuerzo.getPrincipioAlm());
            pstmt2.setString(6, "2");
            
            pstmt2.setString(7, parAlmuerzo.getIdAlmuerzo());
            pstmt2.setString(8, parAlmuerzo.getProteinaAlm());
            pstmt2.setString(9, "3");
            
            pstmt2.setString(10, parAlmuerzo.getIdAlmuerzo());
            pstmt2.setString(11, parAlmuerzo.getBebidaAlm());
            pstmt2.setString(12, "4");
            
            pstmt2.executeUpdate();

            pstmt2.close();
            pstmt.close();
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(AlmuerzoRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al insertar el registro", ex);
        }
        return (parAlmuerzo.getIdAlmuerzo());
    
    }

}
