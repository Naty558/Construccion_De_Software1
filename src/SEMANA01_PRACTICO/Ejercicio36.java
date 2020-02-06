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
/* Suponga que se piden X soles prestados a un banco, con el acuerdo de devolver Y soles cada 
mes hasta devolver el préstamo completo. Parte del pago mensual serán intereses, calculados como el i
por ciento del capital por devolver en ese momento. El resto del pago mensual se aplica a reducir el 
capital a devolver. El programa debe determinar: a.- La cantidad de intereses pagada cada mes.
b.- La cantidad de dinero aplicada cada mes al capital por devolver
c.- La cantidad acumulada de intereses pagados al final de cada mes. 
d.- La cantidad del préstamo aún pendiente al final de cada mes. 
e.- El número necesario de pagos mensuales para devolver el préstamo completo. 
f.- La cantidad del último pago (probablemente menor que
Y) Compruebe el programa usando los siguientes datos: X = 7.200.000, Y = 360.000, i= 1% */
 
public class Ejercicio36 {
     public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("Ingresa los soles que desea prestarse:  ");
        int X=Integer.parseInt(cin.nextLine());
        System.out.println("Ingresa cuantos  soles  devolvera cada mes:  ");
        int Y=Integer.parseInt(cin.nextLine());
        System.out.println("Ingrese el interes en %: ejemplo 1%");
        String interes=cin.nextLine();
        String cad="";
        for(int i=0;i<interes.length();i++){
            if(interes.charAt(i)!='%'){
                 cad+=interes.charAt(i);
            }
        }
        
        double i=Double.parseDouble(cad);
        double interesmen=(double)((i*Y)/100);
        int contador=(int)(X/(Y-((i*Y))/100));
        System.out.println("\n"+"\t INPRESION DE DATOS");
        System.out.println("a) Cantidad de interes pagada cada mes: "+interesmen);
        System.out.println("b) Cantidad de dinero aplicada cada mes al capital por devolver: "+(Y-((i*Y))/100));
        System.out.println("c) La cantidad acumulada de intereses pagados al final de cada mes: "+interesmen*contador);
        System.out.println("d) La cantidad del prestamo aun pendientes al final de cada mes:  "+"\n");
        double cantida_ultimo=0;
        for(int j=1;j<=contador;j++){
            double pendiente=(double)(X-(j*(Y-((i*Y))/100)));
            System.out.println("Mes "+j+"  : "+""+pendiente);
            if(j==contador){
                cantida_ultimo=pendiente;
            }
        }
        System.out.println(" El numero necesario de pagos mensuales para devolver el prestamo completo: "+contador);
        System.out.println("La cantidad del ultimo pago (Probablemente menor que Y): "+cantida_ultimo);
    }
    
}


