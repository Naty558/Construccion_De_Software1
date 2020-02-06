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
public class Ejercicio8 {
    /*8.	En una empresa se requiere calcular el salario semanal de cada uno de los n obreros que laboran en ella.
    El salario se obtiene de la sig. forma:  Si el obrero trabaja 40 horas o menos se le paga $20 por hora  
            Si trabaja mas de 40 horas se le paga $20 por cada una de las primeras 40 horas y $25 por cada hora
                    extra.*/
 public static void main(String[] args) {
Scanner cin=new Scanner(System.in);
System.out.println("Ingresa el numero de obreros:  ");
int numero = cin.nextInt();

ArrayList<obrero> obreros=new ArrayList<>();
for(int i=0;i<numero;i++){
System.out.println("Ingresa las Horas trabajadas por el obrero "+(i+1)+" :");
int horas=cin.nextInt();
double salario=0;
if(horas<=40){
salario=horas*20;
}else{
int resto=horas-40;
salario=40*20;
salario+=(resto*25);
}
obrero o1=new obrero(salario, horas);
obreros.add(o1);
}
mostrar(obreros);

}
public static void mostrar(ArrayList<obrero> Obreros){
for(int i=0;i<Obreros.size();i++){
System.out.println("Obrero "+(i+1)+"  "+Obreros.get(i).toString());
}
}
}
class obrero{
double salario;
int horas_trabajadas;

public obrero(double salario, int horas_trabajadas) {
this.salario = salario;
this.horas_trabajadas = horas_trabajadas;
}

@Override
public String toString() {
return "horas_trabajadas=" + horas_trabajadas + "   Salario=  " + "$/"+salario ;
}
}


