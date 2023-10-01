package com.practice;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EMIcalculatorTest
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://emicalculator.net/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		JavascriptExecutor jss=(JavascriptExecutor) driver;
		for(int i=1; i<=10;i++)
		{
			jss.executeScript("window.scrollBy(0,135)");
		}
	}

}
