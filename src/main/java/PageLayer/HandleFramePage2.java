package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;
import UtilityLayer.HandleFrame;
import UtilityLayer.Wait;

public class HandleFramePage2 extends BaseClass{

	@FindBy(name="name")
	private WebElement fullName;
	
	@FindBy(name="mob")
	private WebElement mob;
	
	@FindBy(name="POM")
	private WebElement pom;
	
	@FindBy(name="add")
	private WebElement add;
	
	@FindBy(name="course")
	private WebElement course;
	
	@FindBys(@FindBy(xpath="//h1[text()='Show Checkboxes']/following::label"))
	private List<WebElement> allCheckbox;
	
	private String AddFrame="addressframe";
	
	private String DropDownframe="toolframe";
	
	private String MobFrame="mobileFrame";
	
	private String Checkbox="showcheckbox";
	
	public HandleFramePage2()
	{
		PageFactory.initElements(driver, this);
	}
	

	public void pqr(String FullName,String mobileNo,String address,String Course)
	{
		//Enter the full name
		Wait.sendKeys(fullName, FullName);
		
		//switch to address frame and enter address
		HandleFrame.frame(AddFrame);
		Wait.sendKeys(add, address);
		
		//switch to the drop down and select the Jenkins drop down
		HandleFrame.frame(DropDownframe);
		HandleDropDown.selectByVisibleText(course, Course);
	
		//switch to the top frame and then switch to mobile Frame and Enter mobile no
		HandleFrame.defaultContent();
		HandleFrame.frame(MobFrame);
		Wait.sendKeys(mob, mobileNo);
		
		//switch to the top frame and then switch to Address frame and then capture the entered address value
		HandleFrame.defaultContent();
		HandleFrame.frame(AddFrame);
		String a= Wait.getAttribute(add, "value");
		
		//Switch to the top frame and then mobile frame and then Checkbox frame and 
		//then select the POM checkbox
//		HandleFrame.defaultContent();
//		HandleFrame.frame(MobFrame);
//		HandleFrame.frame(Checkbox);
//		Wait.selectCheckBox(allCheckbox, checkBoxValue);
		
	}
	
	
	
	
	
}
