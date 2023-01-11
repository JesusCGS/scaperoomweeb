/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import DOMINIO.Trabajadores;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
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
