/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;


import DOMiNIO.Trabajadores;
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
@Table(name = "trabajadores")
@NamedQueries({
    @NamedQuery(name = "Trabajadores.findAll", query = "SELECT t FROM Trabajadores t"),
    @NamedQuery(name = "Trabajadores.findByIdTRABAJADORES", query = "SELECT t FROM Trabajadores t WHERE t.trabajadoresPK.idTRABAJADORES = :idTRABAJADORES"),
    @NamedQuery(name = "Trabajadores.findByNombre", query = "SELECT t FROM Trabajadores t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Trabajadores.findByApellido", query = "SELECT t FROM Trabajadores t WHERE t.apellido = :apellido"),
    @NamedQuery(name = "Trabajadores.findByDni", query = "SELECT t FROM Trabajadores t WHERE t.dni = :dni"),
    @NamedQuery(name = "Trabajadores.findByCorreo", query = "SELECT t FROM Trabajadores t WHERE t.correo = :correo"),
    @NamedQuery(name = "Trabajadores.findByLOCALidLOCALL", query = "SELECT t FROM Trabajadores t WHERE t.trabajadoresPK.lOCALidLOCALL = :lOCALidLOCALL")})
public interface TrabajadoresDao {
     public List<Trabajadores> findAllTrabajadores();
    
    public Trabajadores findTrabajadoresByID(Trabajadores trabajador);
    
    public Trabajadores findTrabajadoresByEmail(Trabajadores trabajador);
    
    public Trabajadores findTrabajadoresByDni(Trabajadores trabajador);
    
    public Trabajadores findTrabajadoresByNombre(Trabajadores trabajador);
    
    public Trabajadores findTrabajadoresByApellido(Trabajadores trabajador);
    
    public void insertTrabajadores(Trabajadores trabajador);

    public void updateTrabajadores(Trabajadores trabajador);
    
    public void deleteTrabajadores(Trabajadores trabajador);        
    
}
