/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;


import DOMiNIO.Sala;
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
@Table(name = "sala")
@NamedQueries({
    @NamedQuery(name = "Sala.findAll", query = "SELECT s FROM Sala s"),
    @NamedQuery(name = "Sala.findByIdsala", query = "SELECT s FROM Sala s WHERE s.salaPK.idsala = :idsala"),
    @NamedQuery(name = "Sala.findByNumSala", query = "SELECT s FROM Sala s WHERE s.numSala = :numSala"),
    @NamedQuery(name = "Sala.findByLOCALidLOCALL", query = "SELECT s FROM Sala s WHERE s.salaPK.lOCALidLOCALL = :lOCALidLOCALL")})

public interface SalaDao {
    
    public List<Sala> findAllSala();
    
    public Sala findSalaByID(Sala sala);
    
    public Sala findSalaByNumeroSala(Sala sala);
    
    public void insertSala(Sala sala);

    public void updateSala(Sala sala);
    
    public void deleteSala(Sala sala);        
    
}
