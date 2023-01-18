/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import DOMiNIO.Direccion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alumno Mañana
 */
@Local
public interface DireccionServicio {
    
   public List<Direccion> findAllDireccion();
    
    public Direccion findDireccionByID(Direccion direccion);
    
    public Direccion findDireccionByCiudad(Direccion direccion);
    
    public void insertDireccion(Direccion direccion);

    public void updateDireccion(Direccion direccion);
    
    public void deleteDireccion(Direccion direccion);       
      
}
