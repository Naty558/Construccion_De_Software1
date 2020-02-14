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
    double sueldoNetoAreas(String area){
         double acu=0;
         for(worker w:list){
            if(w.getAreaLaboral()== area){
                acu+=w.sueldoneto();
            }
        }
         return acu;
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
    }
    static int aleatorio(int min,int max){
        return (int)(Math.random()*(max-min)+min);
    }
}