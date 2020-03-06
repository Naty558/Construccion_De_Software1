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
class PaLinea{
   private String frase;

    public PaLinea(String frase) {
        this.frase = frase;
    }
   public PaLinea(){
       frase="HOLA MUNDO";
   }
   public void infoLetras(){
       
   }
   public String mostrar(){
       return "Hola mundo";
       
   }
}
public class Ejericio5_colecciones {
     public static void main(String[] args) {
        PaLinea pl = new PaLinea("hola mundo");
        pl.infoLetras();
        System.out.println(pl.mostrar());
    }
    
}
