/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego3raya;

/**
 *
 * @author Usuario
 */
public class Juego3raya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugadores players= new Jugadores();
        Tblero tablero = new Tblero();
        
        players.mostrar_jugadores();
        players.crearjugador();
        players.mostrar_jugadores();
        players.crearjugador();
        players.mostrar_jugadores();
        players.crearjugador();
        players.mostrar_jugadores();
        players.primero_jugar();
        tablero.crear_tablero();
        
        tablero.buscarcoordenada(players.turno_actual().getAvatar(), players);
        
    }
    
}
