/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA02_PRACTICO;

/**
 *
 * @author NATY
 */
public class AsistentesalEvento extends Expositores{
    private int telefono;
    private String direccion;

    public AsistentesalEvento(int telefono, String direccion, int codigo, String nombre, String apellido, String correo) {
        super(codigo, nombre, apellido, correo);
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
