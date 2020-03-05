/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_PRACTICO;

import java.util.Scanner;

/**
 *
 * @author NATY
 */
public class Ejercicio08_Colecciones {
    public static void main(String[] args) {
        Scanner ci=new Scanner(System.in);
        ColaPrior cola=new ColaPrior();
         System.out.println("\t PRIORIDAD DE VALORES");
        boolean valor=true;
        int numero=0;
        while(valor){
            System.out.println("Ingresa 1 para agregar valor");
            System.out.println("Ingrese 2 para terminar");
            numero=ci.nextInt();
            switch(numero){
                case 1:
                    System.out.println("Ingresa un valor para agregar:  ");
                    int nu1=ci.nextInt();                    
                    cola.agregar(nu1);
                    System.out.print("Prioridad: ");
                    cola.mostrar();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Prioridad Final");
                    cola.mostrar();
                    valor=false;
                    System.out.println();
                    break;
                default:
                    System.out.println("Ingreso invalido!!");
            }
        }
        
        
    }
}
