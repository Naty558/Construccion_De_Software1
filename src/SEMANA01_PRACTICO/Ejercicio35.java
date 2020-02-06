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
public class Ejercicio35 {
    /* En una tienda de descuento las personas que van a pagar el importe de su compra llegan a la caja
y sacan una bolita de color, que les dirá que descuento tendrán sobre el total de su compra. 
Determinar la cantidad que pagara cada cliente desde que la tienda abre hasta que cierra. Se sabe que si
el color de la bolita es roja el cliente obtendrá un 40% de descuento; si es amarilla un 25% y si es blanca
no obtendrá descuento. */
    public static void main(String[] args) {
       java.util.Scanner Teclado = new java.util.Scanner(System.in);
        int tecla_repetir = 0;
         do{
             System.out.println("Ingrese el valor de importe de la compra:");
        int importe_de_la_compra=Teclado.nextInt();
        int descuento = 0;
        int cantidad_a_pagar;
        int bolita=0;
             System.out.println("Eliga su bolita");
             System.out.println("0.Roja 1.Amarilla 2.Blanca");
             bolita=Teclado.nextInt();
        if(bolita == 0 ){
            descuento =(int) (importe_de_la_compra*0.4);
            System.out.println("Bolita roja");
        }
        if(bolita == 1) {
            descuento = (int) (importe_de_la_compra*0.25);
            System.out.println("Bolita amarilla");
        }
         if(bolita == 2) {
             System.out.println("Bolita blanca");
         }
        cantidad_a_pagar = importe_de_la_compra-descuento;
             System.out.println("Valor de bolita: "+ bolita);
             System.out.println("Valor de cantidad a pagar: "+ cantidad_a_pagar);
             System.out.println("Valor de descuento: "+ descuento);
             System.out.println("");
        do{
            System.out.println("Desea repetir el proceso? (1.S/2.N):");
            tecla_repetir=Teclado.nextInt();
        }while(tecla_repetir==1);
         } while(tecla_repetir ==2);

 
    }
}


    