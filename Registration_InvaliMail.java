package Dresses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration_InvaliMail {
	
	@Test(priority = 1, description = "This is a Registration Without Address Information")
	public void VerifyRegistration_WithoutInvalidEmail() throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		String expected_error = "An account using this email address has already been registered. Please enter a valid password or request a new one.";
		String expectedtext = "An account using this email address has already been registered. Please enter a valid password or request a new one.";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://automationpractice.com/");
		driver.manage().window().maximize();
		String actual_error = "An account using this email address has already been registered. Please enter a valid password or request a new one.";
		System.out.println("Error Msg verified");
		System.out.println("Result Actual - " + actual_error + " Expected - " + expected_error);
		softassert.assertEquals(actual_error, expected_error, "Error Msg Verification");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);

		// Creating Account

		WebElement SignBtn = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		SignBtn.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)");

		WebElement EmlBtn = driver.findElement(By.id("email_create"));
		EmlBtn.click();
		Thread.sleep(1000);
		EmlBtn.sendKeys("randhirall20@gmail.com");
		Thread.sleep(1000);

		WebElement SubBtn = driver.findElement(By.id("SubmitCreate"));
		SubBtn.click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String actual_text = driver.findElement(By.xpath("//*[@id=\"create_account_error\"]")).getText();
		String expected_text = "An account using this email address has already been registered. Please enter a valid password or request a new one.";

		// Type 1
		Assert.assertEquals(actual_text, expected_text);

		// Type 2
		Assert.assertTrue(actual_error.contains("An account using this email address has already been registered. Please enter a valid password or request a new one."));

		System.out.println("Test Completed");
		
}
}
