/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import DOMiNIO.Trabajadores;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alumno Mañana
 */
@Local
public interface TrabajadoresServicio {
    public List<Trabajadores> listarPersonas();
    
    public Trabajadores encontrarPersonaPorID(Trabajadores trabajador);
    
    public Trabajadores econtrarPersonaPorEmail(Trabajadores trabajador);
    
    public Trabajadores encontrarTrabajadorporDni(Trabajadores trabajador);
    
    public Trabajadores encontrarTrabajadoresporNombre(Trabajadores trabajador);
    
    public Trabajadores encontrarTrabajadoresporApellido(Trabajadores trabajador);
    
    public void registrarTrabajadores(Trabajadores trabajador);

    public void actualizarTrabajadores(Trabajadores trabajador);
    
    public void borrarTrabajadores(Trabajadores trabajador);        
}

