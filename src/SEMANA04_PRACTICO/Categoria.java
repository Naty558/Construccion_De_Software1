/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA04_PRACTICO;

/**
 *
 * @author NATY
 */
public class Categoria {
    private int categoria;
    private String IDCategoria;

    public Categoria(int categoria, String IDCategoria) {
        this.categoria = categoria;
        this.IDCategoria = IDCategoria;
    }
    public Categoria(){
        categoria=0;
        IDCategoria="";
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getIDCategoria() {
        return IDCategoria;
    }

    public void setIDCategoria(String IDCategoria) {
        this.IDCategoria = IDCategoria;
    }
    
}
