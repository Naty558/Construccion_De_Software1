/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA06_TEORICO;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author NATY
 */
class persona{
    private String name;
    private double sueldo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}
class padron implements Iterable<persona>{
         
        ArrayList<persona> list= new ArrayList<>();
    void add(worker p1){
        list.add(p1);
    }
    @Override
    public Iterator iterator(){
        return list.iterator();
    }
    }
     
        
class Servicios{
    
}
public class Ejercicio07 {
    public static void main(String[]  args){
        
    }
}
