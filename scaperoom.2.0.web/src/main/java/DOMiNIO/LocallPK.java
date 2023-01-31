/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOMiNIO;

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
public class LocallPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idLOCALL")
    private int idLOCALL;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DIRECCION_idDIRECCION")
    private int dIRECCIONidDIRECCION;

    public LocallPK() {
    }

    public LocallPK(int idLOCALL, int dIRECCIONidDIRECCION) {
        this.idLOCALL = idLOCALL;
        this.dIRECCIONidDIRECCION = dIRECCIONidDIRECCION;
    }

    public int getIdLOCALL() {
        return idLOCALL;
    }

    public void setIdLOCALL(int idLOCALL) {
        this.idLOCALL = idLOCALL;
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
        hash += (int) idLOCALL;
        hash += (int) dIRECCIONidDIRECCION;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LocallPK)) {
            return false;
        }
        LocallPK other = (LocallPK) object;
        if (this.idLOCALL != other.idLOCALL) {
            return false;
        }
        if (this.dIRECCIONidDIRECCION != other.dIRECCIONidDIRECCION) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DOMiNIO.LocallPK[ idLOCALL=" + idLOCALL + ", dIRECCIONidDIRECCION=" + dIRECCIONidDIRECCION + " ]";
    }
    
}
