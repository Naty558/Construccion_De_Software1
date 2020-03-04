/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_PRACTICO;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


/**
 *
 * @author NATY
 */
/*Ejercicio 1. Implementar excepciones en las clases Lista, Pila y Cola. 
Cada estructura debe proporcionar sus propias excepciones. Así, una Lista puede
producir la excepción EmptyListaException, una Pila, EmptyPilaException y una Cola 
EmptyColaException. Crear una aplicación que utiliza esas excepciones. 
 
NOTA-1. A partir de ahora se supone que vamos a utilizar el marco de colecciones de Java
NOTA-2. Para los ejercicios en que sea necesario, los separadores de palabras se consideran 
que son: el espacio, el punto, la coma, el punto y coma, y los dos puntos. */
 
public class Ejercicio1_colecciones {
     public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("Ingresa 1 para llenar en lista");
        System.out.println("Ingresa 2 para llenar en pila");
        System.out.println("Ingresa 3 para llenar en cola");
        
        switch(cin.nextInt()){
            case 1:
                try{
                    Listas l1=new Listas();
                boolean valor=true;
                while(valor){
                    System.out.println("Ingresa 1 para insertar:  ");
                    System.out.println("Ingresa 0 para Finalizar:  ");
                    switch(cin.nextInt()){
                        case 0:
                            l1.mostrar_valores();
                            l1.mostrar();
                            valor=false;
                            break;
                        case 1:
                            System.out.println("Ingresa el numero");
                            l1.Insertar(cin.nextInt());
                            break;
                        default:
                            System.out.println("Opcion Invalido Intenta Otra vEZ :(");
                    }
                }
                }catch(Exception e){
                    System.out.println("Error en la Clase Lista");
                }
                
                break;
            case 2:
                try{
                    
                Pila p=new Pila();
                boolean valor1=true;
                while(valor1){
                    System.out.println("Ingresa 1 para insertar:  ");
                    System.out.println("Ingresa 0 para Finalizar:  ");
                    switch(cin.nextInt()){
                        case 0:
                            p.mostrar_valores();
                            p.mostrar();
                            valor1=false;
                            break;
                        case 1:
                            System.out.println("Ingresa el numero");
                            p.Insertar(cin.nextInt());
                            break;
                        default:
                            System.out.println("Opcion Invalido Intenta Otra vEZ :(");
                    }
                }
                }catch(Exception e){
                    System.out.println("Error en la clase Pila -_-");
                }
                break;
            case 3:
                try{
                    Cola c=new Cola();
                boolean valor2=true;
                while(valor2){
                    System.out.println("Ingresa 1 para insertar:  ");
                    System.out.println("Ingresa 0 para Finalizar:  ");
                    switch(cin.nextInt()){
                        case 0:
                            c.mostrar_valores();
                            c.mostrar();
                            valor2=false;
                            break;
                        case 1:
                            System.out.println("Ingresa el numero");
                            c.Insertar(cin.nextInt());
                            break;
                        default:
                            System.out.println("Opcion Invalido Intenta Otra vEZ :(");
                    }
                }
                }catch(Exception e){
                    System.out.println("Error en la Clase Cola -_-");
                }
                break;  
            default:
                
        }
        
        
     
    }
    
}


class Listas extends Exception{
    ArrayList<Integer> lista_nu;

    public Listas() {
        lista_nu=new ArrayList<>();
    }
    
    public void Insertar(int e){
        lista_nu.add(e);
    }
    public void mostrar(){
        System.out.println("\n IMPRESION EN LISTA");
        Collections.sort(lista_nu);
        System.out.println(lista_nu);
    }
    public void mostrar_valores(){
        System.out.println("Valores Insertados:  ");
        for(int i=0;i<lista_nu.size();i++){
            System.out.print("["+lista_nu.get(i)+"]  ");
        }
    }
}

class Pila extends Exception{
    ArrayList<Integer> lista_nu;
    public Pila(){
        lista_nu=new ArrayList<>();
    }
    
    public void Insertar(int e){
        lista_nu.add(e);
    }
    public void mostrar(){
        System.out.println("\n IMPRESION EN PILA");
        for(int i=0;i<lista_nu.size();i++){
            System.out.println(lista_nu.get(i));
        }
    }
    public void mostrar_valores(){
        System.out.println("Valores Insertados:  ");
        for(int i=0;i<lista_nu.size();i++){
            System.out.print("["+lista_nu.get(i)+"]  ");
        }
    }
}

class Cola extends Exception{
    ArrayList<Integer> lista_nu;
    public Cola(){
        lista_nu=new ArrayList<>();
    }
    
    public void Insertar(int e){
        lista_nu.add(e);
    }
    public void mostrar(){
        System.out.println("\n IMPRESION EN COLA");
        for(int i=(lista_nu.size()-1);i>=0;i--){
            System.out.println(lista_nu.get(i));
        }
    }
    public void mostrar_valores(){
        System.out.println("Valores Insertados:  ");
        for(int i=0;i<lista_nu.size();i++){
            System.out.print("["+lista_nu.get(i)+"]  ");
        }
    }
}

