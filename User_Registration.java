package Dresses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class User_Registration {

	@Test(priority = 1, description = "This is the Search Functionality Test")
	public void Verify_ProductSearch() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String URL = "http://automationpractice.com/index.php";

		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();

		// Click on Sign in
		driver.findElement(By.linkText("Sign in")).click();

		// Enter email address
		driver.findElement(By.cssSelector("[name='email_create']")).sendKeys("test124@gmil.com");

		// Click on "Create an account"
		driver.findElement(By.xpath("//button[@name=\"SubmitCreate\"]")).click();

		// Select Title
		driver.findElement(By.xpath("//input[@id=\"id_gender1\"]")).click();
		driver.findElement(By.name("customer_firstname")).sendKeys("Randhir");
		driver.findElement(By.name("customer_lastname")).sendKeys("Karn");
		driver.findElement(By.id("passwd")).sendKeys("Seva@123");

		// Enter your address
		driver.findElement(By.id("firstname")).sendKeys("Randhir");
		driver.findElement(By.id("lastname")).sendKeys("Karn");
		driver.findElement(By.id("company")).sendKeys("Vsoft");
		driver.findElement(By.id("address1")).sendKeys("Janakpur-8");
		driver.findElement(By.id("city")).sendKeys("Janakpur");

		// Select State
		WebElement statedropdown = driver.findElement(By.name("id_state"));
		Select oSelect = new Select(statedropdown);
		oSelect.selectByValue("4");

		driver.findElement(By.name("postcode")).sendKeys("51838");

		// Select Country
		WebElement countrydropDown = driver.findElement(By.name("id_country"));
		Select oSelectC = new Select(countrydropDown);
		oSelectC.selectByVisibleText("United States");
		
		//Info
		WebElement AdInfo = driver.findElement(By.id("other"));
		AdInfo.click();
		AdInfo.sendKeys("Change World with Automation");

		// Enter Mobile Number
		driver.findElement(By.id("phone_mobile")).sendKeys("234567890");
		driver.findElement(By.xpath("//input[@name=\"alias\"]")).clear();
		driver.findElement(By.xpath("//input[@name=\"alias\"]")).sendKeys("Office");
		driver.findElement(By.name("submitAccount")).click();
		String userText = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).getText();

		// Validate that user has created
		if (userText.contains("Vsoft")) {
			System.out.println("User Verified,Test case Passed");
		} else {
			System.out.println("User Verification Failed,Test case Failed");
		}
	}

}
