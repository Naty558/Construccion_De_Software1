/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA01_PRACTICO;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author NATY
 *//*31) Un censador recopila ciertos datos aplicando encuestas para el ultimo Censo Nacional de Población
y Vivienda. Desea obtener de todas las personas que alcance a encuestar en un día, que porcentaje 
tiene estudios de primaria, secundaria, carrera técnica, estudios profesionales y estudios de posgrado.*/ 

public class Ejercicio31_Censo {
     public static void main(String[] args) {
       Scanner cin=new Scanner(System.in);
        System.out.println("Ingresa el numero de pobladores:  ");
        int cantidad=cin.nextInt();
        double cont1=0,cont2=0,cont3=0,cont4=0,cont5=0;
        for(int i=0;i<cantidad;i++){
            System.out.print("Persona "+(i+1));
            String estudio=estudios();
            if(estudio.equals("Primaria")){
                cont1++;
            }
            if(estudio.equals("Secundaria")){
                cont2++;
            }
            if(estudio.equals("Carrera Tecnica")){
                cont3++;
            }
            if(estudio.equals("Estudios Profesionales")){
                cont4++;
            }
            if(estudio.equals("Estudio de posgrado")){
                cont5++;
            }
            System.out.print("  Estudios:  "+estudio);
            System.out.println("");
        }
        System.out.println("\n"+"El porcentaje de estudios de Primaria es: "+retornar(((cont1*100)/cantidad))+"%");
        System.out.println("El porcentaje de estudios de Secundaria es: "+retornar(((cont2*100)/cantidad))+"%");
        System.out.println("El porcentaje de estudios de Carrera tecnica es: "+retornar(((cont3*100)/cantidad))+"%");
        System.out.println("El porcentaje de estudios de Estudios Profesionales es: "+retornar(((cont4*100)/cantidad))+"%");
        System.out.println("El porcentaje de estudios de Estudios posgraado es: "+retornar(((cont5*100)/cantidad))+"%");
    }
    public static String estudios(){
        String[] cadena={"","Primaria","Secundaria","Carrera Tecnica","Estudios Profesionales","Estudio de posgrado"};
        return cadena[(int)((5+1-1)*Math.random()+1)];
    }
    public static double retornar(double numero){
        BigDecimal bigDecimal = new BigDecimal(numero).setScale(2, RoundingMode.UP);
        return bigDecimal.doubleValue();
    }
}
