package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;
import UtilityLayer.HandleFrame;
import UtilityLayer.Wait;

public class FrameExamplePage extends BaseClass {

	// create Object Repository with the help of Page Object Model with Page Factory
	// concept.
	@FindBy(xpath = "//input[@type='text']")
	private WebElement topic;

	@FindBy(id = "a")
	private WebElement checkbox;

	@FindBy(id = "animals")
	private WebElement AnimalsDp;

	private String topicFrame = "frame1";
	private String dropFrame = "frame2";
	private String checkboxFrame = "frame3";

	// initialize the Object Repository
	public FrameExamplePage() {
		PageFactory.initElements(driver, this);
	}

	// create associated method for each and every object repository without
	// entering the text data.



	public String [] xyz(String Animal,String Topics)
	{
		//switch to drop down frame and selectBaby Cat
		HandleFrame.frame(dropFrame);
		HandleDropDown.selectByVisibleText(AnimalsDp, Animal);
		
		//switch to the topic frame and Entered text
		HandleFrame.defaultContent();
		HandleFrame.frame(topicFrame);
		Wait.sendKeys(topic, Topics);
		
		//switch to the checkbox frame and select the checkbox
		HandleFrame.frame(checkboxFrame);
		Wait.click(checkbox);
		
		//switch to the drop frame and captured the selected value
		HandleFrame.defaultContent();
		HandleFrame.frame(dropFrame);
		String capturedDpValue = HandleDropDown.getFirstSelectedOption(AnimalsDp);
		
		//switch to the topic frame and capture the entered text.
		HandleFrame.defaultContent();
		HandleFrame.frame(topicFrame);
		String captureTextValue =Wait.getAttribute(topic, "value");
		
		//store captured value in Array
		String arr []= new String[2];
		arr[0]=capturedDpValue;
		arr[1]=captureTextValue;
		
		return arr;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String abc(String Topics, String Animal) {
		// switch to topic frame and enter the text
		HandleFrame.frame("frame1");
		Wait.sendKeys(topic, Topics);

		// switch to the top frame
		HandleFrame.defaultContent();

		// switch to the drop down frame and select the Avatar
		HandleFrame.frame("frame2");

		HandleDropDown.selectByVisibleText(AnimalsDp, Animal);

		// switch to the checkbox frame and select the checkbox
		HandleFrame.defaultContent();
		HandleFrame.frame(topicFrame);
		HandleFrame.frame(checkboxFrame);
		Wait.click(checkbox);

		// switch to the topic frame and capture the entered text.
		HandleFrame.parentFrame();
		String topicEnteredText = Wait.getAttribute(topic, "value");

		return topicEnteredText;
	}

}
