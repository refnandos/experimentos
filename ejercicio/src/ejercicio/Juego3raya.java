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
        //Jugadores players= new Jugadores();
        JuegoMadre[] juegos;
        boolean vacio=false;
        
/*
ºººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº
*/   
        System.out.println("cuantos juegos deseas crear?");
        juegos = new JuegoMadre[leer.nextInt()];
        for (int i = 0; i < juegos.length; i++) {
            int select;
            System.out.println("El juego numero "+(i+1)+" será \n"
                    + "1:tres en raya \n"
                    + "o \n"
                    + "2:adivinar?");
            select = leer.nextInt();
            if(select == 1){
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
