package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;


public class testUtils {

	@SuppressWarnings("unused")
	public void getScreenshot() throws IOException{
		
		Date currentdate = new Date();
		String screenshotfilename = currentdate.toString().replace(" ","-").replace(":", "-");
		File screenshotfile = ((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//screenshot//" + Screenshotfilename + ".png"));
	}
}
