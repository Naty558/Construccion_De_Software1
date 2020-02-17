/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_TEORICO;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author NATY
 */
class worker{
    private String codigo;
    private String nombre;
    private String areaLaboral;
    private double sueldo;
    private int hextras;
    private String afilacion;
    

    public worker(String codigo, String nombre, String areaLaboral, double sueldo, int hextras, String afilacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.areaLaboral = areaLaboral;
        this.sueldo = sueldo;
        this.hextras = hextras;
        this.afilacion = afilacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAreaLaboral() {
        return areaLaboral;
    }

    public String getAfilacion() {
        return afilacion;
    }

    
    double montoHextras(){
        return (sueldo*hextras)/240;
    }
    double montoseguro(){
        if(afilacion.equals("AFP")){
            return sueldo*0.17;
        }else{
            return sueldo*0.05;
        }
    }
    double montoessalud(){
        return sueldo*0.03;
    }
    double montosdescuento(){
        return this.montoseguro()+this.montoessalud();
    }
    double montosueldobruto(){
        return this.sueldo+this.montoHextras();
    }
    double sueldoneto(){
        return this.montosueldobruto()-this.montosdescuento();
    }
    String laboral[]={"Sistemas","Administracion","Marketing"};
    String afi[]={"AFP","SNP"};

    @Override
    public String toString() {
        return  "worker{" + "\ncodigo=" + codigo + "\nnombre=" + nombre + "\nareaLaboral=" + areaLaboral + "\nsueldo=" + sueldo + "\nhextras=" + hextras + "\nafilacion=" + afilacion 
                + "\nMONTO EXTRA " + montoHextras()
                + "\nMONTO SEGURO " + montoseguro()
                + "\nMONTO ESSALUD " + montoessalud()
                + "\nMONTO DESCUENTO " + montosdescuento()
                + "\nMONTO SUELDO  BRUTO " + montosueldobruto()
                + "\nMONTO SUELDO NETO " + sueldoneto() + "\n";
    }
        
}
class person implements Iterable<worker>{
    ArrayList<worker> list= new ArrayList<>();
    void add(worker p1){
        list.add(p1);
    }
     //Nombre del empleado que tenga el mayor sueldo neto. 
    String NombreEmpSueldo(){ 
        String cad="";
        double sueldotemp=0.0;
        for(worker w:list){
            if(w.sueldoneto()>=sueldotemp){
                sueldotemp =w.sueldoneto();
//                cad=w.getNombre();
            }
        }
        for(worker w:list){
            if(w.sueldoneto()== sueldotemp){
                cad+=w.getNombre()+" ";
            }
        }
        return cad;
    }
    //b.Promedio de Sueldos netos del área de Marketing.
    double sueldoNetoAreas(String area){
         double acu=0;
         for(worker w:list){
            if(w.getAreaLaboral()== area){
                acu+=w.sueldoneto();
            }
        }
         return acu;
    }
     //c.Numero de Empleados cuyo Monto de Seguro superen los 100 soles.
    double MontoSeguroSuperado(){
        double Acum=0;
        for(worker w:list){
            if(w.montoseguro()>100){
                Acum=Acum+1;
            }
        }
        return Acum;
        
    }
    // d.Numero de empleados del área de sistemas cuyo monto de Horas extras están entre 500 y 800 soles. 
    double NumeroSistemas(String area){
        double acum=0;
        for(worker w:list){
            if(w.getAreaLaboral()==area){
                if(w.montoHextras()>=500 && w.montoHextras()<=800)
                {
                    acum=acum+1;
                }
            }
        }
        return acum;
    }
     //Empleado del SNP con el menor monto de Descuento. 
    String EmpleadoSNP(String afi){
        String cad="";
        double sueldotemp=0.0;
        for(worker w:list){
            if(w.getAfilacion()==afi){
                sueldotemp=w.montosdescuento();
            }
        }
        for(worker w:list){
            if(w.montosdescuento()== sueldotemp){
                cad+=w.getNombre()+" ";
            }
        }
        return cad;
    } 
    // Total que gasta la empresa en pagar a todos sus empleados.
    double TotalPago(){
        double suma=0;
        for(worker w:list){
            suma=w.sueldoneto()+w.montosueldobruto()+w.montosdescuento();
    }
        return suma;
    }
    @Override
    public Iterator iterator(){
        return list.iterator();
    }
    }

public class Ejercicio9{
    public static void main(String[] args){
        String laboral[]={"Sistemas","Administracion","Marketing"};
        String afi[]={"AFP","SNP"};
        DecimalFormat dt=new DecimalFormat("#.##");
        person list=new person();
        worker w1=new worker("1","Jose",laboral[aleatorio(0,3)],2000,10,afi[aleatorio(0,2)]);
        worker w2=new worker("2","Mario",laboral[aleatorio(0,3)],2100,10,afi[aleatorio(0,2)]);
        worker w3=new worker("3","Antonio",laboral[aleatorio(0,3)],2200,10,afi[aleatorio(0,2)]);
        worker w4=new worker("4","Miguel",laboral[aleatorio(0,3)],2300,10,afi[aleatorio(0,2)]);
        worker w5=new worker("5","Pablo",laboral[aleatorio(0,3)],1500,10,afi[aleatorio(0,2)]);
        list.add(w1);
        list.add(w2);
        list.add(w3);
        list.add(w4);
        list.add(w5);
        for(worker w:list){
            System.out.println(w.toString());
        }
        System.out.println("Empleado que tiene mayor sueldo neto: "+list.NombreEmpSueldo());
        System.out.println("Sueldo neto de marketing: "+dt.format(list.sueldoNetoAreas("Marketing")));
        System.out.println("Numero de Empleados cuyo monto Seguro supera los 100 soles "+list.MontoSeguroSuperado());
        System.out.println("Numero de empleados del área de sistemas cuyo monto de Horas extras están entre 500 y 800 soles. "+dt.format(list.NumeroSistemas("sistemas")));
        System.out.println(" Empleado del SNP con el menor monto de Descuento  "+list.EmpleadoSNP("SNP"));
        System.out.println(" Total que gasta la empresa en pagar a todos sus empleados."+list.TotalPago());
    }
    static int aleatorio(int min,int max){
        return (int)(Math.random()*(max-min)+min);
    }
}