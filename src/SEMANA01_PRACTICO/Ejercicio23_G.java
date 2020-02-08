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
public class Ejercicio23_G {
    
//Se desea obtener el promedio de g grupos que están en un mismo año escolar;

// siendo que cada grupo puede tener n alumnos que cada alumno puede llevar m

// materias y que en todas las materias se promedian tres calificaciones para

// obtener el promedio de la materia. Lo que se desea desplegar es el promedio

// de los grupos, el promedio de cada grupo y el promedio de cada alumno

public static void main(String[] args) {
       java.util.Scanner Teclado = new java.util.Scanner(System.in);

    	int grupo,cantidad, CantidadMaterias;	
        float promedioGrupos = 0, promedioMateria;
        float promedioGrupo, promedioAlumno;
        float calificacion;

	   System.out.println("Ingrese la cantidad de grupos: ");
           grupo=Teclado.nextInt();
	   System.out.println("Ingrese la cantidad de alumnos por grupo: ");
           cantidad=Teclado.nextInt();
           System.out.println("Ingrese la cantidad de materias por alumno: ");
           CantidadMaterias=Teclado.nextInt();

	for(int i = 0; i < grupo; i++){

		          System.out.println((i+1)+"..GRUPO..");

		promedioGrupo = 0;

		for(int j = 0; j < cantidad; j++){

			                 System.out.println((j+1)+"..ALUMNO..");

			promedioAlumno = 0;

			for(int k = 0; k < CantidadMaterias; k++){

				       System.out.println((k+1)+"..Materias.. ");

				promedioMateria = 0;

				for(int p = 0; p < 3; p++){

                              System.out.println("Ingrese la "+(p+1)+" calificacion: ");	
                              calificacion=Teclado.nextInt();

					promedioMateria += calificacion;

				}

				promedioMateria /= 3.;

	          System.out.println("\nEl promedio de la materia es: ");
                   System.out.println(promedioMateria);

				promedioAlumno += promedioMateria;

			}

			promedioAlumno /= CantidadMaterias;

			                 System.out.println("El promedio de alumno es ");
                                         System.out.println(promedioAlumno);

			promedioGrupo += promedioAlumno;

		}

		promedioGrupo /= cantidad;

		          System.out.println("\nEl promedio del grupo es: ");

		          System.out.println(promedioGrupo);

		promedioGrupos += promedioGrupo;

	}

	promedioGrupos /= grupo;

	   System.out.println("\nEl promedio de los grupos es: ");

	   System.out.println(promedioGrupos);




}
}