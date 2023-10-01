package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromCmdTest
{
	@Test
	public void cmdTest()
	{
		String BROWSER=System.getProperty("browser");
		String URL=System.getProperty("url");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
//		launch the browser:
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@placeholder='HR Email']")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@placeholder='HR Password']")).sendKeys(PASSWORD);
		 WebElement dd = driver.findElement(By.xpath("//select[@name='hr_type']"));
		 dd.click();
		Select s1=new Select(dd);
		s1.selectByVisibleText("→ HR Head");
		driver.findElement(By.xpath("//button[.='Sign In']")).click();
		
	}

}
