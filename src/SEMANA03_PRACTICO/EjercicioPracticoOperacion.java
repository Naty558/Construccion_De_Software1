/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_PRACTICO;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author NATY
 */
class operacion{
    private int x;
    private int y;

    public operacion(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public operacion(float x, float y){
       
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
class Operaciones<t> implements Iterable<t>{
    ArrayList<t> lista=new ArrayList<>();
    int tope;
    public Operaciones(int x){
        this.tope=x;
    }
    void add(t p){
        if(lista.size()<=tope)
            lista.add(p);
        else
            throw new RuntimeException("Esta lleno");
    }
    @Override
    public Iterator<t> iterator(){
        return null;
    } 
   class suma{
     private int x;
     private int y;
     
       
   }
}

public class EjercicioPracticoOperacion {
    
}
