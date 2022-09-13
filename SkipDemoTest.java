package TEST_1;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest {
	
	Boolean datasetup = false;
	
	@Test(enabled = false)
	public void skipTest1(){
		
		System.out.println("Skipping this test as it is not complete");
	
	}

	@Test
	public void skipTest2(){
		
		System.out.println("Skipping this testforcefully");
		throw new SkipException("Skipping this test");
	}

	@Test
	public void skipTest3(){
		
		System.out.println("Skipping this test based on condition");
		if(datasetup == true) {
			
			System.out.println("Execute the Test");
		}
		else {
			System.out.println("Do not execute further steps");
			throw new SkipException("Do not execute further steps");
		}
		
	}

}
