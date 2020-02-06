/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA01_PRACTICO;

/**
 *
 * @author NATY
 */
public class Ejercicio22 {
    /* Suponga que tiene usted una tienda y desea registrar las ventas en su computadora. 
     Diseñe un algoritmo que lea por cada cliente, el monto total de su compra. 
             Al final del día que escriba la cantidad total de ventas y el numero de clientes atendidos. */
    public static void main(String[] args) {
       java.util.Scanner Teclado = new java.util.Scanner(System.in);
      
    int clientes_atendidos= 0;
    int total_de_ventas =0;
    int total_de_la_compra=0;
    int opcion;
   do{
        System.out.println( "Ingrese el valor de total de la compra:");
        total_de_la_compra=Teclado.nextInt();
        total_de_ventas= total_de_ventas+total_de_la_compra;
        clientes_atendidos = clientes_atendidos+1;
        System.out.println("");
        
        System.out.println( "¿Desea repetir el proceso? (1. SI/ 2. NO):");
            opcion=Teclado.nextInt();
        
   }while(opcion==1);
       System.out.println( "Valor de clientes atendidos: "+ clientes_atendidos);
       System.out.println("Valor de total de ventas: "+ total_de_ventas);

    }
}
