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
public class Ejercico7 {
 /*7.Escriba un programa que lea un valor entero positivo y determine: a) Si el entero es un número primo.
            b) Si el entero es un número de Fibonacci. (Los número de Fibonacci forman una secuencia en 
            la cual cada número es igual a la suma de los dos anteriores, siendo los dos primeros números iguales a 1)
}*/
 public static void main(String[] args) {
Scanner cin=new Scanner(System.in);
System.out.println("Ingresa un numero entero y positivo");
int numero=cin.nextInt();
if(primo(numero)){
System.out.println("Es un numero primo");
}else{
System.out.println("No es numero primo");
}

if(fibonacci(numero)){
System.out.println("El numero es fibonacci");
}else{
System.out.println("El numero no es fibonacci");
}

}
public static boolean primo(int n){
int cont=0;
for(int i=1;i<=n;i++){
if(n%i==0){
cont++;
}

}
if(cont==2){
return true;
}else{
return false;
}
}
public static boolean fibonacci(int n){
int a=0,b=1,c=0;
boolean valor=true;
for(int i=0;c<=n;i++){
if(n==c){
valor=true;
}else{
valor=false;
}
a=b;
b=c;
c=a+b;
}
return valor;
}

}