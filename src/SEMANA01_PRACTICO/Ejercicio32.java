/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA01_PRACTICO;

/**
 *
 * @author NATY
 *//*Un negocio de copias tiene un limite de producción diaria de 10 000 copias si el tipo de impresión 
es offset y de 50 000 si el tipo es estándar. Si hay una solicitud de un el empleado tiene que verificar que
las copias pendientes hasta el momento y las copias solicitadas no excedan del limite de producción.
Si el limite de producción se excediera el trabajo solicitado no podría ser aceptado. El empleado necesita
llevar un buen control de las copias solicitadas hasta 
el momento para decidir en forma rápida si los trabajos que se soliciten en el día se deben aceptar o no.*/
public class Ejercicio32 {
     public static void main(String[] args) {
       java.util.Scanner Teclado = new java.util.Scanner(System.in);
     int offset2,standard2=0;

int offset=0;
int standard=0;
int resultado=1;

         System.out.println("bienvenido a el programa de control de impresion");
while(resultado==1){
    System.out.println("Presiona 1 si la impresion es offset presiona 2 si la impresion es standard");
    resultado=Teclado.nextInt();
if(resultado == 1){ 
    System.out.println(" Digame La cantida de copias que desea");
      int copias=Teclado.nextInt();
if(copias <=10000 ){
offset2=10000-copias;
    System.out.println("Impresion finalizada");

    System.out.println("Recuerda que te quedan " +offset2+ " Impresiones Offset Disponibles");
     
}
}
if(offset >10000) {
    System.out.println("estas tratando de exeder el limite permitido ya no puedes sacar mas impresiones");
}

if(resultado == 2){
    System.out.println("DIGAME LA CANTIDAD DE COPIAS QUE DESEA :");
    int copi1=Teclado.nextInt();
if(copi1 <=50000){
standard2= 50000-copi1;
    System.out.println("impresion en proceso");
    System.out.println("recuerda que te quedan "+standard2+" impresiones standard disponibles");
}
}
if( offset >10000) {
    System.out.println("Estas tratando de exeder el limite permitido de impresones estandard"
            + " ya no puedes sacar mas impresiones");
}


    System.out.println(" escribe 1 si todavia existen solicitudes por atender "
            + "Escribe 2 si ya haz acabado de atender las solicitudes");
resultado=Teclado.nextInt();
}
     }
}
