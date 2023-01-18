/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import DOMiNIO.Locall;
import java.util.List;
import javax.ejb.Local;


/**
 *
 * @author Alumno Mañana
 */
@Local

public interface LocalServicio {
    public List<Locall> listarAllLocal();
    
    public Locall buscarLocalByID(Locall local);
    
    public Locall buscarLocalByNombre(Locall local);
    
   // public Local findLocalByTelfono(Local local);
    
    public void insertLocal(Locall local);

    public void updateLocal(Locall local);
    
    public void deleteLocal(Locall local);        
    
}
