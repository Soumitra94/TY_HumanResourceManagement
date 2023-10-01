package HrAssistantModule;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditEmployeeTest 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Enter URL
		driver.get("http://rmgtestingserver/domain/HRM_System/");
		//Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Enter Username
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='HR Email']"));
		email.sendKeys("hrassistant@gmail.com");
		//Enter Password
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='HR Password']"));
		password.sendKeys("hrassistant@123");
		//Click on Dropdown
		WebElement dd = driver.findElement(By.xpath("//select[@name='hr_type']"));
		Select s1=new Select(dd);
		//click on HR Assistant
		s1.selectByVisibleText("→ HR Assistant");
		//Click on submit button
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();
		Thread.sleep(2000);
		//Handle alert confirmation pop-up
		Alert a = driver.switchTo().alert();
		a.accept();
		//click on Employee DD
		driver.findElement(By.xpath("//i[@class='nav-icon fas fa-user']")).click();
		//click on Add Employee link
		driver.findElement(By.xpath("//p[.='Add Employee']")).click();
		//
		
	}

}
