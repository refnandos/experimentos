/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;
import java.util.List;

public class Tableroxml {
    private int tamaño;
    private List<Jugadorxml> jugadores;

    public Tableroxml(int tamaño, List<Jugadorxml> jugadores) {
        this.tamaño = tamaño;
        this.jugadores = jugadores;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public List<Jugadorxml> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugadorxml> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Tablero{tamaño=" + tamaño + ", jugadores=" + jugadores + "}";
    }
}
