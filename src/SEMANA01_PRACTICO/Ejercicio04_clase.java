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
public class Ejercicio04_clase {
       public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
   
      int MINUTO;
            int SEGUNDO ;
            //Variables  
            double horas;
            int minutos, segundos;
            //Entradas
            System.out.println("Ingrese cantidad de horas");
            horas = entrada.nextInt();
            //Proceso
            minutos =(int)(horas * 60);
            segundos =(int)(horas * 3600);
            //Salidas
            System.out.println("Cantidad en minutos es : " + minutos);
            System.out.println("Cantidad en segundos es : " + segundos);
            System.out.println("");
}
}


