package DATA;



import DOMiNIO.Usuario;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno Mañana
 */
@Entity
@Table(name = "usuario")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIdUSUARIO", query = "SELECT u FROM Usuario u WHERE u.idUSUARIO = :idUSUARIO"),
    @NamedQuery(name = "Usuario.findByNombre", query = "SELECT u FROM Usuario u WHERE u.nombre = :nombre"),
    @NamedQuery(name = "Usuario.findByCorreo", query = "SELECT u FROM Usuario u WHERE u.correo = :correo"),
    @NamedQuery(name = "Usuario.findByContrase\u00f1a", query = "SELECT u FROM Usuario u WHERE u.contrase\u00f1a = :contrase\u00f1a"),
    @NamedQuery(name = "Usuario.findByTelefono", query = "SELECT u FROM Usuario u WHERE u.telefono = :telefono")})
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
