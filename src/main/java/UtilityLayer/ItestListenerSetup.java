package UtilityLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ItestListenerSetup extends ExtentReportSetup implements ITestListener {
	ExtentReports extentReports;
	ExtentTest extentTest;

	@Override
	public void onStart(ITestContext context) {
		extentReports = ExtentReportSetup.setUp(context.getSuite().getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		extentTest = extentReports.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		extentTest.log(Status.PASS, result.getMethod().getMethodName());

		extentTest.addScreenCaptureFromPath(
				ExtentReportSetup.screenshot("PassScreenshot", result.getMethod().getMethodName()));

	}

	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.log(Status.FAIL, result.getMethod().getMethodName());

		extentTest.addScreenCaptureFromPath(
				ExtentReportSetup.screenshot("FailScreenshot", result.getMethod().getMethodName()));

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		extentTest.log(Status.SKIP, result.getMethod().getMethodName());
	}

	@Override
	public void onFinish(ITestContext context) {
		extentReports.flush();
	}

}
