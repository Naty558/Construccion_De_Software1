/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_PRACTICO;

/**
 *
 * @author NATY
 */
/* Crear la clase CuentaW que en el constructor tome como argumento una cadena de caracteres
y sea capaz de mantener información sobre el número de letras y palabras que hay en dicha cadena, 
así como el número de veces que aparece cada signo (sin diferenciar mayúsculas de minúsculas).
Crear los métodos necesarios para poder consultar esa información. Crear una clase que prueba
a la anterior con varios ejemplos. */
class Cuenta{
private String cadena;
    
    public Cuenta(String cadena){
        this.cadena = cadena;
    }
    
    public void setCadena(String cadena){
        this.cadena = cadena;
    }
    
    private boolean letrasMinus(char i){
        for(char c = 'a';c<='z';c++){
            if(i==c)
                return true;
        }   
        return false;
    }
    
    private boolean letrasMayus(char i){
        for(char c = 'A';c<='Z';c++){
            if(i==c)
                return true;
        }   
        return false;
    }
    
//    public int NumLetras(){
//        int contLetras = 0;
//        String caracter = "";
//        for(int i=0;i<cadena.length();i++){
//            caracter = caracterAString(cadena.charAt(i));
//            if(letras(cadena.charAt(i)))
//                contLetras++;
//        }                        
//        return contLetras;
//    }
//    
    
    public int NumLetras(){
        int contLetras = 0;
        String caracter = "";
        for(int i=0;i<cadena.length();i++)            
            if(letrasMayus(cadena.charAt(i)) || letrasMinus(cadena.charAt(i)))
                contLetras++;        
        return contLetras;
    }
                
    public int NumPalabras(){
        int contPalabras = 0;        
        for (int i = 0; i < cadena.length(); i++){
            if(i <= cadena.length()-1){  
                if(letrasMayus(cadena.charAt(i)) || letrasMinus(cadena.charAt(i)))                
                    if(!letrasMayus(cadena.charAt(i-1)) && !letrasMinus(cadena.charAt(i-1)))
                        contPalabras++;
            }            
        }            
        return contPalabras;
    }           
}

public class CuentaW{
    public static void main(String[] args) {
        Cuenta c = new Cuenta("        Raquela q");
        System.out.println("Numero de letras que hay : "+c.NumLetras());
        System.out.println("Numero de palabras que hay : "+c.NumPalabras());
    }    
}

