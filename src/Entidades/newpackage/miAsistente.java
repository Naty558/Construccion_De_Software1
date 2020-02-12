/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.newpackage;

/**
 *
 * @author cliwfshowardfigueroavaleriano
 */
public class miAsistente extends Persona {
    String telefonoAsistente;
    String direccionAsistente;

    public miAsistente(String codigoPersona, String nombrePersona, String apellidoPersona, String correoPersona, String telefonoAsistente, String direccionAsistente) {
        super(codigoPersona, nombrePersona, apellidoPersona, correoPersona);
        this.telefonoAsistente=telefonoAsistente;
        this.direccionAsistente=direccionAsistente;
    }

    public String getTelefonoAsistente() {
        return telefonoAsistente;
    }

    public void setTelefonoAsistente(String telefonoAsistente) {
        this.telefonoAsistente = telefonoAsistente;
    }

    public String getDireccionAsistente() {
        return direccionAsistente;
    }

    public void setDireccionAsistente(String direccionAsistente) {
        this.direccionAsistente = direccionAsistente;
    }

    public String getCodigoPersona() {
        return codigoPersona;
    }

    public void setCodigoPersona(String codigoPersona) {
        this.codigoPersona = codigoPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public String getCorreoPersona() {
        return correoPersona;
    }

    public void setCorreoPersona(String correoPersona) {
        this.correoPersona = correoPersona;
    }

  

   
  
    
}
