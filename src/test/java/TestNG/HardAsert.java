package TestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAsert 
{
	@Test
	public void hardAssertTest()
	{
		System.out.println("----Step-1----");
		System.out.println("----Step-2-----");
		assertEquals("A", "B");
		System.out.println("----Step-3----");
		System.out.println("----Step-4-----");
	}
	
	@Test
	public void hardAssertTest2()
	{
		System.out.println("----Step-5----");
		System.out.println("----Step-6-----");
		assertNotEquals("x","x");
		System.out.println("----Step-7----");
		System.out.println("----Step-8-----");
		
	}
	
	@Test
	public void hardAssertTest3()
	{
		int m=3;
		Assert.assertNull(m);
		System.out.println("----Step-9----");
	}
	@Test
	public void hardAssertTest4()
	{
		int c=8;
		Assert.assertNotNull(c);
		System.out.println("----Step-10----");
	}
	@Test
	public void hardAssertTest5()
	{
		Assert.assertTrue(true);
		System.out.println("----Step-11---");
	}
	

}
