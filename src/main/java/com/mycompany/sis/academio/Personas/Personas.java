/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sis.academio.Personas;

/**
 *
 * @author User
 */
public class Personas {
    private int id;
    private String nombre;
    private String correoPersonal;
    private String cedula;
    //CONSTRUCTOR
   
   public Personas(int id, String nombre, String correoPersonal, String cedula) {
        this.id = id;
        this.nombre = nombre;
        this.correoPersonal = correoPersonal;
        this.cedula = cedula;
        
       
    }
    
    @Override
    public String toString() {
        return "Personass{" + "id=" + id + ", nombre=" + nombre + ", correoPersonal=" + correoPersonal + ", cedula=" + cedula + '}';
    } 
}
