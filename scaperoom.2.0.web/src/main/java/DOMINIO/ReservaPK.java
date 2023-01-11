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
public class ReservaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idRESERVA")
    private int idRESERVA;
    @Basic(optional = false)
    @NotNull
    @Column(name = "USUARIO_idUSUARIO")
    private int uSUARIOidUSUARIO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "JUEGOS_idJuego")
    private int jUEGOSidJuego;

    public ReservaPK() {
    }

    public ReservaPK(int idRESERVA, int uSUARIOidUSUARIO, int jUEGOSidJuego) {
        this.idRESERVA = idRESERVA;
        this.uSUARIOidUSUARIO = uSUARIOidUSUARIO;
        this.jUEGOSidJuego = jUEGOSidJuego;
    }

    public int getIdRESERVA() {
        return idRESERVA;
    }

    public void setIdRESERVA(int idRESERVA) {
        this.idRESERVA = idRESERVA;
    }

    public int getUSUARIOidUSUARIO() {
        return uSUARIOidUSUARIO;
    }

    public void setUSUARIOidUSUARIO(int uSUARIOidUSUARIO) {
        this.uSUARIOidUSUARIO = uSUARIOidUSUARIO;
    }

    public int getJUEGOSidJuego() {
        return jUEGOSidJuego;
    }

    public void setJUEGOSidJuego(int jUEGOSidJuego) {
        this.jUEGOSidJuego = jUEGOSidJuego;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idRESERVA;
        hash += (int) uSUARIOidUSUARIO;
        hash += (int) jUEGOSidJuego;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReservaPK)) {
            return false;
        }
        ReservaPK other = (ReservaPK) object;
        if (this.idRESERVA != other.idRESERVA) {
            return false;
        }
        if (this.uSUARIOidUSUARIO != other.uSUARIOidUSUARIO) {
            return false;
        }
        if (this.jUEGOSidJuego != other.jUEGOSidJuego) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DOMINIO.ReservaPK[ idRESERVA=" + idRESERVA + ", uSUARIOidUSUARIO=" + uSUARIOidUSUARIO + ", jUEGOSidJuego=" + jUEGOSidJuego + " ]";
    }
    
}
