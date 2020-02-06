/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA02_TEORICO;

import java.util.ArrayList;

/**
 *
 * @author NATY
 */
public class TestDoctor {
     public static void main(String[] args){
        ArrayList<Doctor> listaDoctor =new ArrayList<>();
        listaDoctor.add(new Doctor(1,"JUAN"));
        listaDoctor.add(new Doctor(2,"MARIA"));
        listaDoctor.add(new Doctor(3,"ANTHONIO"));
        listaDoctor.add(new Doctor(4,"NELA"));
        for(Doctor datos:listaDoctor){
            System.out.println(datos.tostring());
        }
        
    }
}
