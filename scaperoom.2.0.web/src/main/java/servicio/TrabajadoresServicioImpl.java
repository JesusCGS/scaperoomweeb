/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import DATA.TrabajadoresDao;
import DOMiNIO.Trabajadores;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Alumno Mañana
 */
public class TrabajadoresServicioImpl implements TrabajadoresServicio {
    
    
    private TrabajadoresDao trabajadoresDao ;

    @Override
    public List<Trabajadores> listarPersonas() {
        return trabajadoresDao.findAllTrabajadores();
    }

    @Override
    public Trabajadores encontrarPersonaPorID(Trabajadores trabajador) {
        return trabajadoresDao.findTrabajadoresByID(trabajador);
    }

    @Override
    public Trabajadores econtrarPersonaPorEmail(Trabajadores trabajador) {
        return trabajadoresDao.findTrabajadoresByEmail(trabajador);
    }

    @Override
    public Trabajadores encontrarTrabajadorporDni(Trabajadores trabajador) {
            return trabajadoresDao.findTrabajadoresByDni(trabajador);
    }

    @Override
    public Trabajadores encontrarTrabajadoresporNombre(Trabajadores trabajador) {
            return trabajadoresDao.findTrabajadoresByNombre(trabajador);
    }

    @Override
    public Trabajadores encontrarTrabajadoresporApellido(Trabajadores trabajador) {
           return trabajadoresDao.findTrabajadoresByApellido(trabajador);
    }

    @Override
    public void registrarTrabajadores(Trabajadores trabajador) {
       trabajadoresDao.insertTrabajadores(trabajador);
    }

    @Override
    public void actualizarTrabajadores(Trabajadores trabajador) {
        trabajadoresDao.updateTrabajadores(trabajador);
    }

    @Override
    public void borrarTrabajadores(Trabajadores trabajador) {
        trabajadoresDao.deleteTrabajadores(trabajador);
    }
    
}
