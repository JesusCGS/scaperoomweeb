/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import DOMiNIO.Trabajadores;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;

/**
 *
 * @author Alumno Mañana
 */
public class TrabajadoresDaoImpl implements TrabajadoresDao {
    
    @PersistenceContext(unitName="ScaperoomPU")
    EntityManager em;

    @Override
    public List<Trabajadores> findAllTrabajadores() {
         return em.createNamedQuery("Trabajadores.findAll").getResultList();
    }

    @Override
    public Trabajadores findTrabajadoresByID(Trabajadores trabajador) {
        return em.find(Trabajadores.class,trabajador.getTrabajadoresPK().getIdTRABAJADORES());
    }

    @Override
    public Trabajadores findTrabajadoresByEmail(Trabajadores trabajador) {
        Query query = em.createQuery("from Trabajadores t where t.correo = :correo");
        query.setParameter("correo", trabajador.getCorreo());
        
        return (Trabajadores) query.getSingleResult();
    }

    @Override
    public Trabajadores findTrabajadoresByDni(Trabajadores trabajador) {
     return em.find(Trabajadores.class,trabajador.getDni());
    }


    @Override
    public Trabajadores findTrabajadoresByNombre(Trabajadores trabajador) {
        return em.find(Trabajadores.class,trabajador.getNombre());
    }

    @Override
    public Trabajadores findTrabajadoresByApellido(Trabajadores trabajador) {
        return em.find(Trabajadores.class,trabajador.getApellido());
    }

    @Override
    public void insertTrabajadores(Trabajadores trabajador) {
     em.persist(trabajador);
    }

    @Override
    public void updateTrabajadores(Trabajadores trabajador) {
         em.merge(trabajador);
    }

    @Override
    public void deleteTrabajadores(Trabajadores trabajador) {
       em.remove(em.merge(trabajador));    
    }

    
}
