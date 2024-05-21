/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lector;
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
public static void main(String[] args) {
    Datos datos = null;
    try {
            // Cargar el archivo XML
            File archivo = new File("C:\\Users\\fer\\OneDrive\\Documentos\\NetBeansProjects\\lector\\src\\lector\\datos3nraya.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(archivo);
            doc.getDocumentElement().normalize();

            // Obtener el elemento <juego3raya>
            NodeList juego3rayaList = doc.getElementsByTagName("juego3raya");
            Element juego3rayaElement = (Element) juego3rayaList.item(0);

            // Obtener el número de juegos
            int cantidadJuegos = Integer.parseInt(juego3rayaElement.getElementsByTagName("cantidadjuegos").item(0).getTextContent());

            // Leer datos de Tablero
            Element tableroElement = (Element) juego3rayaElement.getElementsByTagName("Tblero").item(0);
            int tamaño = Integer.parseInt(tableroElement.getElementsByTagName("tamaño").item(0).getTextContent());

            List<Jugadorxml> jugadoresTablero = new ArrayList<>();
            NodeList jugadoresList = tableroElement.getElementsByTagName("jugador");
            for (int i = 0; i < jugadoresList.getLength(); i++) {
                Element jugadorElement = (Element) jugadoresList.item(i);
                String nombre = jugadorElement.getElementsByTagName("nombre").item(0).getTextContent();
                String ficha = jugadorElement.getElementsByTagName("ficha").item(0).getTextContent();
                jugadoresTablero.add(new Jugadorxml(nombre, ficha));
            }

            Tableroxml tablero = new Tableroxml(tamaño, jugadoresTablero);

            // Leer datos de BuscaNum
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

            // Crear el objeto Datos y almacenar los datos
            datos = new Datos(cantidadJuegos, tablero, buscaNum);

            // Imprimir los datos
            System.out.println(datos);
        } catch (Exception e) {
            e.printStackTrace();
        }
    System.out.println(datos.getTablero().getJugadores().get(0).getNombre());

}

    
}
