
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_PRACTICO;

/**
 *
 * @author NATY
 */
/*Ejercicio 4. Crear la clase WUR que tome una frase en el constructor y almacene por un 
lado las palabras que aparecen sólo una vez y por otro las que estén duplicadas.
Dar métodos que devuelvan estos conjuntos. Crear una aplicación que la utilice.  */
 
public class Ejercicio04_Colecciones {
    public static void main(String[] args) {
        WUR w = new WUR("hola hola como estas soy yo");
        w.contarTodas();
        System.out.println(w.contar_Repetidas("hola"));
    }
}

class WUR {

    String texto = null;
    String palabras[] = null;

    public WUR(String texto) {
        this.texto = texto;
        this.palabras = texto.split(" ");
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void contarTodas() {
        String palabras[] = this.texto.split(" ");//divide una cadena de texto en palabras
        String palabrasB[] = this.texto.split(" ");

        int cantidad = palabras.length;
        String resultado = "";

        for (int i = 0; i < cantidad; i++) {
            int contador = 0;
            resultado += palabras[i];
            String palabra = palabras[i];

            for (int j = 0; j < cantidad; j++) {

                if (palabra.equalsIgnoreCase(palabrasB[j])) {//lo lee aunque sea mayuscula o minuscula
                    contador++;
                    palabras[j] = "";
                }
                
            }
            if (contador > 0) {
                resultado += ": " + contador + "\n";
            }

        }

        System.out.print(resultado);
    }

    public int contar_Repetidas(String palabra) {
        int contador = 0;
        for (int i = 0; i < this.palabras.length; i++) {
            if (this.palabras[i].equalsIgnoreCase(palabra)) {
                contador++;
            }
        }
        return contador;
    }
}


