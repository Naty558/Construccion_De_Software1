/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Realice un algoritmo para resolver el siguiente problema: una fábrica de pantalones desea calcular 
cuál es el precio final de venta y cuánto ganará por los N pantalones que produzca con el corte de alguno
de sus modelos, para esto se cuenta con la siguiente información:
a) Tiene dos modelos A y B, tallas 30, 32 y 36 para ambos modelos.
b) Para el modelo A se utiliza 1.50 m de tela, y para el B 1.80 m.
c) Al modelo A se le carga 80 % del costo de la tela, por mano de obra. Al modelo B se le carga 95 % del 
costo de la tela, por el mismo concepto
d) A las tallas 32 y 36 se les carga 4 % del costo generado por mano de obra y tela, sin importar el modelo.
e) Cuando se realiza el corte para fabricar una prenda sólo se hace de un solo modelo y una sola talla.
f) Finalmente, a la suma de estos costos se les carga 30%, que representa la ganancia extra de la tienda.*/
package SEMANA02_PRACTICO;
 import java.util.Scanner;

public class Ganancias {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int modelo, talla;
        double N_pantalones, cargo_por_talla, costo_de_la_tela, ganancia, ganancia_extra;
        double mano_de_obra, metro_de_tela, metros_de_tela, precio_final;
        System.out.print("Ingrese el valor de N pantalones: ");
        N_pantalones = in.nextDouble();
        in.nextLine();
        System.out.print("Ingrese el valor de metro de tela: ");
        metro_de_tela = in.nextDouble();
        in.nextLine();
        System.out.println("Seleccione el valor de modelo.");
        System.out.println("\t1.- A");
        System.out.println("\t2.- B");
        System.out.print("\t: ");
        do {
            modelo = in.nextInt();
            in.nextLine();
            if (modelo<1||modelo>2)
                System.out.print("Valor incorrecto. Ingr\u00E9selo nuevamente.: ");
        } while (modelo<1||modelo>2);
        System.out.println("Seleccione el valor de talla.");
        System.out.println("\t1.- 30");
        System.out.println("\t2.- 32");
        System.out.println("\t3.- 36");
        System.out.print("\t: ");
        do {
            talla = in.nextInt();
            in.nextLine();
            if (talla<1||talla>3)
                System.out.print("Valor incorrecto. Ingr\u00E9selo nuevamente.: ");
        } while (talla<1||talla>3);
        metros_de_tela=modelo==1?1.5*N_pantalones:1.8*N_pantalones;
        costo_de_la_tela=metros_de_tela*metro_de_tela;
        mano_de_obra=modelo==1?costo_de_la_tela*0.8:costo_de_la_tela*0.95;
        cargo_por_talla=talla==2||talla==3?mano_de_obra*0.04:0;
        ganancia_extra=(costo_de_la_tela+mano_de_obra+cargo_por_talla)*0.3;
        precio_final=costo_de_la_tela+mano_de_obra+cargo_por_talla+ganancia_extra;
        ganancia=cargo_por_talla+ganancia_extra;
        System.out.println("Valor de cargo por talla: " + cargo_por_talla);
        System.out.println("Valor de costo de la tela: " + costo_de_la_tela);
        System.out.println("Valor de ganancia: " + ganancia);
        System.out.println("Valor de ganancia extra: " + ganancia_extra);
        System.out.println("Valor de mano de obra: " + mano_de_obra);
        System.out.println("Valor de metros de tela: " + metros_de_tela);
        System.out.println("Valor de precio final: " + precio_final);
    }

}

