/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas4.Aritmetica;

/**
 *
 * @author NATY
 */
public class Aritmetica {
    private double ultimoResultado;
     double suma(double primerSumando, double segundoSumando) {
        return  primerSumando + segundoSumando;
    }
    double resta(double minuendo, double sustraendo) {
        return  minuendo - sustraendo;
    }
    double multiplicacion(double primerFactor,
        double segundoFactor) {
        return  primerFactor * segundoFactor;
    }
     double division(double dividendo, double divisor) {
        return dividendo / divisor;
    }
     public int numero_mayor(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (c > b) {
            return c;
        } else {
            return b;
        }
    }
    
   double modulo(double a,double b){
        return  a % b;
       
}

     double Calcular(double precio, double tipo) {
		double iva=( precio*tipo/100) + precio;
return (iva);
	}
double  DevolverIva(double precio, double tipo) {
		double soloiva=(precio*tipo/100);
return soloiva;
  
}
}
