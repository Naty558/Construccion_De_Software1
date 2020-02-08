/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA01_PRACTICO;

import java.util.Scanner;


 /*38.Calcular la suma siguiente:  100 + 98 + 96 + 94 + . . . + 0 en este orden*/
public class Ejercicio38_SumaSerie {
 public static void main(String[] args) {
  

int suma=0;
for(int i=100;i>=0;i=i-2){
System.out.print(i+" ");
suma=suma+i;
System.out.println("");

}
System.out.println("La suma es :"+suma);
}
}
      



       
          
          
    


     

