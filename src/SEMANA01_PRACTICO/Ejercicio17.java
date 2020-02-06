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
public class Ejercicio17 {
 /*15) El Depto. de Seguridad Publica y Transito del D.F. desea saber, de los n autos que entran a la ciudad
 de México, cuantos entran con calcomanía de cada color. Conociendo el ultimo dígito de la placa
 de cada automóvil se puede determinar el color de la calcomanía utilizando
 la sig. relación: 
  DÍGITO  COLOR   1 o 2   amarilla   3 o 4   rosa   5 o 6   roja   7 o 8   verde   9 o 0   azul */
     public static void main(String[] args) {
        java.util.Scanner Teclado = new java.util.Scanner(System.in);
        System.out.println("Ingrese la cantidad de vehiculos:");
        int Cantidad=Teclado.nextInt();
        int Vehiculo[]=new int[Cantidad];
        for (int i = 0; i < Vehiculo.length; i++) {
            System.out.println("Ingrese el ultimo digito de la placa de cada vehiculo : ");
            int clave=Teclado.nextInt();
            if(clave==1 || clave==2){
                System.out.println("La calcomania es amarrilla");
            }
            if(clave==3 || clave==4){
                System.out.println("La calcomania es rosa");
            }
            if(clave==5 || clave==6){
                System.out.println("La calcomania es roja");
            }
            if(clave==7 || clave==8){
                System.out.println("La calcomania es verde");
            }
            if(clave==9 || clave==0){
                System.out.println("La calcomania es azul");
            }
        }
    }
}


