package Execution;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Browser;

import com.hrm.genericUtils.ExcelUtility;
import com.hrm.genericUtils.FileUtility;
import com.hrm.genericUtils.JavaUtility;
import com.hrm.genericUtils.WebDriverUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FinalExecution 
{
	public static void main(String[] args) throws Throwable 
	{
//      WebDriver driver=null;
      
      //create utilities for all objects
      WebDriverUtilities wLib=new WebDriverUtilities();
      FileUtility fLib=new FileUtility();
      ExcelUtility eLib=new ExcelUtility();
      JavaUtility jLib=new JavaUtility();
      
      
      
      //fetch common data from property file
     String BROWSER = fLib.getPropertyKeyValue("browser");
      String URL = fLib.getPropertyKeyValue("url");
      String USERNAME = fLib.getPropertyKeyValue("username");
      String PASSWORD = fLib.getPropertyKeyValue("password");
      
      //launch the browser
      if(BROWSER.equalsIgnoreCase("chrome"))
      {
    	  WebDriverManager.chromedriver().setup();
    	 WebDriver driver=new ChromeDriver();
      }
      else if(BROWSER.equalsIgnoreCase("firefox"))
      {
    	  WebDriver driver=new FirefoxDriver();
      }
      else
      {
    	  System.out.println("invalid browser");
      }
//      wLib.maximizeTheBrowser(driver);
      
      
      
      //enter the url
//      driver.get(URL);
      
//      wLib.waitUntilUrlLoads(driver, 0, PASSWORD);
      
//    //read data from Excel Sheet
//    HashMap<String, String> typeDD = eLib.getMultipleDataFromExcel("HRhead", 0, 1, driver);
      
      //enter valid UN and PASSWORD
//      driver.findElement(By.name("hr_email")).sendKeys(USERNAME);
      
//      driver.findElement(By.name("hr_password")).sendKeys(PASSWORD);
//      driver.findElement(By.xpath("//button[.='Sign In']")).click();
	
//	//click on dropdown
//      wLib.selectDropdown(text, element);
      
      
      
      
      
      
      
      
      
	}

}
