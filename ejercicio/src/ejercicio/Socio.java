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
@XmlRootElement(name="socio")
@XmlType(propOrder = {"nombreSocio","direccion","fechaAlta"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Socio {
    @XmlAttribute(required = true)
    private Integer  id;
    @XmlElement(name = "nombre")
    private String nombreSocio;
    @XmlElement(name = "direccion")
    private String direccion;
    @XmlElement (name="alta")
    private String fechaAlta;
    
    public Socio(){
    }
    public Socio (Integer id, String nombreSocio, String direccion, String fechaAlta){
        this.id = id;
        this.nombreSocio = nombreSocio;
        this.direccion = direccion;
        this.fechaAlta = fechaAlta;
    }

    @Override
    public String toString() {
        return "Socio{" + "id=" + id + ", nombreSocio=" + nombreSocio + ", direccion=" + direccion + ", fechaAlta=" + fechaAlta + '}';
    }
    
    
}
