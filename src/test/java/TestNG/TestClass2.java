package TestNG;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass2 
{
@BeforeClass
public void beforeClass()
{
 System.out.println("Launch the browser");	
}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("login");
	}
	@Test
	public void test2()
	{
		System.out.println("testscript-2");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("logout");
	}
	@BeforeMethod
	public void beforeMethod1()
	{
		System.out.println("login login");
	}
	@Test
	public void test4()
	{
		System.out.println("Testscript-3");
	}
	@AfterMethod
	public void afterMethod2()
	{
		System.out.println("logout");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("browser close");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("close the database");
	}

}
