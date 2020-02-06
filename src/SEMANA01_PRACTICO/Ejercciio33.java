/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA01_PRACTICO;

/**
 *
 * @author NATY
 */
/* Leer por cada alumno de Diseño estructurado de algoritmos su numero de control y su calificación en 
cada una de las 5 unidades de la materia. Al final que escriba el numero de control del alumno que obtuvo
mayor promedio. Suponga que los alumnos tienen diferentes promedios. */
 
public class Ejercciio33 {
    public static void main(String[] args) {
       java.util.Scanner Teclado = new java.util.Scanner(System.in);
       int Mayor=-999;
       int resp;
int cont=0;
do{
        System.out.println("ingrese el promedio del control 1: ");
        int control1=Teclado.nextInt();
  System.out.println("ingrese el promedio del control 2: ");
        int control2=Teclado.nextInt();
        System.out.println("ingrese el promedio del control 3: ");
        int control3=Teclado.nextInt();
        System.out.println("ingrese el promedio del control 4: ");
        int control4=Teclado.nextInt();
        System.out.println("ingrese el promedio del control 5: ");
        int control5=Teclado.nextInt();

  
  if (control1>Mayor){
    Mayor=control1;
    control1=Mayor;
            }
  if (control2>Mayor){
    Mayor=control2;
    control2=Mayor;
            
            }
  if (control3>Mayor){
    Mayor=control3;
    control3=Mayor;
  }
  if (control4>Mayor){
    Mayor=control4;
    control4=Mayor  ;
            
            }
  if (control5>Mayor){
    Mayor=control5;
    control5=Mayor;
            
            }
        System.out.println("desea ingresar mas personas? 1.si/2.no: ");
        resp=Teclado.nextInt();
}while(resp==1);
  if (resp==2){
      System.out.println("la nota del alumno que obtuvo mayor promedio fue un "+ Mayor);
      System.out.println("");
       
    }
}
}