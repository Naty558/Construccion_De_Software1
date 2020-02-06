/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA01_PRACTICO;


public class Ejercicio24 {
   /* Al cerrar un expendio de naranjas, 15 clientes que aún no han pagado recibirán un 15% de 
            descuento si compran más de 10 kilos. 
            Determinar cuánto pagará cada cliente y cuanto percibirá la tienda por esas compras.*/
    public static void main(String[] args) {
       java.util.Scanner Teclado = new java.util.Scanner(System.in);
        System.out.println("----NARANJAS------");
        int cantidad,precio,descuento,kilos=0,topagar;
        int compra = 0;
         int des = 0;
          int contador = 0;
        System.out.println("La cantidad de naranjas a comprar ");
        cantidad=Teclado.nextInt();
      

             for (int i = 0; i < 15; i++) {
            System.out.println("ingrese cantidad de kilos: ");
            kilos=Teclado.nextInt();

                compra = cantidad * kilos;
                 if(kilos > 10 ){
                  descuento = (int) (compra*(0.15));
                   topagar = compra-descuento;
                     System.out.println("debe pagar:"+compra);
                     System.out.println("su descuento es de:" +descuento);
                 }else
                 {
                     topagar=compra;
                     System.out.println("USTED NO TIENE DESCUENTO ");
                     
                 }
                 contador=topagar+contador;
             }
        System.out.println("el total de ingresos ala tienda fue de :" +contador);
    }
}

    

