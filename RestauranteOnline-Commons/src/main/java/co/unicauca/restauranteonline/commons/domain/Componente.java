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
    private Integer idComponente;

    /**
     * Id del restaurante
     */
    private Integer idRestaurante;
    /**
     * Nombre Componente
     */
    private String nombreComponente;
    /**
     * Tipo de componente
     */
    private String tipoComponente;
    /**
     * ide Tipo de componente
     */
    private Integer idtipoComponente;
    
    // Sigleton
    public Componente() {
    }
    
    //Cosntructor parametrizado 

    public Componente(Integer idComponente, Integer idRestaurante, String nombreComponente, String tipoComponente, Integer idtipoComponente) {
        this.idComponente = idComponente;
        this.idRestaurante = idRestaurante;
        this.nombreComponente = nombreComponente;
        this.tipoComponente = tipoComponente;
        this.idtipoComponente = idtipoComponente;
    }

    

    //Getters and Setters 

    public Integer getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(Integer idComponente) {
        this.idComponente = idComponente;
    }

    public Integer getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(Integer idRestaurante) {
        this.idRestaurante = idRestaurante;
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

    public Integer getIdtipoComponente() {
        return idtipoComponente;
    }

    public void setIdtipoComponente(Integer idtipoComponente) {
        this.idtipoComponente = idtipoComponente;
    }
    
} 
    