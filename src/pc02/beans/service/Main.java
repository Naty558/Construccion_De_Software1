/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc02.beans.service;

import java.util.Scanner;
import pc02.beans.Fabrica;

/**
 *
 * @author naty
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Fabrica miFabrica = new Fabrica();
        int opcion = 0;
        
        do{
            System.out.println("\n-----MENÚ DE OPCIONES-----");
            System.out.println("1. Registrar Cliente Natural");
            System.out.println("2. Registrar Cliente Jurídico");
            System.out.println("3. Registrar Producto");
            System.out.println("4. Registrar Pedido");
            System.out.println("5. Mostrar Clientes Naturales");
            System.out.println("6. Mostrar Clientes Juridicos");
            System.out.println("7. Mostrar Productos");
            System.out.println("8. Mostrar Pedidos");
            System.out.println("9. Salir\n");
            
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    miFabrica.registrarClienteNatural(); break;
                case 2:
                    miFabrica.registrarClienteJuridico(); break;
                case 3:
                    miFabrica.registrarProducto(); break;
                case 4:
                    miFabrica.registrarPedido(); break;
                case 5:
                    miFabrica.mostrarClientesNaturales(); break;
                case 6:
                    miFabrica.mostrarClientesJuridicos(); break;
                case 7:
                    miFabrica.mostrarProductos(); break;
                case 8:
                    miFabrica.mostrarPedidos(); break;
                default:
                    System.out.println("No le entendo, elija otra vez");
            }
        }while(opcion != 9);
        
    }
}
