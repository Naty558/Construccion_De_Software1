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
/*19) Encontrar el menor valor de un conjunto de n números dados*/
public class Ejercicio19_MenorNumero {
public static void main(String[] args) {
Scanner entrada=new Scanner(System.in);
int num;

int menor=0;
System.out.println("Ingrese la cantidad de numeros :");
num=entrada.nextInt();
int  arreglo[]=new  int[num];

for(int i=0;i<num;i++){
System.out.println("Ingrese el "+(i+1)+"numero");
arreglo[i]=entrada.nextInt();
if(i==0){
menor=arreglo[i];
}
if(arreglo[i]<menor){
menor=arreglo[i];
}
}
System.out.println("El numero menor es "+menor);

}
}


