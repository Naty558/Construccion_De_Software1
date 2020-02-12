/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_PRACTICO;

/**
 *
 * @author NATY
 *//*Un banco tiene 3 clientes que pueden hacer depósitos y extracciones. 
También el banco requiere que al final del día calcule la cantidad de dinero que hay depositada. 
Lo primero que hacemos es identificar las clases: Podemos identificar la clase Cliente y la clase Banco.
Luego debemos definir los atributos y los métodos de cada clase:*/
public class Main2 {

    public static void main(String[] args) { 
        Banco banco1=new Banco();
        banco1.operar(); banco1.depositosTotales(); 
    }
}

