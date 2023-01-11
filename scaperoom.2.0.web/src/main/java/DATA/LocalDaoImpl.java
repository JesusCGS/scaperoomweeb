/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import DOMiNIO.Local;
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
    public List<Local> findAllLocal() {
     return em.createNamedQuery("Local.findAll").getResultList();
    }

    @Override
    public Local findLocalByID(Local local) {
        return em.find(Local.class,local.getLocalPK().getIdLOCAL());
    }

    @Override
    public Local findLocalByNombre(Local local) {
       return em.find(Local.class,local.getNombre());
    }

    @Override
    public void insertLocal(Local local) {
       em.persist(local);
    }

    @Override
    public void updateLocal(Local local) {
      em.merge(local);
    }

    @Override
    public void deleteLocal(Local local) {
       em.remove(em.merge(local));    
    }

    
}
