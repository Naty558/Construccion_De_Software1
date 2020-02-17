/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA02_TEORICO;

import java.util.Scanner;

/**
 *
 * @author NATY
 */
public class Figura {
    Scanner entrada=new Scanner(System.in);
    private int cuadrado;
    private int rectangulo;
    private int circulo;

    public Figura(int cuadrado, int rectangulo, int circulo) {
        this.cuadrado = cuadrado;
        this.rectangulo = rectangulo;
        this.circulo = circulo;
    }
    public Figura(){
        cuadrado=0;
        rectangulo=0;
        circulo=0;
        
    }

    public int getCuadrado() {
        return cuadrado;
    }

    public void setCuadrado(int cuadrado) {
        this.cuadrado = cuadrado;
    }

    public int getRectangulo() {
        return rectangulo;
    }

    public void setRectangulo(int rectangulo) {
        this.rectangulo = rectangulo;
    }

    public int getCirculo() {
        return circulo;
    }

    public void setCirculo(int circulo) {
        this.circulo = circulo;
    }
     
    public void InsertarPila(){
        int valor;
        System.out.println("Ingrese el valor a insertar en la pila ");
        valor=entrada.nextInt();
    }
}
