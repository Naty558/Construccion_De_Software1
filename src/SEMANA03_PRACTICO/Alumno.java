/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_PRACTICO;

import java.util.Scanner;

/**
 *
 * @author NATY
 */
public class Alumno {
    Scanner entrada=new Scanner(System.in);
    private String nombre;
    private int edad;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public Alumno(){
        nombre="";
        edad=0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void IngresarDatos(){
        System.out.println("Ingrese el nombre del alumno :");
        nombre=entrada.nextLine();
        System.out.println("Ingresar edad del alumno :");
        edad=entrada.nextInt();
       
    }
    public void ImprimirDatos(){
        System.out.println("El nombre del alumno es "+nombre);
        System.out.println("La edad del alumno es "+edad);
  
}
    public void MostrarEdad(){
         if(edad>=18){
            System.out.println("El alumno es mayor de edad :");
        }else{
            System.out.println("El alumno es menor de edad :");
        }
    }
}
