package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTST {
	
	public static String browser = "Chrome"; //External configuration - XLS, CSV
	public static WebDriver driver;

	public static void main(String[] args) {
		
		if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		WebDriverManager.chromedriver().setup(); //Setup the Chrome Driver to lunch chrome browser
		ChromeDriver driver = new ChromeDriver(); // Created the object "Driver" for chrome Driver
		driver.get("https://www.saucedemo.com/");  //Lunching the URL
		driver.findElement(By.id("user-name")).sendKeys("standard_user"); // Providing the User Name
		driver.findElement(By.id("password")).sendKeys("secret_sauce");      //Providing the Password
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click(); //clicking on Login Button
		driver.close(); // Closing the browser
		
	}

}
