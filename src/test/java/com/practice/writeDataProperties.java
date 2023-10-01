package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class writeDataProperties 
{
	public static void main(String[] args) throws Exception 
	{
		//writing data
		Properties prop=new Properties();
		prop.setProperty("username", "hrhead@gmail.com");
		prop.setProperty("password", "hrhead@123");
		prop.setProperty("url", "http://rmgtestingserver/domain/HRM_System/");
		prop.setProperty("browser", "chrome");
		
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\CommonData1.properties");
		prop.store(fos, "write data");
		fos.close();
		
		//reading data
		FileInputStream fis=new FileInputStream(".\\\\src\\\\test\\\\resources\\\\CommonData1.properties");
		prop.load(fis);
		
		String USERNAME=prop.getProperty("username");
		String PASSWORD=prop.getProperty("password");
		String URL=prop.getProperty("url");
		String browser=prop.getProperty("browser");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver/domain/HRM_System/");
		driver.findElement(By.name("hr_email")).sendKeys(USERNAME);
		driver.findElement(By.name("hr_password")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//option[text()='← Select Type →']")).click();
		driver.findElement(By.xpath("//option[text()='→ HR Head']")).click();
		driver.findElement(By.xpath("//button[.='Sign In']")).click();
		
		
	}

}
