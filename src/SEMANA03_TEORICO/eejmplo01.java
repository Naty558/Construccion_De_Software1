/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_TEORICO;

/**
 *
 * @author NATY
 */
interface padre{
    //constates la variables
    int CAD=14;
    //metodo son abstractos
    void dormir();
    int comer(int a);
    int comer(int p,float y);
}
abstract class canino{
    int x,y;
    abstract void comer();
    abstract void dormir();
    abstract void caminar();
    int suma(){
        return this.x+this.y;
    }
}
class perro extends canino{
    void comer(){}
    void dormir(){}
    void caminar(){}
}
//se cre clases abstractas para comportare como super clases 
public class eejmplo01 {
    public static void main(String[]  args){
        canino p1=new canino();
    }
}
