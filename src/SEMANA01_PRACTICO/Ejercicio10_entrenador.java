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
public class Ejercicio10_entrenador {
    /*10. Un entrenador le ha propuesto a un atleta recorrer una ruta de 5 km. durante 10 días,
para determinar si es apto para la
prueba de 5 km. o debe buscar otra especialidad. Para considerarlo apto debe cumplir por
lo menos una de las siguientes condiciones:
1- Que en ninguna de las pruebas haga un tiempo mayor a 16 min.
2- Que al menos en una de las pruebas realice un tiempo mayor a 16 min.
3- Que su promedio de tiempos sea menor o igual a 15 min.*/
    public static void main(String[] args) {
java.util.Scanner Teclado = new java.util.Scanner(System.in);
double prom;
 int cont,tprueba;
  cont=0;
  tprueba=0;
  prom=0;
int t=10;
int tiempos[] = new int[t];//Tiempos por 10 días
System.out.println("Ingrese los tiempos en minutos:");
for(int i=0;i<t;i++){
System.out.println("DÍA :"+(i+1));
System.out.print("Tiempo:");
tiempos[i] = Teclado.nextInt();
    
   if(tiempos[i] > 16)
   tprueba= tiempos[i]; 
 }
 prom =(float)cont/10; 
 if((prom <=15)||(tprueba < 16))
            System.out.println("\nEl atleta es apto para la prueba de 5 Kilometros ");
 else
            System.out.println("\nEl atleta no es apto debe buscar otra especialidad");

        System.out.println("");  
}





}