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
public class TrabajadoresPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idTRABAJADORES")
    private int idTRABAJADORES;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LOCAL_idLOCAL")
    private int lOCALidLOCAL;

    public TrabajadoresPK() {
    }

    public TrabajadoresPK(int idTRABAJADORES, int lOCALidLOCAL) {
        this.idTRABAJADORES = idTRABAJADORES;
        this.lOCALidLOCAL = lOCALidLOCAL;
    }

    public int getIdTRABAJADORES() {
        return idTRABAJADORES;
    }

    public void setIdTRABAJADORES(int idTRABAJADORES) {
        this.idTRABAJADORES = idTRABAJADORES;
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
        hash += (int) idTRABAJADORES;
        hash += (int) lOCALidLOCAL;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrabajadoresPK)) {
            return false;
        }
        TrabajadoresPK other = (TrabajadoresPK) object;
        if (this.idTRABAJADORES != other.idTRABAJADORES) {
            return false;
        }
        if (this.lOCALidLOCAL != other.lOCALidLOCAL) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DOMINIO.TrabajadoresPK[ idTRABAJADORES=" + idTRABAJADORES + ", lOCALidLOCAL=" + lOCALidLOCAL + " ]";
    }
    
}
