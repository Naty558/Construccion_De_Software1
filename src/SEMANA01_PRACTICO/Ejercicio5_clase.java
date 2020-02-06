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
public class Ejercicio5_clase {
    public static void main(String[] args) { 
   Scanner entrada = new Scanner(System.in); 
    System.out.println("Introduce la temperatura ambiental en ºF"); 
    double tempFar = entrada.nextDouble();
    double tempCel= (tempFar-32)*5/9;
    System.out.println("La temperatura en grados Celsius es "+tempCel);
    }
}



