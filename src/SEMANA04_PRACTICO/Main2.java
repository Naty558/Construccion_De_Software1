/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA04_PRACTICO;

/**
 *
 * @author NATY
 */
public class Main2 {
     public static int cuentaPrestados(Object[] lista) {
        int contador = 0;
        // SE COMPRUEBA QUE ES PRESTABLE
        for (Object obj : lista) {
            if (obj instanceof Prestable && ((Prestable) obj).prestado()) {
                contador++;
            }
        }
        return contador;
    }

    public static int publicacionesAnterioresA(Publicacion[] lista, int anio) {
        int contador = 0;
        for (Publicacion p : lista) {
            if (p.getAnio() < anio) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Publicacion[] biblioteca = { new Libro("CCCC5", "La fundación", 1956),
                new Revista("CC1", "El jueves", 2009, 1582), new Libro("CC3", "El neuromante", 1978),
                new Revista("DR1", "Quo", 2007, 85) };
   
        

        Libro l = (Libro) biblioteca[0]; // SE TRANSFORMA A LIBRO PARA PODER
                                            // LLAMAR A prestar()
        l.prestar();
        for (Publicacion p : biblioteca) {
            System.out.println(p);
        }
        System.out.println(publicacionesAnterioresA(biblioteca, 1990));
        System.out.println(cuentaPrestados(biblioteca));
    }
}
