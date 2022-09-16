package TEST_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemoTest2 {
	
	@Test(dataProvider="create")
	public void test(String username, String password) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement EmailBox1 = driver.findElement(By.id("user-name"));
		EmailBox1.sendKeys(username); 
		WebElement PaswordBox = driver.findElement(By.id("password")); 
		PaswordBox.sendKeys(password);
		WebElement nextBttn = driver.findElement(By.id("login-button"));
		nextBttn.click();

	}
	
	
	@DataProvider(name = "create")
	public Object[][] dataSet1() {
		
		return new Object[][]{
			
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"}
		};	
	} 
	
	
	}


