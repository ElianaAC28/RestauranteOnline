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
    String entradaAlm;
    String principioAlm;
    String proteinaAlm;
    String bebidaAlm;
    int costoAlm;

    /**
     *
     */
    public Almuerzo() {
    }

    public Almuerzo(String idAlmuerzo, String restId, String entradaAlm, String principioAlm, String proteinaAlm, String bebidaAlm, int costoAlm) {
        this.idAlmuerzo = idAlmuerzo;
        this.restId = restId;
        this.entradaAlm = entradaAlm;
        this.principioAlm = principioAlm;
        this.proteinaAlm = proteinaAlm;
        this.bebidaAlm = bebidaAlm;
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

    public int getCostoAlm() {
        return costoAlm;
    }

    public void setCostoAlm(int costoAlm) {
        this.costoAlm = costoAlm;
    }

    /**
     *
     * @param idAlmuerzo
     * @param entradaAlm
     * @param principioAlm
     * @param proteinaAlm
     * @param bebidaAlm
     * @param costoAlm
     */
   

   

    
    
}
