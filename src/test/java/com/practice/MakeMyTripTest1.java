package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTripTest1 
{
	public static void main(String[] args) throws Exception {
		
	
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	Actions act=new Actions(driver);
    act.doubleClick().perform();
	Thread.sleep(2000);
	act.moveByOffset(0, 80).click().perform();
	Thread.sleep(2000);
	
	
//	driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("Bangalore");
	
	
	
	}
}
