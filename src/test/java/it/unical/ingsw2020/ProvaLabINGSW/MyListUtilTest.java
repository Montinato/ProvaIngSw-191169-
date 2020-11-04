package it.unical.ingsw2020.ProvaLabINGSW;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MyListUtilTest
{
    /**
     * Rigorous Test :-)
     */
    private static MyListUtil myList; 
    
    
    @BeforeClass
    public static void prepare()
    {
    	myList = new MyListUtil();
    }
    
    
    private void jodatime() {
		// TODO Auto-generated method stub

	}
    
    @Test
     public void provaOrdina()
    {
    	
    	int numeri[] = new int [3];
    	numeri[0] = 2;
    	numeri[1] = 3;
    	numeri[2] = 1;
    	
		assertEquals(Arrays.asList(1,2,3), myList.ordina(numeri, 1, 3));
		
		assertEquals(Arrays.asList(3,2,1), myList.ordina(numeri, 2, 3));
    }
    
    
}
