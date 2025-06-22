package com.mycompany.sis.academio.decano;

import com.mycompany.sis.academio.Persona.PersonalAcademico;

public class Decano extends PersonalAcademico {

    //ATRIBUTOS
    private String nivel;

    //CONSTRUCTOR
    public Decano(String nivel, double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        this.nivel = nivel;
    }
    
    //GETTERS Y SETTERS
    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Decano{" + super.toString() + "nivel=" + nivel + '}';
    }
}
