/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import DOMiNIO.Reserva;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alumno Mañana
 */
@Local
public interface ReservaServicio {
     public List<Reserva> findAllReserva();
    
    public Reserva findReservaByID(Reserva reserva);
    
    public Reserva findReservaByNombre(Reserva reserva);
    
    public Reserva findReservaByFecha(Reserva reserva);
    
    public void insertReserva(Reserva reserva);

    public void updateReserva(Reserva reserva);
    
    public void deleteReserva(Reserva reserva);        
}
    

