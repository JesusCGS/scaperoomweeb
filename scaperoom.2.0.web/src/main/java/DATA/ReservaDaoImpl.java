/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import DOMiNIO.Reserva;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alumno Mañana
 */
public class ReservaDaoImpl implements ReservaDao  {
    
    @PersistenceContext(unitName="ScaperoomPU")
    EntityManager em;

    @Override
    public List<Reserva> findAllReserva() {
        return em.createNamedQuery("Reserva.findAll").getResultList();
    }

    @Override
    public Reserva findReservaByID(Reserva reserva) {
     return em.find(Reserva.class,reserva.getReservaPK().getIdRESERVA());
    }

    @Override
    public Reserva findReservaByNombre(Reserva reserva) {
      return em.find(Reserva.class,reserva.getNombre());
    }

    @Override
    public Reserva findReservaByFecha(Reserva reserva) {
     return em.find(Reserva.class,reserva.getFechaHora());
    }

    @Override
    public void insertReserva(Reserva reserva) {
         em.persist(reserva);
    }

    @Override
    public void updateReserva(Reserva reserva) {
         em.merge(reserva);
    }

    @Override
    public void deleteReserva(Reserva reserva) {
         em.remove(em.merge(reserva));    
    }
    
}
