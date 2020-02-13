/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_TEORICO;

import java.util.ArrayList;

/**
 *
 * @author NATY
 */
class business{
    //ASI ES COMPOSISION
   // ArrayList<employee> lista=new ArrayList<>();
       ArrayList<employee> lista;
    
    public business(ArrayList list){
        this.lista=list;
    }

    business() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
class employee{
   int a,b;
}
public class ejemplo06 {
    public static void main(String args){
        business b1=new business();
    }
}
