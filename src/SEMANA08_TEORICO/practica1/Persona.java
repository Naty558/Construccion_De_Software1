/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA08_TEORICO.practica1;

/**
 *
 * @author NATY
 */
public class Persona {
   public  String nombre;
    public String direccion;
    public String edad;

    public Persona(String nombre, String direccion, String edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }
    public Persona(){
        nombre="";
        direccion="";
        edad="";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + '}';
    }

}