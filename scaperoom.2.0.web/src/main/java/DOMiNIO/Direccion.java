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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "direccion")
public class Direccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDIRECCION")
    private Integer idDIRECCION;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "calle")
    private String calle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "ciudad")
    private String ciudad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "direccion")
    private List<Locall> locallList;

    public Direccion() {
    }

    public Direccion(Integer idDIRECCION) {
        this.idDIRECCION = idDIRECCION;
    }

    public Direccion(Integer idDIRECCION, String calle, String ciudad) {
        this.idDIRECCION = idDIRECCION;
        this.calle = calle;
        this.ciudad = ciudad;
    }

    public Integer getIdDIRECCION() {
        return idDIRECCION;
    }

    public void setIdDIRECCION(Integer idDIRECCION) {
        this.idDIRECCION = idDIRECCION;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Locall> getLocallList() {
        return locallList;
    }

    public void setLocallList(List<Locall> locallList) {
        this.locallList = locallList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDIRECCION != null ? idDIRECCION.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Direccion)) {
            return false;
        }
        Direccion other = (Direccion) object;
        if ((this.idDIRECCION == null && other.idDIRECCION != null) || (this.idDIRECCION != null && !this.idDIRECCION.equals(other.idDIRECCION))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DOMiNIO.Direccion[ idDIRECCION=" + idDIRECCION + " ]";
    }
    
}
