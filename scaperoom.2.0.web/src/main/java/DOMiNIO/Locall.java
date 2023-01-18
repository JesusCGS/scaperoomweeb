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
@Table(name = "local")
@NamedQueries({
    @NamedQuery(name = "Local.findAll", query = "SELECT l FROM Local l"),
    @NamedQuery(name = "Local.findByIdLOCAL", query = "SELECT l FROM Local l WHERE l.localPK.idLOCAL = :idLOCAL"),
    @NamedQuery(name = "Local.findByNombre", query = "SELECT l FROM Local l WHERE l.nombre = :nombre"),
    @NamedQuery(name = "Local.findByTlf", query = "SELECT l FROM Local l WHERE l.tlf = :tlf"),
    @NamedQuery(name = "Local.findByDIRECCIONidDIRECCION", query = "SELECT l FROM Local l WHERE l.localPK.dIRECCIONidDIRECCION = :dIRECCIONidDIRECCION")})
public class Locall implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LocalPK localPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tlf")
    private int tlf;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "local")
    private List<Trabajadores> trabajadoresList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "local")
    private List<Sala> salaList;
    @JoinColumn(name = "DIRECCION_idDIRECCION", referencedColumnName = "idDIRECCION", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Direccion direccion;

    public Locall() {
    }

    public Locall(LocalPK localPK) {
        this.localPK = localPK;
    }

    public Locall(LocalPK localPK, String nombre, int tlf) {
        this.localPK = localPK;
        this.nombre = nombre;
        this.tlf = tlf;
    }

    public Locall(int idLOCAL, int dIRECCIONidDIRECCION) {
        this.localPK = new LocalPK(idLOCAL, dIRECCIONidDIRECCION);
    }

    public LocalPK getLocalPK() {
        return localPK;
    }

    public void setLocalPK(LocalPK localPK) {
        this.localPK = localPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public List<Trabajadores> getTrabajadoresList() {
        return trabajadoresList;
    }

    public void setTrabajadoresList(List<Trabajadores> trabajadoresList) {
        this.trabajadoresList = trabajadoresList;
    }

    public List<Sala> getSalaList() {
        return salaList;
    }

    public void setSalaList(List<Sala> salaList) {
        this.salaList = salaList;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (localPK != null ? localPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Locall)) {
            return false;
        }
        Locall other = (Locall) object;
        if ((this.localPK == null && other.localPK != null) || (this.localPK != null && !this.localPK.equals(other.localPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DOMiNIO.Local[ localPK=" + localPK + " ]";
    }
    
}
