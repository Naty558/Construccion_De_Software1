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
/*Calcular el promedio de edades de hombres, mujeres y de todo un grupo de alumnos.*/
public class Ejercicio18_Promedio {
    
      public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
         int  edad,edad_mu,edad_hom, cantidadMu, cantidadHom;
         double prom_mu, prom_hom;
         int  sexo;
                 int resp;
 
    edad_mu= 0;
    edad_hom =0;
 
    cantidadMu = 0;
    cantidadHom = 0;

  do{
              System.out.println("Escribir 1 para indicar sexo Femenino o una 2 para indicar sexo Masculino");
              sexo=cin.nextInt();
               System.out.println("Dar la edad");
               edad=cin.nextInt();
               if( sexo == 1 ) {
                    edad_mu = edad_mu + edad;
                    cantidadMu = cantidadMu + 1 ;
               }else
                    if  (sexo ==2 )  {
                         edad_hom = edad_hom + edad;
                         cantidadHom= cantidadHom + 1;
                    }else{
                         System.out.println("No se introdujo correctamente el tipo de sexo");
                    }
  

             System.out.println("Desea continuar introduciendo datos 1 para si o 2 para no");
             resp=cin.nextInt();
  }while ( resp ==1) ;
   
   prom_mu = edad_mu /  cantidadMu;
   prom_hom =edad_hom /  cantidadHom;

          System.out.println("El promedio de edades de alumnas es de "+ prom_mu);
          System.out.println("El promedio de edades de alumnos es de "+ prom_hom);

           }
}