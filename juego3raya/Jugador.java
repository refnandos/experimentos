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
public class Jugador {
    private String nombre;
    private char avatar;
    private boolean turno;
    private Jugador siguiente;

    public Jugador(String nombre, char avatar) {
        this.nombre = nombre;
        this.avatar = avatar;
        this.turno = false;
    }

    public String getNombre() {
        return nombre;
    }

    public char getAvatar() {
        return avatar;
    }

    public boolean getTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }
    
    public void setSiguiente(Jugador siguiente){
        this.siguiente =siguiente;
    }
    
    public String getNombreSiguiente(){
        return siguiente.getNombre();
    }
    
}
