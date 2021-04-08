package co.unicauca.parkinglot.access;

import co.unicauca.parkinglot.domain.Vehicle;
import co.unicauca.parkinglot.domain.service.Service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class VehicleRepository implements IVehicleRepository {

    private Connection conn;

    public VehicleRepository() {
        initDatabase();
    }

    public boolean save(Vehicle newVehicle) {
        try {
            //Validate vehiculo
            //if (newVehicle == null || newVehicle.getProductId() < 0 || newVehicle.getName().isBlank()) {
            if (newVehicle == null ) {
                return false;
            }
            //this.connect();

            String sql = "INSERT INTO Product ( ProductId, Name, Price ) "
                    + "VALUES ( ?, ?, ? )";

            PreparedStatement pstmt = conn.prepareStatement(sql);
           /* pstmt.setInt(1, newProduct.getProductId());
            pstmt.setString(2, newProduct.getName());
            pstmt.setDouble(3, newProduct.getPrice());*/
            pstmt.executeUpdate();
            //this.disconnect();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public List<Vehicle> list() {
        List<Vehicle> vehiculos = new ArrayList<>();
        try {

            String sql = "SELECT ProductId, Name, Price FROM Product";
            //this.connect();

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Vehicle newProduct = new Vehicle();
               /* newProduct.setProductId(rs.getInt("ProductId"));
                newProduct.setName(rs.getString("Name"));
                newProduct.setPrice(rs.getDouble("Price"));*/

                vehiculos.add(newProduct);
            }
            //this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vehiculos;
    }

    private void initDatabase() {
        String sql = "CREATE TABLE IF NOT EXISTS Product (\n"
                + "	ProductId integer PRIMARY KEY,\n"
                + "	Name text NOT NULL,\n"
                + "	Price real\n"
                + ");";

        try {
            this.connect();
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            //this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:./mydatabase.db";
        //String url = "jdbc:sqlite::memory:";

        try {
            conn = DriverManager.getConnection(url);

        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void disconnect() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
