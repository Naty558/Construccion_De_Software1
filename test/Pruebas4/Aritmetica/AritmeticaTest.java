/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas4.Aritmetica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NATY
 */
public class AritmeticaTest {
    
    public AritmeticaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     @Test
    public void testSuma() {
        double primerSumando=10;
        double segundoSumando=5;
        double ultimoResultado=15;
       Aritmetica op=new Aritmetica();
        double testres=op.suma(primerSumando, segundoSumando);
        assertEquals(testres,ultimoResultado,0.0);//compara ambos resultados
        if(ultimoResultado!=testres){
             fail("The test case is a prototype.");
        }
        // TODO review the generated test code and remove the default call to fail.
       
    }
    @Test
    public void testResta(){
        double minuendo=10;
        double sustraendo=5;
        double respuesta=5;
        Aritmetica op=new Aritmetica();
        double testres=op.resta(minuendo, sustraendo);
        assertEquals(testres,respuesta,0.0);
        if(respuesta!=testres){
            fail("the test case is a prototype.");
        }
    }
    @Test
    public void testMultiplicacion(){
         double primerFactor=10;
        double segundoFactor=5;
        double rest=50;
        Aritmetica op=new Aritmetica();
        double testres=op.multiplicacion(primerFactor, segundoFactor);
        assertEquals(testres,rest,0.0);
        if(rest!=testres){
            fail("the test case is a prototype.");
        }
    }
    @Test
      public void testDivision(){
         double dividendo=10;
        double divisor=5;
        double rest=2;
        Aritmetica op=new Aritmetica();
        double testres=op.division(dividendo, divisor);
        assertEquals(testres,rest,0.0);
        if(rest!=testres){
            fail("the test case is a prototype.");
        }
    }
     
     @Test
    public void testNumero_mayor_caso2() {        
        int a = 5;
        int b = 3;
        int c = 4;
       Aritmetica instance = new Aritmetica();
        int expResult = 5;
        int result = instance.numero_mayor(a, b, c);
        assertEquals(expResult, result);        
    }
  
      
   @Test
	public void  testCalcular()
	{ 
              double precio=1200;
              double tipo=16;
              Aritmetica instance=new Aritmetica();
            int expResult=1392;
		double result = instance.Calcular(precio, tipo);
               assertEquals(expResult,result);
	}
        @Test
        public void  testDevolver()
	{ 
              double precio=1200;
              double tipo=16;
              Aritmetica instance=new Aritmetica();
            int expResult=10;
		double result = instance.Calcular(precio, tipo);
               assertEquals(expResult,result);
	}
      
}
