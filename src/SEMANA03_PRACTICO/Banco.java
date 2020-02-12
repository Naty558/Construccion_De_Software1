/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_PRACTICO;

/**
 *
 * @author NATY
 */
public class Banco {
    private Cliente cliente1,cliente2,cliente3;
public Banco() { 
    cliente1=new Cliente("Juan"); 
    cliente2=new Cliente("Ana"); 
    cliente3=new Cliente("Pedro"); 
}
public void operar() { 
    cliente1.depositar (100); 
    cliente2.depositar (150); 
    cliente3.depositar (200); 
    cliente3.extraer (150);
} 
public void depositosTotales () { 
    int t = cliente1.retornarMonto () + cliente2.retornarMonto () + cliente3.retornarMonto ();
    System.out.println ("El total de dinero en el banco es:" + t); 
    cliente1.imprimir(); 
    cliente2.imprimir(); 
    cliente3.imprimir();
}
}
