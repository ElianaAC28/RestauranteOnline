package co.unicauca.restauranteonline.server.access;

import co.unicauca.restauranteonline.commons.domain.Customer;
import co.unicauca.restauranteonline.commons.infra.Utilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Repositorio de Clientes en MySWL
 *
 * @author SoftwareTeam
 */
public class CustomerRepositoryImplMysql implements ICustomerRepository {

    /**
     * Conección con Mysql
     */
    private Connection conn;

    public CustomerRepositoryImplMysql() {

    }

    /**
     * Busca cliente en la base de datos
     *
     * @param id
     * @return
     */
    public Customer findCustomer(String id) {
        Customer customer = null;

        this.connect();
        try {
            String sql = "SELECT * from usuario where id=? ";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            ResultSet res = pstmt.executeQuery();
            if (res.next()) {
                customer = new Customer();
                /* customer.setId(res.getString("id"));
                customer.setFirstName(res.getString("first_name"));
                customer.setLastName(res.getString("last_name"));
                customer.setAddress(res.getString("address"));
                customer.setMobile(res.getString("mobile"));
                customer.setGender(res.getString("gender"));
                customer.setEmail(res.getString("email"));
                 */
            }
            pstmt.close();
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al consultar Customer de la base de datos", ex);
        }
        return customer;
    }
    /**
     * Autentica al usuario
     * @param username
     * @param userpassword
     * @return
     */
    public boolean autenticarCustomer(String username, String userpassword) {
        Customer customer = null;
        boolean ingreso = false;
        this.connect();
        try {
            String sql = "SELECT * from usuario where username='" + username + "' and  userpassword='" + userpassword + "'";
            Statement pstmt = conn.createStatement();
            ResultSet res = pstmt.executeQuery(sql);
            if (res.next()) {
                ingreso = true;
                return ingreso;

            }
            pstmt.close();
            this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al consultar Customer de la base de datos", ex);
        }
        return ingreso;
    }
    /**
     * Crea un usuario 
     * @param customer
     * @return
     */
    @Override
    public String createCustomer(Customer customer) {

        try {

            this.connect();
            String sql = "INSERT INTO customers(id, first_name, last_name, address, mobile, email, gender) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            /*   pstmt.setString(1, customer.getId());
            pstmt.setString(2, customer.getFirstName());
            pstmt.setString(3, customer.getLastName());
            pstmt.setString(4, customer.getAddress());
            pstmt.setString(5, customer.getMobile());
            pstmt.setString(6, customer.getEmail());
            pstmt.setString(7, customer.getGender());

             */
            pstmt.executeUpdate();
            pstmt.close();
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al insertar el registro", ex);
        }
        String e = null;
        return e;
        //customer.getId();

    }

    /**
     * Permite hacer la conexion con la base de datos
     *
     * @return
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
            Logger.getLogger(CustomerRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al consultar Customer de la base de datos", ex);
        }
        return -1;
    }

    /**
     * Cierra la conexion con la base de datos
     *
     */
    public void disconnect() {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepositoryImplMysql.class.getName()).log(Level.FINER, "Error al cerrar Connection", ex);
        }
    }

}
