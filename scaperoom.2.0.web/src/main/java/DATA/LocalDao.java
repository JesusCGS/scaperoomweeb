/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import DOMINIO.Local;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public interface LocalDao {
    
    public List<Local> findAllLocal();
    
    public Local findLocalByID(Local local);
    
    public Local findLocalByNombre(Local local);
    
   // public Local findLocalByTelfono(Local local);
    
    public void insertLocal(Local local);

    public void updateLocal(Local local);
    
    public void deleteLocal(Local local);        
    
}
