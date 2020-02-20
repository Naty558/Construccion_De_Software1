/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA04_TEORICO;

/**
 *
 * @author NATY
 */
class humano{
    protected String nombre;
    protected String apellido;
    public humano(String nombre,String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    
    }
    public humano(){
        nombre="";
        apellido="";
    }
    public String nombreCompleto(){
        return this.apellido +","+this.nombre;
    }
    public String identificacion(){
        return this.nombreCompleto();
    }
}

public class Ejemplo01 {
     public static void main(String[] args){
         humano h =new humano();
         System.out.println("Ingrese el nombre del humano");
         
         
     }
}
