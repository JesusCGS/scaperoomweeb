/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import DOMiNIO.Sala;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alumno Mañana
 */
public class SalaDaoImpl implements SalaDao {
    @PersistenceContext(unitName="ScaperoomPU")
    EntityManager em;

    @Override
    public List<Sala> findAllSala() {
        return em.createNamedQuery("Sala.findAll").getResultList();
    }

    @Override
    public Sala findSalaByID(Sala sala) {
         return em.find(Sala.class,sala.getSalaPK().getIdsala());
    }

    @Override
    public Sala findSalaByNumeroSala(Sala sala) {
       return em.find(Sala.class,sala.getNumSala());
    }

    @Override
    public void insertSala(Sala sala) {
       em.persist(sala);
    }

    @Override
    public void updateSala(Sala sala) {
       em.merge(sala);
    }

    @Override
    public void deleteSala(Sala sala) {
        em.remove(em.merge(sala));    
    }

    
}
