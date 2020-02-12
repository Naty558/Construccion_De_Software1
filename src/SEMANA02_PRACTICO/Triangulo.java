/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA02_PRACTICO;

import java.util.Scanner;

public class Triangulo {
    Scanner entrada=new Scanner(System.in);
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public Triangulo(){
        base=0;
        altura=0;
    }

    public double getBase() {
        return base;
    }

    public double setBase(double base) {
        this.base = base;
        return 0;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void AsignarValores(){
        System.out.println("Ingrese la base del Triangulo");
        base=entrada.nextInt();
        System.out.println("Ingrese la altura del triangulo");
        altura=entrada.nextInt();
    }
    public void CalcularAreaTriangulo(){
        double AreaTriangulo;
        AreaTriangulo=base*altura/2;
        System.out.println("el area del triangulo es :"+AreaTriangulo);
    }
    
}