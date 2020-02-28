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
interface Ipersisten{
    
}
class person{
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
class dataMysql implements Ipersisten{
    public void save (Object o){
        if(o instanceof person ){
          System.out.println("La persona fue almacenada !!!");  
        }
    }

}
class dataoracle implements Ipersisten{
    public void save (Object o){
        if(o instanceof person ){
          System.out.println("La persona fue almacenada !!!");  
        }
    }

}
class servicioPerson{
  Ipersisten ipersisten;
  void setipersisten(Ipersisten ipersisten){
      this.ipersisten=ipersisten;
  }
  void saveperson(person p){
      ipersisten.save(p);
  }
}
public class Ejercicio06 {
      public static void main(String[]  args){
          servicioPerson ser=new servicioPerson();
          ser.setipersisten(new dataMysql());
          ser.saveperson(new person());
      }
}
