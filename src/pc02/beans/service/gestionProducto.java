/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc02.beans.service;

import java.util.ArrayList;
import pc02.beans.Producto;

/**
 *
 * @author naty
 */
public class gestionProducto {
    private ArrayList<Producto> miProducto = new ArrayList<>();
    private int numeroProducto = 1;

    public ArrayList<Producto> getMiProducto() {
        return miProducto;
    }

    public void setMiProducto(ArrayList<Producto> miProducto) {
        this.miProducto = miProducto;
    }

    public int getNumeroProducto() {
        return numeroProducto;
    }

    public void setNumeroProducto(int numeroProducto) {
        this.numeroProducto = numeroProducto;
    }
    
     public void create(String descripcion, double precio, int stock, String unidadMedida){
        miProducto.add(new Producto(numeroProducto, descripcion, precio, stock, unidadMedida));
        numeroProducto++;
    }
     
    public void Lectura(int id){
        System.out.println("Codigo del Producto: "+miProducto.get(id).getCodigoProducto());
        System.out.println("Tipo: "+miProducto.get(id).getDescripcionProducto());
        System.out.println("Precio: s/."+miProducto.get(id).getPrecioProducto());
        System.out.println("Unidad: "+miProducto.get(id).getUnidadMedida());
        System.out.println("Stock Actual: "+miProducto.get(id).getStockProducto());
    }
    
    public void LeerTodo(){
        for(int i=0;i<miProducto.size();i++){
            System.out.println("\n--------------------------------");
            System.out.println("Codigo del Producto: "+miProducto.get(i).getCodigoProducto()+"\n");
            System.out.println("Tipo: "+miProducto.get(i).getDescripcionProducto());
            System.out.println("Precio: s/."+miProducto.get(i).getPrecioProducto());
            System.out.println("Unidad: "+miProducto.get(i).getUnidadMedida());
            System.out.println("Stock Actual: "+miProducto.get(i).getStockProducto());
        }
    }
    
    public void Actualizar(int id, String descripcion, double precio, int stock, String unidadMedida){
        miProducto.get(id).setDescripcionProducto(descripcion);
        miProducto.get(id).setPrecioProducto(precio);
        miProducto.get(id).setStockProducto(stock);
        miProducto.get(id).setUnidadMedida(unidadMedida);
    }
    
    public void Borrar(int id){
        miProducto.remove(id);
    }
   

    public boolean consultarStock(int id, int cantidad){
        
        return (cantidad<=miProducto.get(id).getStockProducto());
    }

    public int retornarID(int codigoProducto){
        int indiceP=-1;
        for(int i=0;i<miProducto.size();i++){
            if(codigoProducto == miProducto.get(i).getCodigoProducto()){
                indiceP = i;
                break;
            }
        }
        return indiceP;
    }
    
    public void disminuirStock(int id, int cantidad){
        int stock = miProducto.get(id).getStockProducto();
        int newStock = miProducto.get(id).getStockProducto() - cantidad;
        miProducto.get(id).setStockProducto(newStock);
    }
}
