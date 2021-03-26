package co.unicauca.restauranteonline.commons.domain;

import java.util.Date;

/**
 * Cliente del restaurante
 *
 * @author Libardo, Julio
 */
public class Customer {

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

    /**
     *
     * @param nombreCliente
     * @param fechaNac
     * @param genero
     * @param email
     * @param contrasena
     * @param celular
     */
    public Customer(String nombreCliente, Date fechaNac, String genero, String email, String contrasena, String celular) {
        this.nombreCliente = nombreCliente;
        this.fechaNac = fechaNac;
        this.genero = genero;
        this.email = email;
        this.contrasena = contrasena;
        this.celular = celular;
    }

    /**
     *
     * @return
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     *
     * @param nombreCliente
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     *
     * @return
     */
    public Date getFechaNac() {
        return fechaNac;
    }

    /**
     *
     * @param fechaNac
     */
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    /**
     *
     * @return
     */
    public String getGenero() {
        return genero;
    }

    /**
     *
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     *
     * @param contrasena
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     *
     * @return
     */
    public String getCelular() {
        return celular;
    }

    /**
     *
     * @param celular
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }
  
    

 
}
