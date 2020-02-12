/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lalechera;

/**
 *
 * @author NATY
 */
public class PersonaJuridica extends Persona {
    private String nombreDeTienda;
    private String ruc;

    public PersonaJuridica() {
    }

    
    public PersonaJuridica(String nombreDeTienda, String ruc, String correo, String direccion, String telefono) {
        super(correo, direccion, telefono);
        this.nombreDeTienda = nombreDeTienda;
        this.ruc = ruc;
    }

    public String getNombreDeTienda() {
        return nombreDeTienda;
    }

    public void setNombreDeTienda(String nombreDeTienda) {
        this.nombreDeTienda = nombreDeTienda;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    public void llenar (){
        System.out.println("ingrese el correo electronico  de la persona : ");
        super.setCorreoelectronico(sc.next());
        System.out.println("ingrese su direccion: ");
        super.setDireccion(sc.next());
        System.out.println("ingrese su numero  de telefono :");
        setTelefono(sc.next());
        System.out.println("ingrese el nombre de la tienda al  cual pertenece: ");
        setNombreDeTienda(sc.next());
        System.out.println("ingrese su RUC:");
        setRuc(sc.next());
        
    }
    String mostrar (){
        return "Nombre de la tienda: "+this.nombreDeTienda+"\n RUC: "+this.ruc+"\n"+super.mostrar();
    }
}
