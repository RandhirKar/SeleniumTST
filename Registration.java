package TSTQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Browserdriver\\chromedriver.exe");
				  
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement MenuBtn = driver.findElement(By.id("menu-toggle"));
		MenuBtn.click();
		Thread.sleep(2000);
		
		WebElement NmBtn = driver.findElement (By.linkText("Login"));
		NmBtn.click();	
		Thread.sleep(2000);
		WebElement UserBtn = driver.findElement(By.id("txt-username"));
		UserBtn.sendKeys("John Doe");
		Thread.sleep(2000);
		WebElement PassBtn = driver.findElement(By.id("txt-password"));
		PassBtn.sendKeys("ThisIsNotAPassword");
		Thread.sleep(2000);
		WebElement LogBtn = driver.findElement(By.id("btn-login"));
		LogBtn.click();
		
		

	}

}
