package TSTQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Appointment {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Browserdriver\\chromedriver.exe");
		  
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		
		
		// Login 
		WebElement MenuBtn = driver.findElement(By.id("menu-toggle"));
		MenuBtn.click();
		Thread.sleep(2000);
		
		WebElement NmBtn = driver.findElement (By.linkText("Login"));
		NmBtn.click();	
		Thread.sleep(2000);
		WebElement UserBtn = driver.findElement(By.id("txt-username"));
		UserBtn.sendKeys("John Doe");
		Thread.sleep(2000);
		WebElement PassBtn = driver.findElement(By.id("txt-password"));
		PassBtn.sendKeys("ThisIsNotAPassword");
		Thread.sleep(2000);
		WebElement LogBtn = driver.findElement(By.id("btn-login"));
		LogBtn.click();
		Thread.sleep(2000);
		
		//Appointment
		
		WebElement FaciBtn = driver.findElement(By.name("facility"));
		FaciBtn.click();
		Thread.sleep(2000);
		
		WebElement SltBtn = driver.findElement(By.xpath("//*[@id=\"combo_facility\"]/option[3]"));
		SltBtn.click();
		

		WebElement ComboBtn = driver.findElement(By.id("combo_facility"));
		ComboBtn.click();
		Thread.sleep(2000);
		
		WebElement ChkBtn = driver.findElement(By.id("chk_hospotal_readmission"));
		ChkBtn.click();
		
		Thread.sleep(2000);
		
		WebElement MedBtn = driver.findElement(By.id("radio_program_medicaid"));
		MedBtn.click();
		
		Thread.sleep(2000);
		WebElement CldBtn = driver.findElement(By.id("txt_visit_date"));
		CldBtn.click();
		
		
		/*
		 * Thread.sleep(2000); WebElement DtBtn =
		 * driver.findElement(By.className("datepicker-switch")); DtBtn.click();
		 * Thread.sleep(5000);
		 */
		/*
		 * WebElement yearClick = driver.findElement(By.className("datepicker-switch"));
		 * yearClick.click(); Thread.sleep(2000);
		 */ 
		
		WebElement DayBtn = driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[5]/td[2]"));
		DayBtn.click();
		Thread.sleep(2000);
		
		WebElement CmtBtn = driver.findElement(By.id("txt_comment"));
		CmtBtn.click();
		CmtBtn.sendKeys("Hi, This is Randhir Karn. I have a appoinment for regular Checkup");
		
		Thread.sleep(2000);
		
		WebElement AppBtn = driver.findElement(By.id("btn-book-appointment"));
		AppBtn.click();
		Thread.sleep(2000);
		
		WebElement HmBtn = driver.findElement(By.xpath("//*[@id=\"summary\"]/div/div/div[7]/p/a"));
		HmBtn.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		
		
		//Appointment with invalid
		
		WebElement FaciBtn1 = driver.findElement(By.name("facility"));
		FaciBtn1.click();
		Thread.sleep(2000);
				
		WebElement SltBtn1 = driver.findElement(By.xpath("//*[@id=\"combo_facility\"]/option[2]"));
		SltBtn1.click();
				

		WebElement ComboBtn1 = driver.findElement(By.id("combo_facility"));
		ComboBtn1.click();
		Thread.sleep(2000);
				
		WebElement ChkBtn1 = driver.findElement(By.id("chk_hospotal_readmission"));
		ChkBtn1.click();
				
		Thread.sleep(2000);
				
		WebElement MedBtn1 = driver.findElement(By.id("radio_program_medicaid"));
		MedBtn1.click();
				
		Thread.sleep(2000);
		WebElement CldBtn1 = driver.findElement(By.id("txt_visit_date"));
		CldBtn1.click();
						
			
		WebElement DayBtn1 = driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[5]/td[1]"));
		DayBtn1.click();
		Thread.sleep(2000);
				
		WebElement CmtBtn1 = driver.findElement(By.id("txt_comment"));
		CmtBtn1.click();
		CmtBtn1.sendKeys("Hi, This is Randhir Karn. I have a appoinment for regular Checkup");
				
		Thread.sleep(2000);
				
		WebElement AppBtn1 = driver.findElement(By.id("btn-book-appointment"));
		AppBtn1.click();
		Thread.sleep(2000);
				
		WebElement HmBtn1 = driver.findElement(By.xpath("//*[@id=\"summary\"]/div/div/div[7]/p/a"));
		HmBtn1.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
				
	

		//Appointment with Health care None
		
		WebElement FaciBtn2 = driver.findElement(By.name("facility"));
		FaciBtn2.click();
		Thread.sleep(2000);
				
		WebElement SltBtn2 = driver.findElement(By.xpath("//*[@id=\"combo_facility\"]/option[2]"));
		SltBtn2.click();
				

		WebElement ComboBtn2 = driver.findElement(By.id("combo_facility"));
		ComboBtn2.click();
		Thread.sleep(2000);
				
		WebElement ChkBtn2 = driver.findElement(By.id("chk_hospotal_readmission"));
		ChkBtn2.click();
				
		Thread.sleep(2000);
				
		WebElement MedBtn2 = driver.findElement(By.id("radio_program_none"));
		MedBtn2.click();
				
		Thread.sleep(2000);
		WebElement CldBtn2 = driver.findElement(By.id("txt_visit_date"));
		CldBtn2.click();
						
			
		WebElement DayBtn2 = driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[5]/td[1]"));
		DayBtn2.click();
		Thread.sleep(2000);
				
		WebElement CmtBtn2 = driver.findElement(By.id("txt_comment"));
		CmtBtn2.click();
		CmtBtn2.sendKeys("Hi, This is Randhir Karn. I have a appoinment for regular Checkup");
				
		Thread.sleep(2000);
				
		WebElement AppBtn2 = driver.findElement(By.id("btn-book-appointment"));
		AppBtn2.click();
		Thread.sleep(2000);
				
		WebElement HmBtn2 = driver.findElement(By.xpath("//*[@id=\"summary\"]/div/div/div[7]/p/a"));
		HmBtn2.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
				
		
		//Appointment without hospital read mission 
		
		WebElement FaciBtn3 = driver.findElement(By.name("facility"));
		FaciBtn3.click();
		Thread.sleep(2000);
		
		
		WebElement SltBtn3 = driver.findElement(By.xpath("//*[@id=\"combo_facility\"]/option[2]"));
		SltBtn3.click();
		 
				

		WebElement ComboBtn3 = driver.findElement(By.id("combo_facility"));
		ComboBtn3.click();
		Thread.sleep(2000);
				
		
				
		WebElement MedBtn3 = driver.findElement(By.id("radio_program_none"));
		MedBtn3.click();
				
		Thread.sleep(2000);
		WebElement CldBtn3 = driver.findElement(By.id("txt_visit_date"));
		CldBtn3.click();
						
			
		WebElement DayBtn3 = driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[5]/td[1]"));
		DayBtn3.click();
		Thread.sleep(2000);
				
		WebElement CmtBtn3 = driver.findElement(By.id("txt_comment"));
		CmtBtn3.click();
		CmtBtn3.sendKeys("Hi, This is Randhir Karn. I have a appoinment for regular Checkup");
				
		Thread.sleep(2000);
				
		WebElement AppBtn3 = driver.findElement(By.id("btn-book-appointment"));
		AppBtn3.click();
		Thread.sleep(2000);
				
		WebElement HmBtn3 = driver.findElement(By.xpath("//*[@id=\"summary\"]/div/div/div[7]/p/a"));
		HmBtn3.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		
		
		//Appointment without Comment
		
		WebElement FaciBtn4 = driver.findElement(By.name("facility"));
		FaciBtn4.click();
		Thread.sleep(2000);
				
		WebElement SltBtn4 = driver.findElement(By.xpath("//*[@id=\"combo_facility\"]/option[2]"));
		SltBtn4.click();
				

		WebElement ComboBtn4 = driver.findElement(By.id("combo_facility"));
		ComboBtn4.click();
		Thread.sleep(2000);
				
		WebElement ChkBtn4 = driver.findElement(By.id("chk_hospotal_readmission"));
		ChkBtn4.click();
				
		Thread.sleep(2000);
				
		WebElement MedBtn4 = driver.findElement(By.id("radio_program_medicaid"));
		MedBtn4.click();
				
		
		Thread.sleep(2000);
		WebElement CldBtn4 = driver.findElement(By.id("txt_visit_date")); 
		CldBtn4.click();
		  
		  
		WebElement DayBtn4 = driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[5]/td[1]")); 
		DayBtn4.click();
		 
		Thread.sleep(2000);
				
						
		WebElement AppBtn4 = driver.findElement(By.id("btn-book-appointment"));
		AppBtn4.click();
		Thread.sleep(2000);
				
		WebElement HmBtn4 = driver.findElement(By.xpath("//*[@id=\"summary\"]/div/div/div[7]/p/a"));
		HmBtn4.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
				
		
		
		
		//Appointment without Visit Date
		
		WebElement FaciBtn5 = driver.findElement(By.name("facility"));
		FaciBtn5.click();
		Thread.sleep(2000);
				
		WebElement SltBtn5 = driver.findElement(By.xpath("//*[@id=\"combo_facility\"]/option[2]"));
		SltBtn5.click();
				

		WebElement ComboBtn5 = driver.findElement(By.id("combo_facility"));
		ComboBtn5.click();
		Thread.sleep(2000);
				
		WebElement ChkBtn5 = driver.findElement(By.id("chk_hospotal_readmission"));
		ChkBtn5.click();
				
		Thread.sleep(2000);
				
		WebElement MedBtn5 = driver.findElement(By.id("radio_program_medicaid"));
		MedBtn5.click();
				
		/*
		 * Thread.sleep(2000); WebElement CldBtn4 =
		 * driver.findElement(By.id("txt_visit_date")); CldBtn4.click();
		 * 
		 * 
		 * WebElement DayBtn4 =
		 * driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[5]/td[1]"))
		 * ; DayBtn4.click();
		 */
		Thread.sleep(2000);
				
		WebElement CmtBtn5 = driver.findElement(By.id("txt_comment"));
		CmtBtn5.click();
		CmtBtn5.sendKeys("Hi, This is Randhir Karn. I have a appoinment for regular Checkup");
				
		Thread.sleep(2000);
				
		WebElement AppBtn5 = driver.findElement(By.id("btn-book-appointment"));
		AppBtn5.click();
		Thread.sleep(2000);
				
		WebElement HmBtn5 = driver.findElement(By.xpath("//*[@id=\"summary\"]/div/div/div[7]/p/a"));
		HmBtn5.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
				
	
	}

}
