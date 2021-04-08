package co.unicauca.restauranteonline.commons.domain;

import java.util.Date;

/**
 * Cliente del restaurante
 *
 * @author Libardo, Julio
 */
public class Customer {

    private String userName;
    /**
     * Nombre Cliente
     */
    private String userPassword;
    /**
     * Nombre Cliente
     */
    private String userNombre;
    /**
     * Apellido Cliente
     */
    private String userApellido;
    /**
     * Fecha Nacimiento
     */
    private Date userFechaNac;
    /**
     * Genero
     */
    private String userGenero;
    /**
     * Nombre Cliente
     */
    private int userCelular;
    /**
     * Email
     */
    private String userEmail;

    public Customer(String userName, String userPassword, String userNombre, String userApellido, Date userFechaNac, String userGenero, int userCelular, String userEmail) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userNombre = userNombre;
        this.userApellido = userApellido;
        this.userFechaNac = userFechaNac;
        this.userGenero = userGenero;
        this.userCelular = userCelular;
        this.userEmail = userEmail;
    }
    //CONSTRUCTOR POR DEFECTO
    public Customer() {

    }
    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserNombre() {
        return userNombre;
    }

    public String getUserApellido() {
        return userApellido;
    }

    public Date getUserFechaNac() {
        return userFechaNac;
    }

    public String getUserGenero() {
        return userGenero;
    }

    public int getUserCelular() {
        return userCelular;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserNombre(String userNombre) {
        this.userNombre = userNombre;
    }

    public void setUserApellido(String userApellido) {
        this.userApellido = userApellido;
    }

    public void setUserFechaNac(Date userFechaNac) {
        this.userFechaNac = userFechaNac;
    }

    public void setUserGenero(String userGenero) {
        this.userGenero = userGenero;
    }

    public void setUserCelular(int userCelular) {
        this.userCelular = userCelular;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
