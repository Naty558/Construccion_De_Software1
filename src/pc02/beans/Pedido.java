/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc02.beans;

/**
 *
 * @author cliwfshowardfigueroavaleriano
 */
public class Pedido {
     
    private int numeroPedido;
    private String fechaPedido;
    private int cantidadPedido;
    private String clientePedido;
    private int codigoProducto;

    public Pedido(int numeroPedido, String fechaPedido, int cantidadPedido, String clientePedido, int codigoProducto) {
        this.numeroPedido = numeroPedido;
        this.fechaPedido = fechaPedido;
        this.cantidadPedido = cantidadPedido;
        this.clientePedido = clientePedido;
        this.codigoProducto = codigoProducto;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public int getCantidadPedido() {
        return cantidadPedido;
    }

    public void setCantidadPedido(int cantidadPedido) {
        this.cantidadPedido = cantidadPedido;
    }

    public String getClientePedido() {
        return clientePedido;
    }

    public void setClientePedido(String clientePedido) {
        this.clientePedido = clientePedido;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
    
    
}
