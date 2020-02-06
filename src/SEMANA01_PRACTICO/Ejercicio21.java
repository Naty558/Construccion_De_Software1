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
/*En un supermercado un cajero captura los precios de los artículos que los clientes compran e indica
a cada cliente cual es el monto de lo que deben pagar. Al final del día le indica a su supervisor
cuanto fue lo que cobro en total a todos los clientes que pasaron por su caja. */
 
public class Ejercicio21 {
    public static void main(String[] args) {
       java.util.Scanner Teclado = new java.util.Scanner(System.in);
        int opcion;
        int valor;
        int sumaProducto=0;
        int sumaDia=0;
        do{
        System.out.println("1 . Ingrese los productos comprados ");
        System.out.println("2. salir  ");
        opcion=Teclado.nextInt();
        if(opcion==1){
            System.out.println("Ingrese la cantidad de productos comprados ");
            int cantidad=Teclado.nextInt();
            System.out.println("La cantidad de productos comprados es :"+cantidad);
            for(int i=0;i<cantidad;i++){
                System.out.println("Ingrese el valor del producto :");
                 valor=Teclado.nextInt();
                System.out.println( "El valor del producto comprado es "+valor);
                 sumaProducto=sumaProducto+valor;
            }
            
           
            System.out.println("El monto a pagar es :"+sumaProducto);
            sumaDia=sumaDia+sumaProducto;
        }
        }while(opcion==1);
        System.out.println("La suma del dia es "+sumaDia);
        
            
        }
        
    }

