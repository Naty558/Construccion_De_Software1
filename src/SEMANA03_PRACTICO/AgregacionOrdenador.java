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
class CPU{
       Scanner entrada=new Scanner(System.in);
   private String color; 

    public CPU(String color) {
        this.color = color;
    }
    public CPU(){
        
    }


    public void mostrar() {
        System.out.println("Ingrese color :");
         color=entrada.next();
         System.out.println("El color del CPU ES "+color);
    }
   
}
class pantalla{
  private String forma;  
}
class teclado{
    private int costo;
}
class raton{
    private int tamanio;
}
class Ordenador{
public pantalla mipantalla;
public teclado miteclado;
public CPU micpu;
public raton miraton;
public Ordenador(pantalla p,teclado t,CPU c,raton r){
  this.mipantalla=p;
  this.miteclado=t;
  this.micpu=c;
  this.miraton=r;
}

}
public class AgregacionOrdenador {
    Scanner entrada=new Scanner(System.in);
          public static void main(String[] args){
              CPU c=new CPU();
              c.mostrar();
}
}