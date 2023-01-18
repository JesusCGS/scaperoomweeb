/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import DATA.UsuarioDao;
import DOMiNIO.Usuario;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Alumno Mañana
 */
public class UsuarioServicioImpl implements UsuarioServicio {
    @Inject    
    private UsuarioDao usuarioDao;

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioDao.findAllUsuario();
    }

    @Override
    public Usuario encontrarPersonaPorID(Usuario usuario) {
         return usuarioDao.findPersonaByID(usuario);
    }

    @Override
    public Usuario econtrarPersonaPorEmail(Usuario usuario) {
        return usuarioDao.findUsuarioByEmail(usuario);
    }

    @Override
    public Usuario econtrarPersonaPorNombre(Usuario usuario) {
        return usuarioDao.findUsuarioByNombre(usuario);
    }

    @Override
    public void registrarPersona(Usuario usuario) {
        usuarioDao.insertUsuario(usuario);
    }

    @Override
    public void modificarPersona(Usuario usuario) {
       usuarioDao.updateUsuario(usuario);
    }

    @Override
    public void eliminarPersona(Usuario usuario) {
         usuarioDao.deleteUsuario(usuario);
    }
    
   
    
}
