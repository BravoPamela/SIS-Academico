package com.mycompany.sis.academio.estudiante;

import com.mycompany.sis.academio.Persona.PersonaInstitucional;

public class Estudiante extends PersonaInstitucional{
    
    //ATRIBUTOS
    private int codigo;
    
    //CONSTRUCTOR
    public Estudiante(int codigo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(correoInstitucional, id, nombre, correoPersonal, cedula);
        this.codigo = codigo;
    }
    
    //GETTERS Y SETTERS
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public String toString() {
        return "Estudiante{" + super.toString() + "codigo=" + codigo + '}';
    }   
}