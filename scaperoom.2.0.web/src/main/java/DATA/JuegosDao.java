/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;


import DOMiNIO.Juegos;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Alumno Mañana
 */
@Entity
@Table(name = "juegos")
@NamedQueries({
    @NamedQuery(name = "Juegos.findAll", query = "SELECT j FROM Juegos j"),
    @NamedQuery(name = "Juegos.findByIdJuego", query = "SELECT j FROM Juegos j WHERE j.juegosPK.idJuego = :idJuego"),
    @NamedQuery(name = "Juegos.findByNombre", query = "SELECT j FROM Juegos j WHERE j.nombre = :nombre"),
    @NamedQuery(name = "Juegos.findByDescripcion", query = "SELECT j FROM Juegos j WHERE j.descripcion = :descripcion"),
    @NamedQuery(name = "Juegos.findByDificultad", query = "SELECT j FROM Juegos j WHERE j.dificultad = :dificultad"),
    @NamedQuery(name = "Juegos.findByAmbientacion", query = "SELECT j FROM Juegos j WHERE j.ambientacion = :ambientacion"),
    @NamedQuery(name = "Juegos.findByNumJugadores", query = "SELECT j FROM Juegos j WHERE j.numJugadores = :numJugadores"),
    @NamedQuery(name = "Juegos.findByDuracion", query = "SELECT j FROM Juegos j WHERE j.duracion = :duracion"),
    @NamedQuery(name = "Juegos.findByPrecio", query = "SELECT j FROM Juegos j WHERE j.precio = :precio"),
    @NamedQuery(name = "Juegos.findByEdadMin", query = "SELECT j FROM Juegos j WHERE j.edadMin = :edadMin"),
    @NamedQuery(name = "Juegos.findByTRABAJADORESidTRABAJADORES", query = "SELECT j FROM Juegos j WHERE j.juegosPK.tRABAJADORESidTRABAJADORES = :tRABAJADORESidTRABAJADORES"),
    @NamedQuery(name = "Juegos.findBySalaIdsala", query = "SELECT j FROM Juegos j WHERE j.juegosPK.salaIdsala = :salaIdsala")})


public interface JuegosDao {
    public List<Juegos> findAllJuegos();
    
    public Juegos findJuegosByID(Juegos juegos);
    
    public Juegos findJuegosByNombre(Juegos juegos);
    
    public Juegos findJuegosByDificultad(Juegos juegos);
    
    public Juegos findJuegosByAmbientacion(Juegos juegos);
   
    public Juegos findJuegosByNumerodeJugadores(Juegos juegos);
    
    public Juegos findJuegosByEdad(Juegos juegos);
    
    public Juegos findJuegosByDuracion(Juegos juegos);
    
    public void insertJuegos(Juegos juegos);

    public void updateJuegos(Juegos juegos);
    
    public void deleteJuegos(Juegos juegos);       
    
}
