package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class JSEvents extends BaseClass {

	/*
	 * JavascriptExecutor reusable script code for click on element, send text to
	 * text box open a URL, Navigate Back, Navigate forward, refresh the browser,
	 * capture browser title,' capture browser URL, create border for element,
	 * scroll down up to element.
	 */

	public static void click(WebElement wb) {

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Wait.visibilityStatus(wb));

	}

	public static void sendKeys(WebElement wb, String value) {
		((JavascriptExecutor) driver).executeScript("arguements[0].value='" + value + "';", Wait.visibilityStatus(wb));
	}

	public static void scrollUpToElement(WebElement wb) {

		((JavascriptExecutor) driver).executeScript("aguments[0].scrollIntoView(true);", Wait.visibilityStatus(wb));

	}

	public static void createBorderForElement(WebElement wb) {
		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red';",
				Wait.visibilityStatus(wb));

	}

	public static void get(String url) {

		((JavascriptExecutor) driver).executeScript("arguments[0].location='" + url + "';");

	}

	public static void newWindowWithUrl(String url) {

		((JavascriptExecutor) driver).executeScript("arguments[0].open('" + url + "');");

	}

	public static void forward(int forword) {

		((JavascriptExecutor) driver).executeScript("history.go(+" + forword + ")");

	}

	public static void back(int back) {

		((JavascriptExecutor) driver).executeScript("history.go(-" + back + ")");
	}

	public static void refresh() {

		((JavascriptExecutor) driver).executeScript("history.go(0)");
	}

	public static String getTitle() {

		return ((JavascriptExecutor) driver).executeScript("return document.TITLE").toString();
	}

	public static String getCurrentUrl() {

		return ((JavascriptExecutor) driver).executeScript("return document.URL").toString();

	}

}
