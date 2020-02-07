/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA02_PRACTICO;

import java.util.Scanner;

/**
 *
 * @author NATY
 */
public class Cuadrado {
    Scanner entrada=new Scanner(System.in);
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }
    public Cuadrado(){
        lado=0;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
     public void AsignarValores(){
         System.out.println("Ingrese el Lado del cuadrado :");
         lado=entrada.nextInt();
     }
     public void CalcularAreaCuadrado(){
         double AreaCuadrado;
         AreaCuadrado=Math.pow(lado,2);
         System.out.println("El area del cuadrado es :"+AreaCuadrado);
     }
}
