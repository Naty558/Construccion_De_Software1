/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA01_PRACTICO;

import java.util.Random;

/**
 *
 * @author NATY
 */
public class Ejercicicio39_Calificaciones {
  /*  39.	Leer 50 calificaciones de un grupo de alumnos. Calcule y 
            escriba el porcentaje de reprobados. Tomando en cuenta que la calificación mínima 
aprobatoria es de 70. */


public static void main(String[] args) {
int NotaAlumno;
int Porcentaje;
int ContadorAprobados = 0;
int ContadorDesaprobados = 0;
Random Notas = new Random();

System.out.println("   ** REGISTRO DE ALUMNOS DE SISTEMAS **");
System.out.println(" AVISO :  Revisando Calificaicon \n");
for (int i = 0; i < 50; i++) {
NotaAlumno = (Notas.nextInt(100) * 1);
if (NotaAlumno >= 70) {
ContadorAprobados++;
} else {
ContadorDesaprobados++;
}

}
Porcentaje = ((ContadorDesaprobados * 100) / 50);
System.out.println("        **RESULDATOS**");
System.out.println("Aprobados: " + ContadorAprobados);
System.out.println("Desaprobados: " + ContadorDesaprobados);
System.out.println("PORCENTAJE DESAPROVADOS: " + Porcentaje + "%");
}

}


