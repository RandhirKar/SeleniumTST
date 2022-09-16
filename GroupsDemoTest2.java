package TEST_1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import Common.CommonDataSetup;

	
	public class GroupsDemoTest2 extends CommonDataSetup {
		
		
		
		@Test(priority = 1,groups = "Reggression")
		public void atest1() {
			
			System.out.println("Test1");
		}
		
		@Test(priority = 2,groups = "Reggression")
		public void btest2()
		{
			System.out.println("Test2");
		}

		@Test(groups= {"Reggression","bvt"})	
		public void bTest3() {
			
			System.out.println("Test2");	
		}
		
		@Test(groups= "bvt")		
		public void bTest4() {
			
			System.out.println("Test2");	
	}

}
