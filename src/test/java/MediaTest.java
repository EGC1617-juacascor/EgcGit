package test.java;

import org.junit.Assert;
import org.junit.Test;

import main.java.Operaciones;

public class MediaTest {
    
    @Test
    public void testMedia1(){
     
         Assert.assertTrue(5.0 == Operaciones.media(5.0,5.0));
    }
    
    @Test
    public void testMedia2(){
     
         Assert.assertTrue(2.0 == Operaciones.media(2.0,2.0));
    }
    
    @Test
    public void testMedia3(){
     
         Assert.assertTrue(3.0 == Operaciones.media(3.0,3.0));
    }
    
    @Test
    public void testMedia4(){
     
         Assert.assertTrue(7.5 == Operaciones.media(5.0,10.0));
    }
    
    @Test
    public void testMedia5(){
     
         Assert.assertTrue(5.0 == Operaciones.media(0.0,10.0));
    }

    
    @Test(expected = AssertionError.class)
    public void testMediaNegativo(){
        
    	 Assert.assertTrue(0.0 == Operaciones.media(5.0,5.0));
    }

    
}