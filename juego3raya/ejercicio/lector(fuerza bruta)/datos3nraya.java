/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;
import javax.xml.bind.annotation.*;
/**
 *
 * @author fer
 */
@XmlRootElement(name="datos")
@XmlType(propOrder = {"tamaño","rango","raya","random","nombre1","ficha1","nombre2","ficha2"})
@XmlAccessorType(XmlAccessType.FIELD)
public class datos3nraya {
    
    //se crean las variables con los valores obtenidos del archivo  xml
    
    @XmlAttribute(required = true)
    private Integer  id;
    @XmlElement(name = "tamaño")
    private Integer  tamaño;
    @XmlElement(name = "rango")
    private Integer  rango;
    @XmlElement(name = "raya")
    private Integer  raya;
    @XmlElement(name = "random")
    private Integer  random;
    
    
    @XmlElement(name = "nombre1")
    private String nombre1;
    @XmlElement(name = "ficha1")
    private String ficha1;
    @XmlElement(name = "nombre2")
    private String nombre2;
    @XmlElement(name = "ficha2")
    private String ficha2;
    //las variables ya tineen valores, no hace falta un constructor
    public datos3nraya(){
    }
    
    
    /* //opconal
    public datos3nraya 
        (Integer id,Integer tamaño,Integer rango,Integer raya, Integer random, String nombre1, String ficha1,String nombre2, String ficha2){
        this.id = id;
        this.nombre1 = nombre1;
        this.ficha1 = ficha1;
        this.nombre2 = nombre2;
        this.ficha2 = ficha2;
        this.tamaño = tamaño;
        this.random = random;
        this.raya = raya;
    }
*/
    public Integer getRango() {
        return rango;
    }

    public String getNombre1() {
        return nombre1;
    }

    public String getFicha1() {
        return ficha1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public String getFicha2() {
        return ficha2;
    }

        
        
    public Integer getId() {
        return id;
    }


    public Integer getTamaño() {
        return tamaño;
    }

    public Integer getRaya() {
        return raya;
    }

    public Integer getRandom() {
        return random;
    }

    
    
    
}
