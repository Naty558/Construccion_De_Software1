/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA02_PRACTICO;

/**
 *
 * @author NATY
 */
public class Principal {
         public static void main(String[] args) {
             Rectangulo r=new Rectangulo();
             Cuadrado c=new Cuadrado();
             Triangulo t=new Triangulo();
             r.AsignarValores();
             r.CalculaAreaRectangulo();
             c.AsignarValores();
             c.CalcularAreaCuadrado();
             t.AsignarValores();
             t.CalcularAreaTriangulo();
         }
}
