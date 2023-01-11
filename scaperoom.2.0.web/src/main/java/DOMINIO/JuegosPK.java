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
public class JuegosPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idJuego")
    private int idJuego;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TRABAJADORES_idTRABAJADORES")
    private int tRABAJADORESidTRABAJADORES;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sala_idsala")
    private int salaIdsala;

    public JuegosPK() {
    }

    public JuegosPK(int idJuego, int tRABAJADORESidTRABAJADORES, int salaIdsala) {
        this.idJuego = idJuego;
        this.tRABAJADORESidTRABAJADORES = tRABAJADORESidTRABAJADORES;
        this.salaIdsala = salaIdsala;
    }

    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public int getTRABAJADORESidTRABAJADORES() {
        return tRABAJADORESidTRABAJADORES;
    }

    public void setTRABAJADORESidTRABAJADORES(int tRABAJADORESidTRABAJADORES) {
        this.tRABAJADORESidTRABAJADORES = tRABAJADORESidTRABAJADORES;
    }

    public int getSalaIdsala() {
        return salaIdsala;
    }

    public void setSalaIdsala(int salaIdsala) {
        this.salaIdsala = salaIdsala;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idJuego;
        hash += (int) tRABAJADORESidTRABAJADORES;
        hash += (int) salaIdsala;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JuegosPK)) {
            return false;
        }
        JuegosPK other = (JuegosPK) object;
        if (this.idJuego != other.idJuego) {
            return false;
        }
        if (this.tRABAJADORESidTRABAJADORES != other.tRABAJADORESidTRABAJADORES) {
            return false;
        }
        if (this.salaIdsala != other.salaIdsala) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DOMINIO.JuegosPK[ idJuego=" + idJuego + ", tRABAJADORESidTRABAJADORES=" + tRABAJADORESidTRABAJADORES + ", salaIdsala=" + salaIdsala + " ]";
    }
    
}
