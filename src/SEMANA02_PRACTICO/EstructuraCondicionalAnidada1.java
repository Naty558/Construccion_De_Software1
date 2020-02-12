/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA02_PRACTICO;
import java.util.Scanner;
public class EstructuraCondicionalAnidada1 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
                int nota1,nota2,nota3;
                System.out.println("Ingrese la primera nota ");
                nota1=teclado.nextInt();
                System.out.println("Ingrese la segunda nota");
                nota2=teclado.nextInt();
                System.out.println("Ingrese la tercera nota ");
                nota3=teclado.nextInt();
                int promedio=(nota1+nota2+nota3)/3;
                EstructuraCondicionalAnidada1 obj=new EstructuraCondicionalAnidada1() ;
                obj.mensaje(promedio);
    }
                public void mensaje(int prom){
        if(prom>=13){
            System.out.println("Promocionando ");
        }else{
            if(prom>=11){
                System.out.println("REGULAR ");
            }else{
                System.out.println("REPROBADO");
            }
        }
        
    }
                      
    }
    

