/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA01_PRACTICO;

import java.util.Scanner;

/**
 *
 * @author NATY
 */
public class Ejercicio37 {
    /*En un supermercado una ama de casa pone en su carrito los artículos que va tomando de los estantes. 
La señora quiere asegurarse de que el cajero le cobre bien lo que ella ha comprado, por lo que cada vez que
toma un articulo anota su precio junto con la cantidad de artículos iguales que ha tomado y determina cuanto
dinero gastara en ese articulo; a esto le suma lo que ira gastando en los demás artículos, hasta que decide
que ya tomo todo lo que necesitaba. Ayúdale a esta señora a obtener el total de sus compras. */
      public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        
        int cont = 0;
        int op=0;
 int suma = 0;
 String articulo ;
 int c,n;
         do{
	
	    System.out.println("ingrese el nombre del articulo :");
            articulo=cin.next();
	
                    
            
	         System.out.println("ingrese el valor del articulo comprado: ");
                  n=cin.nextInt();
	
	         System.out.println("ingrese la cantidad de articulos que compro del mismo tipo: ");
                    c=cin.nextInt();
	cont = c;
	suma = suma + (n * c);
	         System.out.println("la señora compro "+ c+" por un monto de: "+ n+"pesos el articulo");
	         System.out.println("hasta el momento la señora lleva gastado: "+suma+ "pesos.");
	         System.out.println("desea comprar llevar otro articulo?: 1.si/2.no ");
                op=cin.nextInt();
         }while(op==1);
	if (op == 2){
		int cancelar = suma;
		          System.out.println("el monto a cancelar sera: "+cancelar+ "pesos.");

      }
 
}
}
