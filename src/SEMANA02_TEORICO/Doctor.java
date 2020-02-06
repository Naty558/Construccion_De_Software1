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
public class Doctor {
      private int id;
    private String nombre;

    public Doctor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public Doctor(){
        id=0;
        nombre="";
    }
    String tostring(){
        return "id :"+this.id+"Nombre :"+this.nombre;
    }
}
