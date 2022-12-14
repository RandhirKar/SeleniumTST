package Common;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	private int retryCount = 0;
	private static final int maxRetrycount = 3;

	public boolean retry(ITestResult result) {
		if (retryCount < maxRetrycount) {
			retryCount++;
			return true;
		}
		return false;
	}

}
