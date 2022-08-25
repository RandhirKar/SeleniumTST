package TESTUI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddtoCart {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Browserdriver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement EmailBox1 = driver.findElement(By.id("user-name"));
		EmailBox1.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement PaswordBox = driver.findElement(By.id("password"));
		PaswordBox.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement nextBttn = driver.findElement(By.id("login-button"));
		nextBttn.click();
		Thread.sleep(2000);
		
		WebElement scrollBtn = driver.findElement(By.className("product_sort_container"));
		scrollBtn.click();
		Thread.sleep(2000);
		WebElement sortBtn = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[2]"));
		sortBtn.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(2000);
		WebElement AddcartBtn = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
		AddcartBtn.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-4000)");
		Thread.sleep(2000);
		WebElement AddcartBtn1 = driver.findElement(By.name("add-to-cart-test.allthethings()-t-shirt-(red)"));
		AddcartBtn1.click();
		Thread.sleep(2000);
		WebElement cartBtn = driver.findElement(By.className("shopping_cart_link"));
		cartBtn.click();
		Thread.sleep(2000);
		WebElement ChkBtn = driver.findElement(By.name("checkout"));
		ChkBtn.click();
		Thread.sleep(2000);
		WebElement Fname = driver.findElement(By.id("first-name"));
		Fname.sendKeys("Randhir");
		Thread.sleep(2000);
		WebElement Lname = driver.findElement(By.id("last-name"));
		Lname.sendKeys("Karn");
		Thread.sleep(2000);
		WebElement Zipcod = driver.findElement(By.id("postal-code"));
		Zipcod.sendKeys("12345");
		Thread.sleep(2000);
		WebElement contiBtn = driver.findElement(By.id("continue"));
		contiBtn.click();
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(2000);
		WebElement finBtn = driver.findElement(By.id("finish"));
		finBtn.click();
		Thread.sleep(2000);
		WebElement BkBtn = driver.findElement(By.id("back-to-products"));
		BkBtn.click();
		
		
		
		
		
		
		
		

	}

}
