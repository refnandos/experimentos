/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego3raya;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Jugadores {

    static Scanner leer = new Scanner(System.in);
    private Jugador[] listajug;

    public Jugadores() {
        this.listajug = new Jugador[0];
    }

    public Jugador[] getListajug() {
        return listajug;
    }
    
    

    public  void crearjugador(int limpiar) {
        String nombre;
        char avatar;
        /*---*/
        System.out.println("Indique el nombre del jugador");
        nombre = comprobar_nombre(leer.nextLine());
        if(limpiar>0){
            nombre = comprobar_nombre(leer.nextLine());
        }
        /*---*/
        System.out.println("Eliga un avatar (no puede ser un numero)");
        avatar = comprobar_avatar(leer.nextLine());
        /*---*/
        Jugador J1 = new Jugador(nombre, avatar);
        if (this.listajug.length > 0) {
            this.listajug[listajug.length - 1].setSiguiente(J1);
            J1.setSiguiente(this.listajug[0]);
        }
        /*---*/
        añadirlista(J1);
    }
    
    

    private String comprobar_nombre(String nombre) {
        boolean admitido = false;
        int cont = 0;
        /*---*/
        if (this.listajug.length != 0) {
            while (!admitido) {
                cont = 0;
                for (int i = 0; i < this.listajug.length; i++) {
                    if (nombre.equals(this.listajug[i].getNombre())) {
                        System.out.println("nombre en uso elija de nuevo");
                        nombre = leer.nextLine();
                        cont++;
                    }
                }
                admitido = (cont != 0) ? false : true;
            }
        }

        return nombre;

    }

    private char comprobar_avatar(String pato) {
        char[] noadmitidos = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        boolean admitido = false;
        int cont = 0;
        /*---*/
        while (!admitido) {
            cont = 0;
            for (int i = 0; i < noadmitidos.length + this.listajug.length; i++) {
                if (pato.charAt(0) == ((i < noadmitidos.length) ? noadmitidos[i] : this.listajug[i - noadmitidos.length].getAvatar())) {
                    System.out.println("caracter no admitido, porfavor, introduzca el avatar nuevamente");
                    cont++;
                    pato = leer.nextLine();
                }
            }
            admitido = (cont == 0) ? true : false;
        }
        return pato.charAt(0);
    }

    
    private void añadirlista(Jugador J1) {
        Jugador[] aux = new Jugador[this.listajug.length + 1];
        /*---*/
        if (this.listajug.length != 0) {
            for (int i = 0; i < this.listajug.length; i++) {
                aux[i] = this.listajug[i];
            }
        }
        aux[aux.length - 1] = J1;
        this.listajug = aux;
    }

    
    public void primero_jugar(){
        int pos;
        System.out.println("quien sera el primero en jugar?");
        for (int i = 0; i < this.listajug.length; i++) {
            System.out.println((i+1)+":"+this.listajug[i].getNombre());
        }
        pos = leer.nextInt()-1;
        while (pos <0||pos>=this.listajug.length){
            System.out.println("fuera de rango, seleccione otra vez");
            pos = leer.nextInt()-1;
        }
        this.listajug[pos].setTurno(true);
    }
    
    public Jugador turno_actual(){
        int i = 0;
        while (this.listajug[i].getTurno()!=true){
            i++;
        }
        
        return this.listajug[i];
    }
    
    public void pasar_turno(){
        int i = 0;
        while (this.listajug[i].getTurno()!=true){
            i++;
        }
        this.listajug[i].setTurno(false);
        this.listajug[i].getSiguiente().setTurno(true);
    }
    
    
    public void mostrar_jugadores() {
        if (this.listajug.length <= 0) {
            System.out.println("no hay jugadores aun");
        } else {
            for (int i = 0; i < this.listajug.length; i++) {
                System.out.println(this.listajug[i].getNombre() + ": " + this.listajug[i].getAvatar() + ((this.listajug.length > 1) ? " siguiente a este: " + this.listajug[i].getNombreSiguiente() : ""));
            }
        }
    }
    
    public void victoria (boolean ganar){
        if(ganar){
        Jugador actual = turno_actual();
        int sumador = actual.getVictorias();
        sumador=actual.getVictorias()+1;
        actual.setVictorias(sumador);
        }
    }

    
}
