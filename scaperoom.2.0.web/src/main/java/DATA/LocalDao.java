/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;


import DOMiNIO.Locall;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public interface LocalDao {
    
    public List<Locall> findAllLocal();
    
    public Locall findLocalByID(Locall local);
    
    public Locall findLocalByNombre(Locall local);
    
   // public Local findLocalByTelfono(Local local);
    
    public void insertLocal(Locall local);

    public void updateLocal(Locall local);
    
    public void deleteLocal(Locall local);        
    
}
