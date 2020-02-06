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
public class Ejercicio10 {
   /* 10.Realizar un programa que promedie una lista indeterminada de números reales, hasta que se
            introduzca un número negativo. Escriba el programa de dos formas:
usando el WHILE-DO y el REPEAT-UNTIL.*/
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double numero,sum=0;
        int contador=0;
        boolean valor=true;
        do{
        System.out.println("Ingrese un numero que no sea negativo:  ");
        numero=entrada.nextDouble();
        if(numero>=0){
            sum+=numero;
            contador++;
        }else{
            valor=false;
        }   
        }while(valor);
        double promedio=sum/contador;
        System.out.println("La suma es:  "+sum);
        System.out.println("Los numeros reales ingresados son:  "+contador);
        System.out.println("El promedio es: "+promedio);
    }
    
}
