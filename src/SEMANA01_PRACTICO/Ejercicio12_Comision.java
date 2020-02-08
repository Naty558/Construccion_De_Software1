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
 /*12) Una compañía de seguros tiene contratados a n vendedores.
Cada uno hace tres ventas a la semana. Su política de pagos es que un vendedor recibe un sueldo 
base, y un 10% extra por comisiones de sus ventas. El gerente de su compañía desea saber cuanto
dinero obtendrá en la semana cada vendedor por concepto de 
comisiones por las tres ventas realizadas, y cuanto tomando en cuenta su sueldo base y sus comisiones.  */ 
public class Ejercicio12_Comision {
   public static void main(String[] args){
       java.util.Scanner Teclado = new java.util.Scanner(System.in);
        int Trabajador=0,auxiliar=0;
        double sueldobase,comisiondeVenta1,comisiondeVenta2,comisiondeVenta3;
                double Sueldo,comisiones;
                double Venta1,Venta2,Venta3,tiempoventa,sto;
     
        System.out.println("-----------VENDEDORES---------");
        System.out.println("Ingrese el numero de Trabajadores :");
        Trabajador=Teclado.nextInt();
        System.out.println("Cual es el sueldo base de los empleados:");
        sueldobase=Teclado.nextInt();
         for(int i=0;i<Trabajador;i++){
        while(auxiliar<Trabajador){
            System.out.println("Ingrese al "+(i+1)+" trabajador");
            System.out.println("Ingrese su primera venta:");
            Venta1=Teclado.nextInt();
            System.out.println("Ingrese la segunda venta");
            Venta2=Teclado.nextInt();
            System.out.println("Ingrese la terceraventa :");
            Venta3=Teclado.nextInt();
            comisiondeVenta1=(Venta1*0.10);
            comisiondeVenta2=(Venta2*0.10);
            comisiondeVenta3=(Venta3*0.10);
            Sueldo=(Venta1+Venta2+Venta3+comisiondeVenta1+comisiondeVenta2+comisiondeVenta3+sueldobase);
            comisiones= (comisiondeVenta1+comisiondeVenta2+comisiondeVenta3);
            tiempoventa=Venta1+Venta2+Venta3+comisiones;
            System.out.println("EL SUELDO TOTAL ES :"+Sueldo);
            System.out.println("LAS COMISIONES POR VENTA SON:"+comisiones);
            System.out.println("EL VALOR DE VENTAS Y COMISIONES ES DE :"+tiempoventa);
            auxiliar++;
            
        }
    }
}
   
}
