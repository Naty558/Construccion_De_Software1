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
/*41) El profesor de una materia desea conocer la cantidad de sus alumnos que no tienen derecho al examen 
de nivelación.  Diseñe un algoritmo que lea las calificaciones obtenidas en las 5 unidades por cada uno
de los 40 alumnos y escriba la cantidad de ellos que no tienen derecho al examen de nivelación. */
 
public class Ejercicio41_Nivelacion {
    
public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        
        int alum= 0;
        System.out.println("Ingrese el número de alumnos: ");
        alum = dato.nextInt();
        
        Alumno estudiante[] = new Alumno[alum];
        for(int i=0;i<alum;i++){
            estudiante[i] = new Alumno();
        }
System.out.println("Ingrese los datos de los alumnos: ");
        for(int i=0;i<alum;i++){
            System.out.println("Alumno "+i);
            System.out.println("Nombre: ");
            String nombre = dato.next();
            double notas[] = new double[5];
            System.out.println("Ingrese sus 5 notas: ");
            for(int j=0;j<5;j++){
                notas[j]=dato.nextDouble();
            }
            
            estudiante[i].setNombre(nombre);
            estudiante[i].setNotas(notas);
            estudiante[i].promedio();
        }
        
        int aprobados = 0;
        int desaprobados=0;
        for(int i=0;i<alum;i++){
            if(estudiante[i].getPromedio()>=10.5){
                aprobados++;
            }else{
                desaprobados++;
            }
        }
        System.out.println("Hay "+aprobados+" APROBADOS ");
        System.out.println("No tienen a un examen de aplzados  :"+desaprobados+"  alumnos :");
}
}

    

