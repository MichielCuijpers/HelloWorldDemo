import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		int test = 6;
		Telop(test);
	
	}
	public static int Telop (int test){
		
		test = test +1;
		System.out.println(test);
		return test;
	}

	@Test
	public void testAdd1Plus1() 
	{
	    int x  = 1 ; 
	    assertEquals(2, HelloWorld.Telop(x));
	}
}
