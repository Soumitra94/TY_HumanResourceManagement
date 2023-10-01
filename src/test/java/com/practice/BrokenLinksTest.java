package com.practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinksTest {

	public static void main(String[] args) 
	{
		//launch the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//enter url
		driver.get("http://rmgtestingserver/domain/HRM_System/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		
		//get all the links
		List<WebElement>  listlinks=driver.findElements(By.xpath("//a"));
		System.out.println(listlinks.size());
		
		ArrayList<String>  link=new ArrayList<String>();  //empty array
		for(int i=0;i<listlinks.size();i++)
		{
			String eachlink=listlinks.get(i).getAttribute("href");
			
			URL url=null;
			int statuscode=0;
			
			try
			{
				url=new URL(eachlink);
				HttpURLConnection httpConn=(HttpURLConnection) url.openConnection();
				statuscode=httpConn.getResponseCode();
				
				
				if(statuscode>=400)
				{
					link.add(eachlink+"--->"+statuscode);
					System.out.println(eachlink+"--->"+statuscode);
				}
			}
			
			
				catch (Exception e)
			{
					link.add(eachlink+"--->"+statuscode);
					
				}
			
				
				
				
			}
		
			
		}

}




