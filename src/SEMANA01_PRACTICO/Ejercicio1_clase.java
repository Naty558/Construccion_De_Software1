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
public class Ejercicio1_clase {
     public static void main(String [] args){
         Scanner entrada=new Scanner(System.in);
    
            //variables
            //sea la variable  si el Ingreso de datos e inputs
            int si,m,dm,cm;           
            //Entradas
            System.out.println("Ingrese cantidad de MILIMETROS : ");
            si=entrada.nextInt();
            //Proceso
            m = si / 1000;
            si = si % 1000;
            dm = si / 100;
            si = si % 100;
            cm = si / 10;
            si = si % 10;
            //Salidas
            System.out.println("Cantidad en Metros : " + m);
            System.out.println("Cantidad en Decimetros : " + dm);
            System.out.println("Cantidad en Centimetros : " + cm);
            System.out.println("Cantidad en Milimetros : " + si);
           System.out.println();
     }
}


