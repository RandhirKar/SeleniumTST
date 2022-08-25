package TESTUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLogindata {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Browserdriver\\chromedriver.exe");
				  
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	    driver.manage().window().maximize();
		Thread.sleep(2000);
				  
		//Invalid Username
		WebElement EmailBox1 = driver.findElement(By.id("user-name"));
		EmailBox1.sendKeys("standard_users"); 
		Thread.sleep(2000);
		WebElement PaswordBox =driver.findElement(By.id("password"));
		PaswordBox.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement nextBttn = driver.findElement(By.id("login-button"));
		nextBttn.click();
		Thread.sleep(2000);
		EmailBox1.clear();
		PaswordBox.clear();
		Thread.sleep(2000);
				  
		//Valid username
		WebElement EmailBox= driver.findElement(By.id("user-name"));
		EmailBox.sendKeys("standard_user"); 
		//Invalid Password
				  
					
		Thread.sleep(2000);
		WebElement nextBttn1 = driver.findElement(By.id("login-button")); nextBttn1.click();
		Thread.sleep(2000);
					 
	}

}
