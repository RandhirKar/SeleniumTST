package TESTUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	
	  public static void main(String[] args) {
	  
	  System.setProperty("webdriver.chrome.driver",
	  "C:\\Browserdriver\\chromedriver.exe");
	  
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  
	  WebElement EmailBox1 = driver.findElement(By.id("user-name"));
	  EmailBox1.sendKeys("standard_user"); WebElement PaswordBox =
	  driver.findElement(By.id("password")); PaswordBox.sendKeys("secret_sauce");
	  WebElement nextBttn = driver.findElement(By.id("login-button"));
	  nextBttn.click();
	 

	/*
	 * WebDriver driver;
	 * 
	 * private WebDriver driver1;
	 * 
	 * public LoginPage(WebDriver driver) { this.driver1 = driver;
	 * 
	 * }
	 * 
	 * @FindBy(how=How.NAME,using="user-name")
	 * 
	 * @CacheLookup WebElement user-name;
	 * 
	 * @FindBy(how = How.NAME, using = "password")
	 * 
	 * @CacheLookup WebElement password;
	 * 
	 * @FindBy(how = How.NAME, using = "login")
	 * 
	 * @CacheLookup WebElement login;
	 * 
	 * public void loginWordPress(String use, String Pass) { try {
	 * user-name.sendKeys(standard_user); Thread.sleep(2000);
	 * password.sendKeys(secret_sauce); login.click();
	 * 
	 * } catch (InterruptedException e) { e.printStackTrace(); } }
	 */

}
}
