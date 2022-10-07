package Dresses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Common.CommonDataSetup;

public class Verify_Login extends CommonDataSetup {

	@BeforeTest
	public void loginToApplication() {
		System.out.println("Login to application");
	}

	@AfterTest
	public void logoutFromApplication() {
		System.out.println("Logout from Application");
	}

	@BeforeMethod
	public void connectToDB() {

		System.out.println("DB Connected");
	}

	@AfterMethod
	public void disconnectFromDB() {

		System.out.println("Disconnect DB Connected");
	}

	@Test(priority = 1, description = "This is a login test", groups = "Reggression")
	public void login() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://automationpractice.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);

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
		driver.close();
		System.out.println("Login is successfull");
	}

	@Test(priority = 2, description = "This is a logout test")
	public void logoutTest() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://automationpractice.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);

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

		WebElement Img = driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img"));
		Img.click();

		WebElement LoutBtn = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));
		LoutBtn.click();
		Thread.sleep(1000);
		driver.close();
		System.out.println("Logout is successfull");

	}

}
