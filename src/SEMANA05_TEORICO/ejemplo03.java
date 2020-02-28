/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA05_TEORICO;

/**
 *
 * @author NATY
 */
abstract class padre{
    int x;
    int y;
    String saludar(){
        return "buenos dias";
    }
    abstract void  cortePelo();
        
    
}
class hija extends padre
{
 String saludar(){
    return "GOOD MORNING";
}   
 void cortePelo(){
     
 }
}
public class ejemplo03 {
    public static void main(String[]  args){
        padre p=new hija();//creamos un espacio de memoria
        System.out.println(p.saludar());
    }
}
