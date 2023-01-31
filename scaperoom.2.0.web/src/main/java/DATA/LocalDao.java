/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;


import DOMiNIO.Locall;
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
@Table(name = "locall")
@NamedQueries({
    @NamedQuery(name = "Locall.findAll", query = "SELECT l FROM Locall l"),
    @NamedQuery(name = "Locall.findByIdLOCALL", query = "SELECT l FROM Locall l WHERE l.locallPK.idLOCALL = :idLOCALL"),
    @NamedQuery(name = "Locall.findByNombre", query = "SELECT l FROM Locall l WHERE l.nombre = :nombre"),
    @NamedQuery(name = "Locall.findByTlf", query = "SELECT l FROM Locall l WHERE l.tlf = :tlf"),
    @NamedQuery(name = "Locall.findByDIRECCIONidDIRECCION", query = "SELECT l FROM Locall l WHERE l.locallPK.dIRECCIONidDIRECCION = :dIRECCIONidDIRECCION")})
public interface LocalDao {
    
    public List<Locall> findAllLocal();
    
    public Locall findLocalByID(Locall local);
    
    public Locall findLocalByNombre(Locall local);
    
   // public Local findLocalByTelfono(Local local);
    
    public void insertLocal(Locall local);

    public void updateLocal(Locall local);
    
    public void deleteLocal(Locall local);        
    
}
