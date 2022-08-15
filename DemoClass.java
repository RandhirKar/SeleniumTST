package UI;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browerdriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		SearchBox.sendKeys("IPHONE");
		//WebElement SearchIcon = driver.findElement(By.className("nav-input nav-progressive-attribute"));
		//SearchIcon.click();
		//The above code is not working properly so i Use xpath for clicking on search button
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input")).click(); //clicking on Login Button
		//WebElement CheckBox = driver.findElement(By.name("s-ref-checkbox-Boat"));
		//CheckBox.click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[3]/span/div[1]/div/div/div[5]/ul/li[6]/span/a/div/label/i")).click(); //clicking on Login Button
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(4000);
		driver.quit();
		


	}

}
