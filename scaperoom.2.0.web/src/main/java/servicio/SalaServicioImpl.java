/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import DATA.SalaDao;
import DATA.TrabajadoresDao;
import DOMiNIO.Sala;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Alumno Mañana
 */
public class SalaServicioImpl implements SalaServicio {
    
    @Inject    
    private SalaDao salaDao ;

    @Override
    public List<Sala> findAllSala() {
        return salaDao.findAllSala();
    }

    @Override
    public Sala findSalaByID(Sala sala) {
       return salaDao.findSalaByID(sala);
    }

    @Override
    public Sala findSalaByNumeroSala(Sala sala) {
       return salaDao.findSalaByNumeroSala(sala);
    }

    @Override
    public void insertSala(Sala sala) {
        salaDao.insertSala(sala);
    }

    @Override
    public void updateSala(Sala sala) {
         salaDao.updateSala(sala);
    }

    @Override
    public void deleteSala(Sala sala) {
         salaDao.deleteSala(sala);
    }
    
}
