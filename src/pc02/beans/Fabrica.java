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
import java.util.Scanner;
import pc02.beans.service.gestionClienteJuridico;
import pc02.beans.service.gestionClienteNatural;
import pc02.beans.service.gestionPedido;
import pc02.beans.service.gestionProducto;
public class Fabrica {
    Scanner entrada = new Scanner(System.in);
    
    gestionProducto misProductos = new gestionProducto();
    gestionPedido misPedidos = new gestionPedido();
    gestionClienteNatural misCliente = new gestionClienteNatural();
    gestionClienteJuridico misClienteJuridico = new gestionClienteJuridico();

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public gestionProducto getMisproductos() {
        return misProductos;
    }

    public void setMisproductos(gestionProducto misproductos) {
        this.misProductos = misproductos;
    }

    public gestionPedido getMispedidos() {
        return misPedidos;
    }

    public void setMispedidos(gestionPedido mispedidos) {
        this.misPedidos = mispedidos;
    }

    public gestionClienteNatural getMisCliente() {
        return misCliente;
    }

    public void setMisCliente(gestionClienteNatural misCliente) {
        this.misCliente = misCliente;
    }

    public gestionClienteJuridico getMisClienteJurico() {
        return misClienteJuridico;
    }

    public void setMisClienteJurico(gestionClienteJuridico misClienteJurico) {
        this.misClienteJuridico = misClienteJurico;
    }
    
    public void registrarClienteNatural(){
        System.out.println("Ingrese los datos del cliente: ");
        System.out.println("DNI: ");
        String DNI = entrada.next();
        System.out.println("Nombre: ");
        String nombre = entrada.next();
        System.out.println("Apellido Paterno: ");
        String aPaterno = entrada.next();
        System.out.println("Apellido Materno: ");
        String aMaterno = entrada.next();
        System.out.println("Teléfono: ");
        String telefono = entrada.next();
        System.out.println("Correo: ");
        String correo = entrada.next();
        System.out.println("Dirección: ");
        String direccion = entrada.next();
        
        misCliente.create(DNI, nombre, aPaterno, aMaterno, telefono, correo, direccion);
        System.out.println("CLIENTE NATURAL REGISTRADO.");
    }
    
     public void registrarClienteJuridico(){
        System.out.println("Ingrese los datos del cliente: ");
        System.out.println("Nombre de la Tienda: ");
        String nombreT = entrada.next();
        System.out.println("RUC: ");
        String RUC = entrada.next();
        System.out.println("Teléfono: ");
        String telefono = entrada.next();
        System.out.println("Correo: ");
        String correo = entrada.next();
        System.out.println("Dirección: ");
        String direccion = entrada.next();
        
        misClienteJuridico.create(nombreT, RUC, telefono, correo, direccion);
        System.out.println("CLIENTE JURÍDICO REGISTRADO.");
    }
     
     
    public void registrarProducto(){
        System.out.println("Ingrese los datos del producto: ");
        System.out.println("Tipo: ");
        String descripcion = entrada.next();
        System.out.println("Precio: ");
        double precio = entrada.nextDouble();
        System.out.println("Stock: ");
        int stock = entrada.nextInt();
        System.out.println("Unidad de Medida: ");
        String unidadMedida = entrada.next();
        
        misProductos.create(descripcion, precio, stock, unidadMedida);
        System.out.println("PRODUCTO REGISTRADO.");
    }
    
    public void registrarPedido(){
        System.out.println("Ingrese los datos del producto: ");
        System.out.println("Tipo de cliente: \n1) Cliente Natural\n2) Cliente Juridico");
        int tipoCliente = entrada.nextInt();
        
        switch(tipoCliente){
            case 1:
                System.out.println("Ingrese el DNI del cliente: ");
                String DNI = entrada.next();
                int idClienteN = misCliente.retornarID(DNI);
                if(idClienteN != -1){
                    System.out.println("Ingrese el Código del Producto: ");
                    int codigoProducto = entrada.nextInt();
                    int idProducto = misProductos.retornarID(codigoProducto);
                    if(idProducto != -1){
                        System.out.println("Ingrese la cantidad: ");
                        int cantidad = entrada.nextInt();
                        
                        if(cantidad < 100){
                            if(misProductos.consultarStock(idProducto, cantidad)){
                                misProductos.disminuirStock(idProducto, cantidad);
                                System.out.println("Ingrese la fecha que desea recibir el pedido: ");
                                String fecha = entrada.next();
                                
                                misPedidos.create(fecha, cantidad, DNI, codigoProducto);
                                System.out.println("PEDIDO REGISTRADO");
                            }else{
                                System.out.println("La cantidad solicitada excede el Stock del producto.");
                            }
                        }else{
                            System.out.println("Los clientes naturales solo pueden solicitar una cantidad menor a 100.");
                        }
                    }else{
                        System.out.println("Producto no registrado");
                    }
                    
                }else{
                    System.out.println("Cliente Natural no registrado");
                }
                break;
            case 2:
                System.out.println("Ingrese el RUC del cliente: ");
                String RUC = entrada.next();
                int idClienteJ = misClienteJuridico.retornarID(RUC);
                if(idClienteJ != -1){
                    System.out.println("Ingrese el Código del Producto: ");
                    int codigoProducto = entrada.nextInt();
                    int idProducto = misProductos.retornarID(codigoProducto);
                    if(idProducto != -1){
                        System.out.println("Ingrese la cantidad: ");
                        int cantidad = entrada.nextInt();
                        
                        if(cantidad%100 == 0){
                            if(misProductos.consultarStock(idProducto, cantidad)){
                                misProductos.disminuirStock(idProducto, cantidad);
                                System.out.println("Ingrese la fecha que desea recibir el pedido: ");
                                String fecha = entrada.next();
                                
                                misPedidos.create(fecha, cantidad, RUC, codigoProducto);
                                System.out.println("TOTAL A PAGAR: s/."+misProductos.getMiProducto().get(idProducto).getPrecioProducto()*cantidad);
                                System.out.println("PEDIDO REGISTRADO");
                            }else{
                                System.out.println("La cantidad solicitada excede el Stock del producto.");
                            }
                        }else{
                            System.out.println("Los clientes naturales solo pueden solicitar una cantidad menor a 100.");
                        }
                    }else{
                        System.out.println("Producto no registrado");
                    }
                    
                }else{
                    System.out.println("Cliente Natural no registrado");
                }
                break;
            default:
                System.out.println("Opción incorrecta.");
        }
    }
    
    
     public void mostrarClientesNaturales(){
        System.out.println("LISTA DE CLIENTES NATURALES");
        misCliente.LecturaTodo();
    }
    
    public void mostrarClientesJuridicos(){
        System.out.println("LISTA DE CLIENTES JURÍDICOS");
        misClienteJuridico.LecturaTodo();
    }
    
    public void mostrarProductos(){
        System.out.println("LISTA DE PRODUCTOS");
        misProductos.LeerTodo();
    }
    
    public void mostrarPedidos(){
        System.out.println("LISTA DE PEDIDOS");
        misPedidos.LeerTodo();
    }
    
}
