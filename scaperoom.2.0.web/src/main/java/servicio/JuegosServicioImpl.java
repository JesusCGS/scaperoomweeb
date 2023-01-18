/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import DATA.JuegosDao;
import DOMiNIO.Juegos;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Alumno Mañana
 */
public class JuegosServicioImpl implements JuegosServicio {
    @Inject
        private JuegosDao juegosDao;

    @Override
    public List<Juegos> findAllJuegos() {
        return juegosDao.findAllJuegos();
    }

    @Override
    public Juegos findJuegosByID(Juegos juegos) {
      return juegosDao.findJuegosByID(juegos);
    }

    @Override
    public Juegos findJuegosByNombre(Juegos juegos) {
        return juegosDao.findJuegosByNombre(juegos);
    }

    @Override
    public Juegos findJuegosByDificultad(Juegos juegos) {
       return juegosDao.findJuegosByDificultad(juegos);
    }

    @Override
    public Juegos findJuegosByAmbientacion(Juegos juegos) {
    return juegosDao.findJuegosByAmbientacion(juegos);
    }

    @Override
    public Juegos findJuegosByNumerodeJugadores(Juegos juegos) {
        return juegosDao.findJuegosByNumerodeJugadores(juegos);
    }

    @Override
    public Juegos findJuegosByEdad(Juegos juegos) {
       return juegosDao.findJuegosByEdad(juegos);
    }

    @Override
    public Juegos findJuegosByDuracion(Juegos juegos) {
        return juegosDao.findJuegosByDuracion(juegos);
    }

    @Override
    public void insertJuegos(Juegos juegos) {
        juegosDao.insertJuegos(juegos);
    }

    @Override
    public void updateJuegos(Juegos juegos) {
      juegosDao.updateJuegos(juegos);
    }

    @Override
    public void deleteJuegos(Juegos juegos) {
      juegosDao.deleteJuegos(juegos);
    }
    
}
