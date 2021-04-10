/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restauranteonline.commons.domain;

/**
 *
 * @author AC
 */
public class Almuerzo {

    String idAlmuerzo;
    String restId;
    String comp;
    String idComp;
    String costoAlm;

    /**
     *
     */
    public Almuerzo() {
    }

    public Almuerzo(String idAlmuerzo, String restId, String comp, String idComp, String costoAlm) {
        this.idAlmuerzo = idAlmuerzo;
        this.restId = restId;
        this.comp = comp;
        this.idComp = idComp;
        this.costoAlm = costoAlm;
    }

    public String getIdAlmuerzo() {
        return idAlmuerzo;
    }

    public void setIdAlmuerzo(String idAlmuerzo) {
        this.idAlmuerzo = idAlmuerzo;
    }

    public String getRestId() {
        return restId;
    }

    public void setRestId(String restId) {
        this.restId = restId;
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }

    public String getIdComp() {
        return idComp;
    }

    public void setIdComp(String idComp) {
        this.idComp = idComp;
    }

    public String getCostoAlm() {
        return costoAlm;
    }

    public void setCostoAlm(String costoAlm) {
        this.costoAlm = costoAlm;
    }

    
}
