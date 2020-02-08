/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA01_PRACTICO;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author NATY
 */
public class Ejercicio42_Candidatos {
   /* 42.	Leer los 250,000 votos otorgados 
            a los 3 candidatos a gobernador e imprimir el numero del candidato ganador y su cantidad de votos.*/
       Scanner entrada = new Scanner(System.in);
String NombreCandidato[] = new String[3];
    int votoCandidato1 = 0;
    int VotoCandidato2 = 0;
    int VotoCandidato3 = 0;

    public void Nombres() {
        System.out.println("INGRESE NOMBRE DEL CANDIDATO");
        for (int i = 0; i < 3; i++) {
            System.out.print("Candidato [" + (i + 1) + "]: ");
            String Nombre = entrada.nextLine();
            this.NombreCandidato[i] = Nombre;
        }
    }

    public void GenerarVoto() {
        System.out.println("\n GENERANDO VOTOS ...");
        System.out.println(" ...");
        System.out.println(" ..");
        
        for (int i = 0; i < 250000; i++) {
            Random VotoAleatorio = new Random();
            int numero = (VotoAleatorio.nextInt(3) + 1);

            if (numero == 1) {
                votoCandidato1++;
            } else if (numero == 2) {
                VotoCandidato2++;
            } else if (numero == 3) {
                VotoCandidato3++;
            }

        }
    }

    public void Ganador() {
        System.out.println("AVISO: Obteniendo Ganador");
        if (votoCandidato1 > VotoCandidato2 && votoCandidato1 > VotoCandidato3) {
            System.out.println("** CANDIDATO GANADOR **");
            System.out.println("Nombre: " + NombreCandidato[0] + "     # VOTOS :::> " + votoCandidato1);
        } else if (VotoCandidato2 > votoCandidato1 && VotoCandidato2 > VotoCandidato3) {
            System.out.println("** CANDIDATO GANADOR **");
            System.out.println("Nombre: " + NombreCandidato[1] + "     # VOTOS :::> " + VotoCandidato2);

        } else if (VotoCandidato3 > votoCandidato1 && VotoCandidato3 > VotoCandidato2) {
            System.out.println("** CANDIDATO GANADOR **");
            System.out.println("Nombre: " + NombreCandidato[2] + "     # VOTOS :::> " + VotoCandidato3);

        }

    }

    public static void main(String[] args) {

        Ejercicio42_Candidatos voto1 = new Ejercicio42_Candidatos();

        voto1.Nombres();
        voto1.GenerarVoto();
        voto1.Ganador();

    }

}
   

