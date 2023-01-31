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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Alumno Mañana
 */
@MappedSuperclass
@Table(name = "locall")
public class Locall implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LocallPK locallPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tlf")
    private int tlf;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "locall")
    private List<Trabajadores> trabajadoresList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "locall")
    private List<Sala> salaList;
    @JoinColumn(name = "DIRECCION_idDIRECCION", referencedColumnName = "idDIRECCION", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Direccion direccion;

    public Locall() {
    }

    public Locall(LocallPK locallPK) {
        this.locallPK = locallPK;
    }

    public Locall(LocallPK locallPK, String nombre, int tlf) {
        this.locallPK = locallPK;
        this.nombre = nombre;
        this.tlf = tlf;
    }

    public Locall(int idLOCALL, int dIRECCIONidDIRECCION) {
        this.locallPK = new LocallPK(idLOCALL, dIRECCIONidDIRECCION);
    }

    public LocallPK getLocallPK() {
        return locallPK;
    }

    public void setLocallPK(LocallPK locallPK) {
        this.locallPK = locallPK;
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
        hash += (locallPK != null ? locallPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Locall)) {
            return false;
        }
        Locall other = (Locall) object;
        if ((this.locallPK == null && other.locallPK != null) || (this.locallPK != null && !this.locallPK.equals(other.locallPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DOMiNIO.Locall[ locallPK=" + locallPK + " ]";
    }
    
}
