package HrAssistantModule;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SmokeTC 
{
	public static void main(String[] args) throws Exception 
	{
		
    WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://rmgtestingserver/domain/HRM_System/");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	WebElement email = driver.findElement(By.xpath("//input[@placeholder='HR Email']"));
	email.sendKeys("hrassistant@gmail.com");
	WebElement password = driver.findElement(By.xpath("//input[@placeholder='HR Password']"));
	password.sendKeys("hrassistant@123");
	WebElement dd = driver.findElement(By.xpath("//select[@name='hr_type']"));
	Select s1=new Select(dd);
	s1.selectByVisibleText("→ HR Assistant");
	WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
	button.click();
	Thread.sleep(2000);
	Alert a = driver.switchTo().alert();
	a.accept();
//	//click on user lookup image
	driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
    //click on Log Out button
	driver.findElement(By.xpath("//i[@class='fa fa-power-off']")).click();

}
}
