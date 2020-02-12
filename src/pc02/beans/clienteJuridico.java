/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc02.beans;

/**
 *
 * @author cliwfshowardfigueroavaleriano
 */
public class clienteJuridico extends Cliente {
    private String nombreTienda;
    private String RUC;

    public clienteJuridico(){
        super();
        this.nombreTienda = "";
        this.RUC = "";
    }

    public clienteJuridico(String nombreTienda, String RUC, String telefonoCliente, String correoCliente, String direccionCliente) {
        super(telefonoCliente, correoCliente, direccionCliente);
        this.nombreTienda = nombreTienda;
        this.RUC = RUC;
    }

    
    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
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
