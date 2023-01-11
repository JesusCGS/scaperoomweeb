/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import DOMiNIO.Direccion;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alumno Mañana
 */
public class DireccionDaoImpl implements DireccionDao {
    @PersistenceContext(unitName="ScaperoomPU")
    EntityManager em;

    @Override
    public List<Direccion> findAllDireccion() {
     return em.createNamedQuery("Direccion.findAll").getResultList();
    }

    @Override
    public Direccion findDireccionByID(Direccion direccion) {
        return em.find(Direccion.class,direccion.getIdDIRECCION());
    }

    @Override
    public Direccion findDireccionByCiudad(Direccion direccion) {
       return em.find(Direccion.class,direccion.getCiudad());
    }

    @Override
    public void insertDireccion(Direccion direccion) {
    em.persist(direccion);
    }

    @Override
    public void updateDireccion(Direccion direccion) {
       em.merge(direccion);
    }

    @Override
    public void deleteDireccion(Direccion direccion) {
       em.remove(em.merge(direccion));    
    }

    
}
