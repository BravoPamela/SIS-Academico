package com.mycompany.sis.academio.profesor;

import com.mycompany.sis.academio.Persona.PersonalAcademico;

public class Profesor extends PersonalAcademico {

    //ATRIBUTOS
    private Escalafon escalafon;

    //CONSTRUCTOR
    public Profesor(Escalafon escalafon, double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        this.escalafon = escalafon;
    }

    //GETTERS Y SETTERS
    public Escalafon getEscalafon() {
        return escalafon;
    }

    public void setEscalafon(Escalafon escalafon) {
        this.escalafon = escalafon;
    }

    @Override
    public String toString() {
        return "Profesor{" + super.toString() + "escalafon=" + escalafon + '}';
    }
}
