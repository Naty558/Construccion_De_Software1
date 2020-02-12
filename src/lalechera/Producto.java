/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lalechera;

import java.util.Scanner;

/**
 *
 * @author NATY
 */
public class Producto {
     Scanner sc = new Scanner(System.in);
    private String codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private String unidadMedida;
    private int cantidad;

    public Producto(String codigo, String descripcion, double precio, int stock, String unidadMedida, int cantidad) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.unidadMedida = unidadMedida;
        this.cantidad = cantidad;
    }

    public Producto() {

    }

    public String getCodigo() {
        return codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public void llenarleche() {

        System.out.println("ingresa el  codigo del producto");
        setCodigo(sc.next());
        System.out.println("Descripcion del producto");
        setDescripcion("100 % leche de vaca");
        System.out.println(getDescripcion());
        System.out.println("ingrese el costo  de la caja de leche:");
        setPrecio(sc.nextDouble());
        System.out.println("ingrese el stock disponible del producto");
        setStock(sc.nextInt());
        System.out.println("unidad de medida del producto: ");
        setUnidadMedida(" 1 Litro por caja");
        System.out.println(getUnidadMedida());
//        System.out.println("ingrese cuantas cajas de leche desea llevar:");
//        setCantidad(sc.nextInt());
    }

    public void llenarqueso() {

        System.out.println("ingresa el codigo  del producto");
        setCodigo(sc.next());
        System.out.println("Descripcion del producto ");
        setDescripcion(" 100 % puro,  el mejor queso  que probaras e toda tu vida");
        System.out.println(getDescripcion());
        System.out.println("ingrese el costo del molde de kilo del queso: ");
        setPrecio(sc.nextDouble());
        System.out.println("ingrese el stock disponible del producto");
        setStock(sc.nextInt());
        System.out.println("unidad de medida del producto: ");
        setUnidadMedida(" 1 kilo por molde");
        System.out.println(getUnidadMedida());
//        System.out.println("ingrese cuantos moldes de kilo de queso desea llevar:");
//        setCantidad(sc.nextInt());
    }

    public void llenarmantequilla() {

        System.out.println("ingresa el  codigo del producto");
        setCodigo(sc.next());
        System.out.println("Descricpcion del producto ");
        setDescripcion("La mejor mantequilla de todo el mercado 100% puro");
        System.out.println(getDescripcion());
        System.out.println("ingrese el costo de  la barra de mantequilla: ");
        setPrecio(sc.nextDouble());
        System.out.println("ingrese el stock disponible del producto");
        setStock(sc.nextInt());
        System.out.println("unidad de medida del producto: ");
        setUnidadMedida("1 kilo por barra");
        System.out.println(getUnidadMedida());
//        System.out.println("ingrese cuantas barras de mantequilla desea llevar:");
//        setCantidad(sc.nextInt());
    }

    public void venderleche() {
        System.out.println("ingrese la cantidad de leche a llevar: ");
        setCantidad(sc.nextInt());
        System.out.println("stock disponible: "+ getStock());
        if (getStock()-getCantidad()<=0) {
            System.out.println("stock  del producto no disponible");
        } else {
            setPrecio(getCantidad()*getPrecio());
            setStock(getStock() - getCantidad());
            System.out.println("stock restante: " + getStock());
            System.out.println("en total a pagar por llevar: "+getCantidad()+ " cajas de un litro de leche  es: "+getPrecio());
        }
    }

    public void venderqueso(){
        System.out.println("ingrese la cantidad de queso a llevar: ");
        setCantidad(sc.nextInt());
        System.out.println("stock disponible: "+ getStock());
        if (getStock()-getCantidad()<=0) {
            System.out.println("stock  del producto no disponible");
        } else {
            setPrecio(getCantidad()*getPrecio());
            setStock(getStock() - getCantidad());
            System.out.println("stock restante: " + getStock());
            System.out.println("en total a pagar por llevar: "+getCantidad()+ " moldes de kilo de queso  es: "+getPrecio());
        }
    }
    public void vendermantequilla(){
        System.out.println("ingrese la cantidad de mantequilla a llevar: ");
        setCantidad(sc.nextInt());
        System.out.println("stock disponible: "+ getStock());
        if (getStock()-getCantidad()<=0) {
            System.out.println("stock  del producto no disponible");
        } else {
            setPrecio(getCantidad()*getPrecio());
            setStock(getStock() - getCantidad());
            System.out.println("stock restante: " + getStock());
            System.out.println("en total a pagar por llevar: "+getCantidad()+ " barras de kilo de mantequilla  es: "+getPrecio());
        }
    }
    String mostrarDatosdeLeche() {
        Producto p;
        return "CODIGO: " + this.codigo + "\n Descripcion: " + this.descripcion + "\n Costo: " + this.precio + " \n Stock: " + this.stock + "\n unidad de medidad: " + this.unidadMedida;
    }

    String mostrarDatosdeQueso() {
        return "CODIGO: " + this.codigo + "\n Descripcion: " + this.descripcion + "\n Costo: " + this.precio + " \n Stock: " + this.stock + "\n unidad de medidad: " + this.unidadMedida;
    }

    String mostrarDatosdeMantequilla() {
        return "CODIGO: " + this.codigo + "\n Descripcion: " + this.descripcion + "\n Costo: " + this.precio + " \n Stock: " + this.stock + "\n unidad de medidad: " + this.unidadMedida;
    }
}


