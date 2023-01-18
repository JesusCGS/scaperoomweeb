/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;


import DATA.ReservaDao;
import DOMiNIO.Reserva;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Alumno Mañana
 */
public class ReservaServicioImpl implements ReservaServicio  {
    
    @Inject    
    private ReservaDao reservaDao ;

    @Override
    public List<Reserva> findAllReserva() {
        return reservaDao.findAllReserva();
    }

    @Override
    public Reserva findReservaByID(Reserva reserva) {
        return reservaDao.findReservaByID(reserva);
    }

    @Override
    public Reserva findReservaByNombre(Reserva reserva) {
       return reservaDao.findReservaByNombre(reserva);
    }

    @Override
    public Reserva findReservaByFecha(Reserva reserva) {
       return reservaDao.findReservaByFecha(reserva);
    }

    @Override
    public void insertReserva(Reserva reserva) {
        reservaDao.insertReserva(reserva);
    }

    @Override
    public void updateReserva(Reserva reserva) {
         reservaDao.updateReserva(reserva);
    }

    @Override
    public void deleteReserva(Reserva reserva) {
        reservaDao.deleteReserva(reserva);
    }
    
}
