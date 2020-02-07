/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA02_PRACTICO;

import java.util.Date;

/**
 *
 * @author NATY
 */
public class Evento {
    private String titulo;
    private int  duracion;
    private Expositores Expositor;
    private Date Hora_de_Ingreso;
    private Date Hora_de_Salida;
    private String Temporada;

    public Evento(String titulo, int duracion, Expositores Expositor, Date Hora_de_Ingreso, Date Hora_de_Salida, String Temporada) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.Expositor = Expositor;
        this.Hora_de_Ingreso = Hora_de_Ingreso;
        this.Hora_de_Salida = Hora_de_Salida;
        this.Temporada = Temporada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Expositores getExpositor() {
        return Expositor;
    }

    public void setExpositor(Expositores Expositor) {
        this.Expositor = Expositor;
    }

    public Date getHora_de_Ingreso() {
        return Hora_de_Ingreso;
    }

    public void setHora_de_Ingreso(Date Hora_de_Ingreso) {
        this.Hora_de_Ingreso = Hora_de_Ingreso;
    }

    public Date getHora_de_Salida() {
        return Hora_de_Salida;
    }

    public void setHora_de_Salida(Date Hora_de_Salida) {
        this.Hora_de_Salida = Hora_de_Salida;
    }

    public String getTemporada() {
        return Temporada;
    }

    public void setTemporada(String Temporada) {
        this.Temporada = Temporada;
    }
    
    
}
