package TestNG;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationTest 
{
	@BeforeSuite
	public void confBS()
	{
		System.out.println("connect to database");
	}
	@BeforeClass
	public void confBC()
	{
		System.out.println("launch the browser");
	}
	@BeforeMethod
	public void confBM()
	{
		System.out.println("loginto the HRM");
	}
	@Test
	public void confT()
	{
		System.out.println("Testscript");
	}
	@AfterMethod
	public void confAM()
	{
		System.out.println("logout the HRM");
	}
	@BeforeMethod
	public void confBM1()
	{
		System.out.println("login to HRM again");
	}
	@Test
	public void test()
	{
		System.out.println("testscript 1");
	}
	@AfterMethod
	public void afterM()
	{
		System.out.println("Log out the HRM again");
	}
	@AfterClass
	public  void afterC()
	{
		System.out.println("close the browser");
	}
	
	
	

}
