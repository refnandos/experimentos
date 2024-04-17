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
public abstract class JuegoMadre {
    
    public abstract boolean juego(char i,Jugadores players);
    
    public abstract boolean isTerminado();
}
