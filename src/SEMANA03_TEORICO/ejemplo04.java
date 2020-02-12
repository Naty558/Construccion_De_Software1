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
class persona{
    private int a,b;
    public persona(){
        a=0;
        b=0;
    }
    public persona(int x,int y){
        a=x;
        b=y;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
}
public class ejemplo04 {
    public static void main(String[] args) {
        ArrayList<persona>lista=new ArrayList<>();
        persona p1=new persona();
        p1.setA(5);
        p1.setB(5);
        lista.add(new persona(5,4));
    }
}
