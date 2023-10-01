package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MobileColour 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[@role='button']")).click();
	    driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("iphone 14 plus");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    WebElement phone = driver.findElement(By.xpath("//div[.='APPLE iPhone 14 Plus (Blue, 128 GB)']"));
	    System.out.println(phone);
	    Thread.sleep(5000);
	    driver.close();
		
		
	}

}
