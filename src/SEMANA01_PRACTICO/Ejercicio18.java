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
public class Ejercicio18 {
 /*En un supermercado una ama de casa pone en su carrito los artículos que va tomando de los estantes. La señora quiere
asegurarse de que el cajero le cobre bien lo que ella ha comprado, por lo que cada vez que toma un artículo
anota su precio junto con la cantidad de artículos iguales que ha tomado y determina cuánto gastara en ese artículo; 
a esto le suma lo que ira gastando en los demás artículos, 
hasta que decide que ya tomo todo lo que necesitaba. Ayúdale a esta señora a obtener el total de sus compras.*/
    public static void main(String[] args) {
        java.util.Scanner Teclado = new java.util.Scanner(System.in);
        System.out.println("----------------------------------------------");
        System.out.println("------------------SUPERMERCADO NATY----------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("Ingrese la cantidad de productos que va a comprar :");
        int cantidadProductos=Teclado.nextInt();
        double totalAPagar=0;
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println("ingrese precio del "+(i+1)+" producto :");
            double Costo=Teclado.nextDouble();
            System.out.println("ingrese cantidad del "+(i+1)+" producto :");
            int cantidad1=Teclado.nextInt();
            totalAPagar=totalAPagar+(double)cantidad1*Costo;
        }
        System.out.println("el total a pagar es :"+totalAPagar);
    }
}



