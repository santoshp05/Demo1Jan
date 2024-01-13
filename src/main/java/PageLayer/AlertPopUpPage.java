package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleAlert;
import UtilityLayer.Wait;

public class AlertPopUpPage extends BaseClass{

	@FindBy(id="alertButton")
	private WebElement clickMe;
	
	public AlertPopUpPage()
	{
		PageFactory.initElements(driver, this);
	}
	
//	click on click me button
//	switch focus to alert pop capture the text and click on ok button

	public String alertMethod() throws InterruptedException
	{
		Wait.click(clickMe);
		String a = HandleAlert.getText();
		Thread.sleep(3000);
		HandleAlert.accept();
		return a;
	}
	
}
