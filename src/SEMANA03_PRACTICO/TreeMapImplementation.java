/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_PRACTICO;

import java.util.TreeMap;

/**
 *
 * @author NATY
 */
public class TreeMapImplementation {
     // Función para mostrar el ejemplo del constructor TreeMap ()

    static void Example1stConstructor() 
    { 
        //Creando un TreeMap vacío
        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>(); 
  
        // Asignación de valores de cadena a claves int
        tree_map.put(40, "NARANJA"); 
        tree_map.put(5, "TUTIFRUTI"); 
        tree_map.put(9, "MANDARINA"); 
        tree_map.put(4, "GUANBANA"); 
        tree_map.put(89, "MARACUYA"); 
  
        // Mostrar el TreeMap
        System.out.println("TreeMap: "
                           + tree_map); 
    } 
  
    // Código 
    public static void main(String[] args) 
    { 
  
        System.out.println("TreMap"); 
        Example1stConstructor(); 
    } 
} 
