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
public class Ejercicio5 {
    /*5.	Calcular la suma de 1+ 1/(2!) + 1/(3!) + 1/(4!) + .... + 1/(n!) para un n dado.
    Escriba el programa de tres formas diferentes: usando Repita mientras, Repita hasta y Repita para. */
 public static void main(String[] args) {
Scanner cin=new Scanner(System.in);
System.out.println("Ingresa la opcion 1 para Repita mientras");
System.out.println("Ingresa la opcion 2 para Repita Hasta");
System.out.println("Ingresa la opcion 3 para Repita Para");
int opcion=cin.nextInt();
System.out.println("Ingresa un numero n:  ");
int n=cin.nextInt();
int i=1;
double suma=0,nu1=1;
switch(opcion){

case 1:

while(i<=n){
if(i==1){
suma=i;
}else{
suma+=nu1/factorial(i);
}

i++;
}
System.out.println("Suma:  "+suma);
break;
case 2:

do{
if(i==1){
suma=i;
}else{
suma+=nu1/factorial(i);
}
i++;
}while(i<=n);
System.out.println("Suma:  "+suma);
break;
case 3:
for(i=1;i<=n;i++){
if(i==1){
suma=i;
}else{
suma+=nu1/factorial(i);
}
}
System.out.println("Suma:  "+suma);
break;
default:
System.out.println("La opcion es invalida");
}
}
public static double factorial(int n){
int fact=n;
for(int i=1;i<n;i++){
fact=fact*i;
}
return fact;
}
}


