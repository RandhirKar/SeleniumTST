package TESTUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Browserdriver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement EmailBox1 = driver.findElement(By.id("user-name"));
		EmailBox1.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement PaswordBox = driver.findElement(By.id("password"));
		PaswordBox.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement nextBtn = driver.findElement(By.id("login-button"));
		nextBtn.click();
		Thread.sleep(2000);
		WebElement MenuBtn = driver.findElement(By.id("react-burger-menu-btn"));
		MenuBtn.click();
		Thread.sleep(2000);
		WebElement LogoutBtn = driver.findElement(By.id("logout_sidebar_link"));
		LogoutBtn.click();
		
		
		
	}

}
