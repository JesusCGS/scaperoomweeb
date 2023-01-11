/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import DOMiNIO.Juegos;
import DOMiNIO.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alumno Mañana
 */
public class JuegosDaoImpl implements JuegosDao {
    @PersistenceContext(unitName="ScaperoomPU")
    EntityManager em;
    

    @Override
    public List<Juegos> findAllJuegos() {
        return em.createNamedQuery("Juegos.findAll").getResultList();
    }

    @Override
    public Juegos findJuegosByID(Juegos juegos) {
       return em.find(Juegos.class,juegos.getJuegosPK().getIdJuego());
    }

    @Override
    public Juegos findJuegosByNombre(Juegos juegos) {
        return em.find(Juegos.class,juegos.getNombre() );
    }

    @Override
    public Juegos findJuegosByDificultad(Juegos juegos) {
        return em.find(Juegos.class,juegos.getDificultad());
    }

    @Override
    public Juegos findJuegosByAmbientacion(Juegos juegos) {
      return em.find(Juegos.class,juegos.getAmbientacion());
    }

    @Override
    public Juegos findJuegosByNumerodeJugadores(Juegos juegos) {
       return em.find(Juegos.class,juegos.getNumJugadores());
    }

    @Override
    public Juegos findJuegosByEdad(Juegos juegos) {
       return em.find(Juegos.class,juegos.getEdadMin());
    }

    @Override
    public Juegos findJuegosByDuracion(Juegos juegos) {
        return em.find(Juegos.class,juegos.getDuracion() );
    }

    @Override
    public void insertJuegos(Juegos juegos) {
     em.persist(juegos);
    }

    @Override
    public void updateJuegos(Juegos juegos) {
         em.merge(juegos);
    }

    @Override
    public void deleteJuegos(Juegos juegos) {
       em.remove(em.merge(juegos));    
    }
    
}
