/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_PRACTICO;

/**
 *
 * @author NATY
 */
/*Utilizando una lista para almacenar 100 número aleatorios entre 1  y 100.
Usar un iterador para mostrar todos los números. Mostrar también los elementos de la lista sin repetir. 
Por último, mostrar los elementos de la lista sin repetir y en orden ascendente. */
import java.util.TreeSet;
public class Ejercicio2Colecciones {
    public static Integer aleatorio(int max,int min){
        return (int)((max+min-1)*Math.random()+1);
    }
    public static void main(String[] args) {
         TreeSet<Integer>aleatorios=new TreeSet<>();
         for(int i=0;i<100;i++){
            aleatorios.add(aleatorio(1,100));
             
         }
          System.out.println(aleatorios);
     
     }
}

