/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA04_TEORICO;

/**
 *
 * @author NATY
 */
public class Multimedia {
    private String titulo;
	private String autor;
	private Formato formato;
	private double duracion;
	
	
	
	public Multimedia(String titulo, String autor, Formato formato,
			double duracion) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.duracion = duracion;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public Formato getFormato() {
		return formato;
	}
	public double getDuracion() {
		return duracion;
	}


	
	public String toString() {
		return "Multimedia [titulo=" + titulo + ", autor=" + autor
				+ ", formato=" + formato + ", duracion=" + duracion + "]";
	}
	
	
	public boolean equals(Multimedia m){
		
		return titulo.equals(m.getTitulo())&&autor.equals(m.getAutor());
	}
	
    
	
}

