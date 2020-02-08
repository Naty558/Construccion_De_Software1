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
public class Ejercicio9_Contaminacion {
   /* 9.	En un centro de verificación de automóviles se desea saber el promedio de puntos 
            contaminantes de los primeros 25 automóviles que lleguen. 
            Asimismo se desea saber los puntos contaminantes del carro que menos contamino y 
del que más contamino.*/
    public static void main(String[] args) {
     java.util.Scanner Teclado = new java.util.Scanner(System.in);
        int arreglo[]=new int[25];
        int suma=0;
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese los puntos de contaminacion de vehiculo "+(i+1));
            arreglo[i]=Teclado.nextInt();
            suma=suma+arreglo[i];
        }
        int menor,mayor;
        mayor=menor=arreglo[0];
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i]>mayor){
                mayor=arreglo[i];
            }else if(arreglo[i]<menor){
            
                menor=arreglo[i];
            }
        }
        suma=suma/25;
        System.out.println("El promedio de contaminacion es "+suma);
        System.out.println("El que más contamino es: "+mayor);
        System.out.println("El que menos contamino es: "+menor);
    }
}

