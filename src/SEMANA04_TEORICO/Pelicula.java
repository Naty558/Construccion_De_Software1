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
public class Pelicula  extends Multimedia{
	
	private String acrorPrincipal;
	private String actrizPrincipal;
	public Pelicula(String titulo, String autor, Formato formato,
			double duracion, String acrorPrincipal, String actrizPrincipal) {
		super(titulo, autor, formato, duracion);
		this.acrorPrincipal = acrorPrincipal;
		this.actrizPrincipal = actrizPrincipal;
	}
	public String getAcrorPrincipal() {
		return acrorPrincipal;
	}
	public String getActrizPrincipal() {
		return actrizPrincipal;
	}
	@Override
	public String toString() {
		return "Pelicula [acrorPrincipal=" + acrorPrincipal
				+ ", actrizPrincipal=" + actrizPrincipal + ", toString()="
				+ super.toString() + "]";
	}

	
}