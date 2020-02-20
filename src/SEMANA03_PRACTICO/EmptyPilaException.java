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
    public class EmptyPilaException extends Exception {
	public EmptyPilaException(String s) {
		super(s);
	}
	public String toString() {
		return "PilaExcepcion:"+super.toString();
	}
}
