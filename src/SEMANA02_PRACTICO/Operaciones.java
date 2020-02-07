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
class suma{
    int numero1,numero2;

    public suma() {
        this.numero1 = 0;
        this.numero2 = 0;
    }
   /* public void AsignarValores(){
        Scanner entrada=new Scanner(System.in);
      int numero1 = 0;
int numero2 = 0;
	
System.out.println("Introduce el primer número:");			
numero1 = entrada.nextInt();
			
System.out.println("Introduce el segundo número:");
numero2 = entrada.nextInt();

      
    }*/
    public void calcularSuma(int numero1,int numero2){
        suma s=new suma();
        int suma;
        suma=numero1+numero2;
        System.out.println("La suma es :"+suma);
          
       
    }
}
 class multiplicacion{
      int x,y;
      public void CalcularMultiplicacion(int x,int y){
        int multiplicacion;
        multiplicacion=x*y;
          System.out.println("La multiplicacion es :"+multiplicacion);
    }
 } 
    class division{
        double x,y;
        public void CalcularDivision(double x,double y){
            double division;
            division=x/y;
            System.out.println("La division es "+division);
        }
       
    }


public class Operaciones {
    public static void main(String[] args) {
     suma s=new suma();
     multiplicacion m=new multiplicacion();
     division d=new division();
        s.calcularSuma(5,2);
        m.CalcularMultiplicacion(10, 2);
        d.CalcularDivision(5, 2);
      
          
      }  
    }


