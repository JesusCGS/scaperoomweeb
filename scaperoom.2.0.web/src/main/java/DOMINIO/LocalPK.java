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
public class LocalPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idLOCAL")
    private int idLOCAL;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DIRECCION_idDIRECCION")
    private int dIRECCIONidDIRECCION;

    public LocalPK() {
    }

    public LocalPK(int idLOCAL, int dIRECCIONidDIRECCION) {
        this.idLOCAL = idLOCAL;
        this.dIRECCIONidDIRECCION = dIRECCIONidDIRECCION;
    }

    public int getIdLOCAL() {
        return idLOCAL;
    }

    public void setIdLOCAL(int idLOCAL) {
        this.idLOCAL = idLOCAL;
    }

    public int getDIRECCIONidDIRECCION() {
        return dIRECCIONidDIRECCION;
    }

    public void setDIRECCIONidDIRECCION(int dIRECCIONidDIRECCION) {
        this.dIRECCIONidDIRECCION = dIRECCIONidDIRECCION;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idLOCAL;
        hash += (int) dIRECCIONidDIRECCION;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LocalPK)) {
            return false;
        }
        LocalPK other = (LocalPK) object;
        if (this.idLOCAL != other.idLOCAL) {
            return false;
        }
        if (this.dIRECCIONidDIRECCION != other.dIRECCIONidDIRECCION) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DOMINIO.LocalPK[ idLOCAL=" + idLOCAL + ", dIRECCIONidDIRECCION=" + dIRECCIONidDIRECCION + " ]";
    }
    
}
