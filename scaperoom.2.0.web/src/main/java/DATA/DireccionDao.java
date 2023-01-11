/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;


import DOMiNIO.Direccion;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public interface DireccionDao {
    
    public List<Direccion> findAllDireccion();
    
    public Direccion findDireccionByID(Direccion direccion);
    
    public Direccion findDireccionByCiudad(Direccion direccion);
    
    public void insertDireccion(Direccion direccion);

    public void updateDireccion(Direccion direccion);
    
    public void deleteDireccion(Direccion direccion);       
    
}
