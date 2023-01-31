/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;


import DOMiNIO.Reserva;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Alumno Mañana
 */

@Entity
@Table(name = "reserva")
@NamedQueries({
    @NamedQuery(name = "Reserva.findAll", query = "SELECT r FROM Reserva r"),
    @NamedQuery(name = "Reserva.findByIdRESERVA", query = "SELECT r FROM Reserva r WHERE r.reservaPK.idRESERVA = :idRESERVA"),
    @NamedQuery(name = "Reserva.findByNombre", query = "SELECT r FROM Reserva r WHERE r.nombre = :nombre"),
    @NamedQuery(name = "Reserva.findByFechaHora", query = "SELECT r FROM Reserva r WHERE r.fechaHora = :fechaHora"),
    @NamedQuery(name = "Reserva.findByUSUARIOidUSUARIO", query = "SELECT r FROM Reserva r WHERE r.reservaPK.uSUARIOidUSUARIO = :uSUARIOidUSUARIO"),
    @NamedQuery(name = "Reserva.findByJUEGOSidJuego", query = "SELECT r FROM Reserva r WHERE r.reservaPK.jUEGOSidJuego = :jUEGOSidJuego")})
public interface ReservaDao {
    
    public List<Reserva> findAllReserva();
    
    public Reserva findReservaByID(Reserva reserva);
    
    public Reserva findReservaByNombre(Reserva reserva);
    
    public Reserva findReservaByFecha(Reserva reserva);
    
    public void insertReserva(Reserva reserva);

    public void updateReserva(Reserva reserva);
    
    public void deleteReserva(Reserva reserva);        
}
