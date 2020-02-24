/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA01_TEORICO;

import java.util.Scanner;

/**
 *
 * @author NATY
 */
public class SumaDigitos {
      public static void main(String[] args){
         Scanner entrada=new Scanner(System.in);
   int n;
         int suma=0;
         
         System.out.println("Ingrese un numero entero ");
         n=entrada.nextInt();
         while(n>0){
         suma=suma+n%10; //Resto de una división entre enteros (en otros lenguajes denominado mod)
         n=n/10;
         }
         
            System.out.println("La suma es "+suma);
             
          /*  String num;
             int acu=0;
             System.out.println("Ingrese un numero");
             num=entrada.next();
             int i=num.length()-1;
             while(i>0){
                 acu+=Integer.parseInt(num.charAt(i)+"");
                 i--;
             }
         System.out.println(acu);
     }*/
}
}


