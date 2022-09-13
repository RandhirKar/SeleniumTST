package TEST_1;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_Title_Text_Test2 {
	
	@Test
	public void titleTest() {
		
		SoftAssert softassert = new SoftAssert();
		String expectedtitle = "My Store";
		String expectedtext = "Search";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://automationpractice.com/");
		driver.manage().window().maximize();
		String actualtitle = driver.getTitle();
		System.out.println("Verifying title");
		softassert.assertEquals(actualtitle, expectedtitle, "Title Varification Failed");
		String actualtext = driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).getAttribute("submit_search");
		System.out.println("Verifying text");
		softassert.assertEquals(actualtext, expectedtext, "Text Verification Failed");
		System.out.println("Closing browser");
		driver.close();
		softassert.assertAll();
		
	}

}
