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
/*Plantear un programa que permita jugar a los dados. Las reglas de juego son: se tiran 
tres dados si los tres salen con el mismo valor mostrar un mensaje que "gano", sino "perdió". 
Lo primero que hacemos es identificar las clases: Podemos
identificar la clase Dado y la clase JuegoDeDados. Luego los atributos y los métodos de cada clase:*/
public class Dados {
    private int valor;
public void tirar() { 
    valor=1+(int)(Math.random()*6); 
}
public void imprimir() {
    System.out.println("El valor del dado es:"+valor);
}
public int retornarValor() { 
    return valor; 
}
}

