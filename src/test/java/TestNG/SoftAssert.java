package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssert
{
	@Test
	public void softAssertTest() throws InterruptedException
	{
		String expected="Admin Log in";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://rmgtestingserver/domain/HRM_System/");
		String actual=driver.getTitle();
		System.out.println(actual);
		org.testng.asserts.SoftAssert sa=new org.testng.asserts.SoftAssert();
		sa.assertEquals(actual, expected);
		System.out.println("----application is launched----");
		System.out.println("-----Execution is done----");
		sa.assertAll();
		Thread.sleep(2000);
		
		driver.quit();
	}
	

}
