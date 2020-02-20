/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_PRACTICO;

/**
 *
 * @author NATY
 */
class node{
  figuras dato;
    node sgte;
    node ante;
    public node(figuras fig){
        this.dato=fig;
        this.ante=this.sgte=null;
    }
}
class figuras{
    private String nombre;

    public figuras(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Figura{" + "nombre=" + nombre + '}';
    }  
}

class method {
    node ultimo;
    public method(){
        this.ultimo=null;
    }
    
    void mostrar(){
    node temp=ultimo;
    while(temp!=null){
        System.out.println(temp.dato.toString());
        temp=temp.sgte;
    }
  }
    void ingresar(figuras fig){
    node newnodo= new node(fig);
    if(ultimo==null){
        ultimo=newnodo;
    }
    else{
        newnodo.sgte=ultimo;
        ultimo=newnodo;
    }
  }
    void sacarPila(){
        node temp=ultimo;
        if(ultimo==null){
            System.out.println("Lista vacia!!");
        }else if(temp.sgte==null){
            ultimo=null;
        }else{
          while(temp!=null){
            if(temp.sgte.sgte==null){
                temp.sgte=null;
                break;
            }
            temp=temp.sgte;
          }  
        }
    }
}

public class Figura {
    public static void main(String[] args) {
     method metodo=new method();
     metodo.ingresar(new figuras("Circulo"));
     metodo.ingresar(new figuras("Triangulo"));
     metodo.ingresar(new figuras("Cuadrado"));
     metodo.ingresar(new figuras("Rectangulo"));
     metodo.ingresar(new figuras("Rombo"));
     System.out.println("------------LISTA DE FIGURAS: ---------------");
     metodo.mostrar();
     metodo.sacarPila();
     System.out.println("\n-------------SACAR POR PILA:---------");
     metodo.mostrar();
    }
   
}
