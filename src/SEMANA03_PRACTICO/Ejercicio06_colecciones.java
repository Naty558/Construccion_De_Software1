/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_PRACTICO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author NATY
 *//*Ejercicio 6. Crear la clase Palabra que mantenga información sobre las palabras que se 
le agreguen por medio del método add(String). Al final, debe permitirnos conocer el conjunto
de palabras de una determinada longitud. Este conjunto deberá estar ordenado alfabéticamente.
Crear una aplicación que muestre toda la información que disponga la clase Palabra.*/
class palabra {

    String palabra;

    palabra(String p) {
        palabra = p;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

}

public class  Ejercicio06_colecciones  {

    public static void main(String[] args) {
        ArrayList<palabra> lista = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        lista.add(new palabra("Pedro"));
        lista.add(new palabra("Roberto"));
        lista.add(new palabra("Ario"));
        lista.add(new palabra("Feder"));
        lista.add(new palabra("Hugo"));
        lista.add(new palabra("Mario"));
        lista.add(new palabra("Beto"));
        lista.add(new palabra("Diego"));

        for (palabra e : lista) {
            System.out.println(e.getPalabra());
        }

        System.out.println("************* mostrar lista de una determinada longitud ******************");
        System.out.println("ingrese indice");
        int x = sc.nextInt();

        for (int i = 0; i < lista.size() + i; i++) {
            if (x == -1) {
                break;
            }
            lista.remove(x--);

        }
        Collections.sort(lista, new Comparator<palabra>() {
            public int compare(palabra p1, palabra p2) {
                return p1.getPalabra().compareTo(p2.getPalabra());
            }
        });
        
        for (palabra e : lista) {
            System.out.println(e.getPalabra());
        }

    }

}
