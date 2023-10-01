package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class KSRTC_CalenderPopup {

	public static void main(String[] args) 
	{
		int date=3;
		//launch the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//launch the application
		driver.get("https://www.ksrtc.in/");
		
		//wait for page load
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.findElement(By.id("txtJourneyDate")).click();
		
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/descendant::a[text()='"+date+"']")).click();
		
		
		

	}

}
