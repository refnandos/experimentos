/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Usuario
 */
public class Juego3raya {
    static Scanner leer=new Scanner(System.in);
    static Random aleatorio = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Jugadores players= new Jugadores();
        JuegoMadre[] juegos;
        boolean vacio=false;
        Lector datos = new Lector();
/*
ºººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº
*/      
        //System.out.println("cuantos juegos deseas crear?"); //esto es parte del codigo sin XML
        juegos = new JuegoMadre[datos.getDatos().getCantidadJuegos()];
        for (int i = 0; i < juegos.length; i++) {
            int select;
            /*
            System.out.println("El juego numero "+(i+1)+" será \n"
                    + "1:tres en raya \n"
                    + "o \n"
                    + "2:adivinar?");*/ //esto es parte del codigo sin XML
            
            select = aleatorio.nextInt(2);
            if(select == 0){
                int limpiar = i;
                juegos[i]=new Tblero(limpiar);
            }else{
                int limpiar = i;
                juegos[i]=new BuscaNum(limpiar);
            }
        }
/*
ºººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº
*/   
        while(!vacio){
            for (int i = 0; i < juegos.length; i++) {
                vacio = (juegos[i].isTerminado());
                if (!juegos[i].isTerminado()){
                    System.out.println("juego: "+(i+1));
                    juegos[i].juego();
                    if (!juegos[i].isTerminado()){
                    juegos[i].juego();
                    }
                }
            }
        }
        
/*
ºººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº
*/   
        
    }
    
}
