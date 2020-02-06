/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA01_PRACTICO;

/**
 *
 * @author NATY
 */
/*Un jefe de casilla desea determinar cuantas personas de cada una de las secciones que componen su 
zona asisten el día de las votaciones. Las secciones son: 
norte, sur y centro. También desea determinar cual es la sección con mayor numero de votantes. */
public class Ejercicio39 {
     public static void main(String[] args) {
       java.util.Scanner Teclado = new java.util.Scanner(System.in);
    int sn=0;
int ss=0;
int sc=0;
int resp;
char res;
String p;
int opcion=0;

do{

    System.out.println("\n Ingrese la persona votante [ ]\b\b\b\b");
      p=Teclado.next();

    System.out.println("\n Ingrese la seccion :[1=SN][2=SS][3=SC][ ]\b\b\b\b");
     resp=Teclado.nextInt();

if(resp==1){
sn=sn+1;
}
if(resp==2){
 ss=ss+1;
}
if(resp==3){
sc=sc+1;
}


if(sn> ss && sn > sc)

{
    System.out.println("LA SECCION NORTE es mayor con "+sn+" PERSONAS");

}else
if(ss > sn && ss > sc)
{
    System.out.println("LA SECCION SUR es mayor con "+ss+" PERSONAS");
}else
{
    if(sc>sn&&sc<ss){
    System.out.println("LA SECCION CENTRO es mayor con  "+sc+" PERSONAS");
}
}


    System.out.println("\nDECEA REGISTRAR OTRA PERSONA ?[1.S/2.N] [ ]\b\b");
    opcion=Teclado.nextInt();
}while(opcion==1);
if(opcion==2){
    System.out.println("La seccion con mayor numero de votantes es la seccion :"+resp);
}
}

}

