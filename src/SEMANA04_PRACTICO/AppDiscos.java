/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA04_PRACTICO;

import java.util.ArrayList;

/**
 *
 * @author NATY
 */
class ListaMultimedia{
   
private int recursos;
   
    ListaMultimedia(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "ListaMultimedia{" + "recursos=" + recursos + '}';
    }




}
class Disco {
    private String titulo;
    private String autor;
   

    public Disco(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
  
    }
    public Disco(){
        titulo="";
        autor="";
    }

    Disco(String el_Vals_del_Obrero, String skap, Object object, int i, Object object0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 class formato extends genero{
     private String formato;

        public formato(String genero, String titulo, String autor) {
            super(genero, titulo, autor);
        }

     
 }
 class valor extends formato{
    private int valor;

        public valor(int valor, String genero, String titulo, String autor) {
            super(genero, titulo, autor);
            this.valor = valor;
        }

      
    
     
 }
 class genero extends Disco{
 private String genero;

        public genero(String genero, String titulo, String autor) {
            super(titulo, autor);
            this.genero = genero;
        }

        public genero(String genero) {
            this.genero = genero;
        }

     
       


       
     
 }
    
    
    
}
public class AppDiscos {
    public static void main(String[] args) {
        ListaMultimedia lista = new ListaMultimedia(20);
        Disco disco;
        disco=(new Disco("Hopes and Fears", "Keane","mp3",45,"rock"));
        disco=(new Disco("Tubular Bells", "Mike Oldfield","dvd", 45, "pop"));
        disco=(new Disco("El Vals del Obrero", "Ska-p", "cdAudio", 50, "Genero.rock"));
        System.out.println(lista.toString());
        disco = new Disco("El Vals del Obrero", "Ska-p", null, 0, null);

    }
}
