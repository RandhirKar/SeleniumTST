package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator.withTagName;


import io.github.bonigarcia.wdm.WebDriverManager;


public class Locators {
	
	public static String browser = "Chrome"; //External configuration - XLS, CSV
	public static WebDriver driver;

	public static void main(String[] args) {
		
		if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.get("https://www.saucedemo.com/");  //Lunching the URL
		WebElement password = driver.findElement(By.id("password"));
		driver.findElement(withTagName("Input").above(password)).sendKeys("Testing");-->
	}

}