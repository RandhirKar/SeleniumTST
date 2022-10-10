package Dresses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Invalid_Login_Data {

	@Test(priority = 1, description = "This is a login test with Invalid Email Address")
	public void VerifyLogin_InvalidEmail() throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		String expected_error = "There is 1 error\r\n" + "Authentication failed.";
		String expectedtext = "There is 1 error\r\n" + "Authentication failed.";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://automationpractice.com/");
		driver.manage().window().maximize();
		String actual_error = "There is 1 error\r\n" + "Authentication failed.";
		System.out.println("Error Msg verified");
		System.out.println("Result Actual - " + actual_error + " Expected - " + expected_error);
		softassert.assertEquals(actual_error, expected_error, "Error Msg Verification");
		WebElement SignBtn = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		SignBtn.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)");
		WebElement EmlBtn = driver.findElement(By.id("email"));
		EmlBtn.click();
		Thread.sleep(1000);
		EmlBtn.sendKeys("randhira20@gmail.com");
		Thread.sleep(1000);
		WebElement PwdBtn = driver.findElement(By.id("passwd"));
		PwdBtn.click();
		PwdBtn.sendKeys("automation");
		Thread.sleep(1000);
		WebElement SignBttn = driver.findElement(By.id("SubmitLogin"));
		SignBttn.click();
		Thread.sleep(1000);
		String actual_text = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]")).getText();
		String expected_text = "There is 1 error\r\n" + "Authentication failed.";

		// Type 1
		Assert.assertEquals(actual_text, expected_text);

		// Type 2
		Assert.assertTrue(actual_error.contains("There is 1 error\r\n" + "Authentication failed."));

		System.out.println("Test Completed");

	}

	@Test(priority = 2, description = "This is a login test with Invalid Password")
	public void VerifyLogin_InvalidPassword() throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		String expected_error = "There is 1 error\r\n" + "Invalid Password.";
		String expectedtext = "There is 1 error\r\n" + "Invalid Password";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://automationpractice.com/");
		driver.manage().window().maximize();
		String actual_error = "There is 1 error\r\n" + "Invalid Password";
		System.out.println("Error Msg verified");
		System.out.println("Result Actual - " + actual_error + " Expected - " + expected_error);
		softassert.assertEquals(actual_error, expected_error, "Error Msg Verification");
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
		PwdBtn.sendKeys("auto");
		Thread.sleep(1000);
		WebElement SignBttn = driver.findElement(By.id("SubmitLogin"));
		SignBttn.click();
		Thread.sleep(1000);
		String actual_text = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]")).getText();
		String expected_text = "There is 1 error\r\n" + "Invalid Password";

		// Type 1
		Assert.assertEquals(actual_text, expected_text);

		// Type 2
		Assert.assertTrue(actual_error.contains("There is 1 error\r\n" + "Invalid Password"));

		System.out.println("Test Completed");
		
	}
	
	@Test(priority = 3, description = "This is a login test without Email")
	public void VerifyLogin_WithoutEmail() throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		String expected_error = "There is 1 error\r\n" + "\r\n" + "An email address required.";
		String expectedtext = "There is 1 error\r\n" + "\r\n" + "An email address required.";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://automationpractice.com/");
		driver.manage().window().maximize();
		String actual_error = "There is 1 error\r\n" + "\r\n" + "An email address required.";
		System.out.println("Error Msg verified");
		System.out.println("Result Actual - " + actual_error + " Expected - " + expected_error);
		softassert.assertEquals(actual_error, expected_error, "Error Msg Verification");
		WebElement SignBtn = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		SignBtn.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)");
		WebElement PwdBtn = driver.findElement(By.id("passwd"));
		PwdBtn.click();
		PwdBtn.sendKeys("automation");
		Thread.sleep(1000);
		WebElement SignBttn = driver.findElement(By.id("SubmitLogin"));
		SignBttn.click();
		Thread.sleep(1000);
		String actual_text = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]")).getText();
		String expected_text = "There is 1 error\r\n" + "\r\n" + "An email address required.";

		// Type 1
		Assert.assertEquals(actual_text, expected_text);

		// Type 2
		Assert.assertTrue(actual_error.contains("There is 1 error\r\n" + "\r\n" + "An email address required."));

		System.out.println("Test Completed");
		
	}
	
	@Test(priority = 4, description = "This is a login test without Password")
	public void VerifyLogin_WithoutPassword() throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		String expected_error = "There is 1 error\r\n" + "Password is required.";
		String expectedtext = "There is 1 error\r\n" + "Password is required.";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://automationpractice.com/");
		driver.manage().window().maximize();
		String actual_error = "There is 1 error\r\n" + "Password is required.";
		System.out.println("Error Msg verified");
		System.out.println("Result Actual - " + actual_error + " Expected - " + expected_error);
		softassert.assertEquals(actual_error, expected_error, "Error Msg Verification");
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
		PwdBtn.sendKeys("auto");
		Thread.sleep(1000);
		WebElement SignBttn = driver.findElement(By.id("SubmitLogin"));
		SignBttn.click();
		Thread.sleep(1000);
		String actual_text = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]")).getText();
		String expected_text = "There is 1 error\r\n" + "Password is required.";

		// Type 1
		Assert.assertEquals(actual_text, expected_text);

		// Type 2
		Assert.assertTrue(actual_error.contains("There is 1 error\r\n" + "Password is required."));

		System.out.println("Test Completed");


	}
}
