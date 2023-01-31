/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;


import DOMiNIO.Direccion;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

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
public interface DireccionDao {
    
    public List<Direccion> findAllDireccion();
    
    public Direccion findDireccionByID(Direccion direccion);
    
    public Direccion findDireccionByCiudad(Direccion direccion);
    
    public void insertDireccion(Direccion direccion);

    public void updateDireccion(Direccion direccion);
    
    public void deleteDireccion(Direccion direccion);       
    
}
