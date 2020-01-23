package sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestHelloWorld {
	Main h=new Main();
	@Test
public 	void test() {
		
		//fail("Not yet implemented");
		assertEquals("helloworld",h.say());
		
	}
	@Test
public void testReverseWord()
{
	System.out.println("test case reverse word"); 
	System.out.println(h.reverseWord("my name is khan"));

	assertEquals("ym eman si nahk ",h.reverseWord("my name is khan"));
	
}
	@Test
	public void test3()
	{
		String s=null;
		assertNull(s);
	}
	@Test
	public void test4()
	{
		String s="hello";
		assertNotNull(s);
	}
	@Test
	public void test5()
	{
		
		assertTrue(6>5);
	}
	
	}

