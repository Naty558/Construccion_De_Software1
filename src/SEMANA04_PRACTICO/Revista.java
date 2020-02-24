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
public class Revista extends Publicacion {
private int numero;

public Revista(String codigo, String titulo, int anio, int numero) {
super(codigo, titulo, anio);
this.numero = numero;
}

@Override
public String toString() {
return super.toString() + "Numero: " + numero;
}

}