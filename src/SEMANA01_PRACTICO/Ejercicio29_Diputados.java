/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA01_PRACTICO;

import java.text.DecimalFormat;

/**
 *
 * @author NATY
 */
/*29. En la Cámara de Diputados se levanta una encuesta con todos los integrantes con el fin de
determinar qué porcentaje de los n diputados está a favor
del Tratado de Libre Comercio, que porcentaje está en contra y que porcentaje se abstiene de opinar*/
public class Ejercicio29_Diputados {
    public static void main(String[] args){
       java.util.Scanner Teclado = new java.util.Scanner(System.in);
       DecimalFormat formato=new DecimalFormat("###.##");
System.out.println("Cuantos integrantes son");
int cantidad=Teclado.nextInt();
int Favor = 0;
int Contra = 0;
int nulo = 0;

for(int i=0;i<cantidad;i++){
    System.out.println("Seleccione el numero identificado al tratado de libre comercio");
    System.out.println("1- favor, 2- contra, 3-sin comentarios");
     int num=Teclado.nextInt();
if (num == 1) {
Favor++;
}
if( num == 2) {
Contra ++;
}
if(num==3){
nulo++;
        }
}
System.out.println("Los que estan a favor son : "+ 
                Favor + " con un porcentaje de  " + formato.format((double)Favor/(double)cantidad));   
         System.out.println("Los que estan en contra son : "+ 
                Contra + " con un porcentaje de " + formato.format((float)Contra/(float)cantidad));  
          System.out.println("Los que dan voto nulo son : "+ 
                nulo+ " es " + formato.format((float)nulo/(float)cantidad));  
    }
}
                