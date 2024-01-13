package TestLayer;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.HandleFramePage2;

public class HandleFramePageText2 extends BaseClass{

	@BeforeTest
	public void setUp()
	{
		BaseClass.initialization();
	}
	
	@Test
	public void validateFrameExample() throws InterruptedException
	{
		driver.navigate().refresh();
		Thread.sleep(3000);
		HandleFramePage2 handleFramePage2 =new HandleFramePage2();
		handleFramePage2.pqr("Amruta Thakare", "707070", "Dubai", "API Automation");
		Thread.sleep(3000);
		Assert.assertEquals(12, 14);
		
	}	
	
	@AfterTest
	public void tearDown()
	{
		//driver.quit();
	}
	
}
