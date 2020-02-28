/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA06_TEORICO;

import java.io.IOException;

/**
 *
 * @author NATY
 */
public class ejercicio08 {
     public static void main(String[] args){
        int x=15;
         int y=0;
         try{
    //   int resp=x/y;
              //  System.out.println("DIVIDIR X/Y :"+resp);
              String name=null;
              name.equals("QQQ");

         }catch(ArithmeticException e){
             System.out.println("No se puede dividir en cero :");
         
         }catch(Exception e){
             System.out.println("El objeto de error :"+e);
         }
     }
}
