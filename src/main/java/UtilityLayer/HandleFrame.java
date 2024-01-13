package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class HandleFrame extends BaseClass {

	public static void frame(String frameIdOrName) {
		new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIdOrName));
	}

	public static void frame(int frameIndex) {
		new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}

	public static void frame(WebElement framewb) {
		new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framewb));

	}

	public static void parentFrame() {
		driver.switchTo().parentFrame();
	}

	public static void defaultContent() {
		driver.switchTo().defaultContent();
	}

}
