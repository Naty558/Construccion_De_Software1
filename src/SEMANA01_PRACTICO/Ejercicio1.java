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
 *//*	 Imprimir la tabla de multiplicar del número N*/
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce El numero del que desea su tabla de multiplicar: ");
        n = sc.nextInt();
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=12; i++){
             System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}

