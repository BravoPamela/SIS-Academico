/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sis.academio.Persona;

import com.mycompany.sis.academio.Personas.Personas;

/**
 *
 * @author User
 */
public /*abstract*/ class PersonaInstitucional extends Personas{
 private String correoInstitucional;
    //constructor

    public PersonaInstitucional(String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(id, nombre, correoPersonal, cedula);
        this.correoInstitucional = correoInstitucional;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    @Override
    public String toString() {
        return "PersonalInstitucional{" + "correoInstitucional=" + correoInstitucional + super.toString()+'}';
    }
    
     public boolean verificarCedula(){
    return true;
    }
}
