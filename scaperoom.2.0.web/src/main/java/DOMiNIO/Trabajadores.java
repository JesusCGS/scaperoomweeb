/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOMiNIO;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Alumno Mañana
 */
@Entity
@Table(name = "trabajadores")
@NamedQueries({
    @NamedQuery(name = "Trabajadores.findAll", query = "SELECT t FROM Trabajadores t"),
    @NamedQuery(name = "Trabajadores.findByIdTRABAJADORES", query = "SELECT t FROM Trabajadores t WHERE t.trabajadoresPK.idTRABAJADORES = :idTRABAJADORES"),
    @NamedQuery(name = "Trabajadores.findByNombre", query = "SELECT t FROM Trabajadores t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Trabajadores.findByApellido", query = "SELECT t FROM Trabajadores t WHERE t.apellido = :apellido"),
    @NamedQuery(name = "Trabajadores.findByDni", query = "SELECT t FROM Trabajadores t WHERE t.dni = :dni"),
    @NamedQuery(name = "Trabajadores.findByCorreo", query = "SELECT t FROM Trabajadores t WHERE t.correo = :correo"),
    @NamedQuery(name = "Trabajadores.findByLOCALidLOCAL", query = "SELECT t FROM Trabajadores t WHERE t.trabajadoresPK.lOCALidLOCAL = :lOCALidLOCAL")})
public class Trabajadores implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TrabajadoresPK trabajadoresPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "apellido")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "DNI")
    private String dni;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "correo")
    private String correo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "trabajadores")
    private List<Juegos> juegosList;
    @JoinColumn(name = "LOCAL_idLOCAL", referencedColumnName = "idLOCAL", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Locall local;

    public Trabajadores() {
    }

    public Trabajadores(TrabajadoresPK trabajadoresPK) {
        this.trabajadoresPK = trabajadoresPK;
    }

    public Trabajadores(TrabajadoresPK trabajadoresPK, String nombre, String apellido, String dni, String correo) {
        this.trabajadoresPK = trabajadoresPK;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
    }

    public Trabajadores(int idTRABAJADORES, int lOCALidLOCAL) {
        this.trabajadoresPK = new TrabajadoresPK(idTRABAJADORES, lOCALidLOCAL);
    }

    public TrabajadoresPK getTrabajadoresPK() {
        return trabajadoresPK;
    }

    public void setTrabajadoresPK(TrabajadoresPK trabajadoresPK) {
        this.trabajadoresPK = trabajadoresPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Juegos> getJuegosList() {
        return juegosList;
    }

    public void setJuegosList(List<Juegos> juegosList) {
        this.juegosList = juegosList;
    }

    public Locall getLocal() {
        return local;
    }

    public void setLocal(Locall local) {
        this.local = local;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trabajadoresPK != null ? trabajadoresPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trabajadores)) {
            return false;
        }
        Trabajadores other = (Trabajadores) object;
        if ((this.trabajadoresPK == null && other.trabajadoresPK != null) || (this.trabajadoresPK != null && !this.trabajadoresPK.equals(other.trabajadoresPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DOMiNIO.Trabajadores[ trabajadoresPK=" + trabajadoresPK + " ]";
    }
    
}
