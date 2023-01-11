package DATA;


import DOMINIO.Usuario;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno Mañana
 */
public interface UsuarioDao {
    public List<Usuario> findAllUsuario();
    
    public Usuario findPersonaByID(Usuario usuario);
    
    public Usuario findUsuarioByEmail(Usuario usuario);
    
    public Usuario findUsuarioByTelefono(Usuario usuario);
    
    public Usuario findUsuarioByNombre(Usuario usuario);
    
    public void insertUsuario(Usuario usuario);

    public void updateUsuario(Usuario usuario);
    
    public void deleteUsuario(Usuario usuario);   
    
}
