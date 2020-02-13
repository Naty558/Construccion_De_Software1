/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_TEORICO;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author NATY
 */
class bag<t> implements Iterable<t>{
    ArrayList<t> lista=new ArrayList<>();
    int tope;
    public bag(int x){
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
}
class golosina1{
    private String marca;
    public golosina1(String m){
        this.marca=m;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
}
class chocolatina1{
    private String nombre;
    public chocolatina1(String n){
        this.nombre=n;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
}
public class Ejercicio8 {
    public static void main(String[] args){
        bag<golosina1> bolsitag=new bag(5);
        bag<chocolatina1> bolsitac=new bag(5);
        golosina1 g1=new golosina1("chicle");
        golosina1 g2=new golosina1("caramelo");
        golosina1 g3=new golosina1("tofis");
        chocolatina1 c1=new chocolatina1("koka");
        chocolatina1 c2=new chocolatina1("keke");
        chocolatina1 c3=new chocolatina1("koko");
        bolsitac.add(c1);
        bolsitac.add(c2);
        bolsitac.add(c3);
        bolsitag.add(g1);
        bolsitag.add(g2);
        bolsitag.add(g3);
        for(golosina1 g:bolsitag){
            System.out.println(g.getMarca());
        }
        for(chocolatina1 c:bolsitac){
            System.out.println(c.getNombre());
        }
    }
}

