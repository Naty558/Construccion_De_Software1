/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_PRACTICO;

import java.util.ArrayList;

/**
 *
 * @author NATY
 */
/*clase Baraja que inicialmente contenga a todas las cartas en un monto.
Esta clase tendrá un método voidbaraja() que permite barajar el monto de cartas.
Otro método, Carta getCarta() nos proporciona la carta que está situada en la parte superior
del monto retirándola del mismo. Crear una aplicación que utilice esta baraja. */
  class Carta{
    int posicion;
    int num;
    String figura;
    
    public Carta(int posicion,int num,String figura){
        this.posicion=posicion;
        this.num=num;
        this.figura=figura;
    }
}

class Baraja{
    
    ArrayList<Carta>cartas=new ArrayList<>();
    int cont;
 
    void Inicializar(){
        cont=1;
        int cont1=1,cont2=1,cont3=1,cont4=1;
        String Rombo="Rombo",Trebol="Trebol",Corazon="Corazon",Espada="Espada";
        for(int i=0;i<52;i++){
            if(i<13){
                cartas.add(new Carta(i, cont1, Rombo));
                cont1++;
            }else if(i>=13&&i<26){
                cartas.add(new Carta(i, cont2, Trebol));
                cont2++;
            }else if(i>=26&&i<39){
                cartas.add(new Carta(i, cont3, Corazon));
                cont3++;
            }else if(i>=39&&i<52){
                cartas.add(new Carta(i, cont4, Espada));
                cont4++;
            }
        }  
    }
    
    void Barajar(){
        ArrayList<Integer>pos=new ArrayList<>();
        while(pos.size()<52){
            int n=aleatorio(1,52);
            boolean encontrado=false;
            for(int i=0;i<pos.size();i++){
                if(pos.get(i)==n){
                    encontrado=true;
                    break;
                }         
            }
            if(!encontrado)
                pos.add(n);
        }
        int cant=0;
        for(Integer e: pos){
            cartas.get(cant).posicion=e;
            cant++;
        }
        Carta temp;
        for(int i=0;i<52;i++){
            //for(int j=i;j<52;j++)
            if(cartas.indexOf(cartas.get(i))!=pos.get(i)-1){
                temp=cartas.get(i);
                cartas.set(i,cartas.get(pos.get(i)-1));
                cartas.set(pos.get(i)-1,temp);
            }
                
                
                
            
        }
    }

    int aleatorio(int min,int max){
        return (int)((max-min+1)*Math.random()+min);
    }
    
    void mostrar(){
        for(Carta e: cartas){
            System.out.println(e.num+" de "+e.figura);
        }
    }
    
    void getCarta(){
       /* for(int i=0;i<52;i++){
            if(cartas.get(i).posicion==cont){
                System.out.println(cartas.get(i).num+" de "+cartas.get(i).figura);
                cont++;
            }
        }*/
        System.out.println(cartas.get(cont).num+" de "+cartas.get(cont).figura);
        cont++;
        
    }
}

public class Ejercicio09_colecciones{
    public static void main(String[] args) {
        Baraja b1=new Baraja();
        b1.Inicializar();
        //b1.mostrar();
        b1.Barajar();
        //b1.mostrar();
        b1.getCarta();
        b1.getCarta();
        b1.getCarta();
        b1.getCarta();
        b1.getCarta();
        
    }
}
