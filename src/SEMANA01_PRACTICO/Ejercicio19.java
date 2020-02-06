/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA01_PRACTICO;
/*  Un teatro otorga descuentos según la edad del cliente. Determinar la cantidad de dinero que el teatro
deja de percibir por cada una de las categorías. Tomar en cuenta que los niños menores de 5 años no pueden
entrar al teatro y que existe un precio único en los asientos. Los descuentos se hacen tomando en cuenta 
el siguiente cuadro: 
  Edad   Descuento  Categoría 1     5 - 14      35 %  Categoría 2   15 - 19      25 % 
Categoría 3   20 - 45       10 %  Categoría 4   46 - 65      25 %  Categoría 5   66 en adelante     35 % */
public class Ejercicio19 {
public static void main(String[] args) {
       java.util.Scanner Teclado = new java.util.Scanner(System.in);
       System.out.println("----------------TEATRO--------------");
    System.out.println("Ingrese cantidad de personas que van a ingresar al teatro: ");
        int personasIngresar=Teclado.nextInt();
        System.out.println("Ingrese  el precio de la entrada: ");
        int costo=Teclado.nextInt();
        double Total;
        
        for (int i = 0; i < personasIngresar; i++) {
            System.out.println("ingresa edad de la persona: ");
            int edad=Teclado.nextInt();
            if(edad<5){
                System.out.println("El niño no puede ingresar ");
            }else if(edad>=5 && edad<=14){
               
               Total=costo*(0.35);
               System.out.println("su descuento  es  : "+Total);
               
                System.out.println("LA EMPRESA DEJA DE PERCIBIR EN LA CATEGORIA 1 es  :"+Total);
                
            }else if(edad>=15 && edad<=19){
                Total=costo*(0.25);
                System.out.println("su descuento es  : "+Total);
              
                System.out.println("LA EMPRESA DEJA DE PERCIBIR EN LA CATEGORIA 2 es : "+Total);
            }else if(edad>=20 && edad<=45){
                Total=costo*(0.1);
                System.out.println("su descuento es  : "+Total);
                 
                System.out.println("LA EMPRESA DEJA DE PERCIBIR EN LA CATEGORIA 3 es : "+Total);
            }else if(edad>=46 && edad<=65){
                Total=costo*(0.25);
                System.out.println("su descuento es : "+Total);
              
                System.out.println("LA EMPRESA DEJA DE PERCIBIR EN LA CATEGORIA 4 es : "+Total);
            }else {
                Total=costo*(0.35);
                System.out.println("su descuento es : "+Total);
               
                System.out.println("LA EMPRESA DEJA DE PERCIBIR EN LA CATEGORIA 5  es :"+Total);
            }   
        }
    }
}
