/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA01_PRACTICO;

import java.util.Scanner;

/**
 *
 * @author NATY
 */
public class Ejercicio11_Zoologo {
   /* 11.	Un Zoólogo pretende determinar el porcentaje de animales que hay en las siguientes
            tres categorías de edades: de 0 a 1 año, de mas de 1 año y menos de 3 y de 3 o mas años. 
                    El  zoológico todavía no esta seguro del animal que va a estudiar. 
                    Si se decide por elefantes solo tomara una
            muestra de 20 de ellos; si se decide por las jirafas,
                    tomara 15 muestras, y si son chimpancés tomara 40.*/
    public static void main(String[] args) {
Scanner entrada=new Scanner(System.in);
int claseAnimal;
int edad;
int cbe=0,cb=0;
int cne=0,cn=0;
int cae=0,ca=0;
int cbj=0;
int cnj=0;
int caj=0;
int cbc=0;
int cnc=0,cac=0;

System.out.println("Ingrese la clase de animal que desea ingresar 1.Elefante 2.Jirafas. 3.Chimpance");
claseAnimal=entrada.nextInt();
System.out.println("Ingrese la edad del animal ");
edad=entrada.nextInt();
if(claseAnimal==1){
for(int i=1;i<20;i++){
if(edad>=0 && edad<2){

cbe=cb+1;

}
if(edad>=1 && edad<4){
cne=cn+1;
}
if(edad>=3 && edad>3){
cae=ca+1;
}
}
}
int peb=100*cbe/20;
int pen=100*cne/20;
int pea=100*cae/20;
int pce=peb+pen+pea;
System.out.println("El porcentaje de elefantes"+pce);
if(claseAnimal==2){
for(int i=1;i<15;i++){
if(edad>=0 && edad<2){

cbj=cbj+1;

}
if(edad>=1 && edad<4){

cnj=cnj+1;
}
if(edad>=3 && edad>3){

caj=caj+1;
}
}
}
int pjb=100*cbj/20;
int pjn=100*cnj/20;
int pja=100*caj/20;
int pje=pjb+pjn+pja;
System.out.println("El porcentaje de jirafas es "+pje);

if(claseAnimal==3){
for(int i=1;i<40;i++){
if(edad>=0 && edad<2){

cbc=cbc+1;

}
if(edad>=1 && edad<4){

cnc=cnc+1;
}
if(edad>=3 && edad>3){

cac=cac+1;
}
}
}
int pcb=100*cbc/20;
int pcn=100*cnc/20;
int pca=100*cac/20;
int pcc=pcb+pcn+pca;

System.out.println("El porcentaje de chimpance es "+pcc);
}
}


