package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KayakTest {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kayak.co.in/");
//		driver.findElement(By.xpath("//input[@placeholder='To?']")).click();
//		driver.findElement(By.xpath("//span[text()='New Delhi, National Capital Territory of India, India']")).click();
//		driver.findElement(By.xpath("//span[text()='Mon 2/10']")).click();
		
		

	}

}
