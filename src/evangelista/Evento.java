/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evangelista;

import Entidades.newpackage.miAsistente;
import Entidades.newpackage.miExpositor;

/**
 *
 * @author cliwfshowardfigueroavaleriano
 */
public class Evento {
    String Titulo;
    int duracionEvento;
    miExpositor Expositor;
    miAsistente Asistente;
    String horaIngreso;
    String horaSalida;
    String temporadaEvento;
    Double costoEntrada;
    char ubicacionEvento;
    MisConstantes constantes;

    
    public Evento(String Titulo, int duracionEvento, miExpositor Expositor, miAsistente Asistente, String horaIngreso, String horaSalida, String temporadaEvento, char ubicacionEvento) {
        this.Titulo = Titulo;
        this.duracionEvento = duracionEvento;
        this.Expositor = Expositor;
        this.Asistente = Asistente;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
        this.temporadaEvento = temporadaEvento;
        this.costoEntrada = 0.0;
        this.ubicacionEvento = ubicacionEvento;
    }
    
    
    public void costoPorUbicacion(){
      
        if(this.ubicacionEvento == 'P'){
            this.costoEntrada=constantes.Plantinum;
        }
        else if (this.ubicacionEvento == 'G'){
           this.costoEntrada=constantes.Gold;
        }
        else{
           this.costoEntrada=constantes.VIP;
        }

    }
    
    public double generarTotalConIGV(){
        costoEntrada=costoEntrada+(costoEntrada*constantes.IGV);
        return costoEntrada;
    }

    public double descuentoPorTemporada(){
        Double descuento = 0.0;
        if(temporadaEvento == "alta" ) {
        descuento = costoEntrada * 0.05;
        }
        
        if(temporadaEvento == "baja" ) {
        descuento = costoEntrada * 0.10;
        }
        return descuento;
    }
    
    
}
