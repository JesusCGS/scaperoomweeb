/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOMINIO;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "direccion")
@NamedQueries({
    @NamedQuery(name = "Direccion.findAll", query = "SELECT d FROM Direccion d"),
    @NamedQuery(name = "Direccion.findByIdDIRECCION", query = "SELECT d FROM Direccion d WHERE d.idDIRECCION = :idDIRECCION"),
    @NamedQuery(name = "Direccion.findByCalle", query = "SELECT d FROM Direccion d WHERE d.calle = :calle"),
    @NamedQuery(name = "Direccion.findByCiudad", query = "SELECT d FROM Direccion d WHERE d.ciudad = :ciudad")})
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
    private List<Local> localList;

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

    public List<Local> getLocalList() {
        return localList;
    }

    public void setLocalList(List<Local> localList) {
        this.localList = localList;
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
        return "DOMINIO.Direccion[ idDIRECCION=" + idDIRECCION + " ]";
    }
    
}
