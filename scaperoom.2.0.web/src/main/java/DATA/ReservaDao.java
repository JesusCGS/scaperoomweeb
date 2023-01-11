/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import DOMINIO.Reserva;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public interface ReservaDao {
    
    public List<Reserva> findAllReserva();
    
    public Reserva findReservaByID(Reserva reserva);
    
    public Reserva findReservaByNombre(Reserva reserva);
    
    public Reserva findReservaByFecha(Reserva reserva);
    
    public void insertReserva(Reserva reserva);

    public void updateReserva(Reserva reserva);
    
    public void deleteReserva(Reserva reserva);        
}
