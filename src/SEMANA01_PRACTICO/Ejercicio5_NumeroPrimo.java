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
/*5.	Un número primo es una cantidad entera positiva
únicamente divisible por uno o por sí mismo. Calcular y tabular los n primeros números primos.*/
public class Ejercicio5_NumeroPrimo {
   public static void main(String[] args) {
Scanner cin=new Scanner(System.in);

System.out.println("Ingresa el limite del numero primo que desea");
int numero=cin.nextInt();
int CP=0;
int i;
int numeroP=2;
int cont;
        System.out.println("");
while(CP<numero){
    i=1;
    cont=0;
while(i<=numeroP && cont<=2){
if(numeroP%i==0){
cont++;
}
i++;
        }
if(cont==2){
System.out.println(numeroP);
CP++;
}
numeroP++;

    }

    }
}



