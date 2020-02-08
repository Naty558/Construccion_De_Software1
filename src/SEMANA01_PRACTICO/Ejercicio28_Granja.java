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
public class Ejercicio28_Granja {
   /* 28.En una granja se requiere saber alguna información para 
determinar el precio de venta por cada kilo de huevo. Es importante determinar el promedio de 
 calidad de las n gallinas que hay en la granja. 
 La calidad de cada gallina se obtiene según la formula: 
 calidad =  peso de la gallina * altura de la gallina       
numero de huevos que pone 
Finalmente para fijar el precio del kilo de huevo, se toma como base la siguiente tabla:  
PRECIO TOTAL DE CALIDAD 
PESO POR KILO DE HUEVO  mayor o igual que 15   1.2 * promedio de calidad  mayor que 8 y menor
que 15  1.00 * promedio de calidad  menor o igual que 8   0.80 * promedio de calidad */
  public static void main(String[] args) {
Scanner entrada=new Scanner(System.in);
int a,b,c,d,precio;
System.out.println("Digite el peso de su gallina:");
a=entrada.nextInt();
System.out.println("Digite la altura de su gallina:");
c=entrada.nextInt();
System.out.println("Digite el numero de huevos de su gallina:");
d=entrada.nextInt();
b = a*c;
b = b/d;
System.out.println("La calidad de su gallina es de:"+b);
if(b>=15) {
a=(int) (1.2*b);
}
if(b>8){
a=1*b;
}

if(b>=8 && b<=15) {
a=(int)(0.80*b);
}
System.out.println("El precio de la galina es "+a);
}

}



