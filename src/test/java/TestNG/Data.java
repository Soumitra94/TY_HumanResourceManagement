package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data {

	@Test
	public void store() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	}
}
