/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import DOMiNIO.Locall;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alumno Mañana
 */
public class LocalDaoImpl implements LocalDao {
    
    @PersistenceContext(unitName="ScaperoomPU")
    EntityManager em;

    @Override
    public List<Locall> findAllLocal() {
     return em.createNamedQuery("Local.findAll").getResultList();
    }

    @Override
    public Locall findLocalByID(Locall local) {
        return em.find(Locall.class,local.getLocallPK().getIdLOCALL());
    }

    @Override
    public Locall findLocalByNombre(Locall local) {
       return em.find(Locall.class,local.getNombre());
    }

    @Override
    public void insertLocal(Locall local) {
       em.persist(local);
    }

    @Override
    public void updateLocal(Locall local) {
      em.merge(local);
    }

    @Override
    public void deleteLocal(Locall local) {
       em.remove(em.merge(local));    
    }

    
}
