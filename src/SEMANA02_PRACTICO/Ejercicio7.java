/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA02_PRACTICO;

import java.util.Scanner;

/**
 *
 * @author NATY
 */
/*. Escriba una aplicación en Java que utilice ciclos para imprimir el resultado de la siguiente expresión: 
Dado N y X calcular: x1/1+x3/3+x5/5+...........+x(2N)-1? 
 Puede utilizar cualquier estructura repetitiva como while, do..while o for*/

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("Ingrese valor para N:  ");
        int N=cin.nextInt();
        System.out.println("Ingrese valor para X:  ");
        int X=cin.nextInt();
        int suma=0;
        for(int i=1;i<=N;i++){
            if(i==N){
                suma+=(X*(2*N)-1);
            }else{
                if(i==1||i%2==1){
                suma+=(X*i)/i;
            }
            }
        }
        System.out.println("La suma es:  "+suma);
    }
}
  

