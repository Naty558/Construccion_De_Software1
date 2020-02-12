/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc02.beans.service;

import java.util.ArrayList;
import pc02.beans.clienteJuridico;

/**
 *
 * @author cliwfshowardfigueroavaleriano
 */
public class gestionClienteJuridico {
    
     private ArrayList<clienteJuridico> clienteJuridico = new ArrayList<>();

    public ArrayList<clienteJuridico> getClienteJuridico() {
        return clienteJuridico;
    }

    public void setClienteJuridico(ArrayList<clienteJuridico> clienteJuridico) {
        this.clienteJuridico = clienteJuridico;
    }
    
    public void create(String nombreT, String RUC, String telefono, String correo, String direccion){
        clienteJuridico.add(new clienteJuridico(nombreT, RUC, telefono, correo, direccion));
    }    
    
    public void Lectura(int id){
        System.out.println("Nombre de la Tienda: "+clienteJuridico.get(id).getNombreTienda());
        System.out.println("RUC: "+clienteJuridico.get(id).getRUC());
        System.out.println("Teléfono: "+clienteJuridico.get(id).getTelefonoCliente());
        System.out.println("Correo: "+clienteJuridico.get(id).getCorreoCliente());
        System.out.println("Dirección: "+clienteJuridico.get(id).getDireccionCliente());
    }
    
    public void LecturaTodo(){
        for(int i=0;i<clienteJuridico.size();i++){
            System.out.println("\n--------------------------------");
            System.out.println("Nombre de la Tienda: "+clienteJuridico.get(i).getNombreTienda()+"\n");
            System.out.println("RUC: "+clienteJuridico.get(i).getRUC());
            System.out.println("Teléfono: "+clienteJuridico.get(i).getTelefonoCliente());
            System.out.println("Correo: "+clienteJuridico.get(i).getCorreoCliente());
            System.out.println("Dirección: "+clienteJuridico.get(i).getDireccionCliente());
        }
    }
    
    public void Borrar(int id){
        clienteJuridico.remove(id);
    }
    
    public int retornarID(String RUC){
        int indiceClienteJuridico = -1;
        for(int i=0;i<clienteJuridico.size();i++){
            if(clienteJuridico.get(i).getRUC().equals(RUC)){
                indiceClienteJuridico = i;
                break;
            }
        }
        return indiceClienteJuridico;
    }
    
    public void Actualizar(int id, String nombreT, String RUC, String telefono, String correo, String direccion){
        clienteJuridico.get(id).setNombreTienda(nombreT);
        clienteJuridico.get(id).setRUC(RUC);
        clienteJuridico.get(id).setTelefonoCliente(telefono);
        clienteJuridico.get(id).setCorreoCliente(correo);
        clienteJuridico.get(id).setDireccionCliente(direccion);
    }
}

