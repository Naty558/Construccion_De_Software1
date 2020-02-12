/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc02.beans.service;

import java.util.ArrayList;
import pc02.beans.Pedido;

/**
 *
 * @author naty
 */
public class gestionPedido {
    private ArrayList<Pedido> miPedido = new ArrayList<>();
    private int numeroPedido = 1;

    public ArrayList<Pedido> getMiPedido() {
        return miPedido;
    }

    public void setMiPedido(ArrayList<Pedido> miPedido) {
        this.miPedido = miPedido;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
    
     public void create(String fechaProducto, int cantidadProducto, String clienteProducto, int producto){
        miPedido.add(new Pedido(numeroPedido,fechaProducto, cantidadProducto, clienteProducto, producto));
        numeroPedido++;
    }
    
    public void Lectura(int id){
        System.out.println("Número de Pedido: "+miPedido.get(id).getNumeroPedido());
        System.out.println("Código del Cliente: "+miPedido.get(id).getClientePedido());
        System.out.println("Código del Producto: "+miPedido.get(id).getCodigoProducto());
        System.out.println("Cantidad: "+miPedido.get(id).getCantidadPedido());
        System.out.println("Fecha del Pedido: "+miPedido.get(id).getFechaPedido());
    }
    
    public void LeerTodo(){
        for(int i=0;i<miPedido.size();i++){
            System.out.println("\n--------------------------------");
            System.out.println("Número de Pedido: "+miPedido.get(i).getNumeroPedido()+"\n");
            System.out.println("Código del Cliente: "+miPedido.get(i).getClientePedido());
            System.out.println("Código del Producto: "+miPedido.get(i).getCodigoProducto());
            System.out.println("Cantidad: "+miPedido.get(i).getCantidadPedido());
            System.out.println("Fecha del Pedido: "+miPedido.get(i).getFechaPedido());
        }
    }
    
    public void Actualizar(int id, String fechaP, int cantidad, String cliente, int producto){
        miPedido.get(id).setFechaPedido(fechaP);
        miPedido.get(id).setCantidadPedido(cantidad);
        miPedido.get(id).setClientePedido(cliente);
        miPedido.get(id).setCodigoProducto(producto);
    }
    
    public void Eliminar(int id){
        miPedido.remove(id);
    }
    
 
    
}
