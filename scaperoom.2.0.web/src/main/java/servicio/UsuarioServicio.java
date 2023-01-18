/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import DOMiNIO.Usuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alumno Mañana
 */
 @Local
public interface UsuarioServicio {
   
    public List<Usuario>listarUsuarios();
    
    public Usuario encontrarPersonaPorID(Usuario usuario);
    
    public Usuario econtrarPersonaPorEmail(Usuario usuario);
    
    public Usuario econtrarPersonaPorNombre(Usuario usuario);
    
    public void registrarPersona(Usuario usuario);
    
    public void modificarPersona(Usuario usuario);
    
    public void eliminarPersona(Usuario usuario);
    
    
}
