package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OlympicsTest {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		WebElement arg = driver.findElement(By.xpath("//span[text()='Argentina']"));
		System.out.println(arg.getText());
		WebElement gold = driver.findElement(By.xpath(("//div[@data-medal-id='gold-medals-row-1']")));
		System.out.println(gold.getText());
		WebElement silver=driver.findElement(By.xpath("//div[@data-medal-id='silver-medals-row-1']"));
		System.out.println(silver.getText());
		WebElement bronze=driver.findElement(By.xpath("//div[@data-medal-id='bronze-medals-row-1']"));
		System.out.println(bronze.getText());
		

	}

}
