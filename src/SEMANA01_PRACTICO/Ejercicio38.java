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
/* Una persona que va de compras a la tienda “Enano, S.A.”, decide llevar un control sobre lo que va 
comprando, para saber la cantidad de dinero que tendrá que pagar al llegar a la caja. La tienda tiene
una promoción del 20% de descuento sobre aquellos artículos cuya etiqueta sea roja. Determinar la cantidad
de dinero que esta persona deberá pagar. */
 
public class Ejercicio38 {
    public static void main(String[] args) {
       java.util.Scanner Teclado = new java.util.Scanner(System.in);
    int total=0;
    int q;
    int prec;
            double desc=0;
    int precio;
do{
    System.out.println("nombre del articulo");
    String articulo=Teclado.next();
    System.out.println(" valor del articulo");
     int val=Teclado.nextInt();
    System.out.println("Cuantos articulos va a comprar");
    int unid=Teclado.nextInt();
    System.out.println("El articulo tiene etiqueta roja?");
    System.out.println("[1.S] [2.N]");
     int etiq=Teclado.nextInt();
prec =val*unid;
if(etiq==1) {
desc = (prec*0.20);
precio=(int) (prec-desc);
total=total+precio;
    System.out.println("precio por los "+unid+ " articulos "+precio+ "soles");
    System.out.println("Control de cantidad "+total+ "soles");
}else{
    total=total+prec;
    System.out.println("precio por los "+unid +" articulos "+prec +"soles");
     System.out.println("Control de cantidad "+total+ "soles");
}

    System.out.println("Va a seguir comprando?");
    System.out.println("[1.S] [2.N]");
    q=Teclado.nextInt();
}while(q==1);
if(q==2){
        System.out.println("Cantidad Total A pagar "+total+ "soles");
}
}
}
