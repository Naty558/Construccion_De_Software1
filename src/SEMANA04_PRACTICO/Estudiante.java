/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA04_PRACTICO;

/**
 *
 * @author NATY
 */
public class Estudiante extends persona{
    private String Carrera;
    private Categoria cat;

    public Estudiante(String Carrera) {
        this.Carrera = Carrera;
    }
    //agregacion
   public Estudiante(Categoria c){
       cat =c;
   }

    public Estudiante() {
        this.Carrera ="";
      
    }

    
    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    
}
