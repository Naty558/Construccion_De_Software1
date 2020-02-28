/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA06_TEORICO;

/**
 *
 * @author NATY
 */
interface Ianimal{
    
}
class animal implements Ianimal{
    void corre(){
        
    }
}
class tortuga implements Ianimal{
    void corre(){
        throw new RuntimeException("la tortuga no puede correr :");
    }
    
}
public class Ejercicio01 {
     public static void main(String[]  args){
         Ianimal a=new animal();
         Ianimal b=new tortuga();
     }
}
