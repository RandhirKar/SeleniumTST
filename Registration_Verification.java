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

public class Registration_Verification {

	@Test(priority = 1, description = "This is a Registration Without Address Information")
	public void VerifyRegistration_WithoutAddInfo() throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		String expected_error = "There are 4 errors\r\n" + "\r\n" + "address1 is required.\r\n"
				+ "city is required.\r\n"
				+ "The Zip/Postal code you've entered is invalid. It must follow this format: 00000\r\n"
				+ "This country requires you to choose a State.";
		String expectedtext = "There are 4 errors\r\n" + "\r\n" + "address1 is required.\r\n" + "city is required.\r\n"
				+ "The Zip/Postal code you've entered is invalid. It must follow this format: 00000\r\n"
				+ "This country requires you to choose a State.";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://automationpractice.com/");
		driver.manage().window().maximize();
		String actual_error = "There are 4 errors\r\n" + "\r\n" + "address1 is required.\r\n" + "city is required.\r\n"
				+ "The Zip/Postal code you've entered is invalid. It must follow this format: 00000\r\n"
				+ "This country requires you to choose a State.";
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
		EmlBtn.sendKeys("randhir.karn@seva.com");
		Thread.sleep(1000);

		WebElement SubBtn = driver.findElement(By.id("SubmitCreate"));
		SubBtn.click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Entering Personal Information

		WebElement TtlBtn = driver.findElement(By.id("id_gender1"));
		TtlBtn.click();
		Thread.sleep(2000);

		WebElement FnmBtn = driver.findElement(By.id("customer_firstname"));
		FnmBtn.click();
		FnmBtn.sendKeys("Randhir");
		Thread.sleep(1000);

		WebElement LnmBtn = driver.findElement(By.id("customer_lastname"));
		LnmBtn.click();
		LnmBtn.sendKeys("Karn");
		Thread.sleep(1000);

		WebElement PwdBtn = driver.findElement(By.id("passwd"));
		PwdBtn.click();
		PwdBtn.sendKeys("automation");
		Thread.sleep(1000);

		WebElement YrBtn = driver.findElement(By.id("years"));
		YrBtn.click();
		Thread.sleep(1000);

		WebElement SltYr = driver.findElement(By.xpath("//*[@id=\"years\"]/option[27]"));
		SltYr.click();
		YrBtn.click();
		Thread.sleep(1000);
		WebElement MntBtn = driver.findElement(By.id("months"));
		MntBtn.click();
		WebElement SltMnt = driver.findElement(By.xpath("//*[@id=\"months\"]/option[8]"));
		SltMnt.click();
		MntBtn.click();
		Thread.sleep(1000);

		WebElement DtBtn = driver.findElement(By.id("days"));
		DtBtn.click();
		WebElement SltDt = driver.findElement(By.xpath("//*[@id=\"days\"]/option[24]"));
		SltDt.click();
		DtBtn.click();
		Thread.sleep(1000);

		WebElement ChkBtn = driver.findElement(By.id("optin"));
		ChkBtn.click();

		WebElement AdInfo = driver.findElement(By.id("other"));
		AdInfo.click();
		AdInfo.sendKeys("Change World with Automation");
		Thread.sleep(1000);

		WebElement PhNm = driver.findElement(By.id("phone_mobile"));
		PhNm.click();
		PhNm.sendKeys("123456789");
		Thread.sleep(1000);

		WebElement RefInfo = driver.findElement(By.id("alias"));
		RefInfo.click();
		RefInfo.sendKeys(" is Nepal");
		Thread.sleep(1000);

		WebElement RegBtn = driver.findElement(By.id("submitAccount"));
		RegBtn.click();
		String actual_text = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div")).getText();
		String expected_text = "There are 4 errors\r\n" + "\r\n" + "address1 is required.\r\n" + "city is required.\r\n"
				+ "The Zip/Postal code you've entered is invalid. It must follow this format: 00000\r\n"
				+ "This country requires you to choose a State.";

		// Type 1
		Assert.assertEquals(actual_text, expected_text);

		// Type 2
		Assert.assertTrue(actual_error
				.contains("There are 4 errors\r\n" + "\r\n" + "address1 is required.\r\n" + "city is required.\r\n"
						+ "The Zip/Postal code you've entered is invalid. It must follow this format: 00000\r\n"
						+ "This country requires you to choose a State."));

		System.out.println("Test Completed");

	}

	@Test(priority = 2, description = "This is a Registration Without Personal Information")
	public void VerifyRegistration_WithoutPersonalInfo() throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		String expected_error = "There are 3 errors\r\n" + "\r\n" + "lastname is required.\r\n"
				+ "firstname is required.\r\n" + "passwd is required.";
		String expectedtext = "There are 3 errors\r\n" + "\r\n" + "lastname is required.\r\n"
				+ "firstname is required.\r\n" + "passwd is required.";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://automationpractice.com/");
		driver.manage().window().maximize();
		String actual_error = "There are 3 errors\r\n" + "\r\n" + "lastname is required.\r\n"
				+ "firstname is required.\r\n" + "passwd is required.";
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
		EmlBtn.sendKeys("randhir.karn@seva.com");
		Thread.sleep(1000);

		WebElement SubBtn = driver.findElement(By.id("SubmitCreate"));
		SubBtn.click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Entering Address Information

		WebElement CmpNm = driver.findElement(By.id("company"));
		CmpNm.click();
		CmpNm.sendKeys("Seva Development");
		Thread.sleep(1000);

		WebElement Adres = driver.findElement(By.id("address1"));
		Adres.click();
		Adres.sendKeys("Lalitpur - 1");
		Thread.sleep(1000);

		WebElement CtNm = driver.findElement(By.id("city"));
		CtNm.click();
		CtNm.sendKeys("Kathmandu");
		Thread.sleep(1000);

		WebElement StNm = driver.findElement(By.id("id_state"));
		StNm.click();
		WebElement SltSt = driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[4]\r\n"));
		SltSt.click();
		Thread.sleep(1000);

		WebElement ZpCd = driver.findElement(By.id("postcode"));
		ZpCd.click();
		ZpCd.sendKeys("44600");
		js.executeScript("window.scrollBy(0,500)");

		WebElement CntNm = driver.findElement(By.id("id_country"));
		CntNm.click();
		WebElement SltCnt = driver.findElement(By.xpath("//*[@id=\"id_country\"]/option[2]"));
		SltCnt.click();
		Thread.sleep(1000);

		WebElement AdInfo = driver.findElement(By.id("other"));
		AdInfo.click();
		AdInfo.sendKeys("Change World with Automation");
		Thread.sleep(1000);

		WebElement PhNm = driver.findElement(By.id("phone_mobile"));
		PhNm.click();
		PhNm.sendKeys("123456789");
		Thread.sleep(1000);

		WebElement RefInfo = driver.findElement(By.id("alias"));
		RefInfo.click();
		RefInfo.sendKeys(" is Nepal");
		Thread.sleep(1000);

		WebElement RegBtn = driver.findElement(By.id("submitAccount"));
		RegBtn.click();

		String actual_text = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div")).getText();
		String expected_text = "There are 3 errors\r\n" + "\r\n" + "lastname is required.\r\n"
				+ "firstname is required.\r\n" + "passwd is required.";

		// Type 1
		Assert.assertEquals(actual_text, expected_text);

		// Type 2
		Assert.assertTrue(actual_error.contains("There are 3 errors\r\n" + "\r\n" + "lastname is required.\r\n"
				+ "firstname is required.\r\n" + "passwd is required."));

		System.out.println("Test Completed");

	}

}
