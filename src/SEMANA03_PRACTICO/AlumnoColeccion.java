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

class nodo {
 alumno dato;
    nodo sgte;
    nodo ante;
    public nodo(alumno alu){
        this.dato=alu;
        this.ante=this.sgte=null;
    }
}

class alumno {
  String name;
  int nota1,nota2,nota3;

    public alumno(String name, int a, int b, int c) {
        this.name = name;
        this.nota1 = a;
        this.nota2= b;
        this.nota3= c;
    }
    @Override
    public String toString() {
        return "alumno{" + " name= " + name + ", nota1= " + nota1 + ", nota2= " + nota2 + ", nota3= " + nota3 + '}';
    }
}

class metodo {
    nodo ultimo;
    public metodo(){
        this.ultimo=null;
    }
    
    void mostrar(){
    nodo temp=ultimo;
    while(temp!=null){
        System.out.println(temp.dato.toString());
        temp=temp.sgte;
    }
  }
    void ingresar(alumno dat){
    nodo newnodo= new nodo(dat);
    if(ultimo==null){
        ultimo=newnodo;
    }
    else{
        newnodo.sgte=ultimo;
        ultimo=newnodo;
    }
  }
    void sacarCola(){
        if(ultimo==null){
            System.out.println("Lista vacia!!");
        }else{
           ultimo=ultimo.sgte; 
        }
        
    }
}

public class AlumnoColeccion {
    public static void main(String[] args) {
        metodo met=new metodo();
        
        met.ingresar(new alumno("marlon",12,15,16));
        met.ingresar(new alumno("susan",14,15,13));
        met.ingresar(new alumno("marco",11,17,12));
        met.ingresar(new alumno("nela",14,13,12));
        met.ingresar(new alumno("gina",15,15,16));
        System.out.println("------------LISTA DE ALUMNOS: ---------------");
        met.mostrar();
        met.sacarCola();
        System.out.println("\n-------------SACAR POR COLA:---------");
        met.mostrar();
        
        
        
    }
 
}

