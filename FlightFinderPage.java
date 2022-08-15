 package UI;

import org.openqa.selenium.WebDriver;

public class FlightFinderPage {
	
	WebDriver driver;
	
	public FlightFinderPage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(how=How.XPATH,using="/html/body/div/table/tbody/tr/td[2]/table/")

}
