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
class humano1{
    protected String nombre;
    protected String apellido;
    public humano1(String n,String a){
        this.nombre=n;
        this.apellido=a;
    }

    @Override
    public String toString() {
        return "humano1{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
}
class ciudadano extends humano{
    private String documento;
    public ciudadano(String d,String n,String a){
        this.documento=d;
    }

    public String toStringciudadano() {
        return this.toString()+"ciudadano{" + "documento=" + documento + '}';
    }
    
}
public class Ejemplo02 {
     public static void main(String[] args){
         ciudadano c1=new ciudadano("123","juan","salazar");
         System.out.println(c1.toStringciudadano());
     }
}
