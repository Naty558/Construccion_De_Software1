/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA08_TEORICO.practica1;

import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author NATY
 */
public class PanelReloj extends JPanel {
    public PanelReloj() {
        super();
        String tiempoActual = getTiempo();
        JLabel tiempo = new JLabel("Fecha: ");
        JLabel actual = new JLabel(tiempoActual);
        add(tiempo);
        add(actual);
    }

    String getTiempo() {
        String tiempo;
        // obtener fecha y hora actual
        Calendar ahora = Calendar.getInstance();
        int hora = ahora.get(Calendar.HOUR_OF_DAY);
        int minuto= ahora.get(Calendar.MINUTE);
        int mes = ahora.get(Calendar.MONTH) + 1;
        int dia = ahora.get(Calendar.DAY_OF_MONTH);
        int year = ahora.get(Calendar.YEAR);

        String nombreMes = "";
        switch (mes) {
            case (1):
                nombreMes = "Enero";
                break;
            case (2):
                nombreMes = "Febrero";
                break;
            case (3):
                nombreMes = "Marzo";
                break;
            case (4):
                nombreMes = "Abril";
                break;
            case (5):
                nombreMes = "Mayo";
                break;
            case (6):
                nombreMes = "Junio";
                break;
            case (7):
                nombreMes = "Julio";
                break;
            case (8):
                nombreMes = "Agosto";
                break;
            case (9):
                nombreMes = "Septiembre";
                break;
            case (10):
                nombreMes = "Octubre";
                break;
            case (11):
                nombreMes = "Noviembre";
                break;
            case (12):
                nombreMes = "Diciembre";
        }
        tiempo = dia + " de " + nombreMes + " de "  + year + ".  " + " Hora:  "
            + hora + ":" + minuto;
        return tiempo;
    }
}