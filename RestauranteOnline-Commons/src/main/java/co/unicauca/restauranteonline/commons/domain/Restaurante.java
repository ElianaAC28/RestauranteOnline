package co.unicauca.restauranteonline.commons.domain;

import java.util.Date;

/**
 * Restaurante
 *
 * @author Libardo, Julio
 */
public class Restaurante {

    /**
     * id
     */
    private String restId;
    /**
     * Nombre del restaurante
     */
    private String restNombre;
    /**
     * Eslogan
     */
    private String restEslogan;
    /**
     * Propietario
     */
    private String restPropietario;
    /**
     * Dirección
     */
    private String restDireccion;
    /**
     * Telefono
     */
    private String restTelefono;
    /**
     * Ciudad
     */
    private String restCiudad;
    /**
     * Administrador
     */
    private String restAdmin;

   

    /**
     * Constructor parametrizado
     *
     * @param restId
     * @param restEslogan
     * @param restNombre
     * @param restPropietario
     * @param restTelefono
     * @param restDireccion
     * @param restAdmin
     * @param restCiudad
     */
    public Restaurante(String restId, String restNombre, String restEslogan, String restPropietario, String restDireccion, String restTelefono, String restCiudad, String restAdmin) {    
        this.restId = restId;
        this.restNombre = restNombre;
        this.restEslogan = restEslogan;
        this.restPropietario = restPropietario;
        this.restDireccion = restDireccion;
        this.restTelefono = restTelefono;
        this.restCiudad = restCiudad;
        this.restAdmin = restAdmin;
    }

    /**
     *
     * @return
     */
    public String getRestId() {
        return restId;
    }

    /**
     *
     * @param restId
     */
    public void setRestId(String restId) {
        this.restId = restId;
    }

    /**
     *
     * @return
     */
    public String getRestNombre() {
        return restNombre;
    }

    /**
     *
     * @param restNombre
     */
    public void setRestNombre(String restNombre) {
        this.restNombre = restNombre;
    }

    /**
     *
     * @return
     */
    public String getRestEslogan() {
        return restEslogan;
    }

    /**
     *
     * @param restEslogan
     */
    public void setRestEslogan(String restEslogan) {
        this.restEslogan = restEslogan;
    }

    /**
     *
     * @return
     */
    public String getRestPropietario() {
        return restPropietario;
    }

    /**
     *
     * @param restPropietario
     */
    public void setRestPropietario(String restPropietario) {
        this.restPropietario = restPropietario;
    }

    /**
     *
     * @return
     */
    public String getRestDireccion() {
        return restDireccion;
    }

    /**
     *
     * @param restDireccion
     */
    public void setRestDireccion(String restDireccion) {
        this.restDireccion = restDireccion;
    }

    /**
     *
     * @return
     */
    public String getRestTelefono() {
        return restTelefono;
    }

    /**
     *
     * @param restTelefono
     */
    public void setRestTelefono(String restTelefono) {
        this.restTelefono = restTelefono;
    }

    /**
     *
     * @return
     */
    public String getRestCiudad() {
        return restCiudad;
    }

    /**
     *
     * @param restCiudad
     */
    public void setRestCiudad(String restCiudad) {
        this.restCiudad = restCiudad;
    }

    /**
     *
     * @return
     */
    public String getRestAdmin() {
        return restAdmin;
    }

    /**
     *
     * @param restAdmin
     */
    public void setRestAdmin(String restAdmin) {
        this.restAdmin = restAdmin;
    }
    

}
