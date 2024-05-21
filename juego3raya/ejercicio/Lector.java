/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author fer
 */
public class Lector {
    private Datos datos = null;
    
    
public Lector() {
    
    try {
            // busca el alchivo xml y lo analiza
            File archivo = new File("C:\\Users\\fer\\OneDrive\\Documentos\\NetBeansProjects\\ejercicio\\src\\ejercicio\\datos3nrayaleer.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(archivo);
            doc.getDocumentElement().normalize();

            // busca y guarda  el elemento con la etiqueta: juego3raya
            NodeList juego3rayaList = doc.getElementsByTagName("juego3raya");
            Element juego3rayaElement = (Element) juego3rayaList.item(0);

            // una vez dentro de la etiqueta juego3raya se busca y guarda la cantidad de juegos, es decir, busca la etiqueta cantidadjuegos y almacena lo que este en ella, usando parseInt para pasar el texto a codigo
            int cantidadJuegos = Integer.parseInt(juego3rayaElement.getElementsByTagName("cantidadjuegos").item(0).getTextContent());

            // busca el elemento tablero que contiene sus propios elementos, ademas los busca y almacena para ser usados despues en la creacion del objeto tablero 
            Element tableroElement = (Element) juego3rayaElement.getElementsByTagName("Tblero").item(0); //busca el elemento Tblero y lo almacena como un objeto elemento
            int tamaño = Integer.parseInt(tableroElement.getElementsByTagName("tamaño").item(0).getTextContent()); //busca el elemento tamaño dentro de el elemento tablero y lo pasa a un Integer

            List<Jugadorxml> jugadoresTablero = new ArrayList<>(); //lista dinamica generica para los jugadores que solo admite un objeto del tipo Jugadorxml
            NodeList jugadoresList = tableroElement.getElementsByTagName("jugador"); //se busca el elemento jugador dentro de la lista que tengan la etiqueta jugador
            for (int i = 0; i < jugadoresList.getLength(); i++) { //bucle for con iteraciones igual al tamaño de la lista de jugadores
                Element jugadorElement = (Element) jugadoresList.item(i); //se crea el elemento jugador que almacena el elemento de la lista jugadoresList
                String nombre = jugadorElement.getElementsByTagName("nombre").item(0).getTextContent(); // se busca y almacena el contenido de la etiqueta nombre
                String ficha = jugadorElement.getElementsByTagName("ficha").item(0).getTextContent(); // se busca y almacena el contenido de la etiqueta ficha
                jugadoresTablero.add(new Jugadorxml(nombre, ficha)); //se añade a la lista jugadoresTablero un objeto nuevo con las variables nombre y ficha
            }

            Tableroxml tablero = new Tableroxml(tamaño, jugadoresTablero);//se crea el objeto Tableroxml dandole la variable tamaño ya almacenada y la lista dinamica generica jugadoresTablero

            // busca el elemento tablero que contiene sus propios elementos, ademas los busca y almacena para ser usados despues para la creaciond el objeto buscanum
            Element buscaNumElement = (Element) juego3rayaElement.getElementsByTagName("BuscaNum").item(0);
            int rango = Integer.parseInt(buscaNumElement.getElementsByTagName("rango").item(0).getTextContent());

            List<Jugadorxml> jugadoresBuscaNum = new ArrayList<>();
            NodeList jugadoresBuscaNumList = buscaNumElement.getElementsByTagName("jugador");
            for (int i = 0; i < jugadoresBuscaNumList.getLength(); i++) {
                Element jugadorElement = (Element) jugadoresBuscaNumList.item(i);
                String nombre = jugadorElement.getElementsByTagName("nombre").item(0).getTextContent();
                String ficha = jugadorElement.getElementsByTagName("ficha").item(0).getTextContent();
                jugadoresBuscaNum.add(new Jugadorxml(nombre, ficha));
            }

            BuscaNumxml buscaNum = new BuscaNumxml(rango, jugadoresBuscaNum);

            // le da los valores leidos anteriormente a el objeto datos
            datos = new Datos(cantidadJuegos, tablero, buscaNum);

            
        } catch (Exception e) {
            e.printStackTrace();
        }

}

    public Datos getDatos() {
        return datos;
    }



    
}
