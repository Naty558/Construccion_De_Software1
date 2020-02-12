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
/*Plantear una clase Club y otra clase Socio:
La clase Socio debe tener los siguientes atributos privados: 
nombre y la antigüedad en el club (en años). En el constructor pedir la carga del nombre y su antigüedad. 
La clase Club debe tener como atributos 3 objetos de la clase Socio. 
Definir una responsabilidad para imprimir el nombre del socio con mayor antigüedad en el club.*/
public class socio {
Scanner teclado=new Scanner(System.in);
    private String nombre;
    private int antiguedad;
    
    public socio() {
        System.out.print("Ingrese el nombre del socio:");
        nombre=teclado.next();
        System.out.print("Ingrese la antiguedad:");
        antiguedad=teclado.nextInt();
    }
    
    public void imprimir() {
        System.out.println(nombre+" tiene una antiguedad de "+antiguedad);
    }
    
    public int retornarAntiguedad() {
        return antiguedad;
    }
}