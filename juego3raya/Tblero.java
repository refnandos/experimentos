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
public class Tblero {
    static Scanner leer = new Scanner(System.in);
    String [][] tablero;
    
    public Tblero(){
        tablero = new String [0][0];
    }
    
    public void crear_tablero(){
        int tamaño;
        System.out.println("de que tamaño sera el tablero de  juego?");
        tamaño = leer.nextInt();
        String [][] auxtab = new String [tamaño] [tamaño];
        rellenar_tablero(auxtab,1);
        this.tablero = auxtab;
    }
    
    private void rellenar_tablero(String[][] auxtab,int tipo){
        int relleno = 1;
        for (int i = 1; i <= auxtab.length; i++) {
            for (int j = 1; j <= auxtab.length; j++) {
                if(tipo==1){
                String po = ""+ relleno;
                auxtab[i-1][j-1] = po;
                relleno++;
                String espaciado = (relleno>=100)?" ":(relleno>10)?"  ":"   ";
                System.out.print(auxtab[i-1][j-1]+espaciado);
                }else{
                relleno++;
                String espaciado = (relleno>=100)?" ":(relleno>10)?"  ":"   ";
                System.out.print(auxtab[i-1][j-1]+espaciado);
                }
            }
            System.out.println("");
        }
    }
    
        public void buscarcoordenada(char i,Jugadores players)
{//inicio metodo buscarcoordenada
        String[][] auxtab;
        Jugador[] avatares = players.getListajug();
        auxtab = this.tablero;
        System.out.println("introduzca la posición");
        int posicion= leer.nextInt();
        boolean libre = true;
        int fila =(posicion%2==0)?posicion/(auxtab.length+1):posicion/(auxtab.length);
        int columna = (posicion-auxtab.length*fila)-1;
        
        if(columna>=(auxtab.length)){
            fila+=1;
            columna-=auxtab.length;
        }else if (columna<0){
            fila-=1;
            columna+=auxtab.length;
       }
        
        for (int j = 0; j < avatares.length&&libre; j++) 
{//inicio bucle for de j
    
            libre = (avatares[j].getAvatar() != auxtab[fila][columna].charAt(0));
            
}//fin bucle for de j
        
        if(libre){
            System.out.println(fila +"-"+ columna+"confirmado");
            
            auxtab [fila][columna]=i+"";
            rellenar_tablero(auxtab,i);
        }else{
            System.out.print(posicion+" es una posicion que ya esta ocupaoda, seleccione otra poscicion: ");
            buscarcoordenada(i,players);
        }
        
}//fin metodo buscarcoordenada
}
