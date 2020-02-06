/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA01_PRACTICO;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author NATY
 */
public class Ejercicio03_clase {
      public static void main(String [] args){
        Scanner entrada=new Scanner(System.in);
        DecimalFormat formato=new DecimalFormat("###.##");
         int a,b,c,d;
      
                
        Scanner scanner = new Scanner(System.in);        
        System.out.println("Ingrese los 4 numeros : ");   
        System.out.println("1 numero");
        a=entrada.nextInt();
        System.out.println("2 numero");
        b=entrada.nextInt();
        System.out.println("3 numero");
        c=entrada.nextInt();
        System.out.println("4 numero");
        d=entrada.nextInt();
        
        int suma=a+b+c+d;
        
         
    /*   rpta = (a*suma) /100.0;
        rpta2=(b*suma)/100.0;
        rpta3=(c*suma)/100.0;
        rpta4=(d*suma)/100.0;*/
        System.out.println("El  % de "+ 
                a + " es " + formato.format((double)a/(double)suma));   
         System.out.println("El  % de "+ 
                b + " es " + formato.format((float)b/(float)suma));  
          System.out.println("El  % de "+ 
                c + " es " + formato.format((float)c/(float)suma));  
           System.out.println("El  % de "+ 
                d + " es " + formato.format((float)d/(float)suma));  
                
    }   
    }

