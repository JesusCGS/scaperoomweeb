/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOMiNIO;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Alumno Mañana
 */
@MappedSuperclass
@Table(name = "juegos")
public class Juegos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected JuegosPK juegosPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "dificultad")
    private String dificultad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ambientacion")
    private String ambientacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "num_jugadores")
    private int numJugadores;
    @Basic(optional = false)
    @NotNull
    @Column(name = "duracion")
    @Temporal(TemporalType.TIME)
    private Date duracion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private double precio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "edad_min")
    private int edadMin;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "foto")
    private byte[] foto;
    @JoinColumn(name = "sala_idsala", referencedColumnName = "idsala", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Sala sala;
    @JoinColumn(name = "TRABAJADORES_idTRABAJADORES", referencedColumnName = "idTRABAJADORES", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Trabajadores trabajadores;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "juegos")
    private List<Reserva> reservaList;

    public Juegos() {
    }

    public Juegos(JuegosPK juegosPK) {
        this.juegosPK = juegosPK;
    }

    public Juegos(JuegosPK juegosPK, String nombre, String descripcion, String dificultad, String ambientacion, int numJugadores, Date duracion, double precio, int edadMin, byte[] foto) {
        this.juegosPK = juegosPK;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.dificultad = dificultad;
        this.ambientacion = ambientacion;
        this.numJugadores = numJugadores;
        this.duracion = duracion;
        this.precio = precio;
        this.edadMin = edadMin;
        this.foto = foto;
    }

    public Juegos(int idJuego, int tRABAJADORESidTRABAJADORES, int salaIdsala) {
        this.juegosPK = new JuegosPK(idJuego, tRABAJADORESidTRABAJADORES, salaIdsala);
    }

    public JuegosPK getJuegosPK() {
        return juegosPK;
    }

    public void setJuegosPK(JuegosPK juegosPK) {
        this.juegosPK = juegosPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getAmbientacion() {
        return ambientacion;
    }

    public void setAmbientacion(String ambientacion) {
        this.ambientacion = ambientacion;
    }

    public int getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

    public Date getDuracion() {
        return duracion;
    }

    public void setDuracion(Date duracion) {
        this.duracion = duracion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Trabajadores getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(Trabajadores trabajadores) {
        this.trabajadores = trabajadores;
    }

    public List<Reserva> getReservaList() {
        return reservaList;
    }

    public void setReservaList(List<Reserva> reservaList) {
        this.reservaList = reservaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (juegosPK != null ? juegosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Juegos)) {
            return false;
        }
        Juegos other = (Juegos) object;
        if ((this.juegosPK == null && other.juegosPK != null) || (this.juegosPK != null && !this.juegosPK.equals(other.juegosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DOMiNIO.Juegos[ juegosPK=" + juegosPK + " ]";
    }
    
}
