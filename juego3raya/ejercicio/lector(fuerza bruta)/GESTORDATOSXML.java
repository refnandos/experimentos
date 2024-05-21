/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Usuario
 */
public class GESTORDATOSXML {
        
            private Unmarshaller um =null;
            private JAXBContext contexto;
            private datos3nraya datos = null ;
    
    public GESTORDATOSXML(){
            try{
            contexto = JAXBContext.newInstance(datos3nraya.class);
            um = contexto.createUnmarshaller();
            datos = (datos3nraya) um.unmarshal(new File("C:\\Users\\fer\\OneDrive\\Documentos\\NetBeansProjects\\ejercicio\\src\\ejercicio\\datos3nraya.xml"));

            }catch(JAXBException ex){
                System.out.println(ex);
            }
            
    }
    
    public Integer getId() {
        return this.datos.getId();
    }

    public Integer getRango() {
        return this.datos.getRango();
    }

    public String getNombre1() {
        return this.datos.getNombre1();
    }

    public String getFicha1() {
        return this.datos.getFicha1();
    }

    public String getNombre2() {
        return this.datos.getNombre2();
    }

    public String getFicha2() {
        return this.datos.getFicha2();
    }

        
    public Integer getTamaño() {
        return this.datos.getTamaño();
    }

    public Integer getRaya() {
        return this.datos.getRaya();
    }

    public Integer getRandom() {
        return this.datos.getRandom();
    }
}
