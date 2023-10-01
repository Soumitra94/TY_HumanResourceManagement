package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MockTest {

	public static void main(String[] args) 
	{
		String MonthAndYear="March 2024";
		int date=15;
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[.='Departure']")).click();
		
		String actual="//div[.='"+MonthAndYear+"']/ancestor::div[//div[@class='DayPicker-Months']/descendant::p[.='"+date+"']";
		String nextArrow="//span[@class='DayPicker-NavButton DayPicker-NavButton--next']";
		
				for(;;)
				{
					try
					{
					driver.findElement(By.xpath(actual)).click();
					break;
				}
		catch (Exception e)
		{
     driver.findElement(By.xpath(nextArrow)).click();
		}
					
	}
	
				
				
				
		
		
		
	
	}
	}


