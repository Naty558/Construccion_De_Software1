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
import java.util.Scanner;
public class club {

    private socio socio1,socio2,socio3;
    private Scanner teclado;
    
    public club() {
      teclado=new Scanner(System.in);
      socio1=new socio();
      socio2=new socio();
      socio3=new socio();
    }

    public void mayorAntiguedad() {
    	System.out.print("Socio con mayor antiguedad:");
        if (socio1.retornarAntiguedad()>socio2.retornarAntiguedad() &&
            socio1.retornarAntiguedad()>socio3.retornarAntiguedad()) {
            socio1.imprimir();
        } else {
            if (socio2.retornarAntiguedad()>socio3.retornarAntiguedad()) {
                socio2.imprimir();
            } else {
                socio3.imprimir();
            }
        }
    }
}

    