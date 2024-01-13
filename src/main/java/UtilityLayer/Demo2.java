package UtilityLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class Demo2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		BaseClass b = new BaseClass();
		b.initialization();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//p[@class='sc-12foipm-18 cTPYom fswWidgetTitle'])[1]")).click();
		Thread.sleep(5000);
		WebElement MonthYear = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]"));

		WebElement next = driver
				.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"));

		Calender.dynamicCalender(MonthYear, "May 2024", "p", "14", next);
	}
}
