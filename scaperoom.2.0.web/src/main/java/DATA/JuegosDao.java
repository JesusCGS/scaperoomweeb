/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import DOMINIO.Juegos;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public interface JuegosDao {
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
