/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA02_TEORICO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author NATY
 */
public class BufferReader {
    public static void main(String[] args)throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        
        String nombre;
        System.out.println("Ingrese su nombre ");
        nombre=bf.readLine();
        System.out.println("Hola "+nombre);
        int n1,n2;
        System.out.println("Ingrese el primer numero");
        n1=Integer.parseInt(bf.readLine());
        System.out.println("Ingrese el segundo numero");
        n2=Integer.parseInt(bf.readLine());
        int suma=0;
        suma=n1+n2;
        System.out.println("la suma es "+suma);
        
    }
}


