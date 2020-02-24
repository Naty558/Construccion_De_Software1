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
public class ListaMultimedia {
    private Multimedia[] lista;
	private int contador;
	
	public ListaMultimedia(int tamanio) {
		
		lista = new Multimedia[tamanio];
		contador=0;
	}
	
	public int size(){
		return contador;
	}
	
	private boolean llena(){
	
		return contador ==lista.length;
	}
	
	public boolean addMultimedia(Multimedia m)
	{
		if(llena()){
			return false;
		}else{
			lista[contador]=m;
			contador++;
			return true;
		}
		
	}
	
	public Multimedia getMultimedia(int posicion){
		
		if(posicion<0||posicion>=contador)
			throw new IndexOutOfBoundsException();
		   return lista[posicion];
	}
   
	public int idexOf(Multimedia m){
		
		for(int i=0; i<contador; i++){
			
			if(m.equals(lista[i])){
				return i;
			}
			
		}
		return -1;
	}

	
	public String toString() {
		String s =" ";
		   for(int i=0; i<contador; i++){
			   s+= lista[i].toString()+"\n\n";
		   }
		      
			return s;
	}
	
	   
	}

