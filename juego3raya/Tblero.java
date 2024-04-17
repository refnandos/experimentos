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
    
        public boolean juego(char i,Jugadores players)
{//inicio metodo buscarcoordenada
        String[][] auxtab;
        Jugador[] avatares = players.getListajug();
        auxtab = this.tablero;
        System.out.println("introduzca la posición para: "+i);
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
            juego(i,players);
        }
        Jugador pato=null;
        for(int j = 0 ; j<avatares.length ; j++){
            if (avatares[j].getAvatar()==i)
                pato = avatares[j];
        }
        return comprobarganador(auxtab,i,pato.getNombre());
}//fin metodo buscarcoordenada
        
        
        
        public static boolean comprobarganador(String[][] auxtab,char i,String nomjgdr)
{//inicio funcion comprovar ganador
        boolean zi=false;
        int j=0;
        int k=0;
        int contador = 0;
        int contadorcol =0;
        int contadordiag =0;
        int contadordiagder =0;
        String [] comprueba=new String [auxtab.length];
        while(!zi&&k<auxtab.length){
            contador=0;
            contadorcol=0;
            contadordiag=0;
            contadordiagder=0;
            j=0;
            while(j<auxtab.length){
                comprueba[j]=i+"";
                contador=(comprueba[j].equals(auxtab[k][j]))?contador+1:contador;
                contadorcol=(comprueba[j].equals(auxtab[j][k]))?contadorcol+1:contadorcol;
                contadordiag=(comprueba[j].equals(auxtab[j][j]))?contadordiag+1:contadordiag;
                contadordiagder=(comprueba[j].equals(auxtab[auxtab.length-1-j][j]))?contadordiagder+1:contadordiagder;
                j++;
            }
            zi=(contador==auxtab.length||contadorcol==auxtab.length||contadordiag==auxtab.length||contadordiagder==auxtab.length);
            
            k++;
        }
        if (zi){
                    System.out.println(nomjgdr+ " es el ganador");
                }
        return zi;
}//fin funcion comprobar ganador
        
}
