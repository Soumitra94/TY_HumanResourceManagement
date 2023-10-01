package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.xdevapi.Statement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RMGYantraTest {

	public static void main(String[] args) throws Exception 
	{
		Connection con=null;
		String expdata="SDET52";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver:8084");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.id("usernmae")).sendKeys("rmgyantra");
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[.='Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Projects']")).click();
		driver.findElement(By.xpath("//span[.='Create Project']")).click();
		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys(expdata);
		driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("Soumitra");
		WebElement ele = driver.findElement(By.xpath("//select[@name='status']"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("Created");
		
		driver.findElement(By.xpath("//input[@value='Add Project']")).click();
		
//		step 1: register to the database
		Driver driver1= new Driver();
		DriverManager.registerDriver(driver1);
		
	 con = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects", "root@%", "root");
		java.sql.Statement state = con.createStatement();
		
		String query="select * from project";
		ResultSet result = state.executeQuery(query);
		boolean flag=false;
		while(result.next())
		{
			String actual=result.getString(4);
			if(actual.equalsIgnoreCase(expdata))
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Project is created");
		}
		else
		{
			System.out.println("Project is not created");
		}
//	catch (Exception e) 
//	{
//		
//	}
//	finally
	{
		con.close();
	}

	}

}
