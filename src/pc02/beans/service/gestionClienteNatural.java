/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc02.beans.service;


import java.util.ArrayList;
import pc02.beans.clienteNatural;

/**
 *
 * @author cliwfshowardfigueroavaleriano
 */
public class gestionClienteNatural {
     ArrayList<clienteNatural> miClienteNatural = new ArrayList<>();

    public ArrayList<clienteNatural> getMiClienteNatural() {
        return miClienteNatural;
    }

    public void setMiClienteNatural(ArrayList<clienteNatural> miClienteNatural) {
        this.miClienteNatural = miClienteNatural;
    }
     
    public void create(String naturalDNI, String naturalNombre, String naturalPaterno, String naturalMaterno, String telefono, String correo, String direccion){
        miClienteNatural.add(new clienteNatural(naturalDNI, naturalNombre, naturalPaterno, naturalMaterno, telefono, correo, direccion));
    }
    
    public void Lectura(int id){
        System.out.println("DNI: "+miClienteNatural.get(id).getNaturalDNI());
        System.out.println("Nombre: "+miClienteNatural.get(id).getNaturalNombre());
        System.out.println("Apellidos: "+miClienteNatural.get(id).getNaturalMaterno()+" "+miClienteNatural.get(id).getNaturalMaterno());
        System.out.println("Teléfono: "+miClienteNatural.get(id).getTelefonoCliente());
        System.out.println("Correo: "+miClienteNatural.get(id).getCorreoCliente());
        System.out.println("Dirección: "+miClienteNatural.get(id).getDireccionCliente());
    }
    
    public void LecturaTodo(){
        for(int i=0;i<miClienteNatural.size();i++){
        System.out.println("DNI: "+miClienteNatural.get(i).getNaturalDNI());
        System.out.println("Nombre: "+miClienteNatural.get(i).getNaturalNombre());
        System.out.println("Apellidos: "+miClienteNatural.get(i).getNaturalMaterno()+" "+miClienteNatural.get(i).getNaturalMaterno());
        System.out.println("Teléfono: "+miClienteNatural.get(i).getTelefonoCliente());
        System.out.println("Correo: "+miClienteNatural.get(i).getCorreoCliente());
        System.out.println("Dirección: "+miClienteNatural.get(i).getDireccionCliente());
        }
    }
    
    public void Actualizar(int i, String DNI, String nombre, String naturalPaterno, String naturalMaterno, String naturalTelefono, String correo, String direccion){
        miClienteNatural.get(i).setNaturalDNI(DNI);
        miClienteNatural.get(i).setNaturalNombre(nombre);
        miClienteNatural.get(i).setNaturalPaterno(naturalPaterno);
        miClienteNatural.get(i).setNaturalMaterno(naturalMaterno);
        miClienteNatural.get(i).setTelefonoCliente(naturalTelefono);
        miClienteNatural.get(i).setCorreoCliente(correo);
        miClienteNatural.get(i).setDireccionCliente(direccion);
    }
    
    public void Borrar(int id){
        miClienteNatural.remove(id);
    }
    
    public int retornarID(String DNI){
        int indiceClienteNatural = -1;
        for(int i=0;i<miClienteNatural.size();i++){
            if(miClienteNatural.get(i).getNaturalDNI().equals(DNI)){
                indiceClienteNatural = i;
                break;
            }
        }
        return indiceClienteNatural;
    }
}
