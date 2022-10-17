package Dresses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Add_to_Cart_1 {

	@Test(priority = 1, description = "This is a Add to Cart Test")
	public void VerifyAddtoCart_Functionality() throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		String expected_error = "Add to Cart Unsuccessful";
		String expectedtext = "Product successfully added to your shopping cart";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://automationpractice.com/");
		driver.manage().window().maximize();
		String actual_error = "Add to Cart Unsuccessful";
		System.out.println("Error Msg verified");
		System.out.println("Result Actual - " + actual_error + " Expected - " + expected_error);
		softassert.assertEquals(actual_error, expected_error, "Error Msg Verification");
		// Login

		WebElement SignBtn = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		SignBtn.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)");

		WebElement EmlBtn = driver.findElement(By.id("email"));
		EmlBtn.click();
		Thread.sleep(1000);
		EmlBtn.sendKeys("randhirall20@gmail.com");
		Thread.sleep(1000);

		WebElement PwdBtn = driver.findElement(By.id("passwd"));
		PwdBtn.click();
		PwdBtn.sendKeys("automation");
		Thread.sleep(1000);

		WebElement SignBttn = driver.findElement(By.id("SubmitLogin"));
		SignBttn.click();
		Thread.sleep(1000);

		WebElement LdBtn = driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img"));
		LdBtn.click();
		Thread.sleep(2000);

		WebElement DrssBtn = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
		DrssBtn.click();
		Thread.sleep(2000);

		WebElement CslDrss = driver.findElement(By.xpath("//*[@id=\"subcategories\"]/ul/li[2]/h5/a"));
		CslDrss.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,700)");
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));

		//Creating object of an Actions class
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();	
		WebElement AdCrt = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));
		AdCrt.click();
		String actual_text = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2/text()")).getText();
		String expected_text = "Product successfully added to your shopping cart";

		// Type 1
		Assert.assertEquals(actual_text, expected_text);

		// Type 2
		Assert.assertTrue(actual_error.contains("Product successfully added to your shopping cart"));

		System.out.println("Test Completed");
	}
	
	
}

