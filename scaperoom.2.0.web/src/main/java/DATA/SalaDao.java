/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import DOMINIO.Sala;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public interface SalaDao {
    
    public List<Sala> findAllSala();
    
    public Sala findSalaByID(Sala sala);
    
    public Sala findSalaByNumeroSala(Sala sala);
    
    public void insertSala(Sala sala);

    public void updateSala(Sala sala);
    
    public void deleteSala(Sala sala);        
    
}
