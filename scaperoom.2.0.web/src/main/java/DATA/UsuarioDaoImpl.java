/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;


import DOMiNIO.Usuario;
import javax.persistence.*;
import javax.ejb.Stateless;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author el novio de tu mama
 */
@Stateless
public class UsuarioDaoImpl implements UsuarioDao {
    
    @PersistenceContext(unitName="ScaperoomPU")
    EntityManager em;
    
  
    @Override
    public List<Usuario> findAllUsuario() {
        
        return em.createNamedQuery("Usuario.findAll").getResultList();
    }

    @Override
    public Usuario findPersonaByID(Usuario usuario) {//busca por id
       return em.find(Usuario.class,usuario.getIdUSUARIO());
    }

    @Override
    public Usuario findUsuarioByEmail(Usuario usuario) {// busca por email
        Query query = em.createQuery("from Usuario u where u.correo = :correo");
        query.setParameter("correo", usuario.getCorreo());
        
        return (Usuario) query.getSingleResult();
    }

    @Override
    public Usuario findUsuarioByTelefono(Usuario usuario) {//busca por tlf
        return em.find(Usuario.class,usuario.getTelefono());
    }

    @Override
    public Usuario findUsuarioByNombre(Usuario usuario) {//busca por nombre
       return em.find(Usuario.class,usuario.getNombre());
    }

    @Override
    public void insertUsuario(Usuario usuario) {//
        em.persist(usuario);
    }

    @Override
    public void updateUsuario(Usuario usuario) {//
         em.merge(usuario);
    }

    @Override
    public void deleteUsuario(Usuario usuario) {//
       em.remove(em.merge(usuario));    
    }

   
}
