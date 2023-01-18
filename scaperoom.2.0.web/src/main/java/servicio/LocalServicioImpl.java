/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;


import DATA.LocalDao;
import DOMiNIO.Locall;
import java.util.List;
import javax.ejb.Local;
import javax.inject.Inject;

/**
 *
 * @author Alumno Mañana
 */
public class LocalServicioImpl implements LocalServicio {
        @Inject
        private LocalDao localDao;

    @Override
    public List<Locall> listarAllLocal() {
        return localDao.findAllLocal();
    }
    @Override
    public Locall buscarLocalByID(Locall local) {
          return localDao.findLocalByID(local);
    }

    @Override
    public Locall buscarLocalByNombre(Locall local) {
        return localDao.findLocalByNombre(local);
    }

    @Override
    public void insertLocal(Locall local) {
        localDao.insertLocal(local);
    }

    @Override
    public void updateLocal(Locall local) {
      localDao.updateLocal(local);
    }

    @Override
    public void deleteLocal(Locall local) {
     localDao.deleteLocal(local);
    }

  
    

}
