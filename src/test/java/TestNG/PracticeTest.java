package TestNG;

import org.testng.annotations.Test;

public class PracticeTest
{
	@Test(invocationCount = 0)
	public void createTest()
	{
		System.out.println("----Data is Created----");
	}
    @Test(dependsOnMethods ="createTest" )
    public void editTest()
    {
    	System.out.println("----Data is Edited---");
    }
    @Test(priority = -1)
    public void removeTest()
    {
    	System.out.println("---Data is Removed---");
    }
}
