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

public class Forget_Password {

	@Test(priority = 1, description = "This is a login test with Invalid Password")
	public void VerifyLogin_InvalidPassword() throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		String expected_error = "There is 1 error\r\n" + "Invalid Password.";
		String expectedtext = "There is 1 error\r\n" + "Invalid Password.";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://automationpractice.com/");
		driver.manage().window().maximize();
		String actual_error = "There is 1 error\r\n" + "Invalid Password.";
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
		String expected_text = "There is 1 error\r\n" + "Invalid Password.";

		// Type 1
		Assert.assertEquals(actual_text, expected_text);

		// Type 2
		Assert.assertTrue(actual_error.contains("There is 1 error\r\n" + "Invalid Password."));

		System.out.println("Test Completed");
	}

	@Test(priority = 2, description = "This is the forget password test")
	public void Verify_Forgot_Password() throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		String expected_error = "There is 1 error\r\n" + "There is no account registered for this email address.";
		String expectedtext = "There is 1 error\r\n" + "There is no account registered for this email address.";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://automationpractice.com/");
		driver.manage().window().maximize();
		String actual_error = "There is 1 error\r\n" + "There is no account registered for this email address.";
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

		WebElement FgotBtn = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/p[1]/a"));
		FgotBtn.click();
		Thread.sleep(1000);
		WebElement EmlBtn1 = driver.findElement(By.id("email"));
		EmlBtn1.click();
		Thread.sleep(1000);
		EmlBtn1.sendKeys("randhirall@gmail.com");
		Thread.sleep(1000);
		WebElement RtvBtn = driver.findElement(By.xpath("//*[@id=\"form_forgotpassword\"]/fieldset/p/button"));
		RtvBtn.click();
		String actual_text = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div")).getText();
		String expected_text = "There is 1 error\r\n" + "There is no account registered for this email address.";

		// Type 1
		Assert.assertEquals(actual_text, expected_text);

		// Type 2
		Assert.assertTrue(actual_error.contains("There is 1 error\r\n" + "There is no account registered for this email address."));

		System.out.println("Test Completed");
	}
	
	@Test(priority = 3, description = "This is the forget password test")
	public void Verify_Forgot_Password_InvalidEmail() throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		String expected_error = "There is 1 error\r\n" + "There is no account registered for this email address.";
		String expectedtext = "There is 1 error\r\n" + "There is no account registered for this email address.";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://automationpractice.com/");
		driver.manage().window().maximize();
		String actual_error = "There is 1 error\r\n" + "There is no account registered for this email address.";
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

		WebElement FgotBtn = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/p[1]/a"));
		FgotBtn.click();
		Thread.sleep(1000);
		WebElement EmlBtn1 = driver.findElement(By.id("email"));
		EmlBtn1.click();
		Thread.sleep(1000);
		EmlBtn1.sendKeys("randhirall@gmail.com");
		Thread.sleep(1000);
		WebElement RtvBtn = driver.findElement(By.xpath("//*[@id=\"form_forgotpassword\"]/fieldset/p/button"));
		RtvBtn.click();
		String actual_text = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div")).getText();
		String expected_text = "There is 1 error\r\n" + "There is no account registered for this email address.";

		// Type 1
		Assert.assertEquals(actual_text, expected_text);

		// Type 2
		Assert.assertTrue(actual_error.contains("There is 1 error\r\n" + "There is no account registered for this email address."));

		System.out.println("Test Completed");
	}
	
	@Test(priority = 2, description = "This is the forget password test")
	public void Verify_Forgot_Password_Setup() throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		String expected_error = "A confirmation email has been sent to your address: randhirall20@gmail.com";
		String expectedtext = "A confirmation email has been sent to your address: randhirall20@gmail.com";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://automationpractice.com/");
		driver.manage().window().maximize();
		String actual_error = "A confirmation email has been sent to your address: randhirall20@gmail.com";
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
		WebElement FgotBtn = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/p[1]/a"));
		FgotBtn.click();
		Thread.sleep(1000);
		WebElement EmlBtn1 = driver.findElement(By.id("email"));
		EmlBtn1.click();
		Thread.sleep(1000);
		EmlBtn1.sendKeys("randhirall20@gmail.com");
		Thread.sleep(1000);
		WebElement RtvBtn = driver.findElement(By.xpath("//*[@id=\"form_forgotpassword\"]/fieldset/p/button"));
		RtvBtn.click();
		String actual_text = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p")).getText();
		String expected_text = "A confirmation email has been sent to your address: randhirall20@gmail.com";

		// Type 1
		Assert.assertEquals(actual_text, expected_text);

		// Type 2
		Assert.assertTrue(actual_error.contains("A confirmation email has been sent to your address: randhirall20@gmail.com"));

		System.out.println("Test Completed");
	}
}
