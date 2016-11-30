import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testAdd1Plus1() 
	{
	    int x  = 1 ; 
	    assertEquals(2, HelloWorld.Telop(x));
	}
	
	@Test
	public void testAdd2Plus1() 
	{
	    int x  = 2 ; 
	    assertEquals(3, HelloWorld.Telop(x));
	}
	
	@Test
	public void testMultiply2by17() 
	{
	    int x  = 2 ; int y = 17; 
	    assertEquals(34, HelloWorld.vermenigvuldig(x,y));
	}
}
