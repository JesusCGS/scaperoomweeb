/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOMINIO;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Alumno Mañana
 */
@Entity
@Table(name = "reserva")
@NamedQueries({
    @NamedQuery(name = "Reserva.findAll", query = "SELECT r FROM Reserva r"),
    @NamedQuery(name = "Reserva.findByIdRESERVA", query = "SELECT r FROM Reserva r WHERE r.reservaPK.idRESERVA = :idRESERVA"),
    @NamedQuery(name = "Reserva.findByNombre", query = "SELECT r FROM Reserva r WHERE r.nombre = :nombre"),
    @NamedQuery(name = "Reserva.findByFechaHora", query = "SELECT r FROM Reserva r WHERE r.fechaHora = :fechaHora"),
    @NamedQuery(name = "Reserva.findByUSUARIOidUSUARIO", query = "SELECT r FROM Reserva r WHERE r.reservaPK.uSUARIOidUSUARIO = :uSUARIOidUSUARIO"),
    @NamedQuery(name = "Reserva.findByJUEGOSidJuego", query = "SELECT r FROM Reserva r WHERE r.reservaPK.jUEGOSidJuego = :jUEGOSidJuego")})
public class Reserva implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ReservaPK reservaPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaHora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora;
    @JoinColumn(name = "JUEGOS_idJuego", referencedColumnName = "idJuego", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Juegos juegos;
    @JoinColumn(name = "USUARIO_idUSUARIO", referencedColumnName = "idUSUARIO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;

    public Reserva() {
    }

    public Reserva(ReservaPK reservaPK) {
        this.reservaPK = reservaPK;
    }

    public Reserva(ReservaPK reservaPK, String nombre, Date fechaHora) {
        this.reservaPK = reservaPK;
        this.nombre = nombre;
        this.fechaHora = fechaHora;
    }

    public Reserva(int idRESERVA, int uSUARIOidUSUARIO, int jUEGOSidJuego) {
        this.reservaPK = new ReservaPK(idRESERVA, uSUARIOidUSUARIO, jUEGOSidJuego);
    }

    public ReservaPK getReservaPK() {
        return reservaPK;
    }

    public void setReservaPK(ReservaPK reservaPK) {
        this.reservaPK = reservaPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Juegos getJuegos() {
        return juegos;
    }

    public void setJuegos(Juegos juegos) {
        this.juegos = juegos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reservaPK != null ? reservaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reserva)) {
            return false;
        }
        Reserva other = (Reserva) object;
        if ((this.reservaPK == null && other.reservaPK != null) || (this.reservaPK != null && !this.reservaPK.equals(other.reservaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DOMINIO.Reserva[ reservaPK=" + reservaPK + " ]";
    }
    
}
