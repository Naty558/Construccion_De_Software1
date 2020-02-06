/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA01_PRACTICO;

import javax.swing.JOptionPane;



public class Ejercicio16 {
  
/*Los surtidores de una gasolinera registran las ventas por galones, pero el precio de la gasolina está 
    fijada en litros.
    El programa debe calcular lo que los clientes deben pagar y el total recaudado por la gasolinera,
    tomando en cuenta lo siguiente: 
• Cada galón tiene 3,785 litros 
• El precio del litro es para el Tipo A 50 Soles, para el Tipo B 55 Soles y para el Tipo C 60 Soles. 
• El programa finaliza cuando se introduce una D como tipo de gasolina.*/
    public static void main(String[] args) {
        java.util.Scanner Teclado = new java.util.Scanner(System.in);
        String opciones;      
        System.out.println("1. tipo A \n"+"2. tipo  B \n"+"3. tipo  C \n");
        System.out.println("Ingrese un tipo ");
        int tipo=Teclado.nextInt();
        System.out.println("ingrese cantidad de galones: ");
        int galones=Teclado.nextInt();
        
        double litros=galones*3.785;
              if(tipo==1){
                  
                double precioA=litros*50;
                System.out.println("total a pagar: "+precioA);
              }
              if(tipo==2){
                  
                double precioB=litros*55;
                System.out.println("total a pagar: "+precioB);
              }
               if(tipo==3){
                double precioC=litros*60;
                System.out.println("total a pagar: "+precioC);
               }
        }

    }



