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
 *//*20.	Encontrar el mayor valor de un conjunto de n números dados*/
public class Ejercicio20_MayorNumero {
   public static void main(String[] args) {
Scanner entrada=new Scanner(System.in);
int num;

int mayor=0;
System.out.println("Ingrese la cantidad de numeros :");
num=entrada.nextInt();
int  arreglo[]=new  int[num];

for(int i=0;i<num;i++){
System.out.println("Ingrese el "+(i+1)+" numero");
arreglo[i]=entrada.nextInt();

if(arreglo[i]>mayor){
mayor=arreglo[i];
}
}
System.out.println("El numero mayor es "+mayor);

}
}


