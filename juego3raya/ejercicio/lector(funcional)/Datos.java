/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lector;
import java.util.List;

public class Datos {
    private int cantidadJuegos;
    private Tableroxml tablero;
    private BuscaNumxml buscaNum;

    public Datos(int cantidadJuegos, Tableroxml tablero, BuscaNumxml buscaNum) {
        this.cantidadJuegos = cantidadJuegos;
        this.tablero = tablero;
        this.buscaNum = buscaNum;
    }

    public int getCantidadJuegos() {
        return cantidadJuegos;
    }

    public void setCantidadJuegos(int cantidadJuegos) {
        this.cantidadJuegos = cantidadJuegos;
    }

    public Tableroxml getTablero() {
        return tablero;
    }

    public void setTablero(Tableroxml tablero) {
        this.tablero = tablero;
    }

    public BuscaNumxml getBuscaNum() {
        return buscaNum;
    }

    public void setBuscaNum(BuscaNumxml buscaNum) {
        this.buscaNum = buscaNum;
    }

    @Override
    public String toString() {
        return "Datos{cantidadJuegos=" + cantidadJuegos + ", tablero=" + tablero + ", buscaNum=" + buscaNum + "}";
    }
}