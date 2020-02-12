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
public class Cliente {
    protected String telefonoCliente;
    protected String correoCliente;
    protected String direccionCliente;
    
    public Cliente(){
        this.telefonoCliente = "";
        this.correoCliente = "";
        this.direccionCliente = "";
    }

    public Cliente(String telefonoCliente, String correoCliente, String direccionCliente) {
        this.telefonoCliente = telefonoCliente;
        this.correoCliente = correoCliente;
        this.direccionCliente = direccionCliente;
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
