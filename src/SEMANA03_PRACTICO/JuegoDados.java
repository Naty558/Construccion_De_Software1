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
public class JuegoDados {
    private Dados dado1,dado2,dado3;
public JuegoDados() { 
    dado1=new Dados();
    dado2=new Dados(); 
    dado3=new Dados();        }
public void jugar() { 
    dado1.tirar(); 
    dado1.imprimir();
    dado2.tirar();
    dado2.imprimir();
    dado3.tirar(); 
    dado3.imprimir();
    if (dado1.retornarValor()==dado2.retornarValor() && dado1.retornarValor()==dado3.retornarValor()) {
        System.out.println("Ganó");
    } else { 
        System.out.println("Perdió");
    }       
}
}
