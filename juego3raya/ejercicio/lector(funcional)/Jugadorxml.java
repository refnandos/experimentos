/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lector;

/**
 *
 * @author fer
 */
public class Jugadorxml {
    private String nombre;
    private String ficha;

    public Jugadorxml(String nombre, String ficha) {
        this.nombre = nombre;
        this.ficha = ficha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFicha() {
        return ficha;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    @Override
    public String toString() {
        return "Jugador{nombre='" + nombre + "', ficha='" + ficha + "'}";
    }
}