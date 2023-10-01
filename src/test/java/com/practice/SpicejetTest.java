package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpicejetTest {

	public static void main(String[] args) throws Exception 
	{
		ChromeOptions p = new ChromeOptions();
		p.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(p);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//		From
	    driver.findElement(By.xpath("//div[text()='From']")).click();
	    driver.findElement(By.xpath("//div[text()='Agartala']")).click();
//	    To
	    driver.findElement(By.xpath("//div[.='To']")).click();
	    driver.findElement(By.xpath("//div[.='Ahmedabad']")).click();
	    driver.findElement(By.xpath("(//div[.='19'])[3]")).click();
	    driver.findElement(By.xpath("//div[.='1 Adult']")).click();
	    
		

	}

}
