/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evangelista;

import Entidades.newpackage.miAsistente;
import Entidades.newpackage.miExpositor;

/**
 *
 * @author naty
 */
public class Prueba1 {
    
     public static void main(String[] args) {
         
         miAsistente Asistente = new miAsistente("020170092","Naty","Evangelista","natyevangelista@gmail.com","917935413","Brisas del Huallaga");
         miExpositor Expositor = new miExpositor("020170092","Naty","Evangelista","natyevangelista@gmail.com");
         Evento miEvento;
         miEvento = new Evento ("La vida",5,Expositor,Asistente,"4:10","5:00","alta",'P');
         
         System.out.println("Titulo Evento : "+ miEvento.Titulo);
         System.out.println("Duracion de Evento : "+ miEvento.duracionEvento + "Horas");
         System.out.println("Nombre y Apellido de Expositor : "+ miEvento.Expositor.getNombrePersona()+ " "+miEvento.Expositor.getApellidoPersona());
         System.out.println("Correo de Expositor : "+ miEvento.Expositor.getCorreoPersona());
         System.out.println("DATOS DE ASISTENTE");
         System.out.println("Nombre y Apellido de Asistente : "+ miEvento.Asistente.getNombrePersona()+ " " + miEvento.Asistente.getApellidoPersona());
         System.out.println("Correo de Asistente : "+ miEvento.Asistente.getCorreoPersona());
         System.out.println("Telefono de Asistente : "+ miEvento.Asistente.getTelefonoAsistente());
         System.out.println("Direccion : "+ miEvento.Asistente.getDireccionAsistente());
         System.out.println("==================================================================================== ");  
         System.out.println("Hora de inicio : "+ miEvento.horaIngreso);
         System.out.println("Hora de salida : "+ miEvento.horaSalida);
         System.out.println("Temporada Alta : "+ miEvento.temporadaEvento);
         System.out.println("Ubicacion : "+ miEvento.ubicacionEvento);
         miEvento.costoPorUbicacion();
         System.out.println("Costo : "+ miEvento.costoEntrada);
         System.out.println("Monto a pagar con IGV : " + miEvento.generarTotalConIGV());
          System.out.println("Monto por temporada : " + miEvento.descuentoPorTemporada());
    }

  

}
