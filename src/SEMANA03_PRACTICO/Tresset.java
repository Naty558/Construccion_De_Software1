/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_PRACTICO;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author NATY
 */
public class Tresset {
    public static void main(String[] args) {
        // Creando un TreeSet
        SortedSet<String> frutas = new TreeSet<>();

        // Agregar nuevos elementos a un TreeSet
        frutas.add("Platano");
        frutas.add("Manzana");
        frutas.add("Piña");
        frutas.add("Naranja");

        System.out.println("Las frutas son : " + frutas);

        // Los elementos duplicados se ignoran
        frutas.add("Manzana");
        System.out.println("Después de agregar el elemento duplicado Manzana " + frutas);

        //Esto se permitirá porque está en minúsculas.
        frutas.add("Platano");
        System.out.println("Despues de agregar platano : " + frutas);
    }
}
