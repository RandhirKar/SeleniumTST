package TSTQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {

		public static void main(String[] args) throws InterruptedException {
			
			
			System.setProperty("webdriver.chrome.driver","C:\\Browserdriver\\chromedriver.exe");
			  
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://katalon-demo-cura.herokuapp.com/");
			driver.manage().window().maximize();
			JavascriptExecutor js = (JavascriptExecutor)driver;
			Thread.sleep(2000);
			
			// Login 
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
			Thread.sleep(2000);
			
			
			WebElement MnBtn = driver.findElement(By.id("menu-toggle"));
			MnBtn.click();
			Thread.sleep(2000);
			
			//History
			
			WebElement HisBtn = driver.findElement(By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[3]/a"));
			HisBtn.click();
			Thread.sleep(2000);
			
			WebElement HmBtn = driver.findElement(By.xpath("//*[@id=\"history\"]/div/div[3]/p/a"));
			HmBtn.click();
			Thread.sleep(2000);
			
			WebElement MnBtn1 = driver.findElement(By.id("menu-toggle"));
			MnBtn1.click();
			Thread.sleep(2000);
			
			WebElement PrfBtn = driver.findElement(By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[4]/a"));
			PrfBtn.click();
			Thread.sleep(2000);
			
			WebElement LoutBtn = driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div/div/p[2]/a"));
			LoutBtn.click();
			
			
			
			
	}		
	
}
