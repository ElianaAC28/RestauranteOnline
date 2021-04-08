package co.unicauca.restauranteonline.commons.domain;

import java.util.Date;

/**
 * Restaurante
 *
 * @author Libardo, Julio
 */
public class Restaurante {

    /**
     * NIT
     */
    private String nit;
    /**
     * Nombre del restaurante
     */
    private String nombreRestaurante;
    /**
     * Eslogan
     */
    private String eslogan;
    /**
     * Propietario
     */
    private String propietario;
    /**
     * Dirección
     */
    private String direccion;
    /**
     * Telefono
     */
    private String telefono;
    /**
     * Ciudad
     */
    private String ciudad;
    /**
     * Administrador
     */
    private String administrador;
    /**
     * Fotografía
     */
    private String fotografía;
   

    /**
     * Constructor parametrizado
     *
     * @param nit
     * @param eslogan
     * @param nombreRestaurante
     * @param propietario
     * @param telefono
     * @param direccion
     * @param administrador
     * @param ciudad
     * @param fotografía
     */
    public Restaurante(String nit, String nombreRestaurante, String eslogan, String propietario, String direccion, String telefono, String ciudad, String administrador, String fotografía) {    
        this.nit = nit;
        this.nombreRestaurante = nombreRestaurante;
        this.eslogan = eslogan;
        this.propietario = propietario;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.administrador = administrador;
        this.fotografía = fotografía;

    }

    /**
     *
     * @return
     */
    public String getNit() {
        return nit;
    }

    /**
     *
     * @param nit
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     *
     * @return
     */
    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    /**
     *
     * @param nombreRestaurante
     */
    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    /**
     *
     * @return
     */
    public String getEslogan() {
        return eslogan;
    }

    /**
     *
     * @param eslogan
     */
    public void setEslogan(String eslogan) {
        this.eslogan = eslogan;
    }

    /**
     *
     * @return
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     *
     * @param propietario
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    /**
     *
     * @return
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     *
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     *
     * @return
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     *
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     *
     * @return
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     *
     * @param ciudad
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     *
     * @return
     */
    public String getAdministrador() {
        return administrador;
    }

    /**
     *
     * @param administrador
     */
    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }

    /**
     *
     * @return
     */
    public String getFotografía() {
        return fotografía;
    }

    /**
     *
     * @param fotografía
     */
    public void setFotografía(String fotografía) {
        this.fotografía = fotografía;
    }
    

}
