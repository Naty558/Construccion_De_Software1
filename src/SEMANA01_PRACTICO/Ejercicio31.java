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
/*Determinar la cantidad semanal de dinero que recibirá cada uno de los n obreros de una empresa. 
Se sabe que cuando las horas que trabajo un obrero exceden de 40, el resto se convierte en horas extras
que se pagan al doble de una hora normal, cuando no exceden de 8; cuando las horas extras exceden de 8
se pagan las primeras 8 al doble de lo que se paga por una hora normal y el resto al triple. */
 
public class Ejercicio31 {
    public static void main(String[] args) {
       java.util.Scanner Teclado = new java.util.Scanner(System.in);
        int sueldo, horas, pago, trabaj, i;
        System.out.println("Ingrese el sueldo por una hora de trabajo\n");
        sueldo=Teclado.nextInt();
        System.out.println("Ingrese el numero de trabajadores\n");
        trabaj=Teclado.nextInt();
    for(i=0; i< trabaj; i++){
        System.out.println("Ingrese las horas trabajadas\n");
        horas=Teclado.nextInt();
        pago = 0;
        if(horas <= 40){
            pago = horas * sueldo;
            System.out.println("Sueldo total:  \n"+pago);
        }
        if (horas > 40 && horas < 80){
            sueldo = sueldo * 2;pago = horas * sueldo;
            System.out.println("Sueldo total:  \n"+pago);
            sueldo = sueldo / 2;
}if (horas >= 80){
    sueldo = sueldo * 3;
    pago = horas * sueldo;
        System.out.println("Sueldo total: %i \n"+ pago);
}}
  
    }

}
