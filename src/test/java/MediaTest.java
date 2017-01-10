package test.java;

import org.junit.Assert;
import org.junit.Test;

import main.java.Operaciones;

public class MaquinaExpendedoraTest {
    
    @Test
    public void testCorriente(){
     
         Assert.assertTrue(5.0 == Operaciones.media(5.0,5.0));
    }

    
    @Test(expected = AssertionError.class)
    public void testCrearMaquinaNumerosNegativos(){
        
    	 Assert.assertTrue(0.0 == Operaciones.media(5.0,5.0));
    }

    
}