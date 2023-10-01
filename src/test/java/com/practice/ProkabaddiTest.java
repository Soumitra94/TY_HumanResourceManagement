package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProkabaddiTest {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.prokabaddi.com/standings");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		WebElement jpp = driver.findElement(By.xpath("//p[text()='Jaipur Pink Panthers']"));
//		System.out.println(jpp.getText());
		WebElement scorediff = driver.findElement(By.xpath("//p[text()='174']"));
//		System.out.println(scorediff.getText());
		System.out.println(jpp.getText()+" "+scorediff.getText()+" ");

	}

}
