/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc02.beans;

/**
 *
 * @author naty
 */
public class clienteNatural extends Cliente {
    private String naturalDNI;
    private String naturalNombre;
    private String naturalPaterno;
    private String naturalMaterno;

    public clienteNatural(){
        super();
        naturalDNI = "";
        naturalNombre = "";
        naturalPaterno = "";
        naturalMaterno = "";
    }

    public clienteNatural(String naturalDNI, String naturalNombre, String naturalPaterno, String naturalMaterno, String telefonoCliente, String correoCliente, String direccionCliente) {
        super(telefonoCliente, correoCliente, direccionCliente);
        this.naturalDNI = naturalDNI;
        this.naturalNombre = naturalNombre;
        this.naturalPaterno = naturalPaterno;
        this.naturalMaterno = naturalMaterno;
    }

    

    public String getNaturalDNI() {
        return naturalDNI;
    }

    public void setNaturalDNI(String naturalDNI) {
        this.naturalDNI = naturalDNI;
    }

    public String getNaturalNombre() {
        return naturalNombre;
    }

    public void setNaturalNombre(String naturalNombre) {
        this.naturalNombre = naturalNombre;
    }

    public String getNaturalPaterno() {
        return naturalPaterno;
    }

    public void setNaturalPaterno(String naturalPaterno) {
        this.naturalPaterno = naturalPaterno;
    }

    public String getNaturalMaterno() {
        return naturalMaterno;
    }

    public void setNaturalMaterno(String naturalMaterno) {
        this.naturalMaterno = naturalMaterno;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }
    
  
}
