package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	public String comparacion = "Hello World!";
    /**
     * Rigorous Test :-)     
     */
    @Test
    public void shouldAnswerWithTrue()
    {
		
        assertTrue(comparacion.equals(App.getString()));
    }    
}
