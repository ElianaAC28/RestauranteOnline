/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restauranteonline.commons.domain;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Componente {

    /**
     * Id del componente
     */
    private String idComponente;

    /**
     * Nombre Componente
     */
    private String nombreComponente;
    /**
     * Tipo de componente
     */
    private String tipoComponente;

    // Sigleton
    public Componente() {
    }
    
    //Cosntructor parametrizado 
    public Componente(String idComponente, String nombreComponente, String tipoComponente) {
        this.idComponente = idComponente;
        this.nombreComponente = nombreComponente;
        this.tipoComponente = tipoComponente;
    }
    
    //Getters and Setters 
    public String getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(String idComponente) {
        this.idComponente = idComponente;
    }

    public String getNombreComponente() {
        return nombreComponente;
    }

    public void setNombreComponente(String nombreComponente) {
        this.nombreComponente = nombreComponente;
    }

    public String getTipoComponente() {
        return tipoComponente;
    }

    public void setTipoComponente(String tipoComponente) {
        this.tipoComponente = tipoComponente;
    }

    
}
