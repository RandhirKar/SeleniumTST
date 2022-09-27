package TEST_1;

import org.testng.annotations.Test;

import Common.BaseTest;

public class ListenerDemoTest extends BaseTest {
	
	@Test
	public void launchApp()
	{
		driver.get("https://ebay.com");
	}

}
