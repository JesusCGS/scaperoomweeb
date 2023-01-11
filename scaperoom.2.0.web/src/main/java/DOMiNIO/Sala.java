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

/**
 *
 * @author Alumno Mañana
 */
@Entity
@Table(name = "sala")
@NamedQueries({
    @NamedQuery(name = "Sala.findAll", query = "SELECT s FROM Sala s"),
    @NamedQuery(name = "Sala.findByIdsala", query = "SELECT s FROM Sala s WHERE s.salaPK.idsala = :idsala"),
    @NamedQuery(name = "Sala.findByNumSala", query = "SELECT s FROM Sala s WHERE s.numSala = :numSala"),
    @NamedQuery(name = "Sala.findByLOCALidLOCAL", query = "SELECT s FROM Sala s WHERE s.salaPK.lOCALidLOCAL = :lOCALidLOCAL")})
public class Sala implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SalaPK salaPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "num_sala")
    private int numSala;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sala")
    private List<Juegos> juegosList;
    @JoinColumn(name = "LOCAL_idLOCAL", referencedColumnName = "idLOCAL", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Local local;

    public Sala() {
    }

    public Sala(SalaPK salaPK) {
        this.salaPK = salaPK;
    }

    public Sala(SalaPK salaPK, int numSala) {
        this.salaPK = salaPK;
        this.numSala = numSala;
    }

    public Sala(int idsala, int lOCALidLOCAL) {
        this.salaPK = new SalaPK(idsala, lOCALidLOCAL);
    }

    public SalaPK getSalaPK() {
        return salaPK;
    }

    public void setSalaPK(SalaPK salaPK) {
        this.salaPK = salaPK;
    }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public List<Juegos> getJuegosList() {
        return juegosList;
    }

    public void setJuegosList(List<Juegos> juegosList) {
        this.juegosList = juegosList;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salaPK != null ? salaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sala)) {
            return false;
        }
        Sala other = (Sala) object;
        if ((this.salaPK == null && other.salaPK != null) || (this.salaPK != null && !this.salaPK.equals(other.salaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DOMiNIO.Sala[ salaPK=" + salaPK + " ]";
    }
    
}
