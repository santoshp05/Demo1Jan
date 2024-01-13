package UtilityLayer;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.BaseClass;

public class ExtentReportSetup extends BaseClass {

	public static String date() {
		return new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
	}

	public static ExtentReports setUp(String suiteName) {
		ExtentReports extentReports = new ExtentReports();
		extentReports.attachReporter(new ExtentSparkReporter(
				System.getProperty("user.dir") + "\\ExtentHTMLReports\\" + suiteName + date() + ".html"));
		return extentReports;
	}

	public static String screenshot(String foldername, String testCaseName) {
		String path = System.getProperty("user.dir") + "\\" + foldername + "\\" + testCaseName + date() + ".png";
		try {
			FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), new File(path));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return path;
	}

}
