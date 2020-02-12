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
/*El dueño de un estacionamiento requiere un diagrama de flujo con el algoritmo que le permita determinar
cuánto debe cobrar por el uso del estacionamiento a sus clientes. Las tarifas que se tienen son las
siguientes: 
Las dos primeras horas a $5.00 c/u. 
Las siguientes tres a $4.00 c/u. 
Las cinco siguientes a $3.00 c/u. 
Después de diez horas el costo por cada una es de dos soles. */
 
 
public class HorasDeEstacionamiento {
      public static void main(String[] args) {
          Scanner entrada=new Scanner(System.in);
          System.out.println("Ingrese el valor de horas:");
          int horas=entrada.nextInt();
    int cobro =0;
    if(horas<=2) {
        cobro = horas*5;
    }
    if(horas>2 && horas<=5 ){
        cobro = 2*5+(horas-2)*4;
    }
    if(horas>5 && horas<=10){ 
        cobro = 2*5+3*4+(horas-5)*3;
    }
    if(horas>10){ 
        cobro = 2*5+3*4+3*5+(horas-10)*2;
    }
          System.out.println("Valor de cobro: "+ cobro);
}
}
