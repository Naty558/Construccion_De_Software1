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
/*22. Cinco miembros de
un club contra la obesidad desean saber cuanto han bajado o subido de peso desde la ultima
vez que se reunieron. Para esto se debe realizar un ritual de pesaje en donde cada uno se 
pesa en diez básculas distintas para así tener el promedio mas exacto de su peso.
Si existe diferencia positiva entre este promedio de peso y el peso de la ultima vez que se reunieron,
significa que subieron de peso. Pero si la diferencia es negativa, significa que bajaron. 
Lo que el problema requiere es que por cada persona se imprima un letrero que diga: “SUBIO” o “BAJO” 
y la cantidad de kilos que subió o bajo de peso. */
 
public class Ejercicio22_Obesidad {
    public static void main(String[] args){
       java.util.Scanner Teclado = new java.util.Scanner(System.in);
int suma1=0;                      int prom2=0;
    int dif2=0,dif4=0,dif3=0,dif5=0;
        int prom1=0;
        int prom3=0,prom4=0,prom5=0;
        int dif1=0;
int suma2=0;
int suma3=0;
int suma4=0;
int suma5=0;
int cont1=0;
int cont2=0;
int cont3=0;
int cont4=0;
int cont5=0;

        System.out.println("ingrese el nombre de la primera persona: ");
        String Miembro1=Teclado.next();
        System.out.println("ingrese el peso de la primera persona: ");
        int peso1=Teclado.nextInt();
cont1+=1;
suma1+=peso1;

 System.out.println("ingrese el nombre de la segunda persona: ");
        String Miembro2=Teclado.next();
        System.out.println("ingrese el peso de la segunda persona: ");
        int peso2=Teclado.nextInt();
cont2+=1;
suma2+=peso2;

 System.out.println("ingrese el nombre de la   tercera    persona: ");
        String Miembro3=Teclado.next();
        System.out.println("ingrese el peso de la tercera persona: ");
        int peso3=Teclado.nextInt();
cont3+=1;
suma3+=peso3;

 System.out.println("ingrese el nombre de la cuarta persona: ");
        String Miembro4=Teclado.next();
        System.out.println("ingrese el peso de la cuarta persona: ");
        int peso4=Teclado.nextInt();
cont4+=1;
suma4+=peso4;
 System.out.println("ingrese el nombre de la quinta persona: ");
        String Miembro5=Teclado.next();
        System.out.println("ingrese el peso de la quinta persona: ");
        int peso5=Teclado.nextInt();
cont5+=1;
suma5+=peso5;

while(cont1!=5){
    System.out.println("ingrese el peso de la primera persona: ");
    peso1=Teclado.nextInt();
  cont1+=1;
  suma1+=peso1;
  prom1=suma1/5;
  dif1=peso1-prom1;
    System.out.println("--------------------------------------------");
}
while(cont2!=5){
    System.out.println("ingrese el peso de la segunda persona: ");
    peso2=Teclado.nextInt();
  cont2+=1;
  suma2+=peso2;
  prom2=suma2/5;
  dif2=peso2-prom2;
}
    System.out.println("------------------------------------------");
while(cont3!=5){
    System.out.println("ingrese el peso de la tercera persona: ");
  cont3+=1;
  suma3+=peso3;
  prom3=suma3/5;
  dif3=peso3-prom3;
}
    System.out.println("-----------------------------------------------");
while(cont4!=5){
    System.out.println("ingrese el peso de la cuarta persona: ");
    peso4=Teclado.nextInt();
  cont4+=1;
  suma4+=peso4;
  prom4=suma4/5;
  dif4=peso4-prom4;
  
          }
        System.out.println("-----------------------------------------------");
while(cont5!=5){
    System.out.println("ingrese el peso de la quinta persona: ");
    peso5=Teclado.nextInt();
  cont5+=1;
  suma5+=peso5;
  prom5=suma5/5;
  dif5=peso5-prom5;
}
        System.out.println("-----------------------------------------------");
        System.out.println("los resultados del señor : "+Miembro1+ "arrojaron:");
if (dif1>0){
    System.out.println("el señor(@):"+Miembro1 +"SUBIO"+ dif1+"kilos.");
}
if(prom1==dif1){
    System.out.println("le persona se mantuvo en: "+ prom1+ "kilos.");
          }
else{
    System.out.println("el señor(@):"+Miembro1+ "BAJO"+dif1+"kilos");

          }
        System.out.println("los resultados del señor@ "+ Miembro2+"arrojaron:");
        System.out.println("--------------------------------");
if (dif2>0){
    System.out.println("el señor(@):"+Miembro2 +"SUBIO"+ dif2+"kilos.");
}
if(prom2==dif2){
    System.out.println("le persona se mantuvo en: "+ prom2+ "kilos.");
          }
else{
    System.out.println("el señor(@):"+Miembro2+ "BAJO"+dif2+"kilos");

          }
        System.out.println("los resultados del señor@ "+ Miembro3+"arrojaron:");
        System.out.println("--------------------------------");
if (dif3>0){
    System.out.println("el señor(@):"+Miembro3 +"SUBIO"+ dif3+"kilos.");
}
if(prom3==dif3){
    System.out.println("le persona se mantuvo en: "+ prom3+ "kilos.");
          }
else{
    System.out.println("el señor(@):"+Miembro3+ "BAJO"+dif3+"kilos");

          }
        System.out.println("los resultados del señor@ "+ Miembro4+"arrojaron:");
        System.out.println("--------------------------------");
if (dif4>0){
    System.out.println("el señor(@):"+Miembro4 +"SUBIO"+ dif4+"kilos.");
}
if(prom4==dif4){
    System.out.println("le persona se mantuvo en: "+ prom4+ "kilos.");
          }
else{
    System.out.println("el señor(@):"+Miembro4+ "BAJO"+dif4+"kilos");

          }
        System.out.println("los resultados del señor@ "+ Miembro5+"arrojaron:");
        System.out.println("--------------------------------");
if (dif5>0){
    System.out.println("el señor(@):"+Miembro5 +"SUBIO"+ dif5+"kilos.");
}
if(prom5==dif5){
    System.out.println("le persona se mantuvo en: "+ prom5+ "kilos.");
          }
else{
    System.out.println("el señor(@):"+Miembro5+ "BAJO"+dif5+"kilos");

          }
       
        System.out.println("--------------------------------");
    }
}

     

