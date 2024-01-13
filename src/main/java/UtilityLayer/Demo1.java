package UtilityLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class Demo1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		BaseClass b = new BaseClass();

		b.initialization();

		driver.findElement(By.id("onwardCal")).click();

		WebElement wbMonthAndYear = driver
				.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]"));

		WebElement wbNext = driver
				.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[3]"));

		Calender.dynamicCalender(wbMonthAndYear, "Feb 2024", "span", "29", wbNext);

	}

}
