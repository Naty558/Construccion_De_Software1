/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_PRACTICO;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author NATY
 */
public class ColaPrior implements Prioridad{
    
    int valor;
    ArrayList<Integer> elementos; 
    public ColaPrior(){
        elementos=new ArrayList<>(); 
    }
    
    @Override
    public int prioridad() {
        
        elementos.add(valor);
        return valor;
    }
    @Override
    public void mostrar(){
        ordenar();
        if(elementos.size()>=0){
            System.out.print("[");
            for(int i=0;i<elementos.size();i++){
                System.out.print(elementos.get(i) +" ");
            }
            System.out.print("]");
        }else{
            System.out.println("La lista esta Vacia");
        }
        
    }
    
    @Override
    public void agregar(int i){
        valor=i;
        prioridad();
    }
    public void ordenar(){
        Collections.reverse(elementos);
        
    }
    
}
