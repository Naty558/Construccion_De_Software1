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
public class EjercicioPracticoOperacion<Op> implements Iterable<Op>{

    ArrayList<Op> result1 = new ArrayList<>();    
    int topeX;
    int topeY;
    
    
    public EjercicioPracticoOperacion(int x,int y){
        super();
        this.topeX= x;
        this.topeY = y;
        
    }
    
    
    public void add(Op p){        
            if(result1.size()<=topeX){
                if(result1.size()<=topeY){
                    result1.add(p);
                }else{
                    throw new RuntimeException("No cabe mas en Y");
                }
            }else{
                throw new RuntimeException("No cabe mas X");
            }                     
    }
    
    @Override
    public Iterator<Op> iterator() {            
        return result1.iterator();
    }
           
    
    
    public static void main(String[] args) {
        
        EjercicioPracticoOperacion<Float> op1 = new EjercicioPracticoOperacion(5,5);
        EjercicioPracticoOperacion<Integer> op2 = new EjercicioPracticoOperacion(4,5);
                
        Suma s2 = new Suma(1,5);  
        Resta r2 = new Resta(1, 2);
        Producto p2 = new Producto(3,6);
        
        
        Suma s1 = new Suma(0.78f,89f);
        Resta r1 = new Resta(0.78f,89f);
        Producto p1 = new Producto(8f,5f);
        
        //Integer
        op2.add(s2.getSuma());
        op2.add(r2.getResta());
        op2.add(p2.getProducto());
                 
        //FLoat
        op1.add(s1.getSumaFloat());
        op1.add(r1.getRestaFloat());
        op1.add(p1.getProductoFloat());
        
        
        for (Integer integer : op2) {            
            System.out.println("Operacion con Integer: "+integer.toString());            
        }
        System.out.println("\n");
        for (Float f: op1) {
            System.out.println("Operacion con FLoat: "+ f.toString());
        }
    }
   
  
    
}


class Suma{
    
    int num1,num2;
    Float n1,n2;
    int s1;
    Float s2;
    
    public Suma(int n1,int n2){
        this.num1 = n1;
        this.num2 = n2;
        s1 = num1+num2;
        
    }
    
    public Suma(Float n1,Float n2){
        this.n1 = n1;
        this.n2 = n2;
        s2 = n1+n2;
    }
    
    public int getSuma(){
        return s1;
    }
    
    public Float getSumaFloat(){
        return s2;
    }
}

class Resta{
    
    int num1,num2;
    Float n1,n2;
    
    int s1;
    Float s2;
    
    public Resta(int n1,int n2){
        this.num1 = n1;
        this.num2 = n2;
        s1 = n1-n2;
    }
    
    public Resta(Float n1,Float n2){
        this.n1 = n1;
        this.n2 = n2;       
        s2 = n1-n2;
    }
    
    public int getResta(){
        return s1;
    }
    
    public Float getRestaFloat(){
        return s2;
    }
    
}


class Producto{
    
    int num1,num2;
    Float n1,n2;
    int s1;
    Float s2;
    
    public Producto(int n1,int n2){
        this.num1 = n1;
        this.num2 = n2;
        s1 = n1*n2;
    }
    
    public Producto(Float n1,Float n2){
        this.n1 = n1;
        this.n2 = n2;
        s2 = n1*n2;
    }
    
    public int getProducto(){
        return s1;
    }
    
    public Float getProductoFloat(){
        return s2;
    }
    
}