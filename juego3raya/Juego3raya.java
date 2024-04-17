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
public class Juego3raya {
    static Scanner leer=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugadores players= new Jugadores();
        Tblero tablero = new Tblero();
        boolean ganador=false;
        
        players.mostrar_jugadores();
        players.crearjugador();
        players.mostrar_jugadores();
        players.crearjugador();
        players.mostrar_jugadores();
        players.primero_jugar();
        tablero.crear_tablero();
        while(!ganador){
            
            if(!ganador){
                ganador=tablero.juego(players.turno_actual().getAvatar(), players);
            }
            if(ganador){
                System.out.println("desea crear otra partida?\n"
                        + "1:si\n"
                        + "2:no");
                int selector = leer.nextInt();
                if(selector == 1){
                    tablero.crear_tablero();
                    players.primero_jugar();
                    ganador=false;
                }else{
                    System.out.println("ok");
                }
            }
            
        }
    }
    
}
