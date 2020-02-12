/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA02_PRACTICO;

import java.util.Scanner;


public class EstructuraRepetitivaFor2 {
     public static void main(String[] args) {
         Scanner teclado=new Scanner(System.in);
         int f=0,valor;
                 double promedio;
         double suma=0;
         do{
             System.out.println("Ingrese valor :");
             valor=teclado.nextInt();
             suma=suma+valor;
             f++;
         }while(f<10);
         System.out.println("La suma es :");
         System.out.println(suma);
         promedio=suma/10;
         System.out.println("El promedio es :");
         System.out.println(promedio);
     }
}
