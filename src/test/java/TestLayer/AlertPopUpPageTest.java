package TestLayer;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.AlertPopUpPage;

public class AlertPopUpPageTest extends BaseClass {

	@BeforeTest
	public void setUp() {
		BaseClass.initialization();
	}

	@Test
	public void validateAlertPopExample() throws InterruptedException {
		AlertPopUpPage alertPopUpPage = new AlertPopUpPage();
		String a = alertPopUpPage.alertMethod();

		Assert.assertEquals(a, "You clicked a ");
	}
	
	@AfterTest
	public void tearDown()
	{
		//driver.quit();
	}
	
}
