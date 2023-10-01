package com.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JioMartTest 
{
	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jiomart.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[.='Groceries']")).click();
		driver.findElement(By.xpath("//img[@class='collapse-toggle']")).click();
		List<WebElement> data = driver.findElements(By.xpath("//div[@id='category-219']"));
		System.out.println(data.get(0));
		
			}

}
