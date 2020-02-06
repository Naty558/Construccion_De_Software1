/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA02_TEORICO;

/**
 *
 * @author NATY
 */
class operaciones{
  double potencia(double x,double y){
      return Math.pow(x, y);
  }
  double factorial(double x){
      double fact=1;
      for(int i=1;i<=x;i++){
          fact*=i;
      }
      return fact;
  }
  double raiz_cuadrada(double x){
      return  Math.sqrt(x);
  }
}
public class TestOperacion {
    public static void main(String []args){
        operaciones op=new operaciones();
        System.out.println("Factorial de 5 es :"+op.factorial(5));
    }
}
