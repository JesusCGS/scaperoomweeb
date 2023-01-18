/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import DOMiNIO.Juegos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alumno Mañana
 */
@Local
public interface JuegosServicio {
    public List<Juegos> findAllJuegos();
    
    public Juegos findJuegosByID(Juegos juegos);
    
    public Juegos findJuegosByNombre(Juegos juegos);
    
    public Juegos findJuegosByDificultad(Juegos juegos);
    
    public Juegos findJuegosByAmbientacion(Juegos juegos);
   
    public Juegos findJuegosByNumerodeJugadores(Juegos juegos);
    
    public Juegos findJuegosByEdad(Juegos juegos);
    
    public Juegos findJuegosByDuracion(Juegos juegos);
    
    public void insertJuegos(Juegos juegos);

    public void updateJuegos(Juegos juegos);
    
    public void deleteJuegos(Juegos juegos);
}
