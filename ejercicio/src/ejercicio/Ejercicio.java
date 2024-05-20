/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;
import java.io.*;
import java.util.Locale;
import java.util.Scanner;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
/**
 *
 * @author fer
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    
    
   
    public static void main(String[] args) {
        
        Unmarshaller um =null;
        try{
        JAXBContext contexto = JAXBContext.newInstance(Socio.class);
        um = contexto.createUnmarshaller();
        Socio s = (Socio) um.unmarshal(new File("C:\\Users\\fer\\OneDrive\\Documentos\\NetBeansProjects\\ejercicio\\src\\ejercicio\\Socio (2).xml"));
        System.out.println(s);
        Marshaller m = contexto.createMarshaller();
        Socio s1 = new Socio (1, "Armando Fuentes", "C/Fontaneria 1", "01/09/1990");
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.marshal(s1, new FileWriter("socio2.xml"));
        //m.marshal(s1, System.out);
        }catch(Exception ex){
            System.out.println(ex);
        }
         
        
        
         /*10.8
        System.out.println("Nombre del Fichero");
        String fichOriginal = new Scanner(System.in).nextLine();
        String fichCopia = "copia_de_" + fichOriginal;
        try (BufferedReader in = new BufferedReader (new FileReader (fichOriginal));
            BufferedWriter out = new BufferedWriter (new FileWriter(fichCopia))){
            int c = in.read();
            while (c != -1){
                out.write(c);
                c = in.read();
            }
        
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    
    */
/*0-0-0-0-00-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-00-0-0-0-0-0-0-*/        
        /*10.7
        BufferedWriter out = null;
        BufferedReader in = null;
        try{
            
            out = new BufferedWriter(new FileWriter("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\ap\\src\\ap\\Quijote.txt"));
            String cad = "En un lugar de la mancha,";
            for (int i = 0; i < cad.length(); i++) {
                out.write(cad.charAt(i));
            }
            cad = "de cuyo nombre no quiero acordarme";
            out.newLine();
            out.write(cad);
            System.out.println("se acabo");
            
        }catch (IOException ex){
            System.out.println(ex);
        }finally{
            if (out !=null){
                try{
                    out.close();
                }catch (IOException ex){
                    System.out.println(ex);
                }
            }
        }
        try{
        
            in = new BufferedReader (new FileReader("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\ap\\src\\ap\\Quijote.txt"));
            
            String pcad = in.readLine();
            while(pcad != null){
                System.out.println(pcad);
                pcad=in.readLine();
            }
            System.out.println("aqui tambien");
        }catch(IOException ex){
            System.out.println(ex);
        }finally{
            if(in!=null){
                try{
                    in.close();
                }catch(IOException ex){
                    System.out.println(ex);
                }
            }
        }
        */
/*0-0-0-0-00-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-00-0-0-0-0-0-0-*/        
        /* 10.6
        FileInputStream flujo = null;
        try{
            flujo = new FileInputStream ("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\ap\\src\\ap\\Enteros.txt");
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        Scanner s = new Scanner(flujo);
        int contador = 0;
        int suma = 0;
        while (s.hasNext()){
            int n = s.nextInt();
            System.out.println(n+" ");
            suma += n;
            contador++;
        }
        double media = (double)suma / contador;
        System.out.println("\nsume: "+suma + " media: "+ media);*/
        
/*0-0-0-0-00-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-00-0-0-0-0-0-0-*/        
        
        /*10.5
        BufferedReader in = null;
        
        try{
            in = new BufferedReader(new FileReader("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\ap\\src\\ap\\Numeros.txt"));
            Scanner s;
            double numero;
            double suma = 0;
            String linea = in.readLine();
            System.out.println(linea);
            while(linea != null){
                s = new Scanner(linea).useLocale(Locale.US);
                if (s.hasNextDouble()){
                    numero = s.nextDouble();
                    suma += numero;
                }
                linea = in.readLine();
            }
            System.out.println("suma: "+ suma);
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }finally{
            if (in != null){
                try{
                    in.close();
                }catch(IOException ex){
                    System.out.println(ex);
                }
            }
        }
*/
    }
    
}
