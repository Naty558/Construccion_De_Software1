/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA01_PRACTICO;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NATY
 */
public class Ejercicio9 {
   /*Determinar cuantos hombres y cuantas mujeres
            se encuentran en un grupo de n personas, suponiendo que los datos
                    son extraídos alumno por alumno.*/
 public static void main(String[] args) {
Scanner cin=new Scanner(System.in);
System.out.println("Ingresa el numero de alumnos que desea registrar:  ");
int numero = cin.nextInt();

ArrayList<alumno> alumnos=new ArrayList<>();
System.out.println("Ingrese los datos de cada alumno:\n");
       for(int i=0;i<numero;i++){
        
            System.out.println("Nombre: ");
            String nombres=cin.next();
       
            System.out.println("Sexo (H ó M): ");
           String sexo=cin.next();
            System.out.println("------------------------");


alumno a1=new alumno(nombres,sexo);
alumnos.add(a1);
}

mostrar(alumnos);
}
public static void mostrar(ArrayList<alumno> alum){
System.out.println("DATOS DE LOS ALUMNOS REGISTRADOS");
int contHombres=0,contMujeres=0;
for(int i=0;i<alum.size();i++){
System.out.println("Datos del alumno "+(i+1)+" :");
System.out.println(alum.get(i).toString());

if(alum.get(i).getSexo().equals("H")){
contHombres++;
}
if(alum.get(i).getSexo().equals("M")){
contMujeres++;
}
}
System.out.println("El numero de hombres es:  "+contHombres);
System.out.println("El numero de mujeres es:  "+contMujeres);
}
}
class alumno{
String nombre;
String sexo;

public alumno(String nombre, String sexo) {
this.nombre = nombre;
this.sexo = sexo;
}
public alumno(){
    nombre="";
    sexo="";
}

public String getNombre() {
return nombre;
}

public void setNombre(String nombre) {
this.nombre = nombre;
}

public String getSexo() {
return sexo;
}

public void setSexo(String sexo) {
this.sexo = sexo;
}


@Override
public String toString() {
return "Nombre=" + nombre + ", Sexo=" + sexo + '}';
}


}


