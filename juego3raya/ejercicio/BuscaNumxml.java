/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;
import java.util.List;

public class BuscaNumxml {
    private int rango;
    private List<Jugadorxml> jugadores;

    public BuscaNumxml(int rango, List<Jugadorxml> jugadores) {
        this.rango = rango;
        this.jugadores = jugadores;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    public List<Jugadorxml> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugadorxml> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "BuscaNum{rango=" + rango + ", jugadores=" + jugadores + "}";
    }
}
