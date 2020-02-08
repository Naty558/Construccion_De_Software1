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
/*16.	Obtener el promedio de calificaciones de un grupo de n alumnos*/
public class Ejercicio16_Promedio {
    public static void Inicializar(double Calificaciones[], String Alumnos[], Scanner Teclado)
{
for (int i = 0; i < Calificaciones.length; i++)
{
System.out.print("Ingrese el nombre del "+(i+1)+" alumno :");
Alumnos[i] = Teclado.next();
System.out.print("Ingrese la calificacion del "+(i+1)+" alumno :");
Calificaciones[i] = Teclado.nextDouble();
}
}

public static double Promedio(double Calificaciones[])
{
double prom, suma = 0;
for (int i = 0; i < Calificaciones.length; i++)
suma += Calificaciones[i];
prom = suma / Calificaciones.length;
return prom;
}

public static void Imprimir(double Calificaciones[], String Alumnos[], double Promedio)
{
System.out.printf("%n%n%n%n", "Alumnos", "Calificacion");
for (int i = 0; i < Calificaciones.length; i++)
{
System.out.printf("%n%n%n%n", Alumnos[i], Calificaciones[i]);
}
System.out.println("\nEl promedio grupal es "+Promedio);
}

public static void Mayor (double Calificaciones[], String Alumnos[])
{
double Mayor = 0;
String Alumno = null;

for (int i = 0; i < Calificaciones.length; i++)
if (Calificaciones[i] > Mayor)
{
Mayor = Calificaciones[i];
Alumno = Alumnos[i];
}
System.out.println("\nLa calificacion mas alta fue "+Mayor+" y la saco "+Alumno);
}

public static void main(String[] args) {
Scanner Teclado = new Scanner(System.in);

double Calificaciones[];
String Alumnos[];
int n;
double Promedio;

System.out.print("Ingrese la cantidad de alumnos :");
n = Teclado.nextInt();

Calificaciones = new double[n];
Alumnos = new String[n];

Inicializar(Calificaciones, Alumnos, Teclado);
Promedio = Promedio(Calificaciones);
Imprimir(Calificaciones, Alumnos, Promedio);
Mayor(Calificaciones, Alumnos);

}
}


