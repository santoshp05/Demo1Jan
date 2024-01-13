package TestLayer;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.FrameExamplePage;

public class FrameExamplePageTest extends BaseClass{

	@BeforeTest
	public void setUp()
	{
		BaseClass.initialization();	
	}
	
	
	@Test
	public void validateFrameFlow2()
	{
		FrameExamplePage frameExamplePage=new FrameExamplePage();
		String [] arr =frameExamplePage.xyz("Baby Cat", "Cucumber");
		
		Assert.assertEquals(arr[0], "Baby Cat");
		
		Assert.assertEquals(arr[1], "Cucumber");
			
	}
	
	
	
	

	
	@AfterTest
	public void tearDown()
	{
		//driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public void validateFrameFlow()
//	{
//		FrameExamplePage frameExamplePage =new FrameExamplePage();
//		String a = frameExamplePage.abc("Selenium", "Avatar");
//		Assert.assertEquals(a, "Selenium");
//	}
	
}

