package co.unicauca.restauranteonline.commons.domain;

import java.util.Date;

/**
 * Cliente del restaurante
 *
 * @author Libardo, Julio
 */
public class Customer {

    private String id;

 
    /**
     * Nombre Cliente
     */
    private String nombreCliente;
    /**
     * Fecha Nacimiento
     */
    private Date fechaNac;
    /**
     * Genero
     */
    private String genero;
    /**
     * Email 
     */
    private String email;
    /**
     * Contraseña
     */
    private String contrasena;
    /**
     * Celular
     */
    private String celular;

    /**
     * Constructor
     */
    public Customer() {
    }

    public Customer(String id, String nombreCliente, Date fechaNac, String genero, String email, String contrasena, String celular) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.fechaNac = fechaNac;
        this.genero = genero;
        this.email = email;
        this.contrasena = contrasena;
        this.celular = celular;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    

    

 
}
