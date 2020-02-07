/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA02_TEORICO;

import java.util.ArrayList;

/**
 *
 * @author NATY
 */
class numeros{
        private int x=10;
        void setx(int a){
            this.x=a;
        }
        int getx(){
            return this.x;
        }
        }
public class Ejercicio10 {
     public static void main(String[] args) {
         numeros num=new numeros();
         ArrayList Lista=new ArrayList();
         implementar(num);
         System.out.println(num.getx());
     }
     static void implementar(numeros a){
        a.setx(30);
     }
}
