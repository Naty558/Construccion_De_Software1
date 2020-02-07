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
public class Rectangulo {
    Scanner entrada=new Scanner(System.in);
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public Rectangulo(){
        base=0;
        altura=0;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void AsignarValores(){
        System.out.println("Ingrese la base del rectangulo");
        base=entrada.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        altura=entrada.nextInt();
    }
    public void CalculaAreaRectangulo(){
        int Area;
        Area=base*altura;
        System.out.println("El area del rectangulo es "+Area);
    }
  
}
    
