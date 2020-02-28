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
interface data{
    
}
class mysql implements data{
    String cadena;
}
class conect extends mysql
{
    
}
class rescusql extends mysql{
    
}
class oracle implements data{
    String cadena;
}
class conectOracle extends oracle{
    
}
class rescusqlOrcale extends oracle{
    
}
class save{
    public save(){
        data con=new conectOracle();
        data res=new rescusqlOrcale();
    }
}
public class Ejericio05 {
    
}
