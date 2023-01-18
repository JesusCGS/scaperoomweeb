/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;


import DATA.DireccionDao;
import DOMiNIO.Direccion;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Alumno Mañana
 */
public class DireccionServicioImpl implements DireccionServicio{
    
    @Inject
        private DireccionDao direccionDao;

    @Override
    public List<Direccion> findAllDireccion() {
        return direccionDao.findAllDireccion();
    }

    @Override
    public Direccion findDireccionByID(Direccion direccion) {
         return direccionDao.findDireccionByID(direccion);
    }

    @Override
    public Direccion findDireccionByCiudad(Direccion direccion) {
      return direccionDao.findDireccionByCiudad(direccion);
    }

    @Override
    public void insertDireccion(Direccion direccion) {
        direccionDao.insertDireccion(direccion);
    }

    @Override
    public void updateDireccion(Direccion direccion) {
        direccionDao.updateDireccion(direccion);
    }

    @Override
    public void deleteDireccion(Direccion direccion) {
        direccionDao.deleteDireccion(direccion);
    }
    
}
