/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOMINIO;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Alumno Mañana
 */
@Embeddable
public class SalaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idsala")
    private int idsala;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LOCAL_idLOCAL")
    private int lOCALidLOCAL;

    public SalaPK() {
    }

    public SalaPK(int idsala, int lOCALidLOCAL) {
        this.idsala = idsala;
        this.lOCALidLOCAL = lOCALidLOCAL;
    }

    public int getIdsala() {
        return idsala;
    }

    public void setIdsala(int idsala) {
        this.idsala = idsala;
    }

    public int getLOCALidLOCAL() {
        return lOCALidLOCAL;
    }

    public void setLOCALidLOCAL(int lOCALidLOCAL) {
        this.lOCALidLOCAL = lOCALidLOCAL;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idsala;
        hash += (int) lOCALidLOCAL;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalaPK)) {
            return false;
        }
        SalaPK other = (SalaPK) object;
        if (this.idsala != other.idsala) {
            return false;
        }
        if (this.lOCALidLOCAL != other.lOCALidLOCAL) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DOMINIO.SalaPK[ idsala=" + idsala + ", lOCALidLOCAL=" + lOCALidLOCAL + " ]";
    }
    
}
