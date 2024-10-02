/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.dominio;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named("InvestigacionBean")
@RequestScoped
public class InvestigacionBean {
    private Investigacion investigacion;

    // Constructor
    public InvestigacionBean() {
        investigacion = new Investigacion("Investigación en IA", 
                "Descripción de la investigación", 
                "https://ejemplo.com/referencia", 
                "imagen.jpg");
    }

    public Investigacion get_investigacion() {
        return investigacion;
    }

    public void set_investigacion(Investigacion investigacion) {
        this.investigacion = investigacion;
    }
}

