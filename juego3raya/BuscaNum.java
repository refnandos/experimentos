/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego3raya;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Usuario
 */
public class BuscaNum extends JuegoMadre {
    static Scanner leer = new Scanner(System.in);
    static Random aleatorio = new Random();
    Jugadores players;
    int numeromisterio;
    private boolean terminado;
    int [] numerosech;

    public BuscaNum(int limpiar) {
        players= new Jugadores();
        int rango;
        System.out.println("dentro de que rango se dara la busqueda del numero?");
        rango = confirmarran(leer.nextInt());
        this.numeromisterio = aleatorio.nextInt(rango);
        numerosech = new int[rango];
        
        
        players.crearjugador(limpiar);
        players.crearjugador(0);
        players.mostrar_jugadores();
        players.primero_jugar();
        
    }
    
    public int confirmarran (int rango){
        while(rango <0){
            System.out.println("eso esta por debajo de lo pèrmitido, introduzca otro rango");
            rango = leer.nextInt();
        }
        rango ++;
        return rango;
    }

    
    
    @Override
    public void juego() {
        int adivinado;
        Jugador[] avatares = this.players.getListajug();
        char i = players.turno_actual().getAvatar();
        System.out.println("ingrese un numero dentro del rango de 0 a "+ this.numerosech.length + " incluidos");
        adivinado = leer.nextInt();
        
        Jugador pato=null;
        for(int j = 0 ; j<avatares.length ; j++){
            if (avatares[j].getAvatar()==i)
                pato = avatares[j];
        }
        comprovarganador(adivinado, pato.getNombre());
        players.victoria(isTerminado());
        players.pasar_turno();
        
    }
    
    public void comprovarganador (int adivinado, String nomjgdr){
        boolean victoria = false;
        if (adivinado == this.numeromisterio){
            victoria=true;
            System.out.println(nomjgdr+" adivino el numero misterioso");
        }
        this.terminado = victoria;
        
    }

    @Override
    public boolean isTerminado() {
        return terminado;
    }
    
}
