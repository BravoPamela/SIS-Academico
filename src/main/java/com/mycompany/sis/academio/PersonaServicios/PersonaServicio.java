/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sis.academio.PersonaServicios;

import com.mycompany.sis.academio.Persona.Empleado;

/**
 *
 * @author User
 */
public class PersonaServicio extends Empleado {
    private String gremio;
    
    //constructor

    public PersonaServicio(String gremio, double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        this.gremio = gremio;
    }
    
    //set y gerr

    public String getGremio() {
        return gremio;
    }

    public void setGremio(String gremio) {
        this.gremio = gremio;
    }
    public String agregarPersonalServicio(){
    return "";
    }

    @Override
    public String toString() {
        return "PersonaServicios{" + "gremio=" + gremio + super.toString()+'}';
    }
    
}
