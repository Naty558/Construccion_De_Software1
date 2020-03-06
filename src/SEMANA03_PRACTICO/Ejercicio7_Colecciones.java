/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_PRACTICO;

import java.util.ArrayList;

/**
 *
 * @author NATY
 */
class numero{
    private int n;

    public numero() {
    }

    public numero(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "num{" + "n=" + n + '}';
    }
}
   class numeros1{
      ArrayList<numero> ListaAlum=new ArrayList<>();
    
    public void agregar(numero d){
        ListaAlum.add(d);
    }
    public void mostrar(){
        for(int i=0;i<ListaAlum.size();i++){
            System.out.println(ListaAlum.get(i).toString());
        }
   }
    public void mostrarPila(){
         for(int i=(ListaAlum.size()-1);i>=0;i--){
            System.out.println(ListaAlum.get(i).toString());
        }
    }
}

public class Ejercicio7_Colecciones {
       public static void main(String[] args) {
         numeros c=new numeros();
        num d1=new num(4);
        num d2=new num(3);
        num d3=new num(5);
        num d4=new num(6);
           System.out.println("COLA");
        c.agregar(d1);
        c.agregar(d2);
        c.agregar(d3);
        c.agregar(d4);
        c.mostrar();
           System.out.println("¨**************************");
           System.out.println("PILA");
           c.mostrarPila();
    }
}
