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
    String entradaAlm;
    String principioAlm;
    String proteinaAlm;
    String bebidaAlm;
    String restId;
    String costoAlm;

    /**
     *
     */
    public Almuerzo() {
    }

    public Almuerzo(String idAlmuerzo, String entradaAlm, String principioAlm, String proteinaAlm, String bebidaAlm, String restId, String costoAlm) {
        this.idAlmuerzo = idAlmuerzo;
        this.entradaAlm = entradaAlm;
        this.principioAlm = principioAlm;
        this.proteinaAlm = proteinaAlm;
        this.bebidaAlm = bebidaAlm;
        this.restId = restId;
        this.costoAlm = costoAlm;
    }

    public String getIdAlmuerzo() {
        return idAlmuerzo;
    }

    public void setIdAlmuerzo(String idAlmuerzo) {
        this.idAlmuerzo = idAlmuerzo;
    }

    public String getEntradaAlm() {
        return entradaAlm;
    }

    public void setEntradaAlm(String entradaAlm) {
        this.entradaAlm = entradaAlm;
    }

    public String getPrincipioAlm() {
        return principioAlm;
    }

    public void setPrincipioAlm(String principioAlm) {
        this.principioAlm = principioAlm;
    }

    public String getProteinaAlm() {
        return proteinaAlm;
    }

    public void setProteinaAlm(String proteinaAlm) {
        this.proteinaAlm = proteinaAlm;
    }

    public String getBebidaAlm() {
        return bebidaAlm;
    }

    public void setBebidaAlm(String bebidaAlm) {
        this.bebidaAlm = bebidaAlm;
    }

    public String getRestId() {
        return restId;
    }

    public void setRestId(String restId) {
        this.restId = restId;
    }

    public String getCostoAlm() {
        return costoAlm;
    }

    public void setCostoAlm(String costoAlm) {
        this.costoAlm = costoAlm;
    }

    

}
