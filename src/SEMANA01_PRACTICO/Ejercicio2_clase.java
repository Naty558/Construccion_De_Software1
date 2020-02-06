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
public class Ejercicio2_clase {
    
public static void main(String[] args) {    
    Scanner entrada = new Scanner(System.in); 
    System.out.println("Introduce la valor de a"); 
    int a = entrada.nextInt();
    System.out.println("Introduce la valor de b"); 
    int b=  entrada.nextInt();
    
    double c=0;
    c=((4*Math.pow(a,2))+(3*b*a)+(Math.pow(b,2)))/((Math.pow(a,2))-(Math.pow(b,2)));
    System.out.println("El valor de C es  "+c); 
    double d=0;
    d=((3*(Math.pow(c,2))+a+b));
    
    System.out.println("El valor de D es :"+d); 
    
 }
}

