package UtilityLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class Calender extends BaseClass {

	public static By by(String tagname, String date) {
		// tagname[text()='15']
		return By.xpath("//" + tagname + "[text()='" + date + "']");
	}

	public static void dynamicCalender(WebElement MonthYearWb, String Expectedmonthyear, String tagName, String date,
			WebElement next) throws InterruptedException {

		while (true) {

			Thread.sleep(2000);
			if (Wait.getText(MonthYearWb).contains(Expectedmonthyear)) {
				Wait.click(driver.findElement(by(tagName, date)));
				break;
			} else {
				Wait.click(next);

			}
		}
	}

}
