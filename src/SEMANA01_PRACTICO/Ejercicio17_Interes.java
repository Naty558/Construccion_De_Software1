/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA01_PRACTICO;

/**
 *
 * @author NATY
 */
/*17. Una persona desea invertir su dinero en un banco, el cual le otorga un 2% de interés. ¿Cuál será 
la cantidad de dinero que esta persona tendrá al cabo de un año si la ganancia de cada mes es reinvertida?*/
public class Ejercicio17_Interes {
    public static void main(String[] args) {
       java.util.Scanner Teclado = new java.util.Scanner(System.in);
       int dinero=0;
       int ganancia=0;
       int mensual=1;
        System.out.println("BANCO DE LA NACION");
        System.out.println("Ingrese su dinero a invertir ");
         dinero=Teclado.nextInt();
      
           
          
            while(mensual<=12 ){
                        ganancia=(dinero*2)/100;
                        dinero=dinero+ganancia;
                        System.out.println("La ganancia mensual es :"+dinero);
                        mensual=mensual+1;
         
    }
            
            System.out.println( "Saldo a un año es: "+dinero);
       
    }
}
