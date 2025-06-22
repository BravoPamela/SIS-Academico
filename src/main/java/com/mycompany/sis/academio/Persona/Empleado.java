/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sis.academio.Persona;

/**
 *
 * @author User
 */
public class Empleado extends PersonaInstitucional{
    private double sueldo;
    //constructor

    public Empleado(double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(correoInstitucional, id, nombre, correoPersonal, cedula);
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "Sueldo=" + sueldo + super.toString()+'}';
    }
    public boolean verificarCedula(){
    return true;
    }
    
}
