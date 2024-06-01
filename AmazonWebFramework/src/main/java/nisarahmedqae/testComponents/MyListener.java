package nisarahmedqae.testComponents;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class MyListener implements ITestListener {
    // Path for the report file
    private static final String path = System.getProperty("user.dir") + "\\reports\\index.html";
    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    static {
        // Create an ExtentSparkReporter for the report file configuration
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Web Automation Results");
        reporter.config().setDocumentTitle("Test Results");

        // Create an ExtentReports object and attach the reporter
        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "Mohim");
    }

    @Override
    public void onTestStart(ITestResult result) {
        // Create a new test in the ExtentReports and assign it to the test variable
        ExtentTest test = extent.createTest(result.getMethod().getMethodName());
        // Store the test object in the ThreadLocal object, mapping it to the unique thread ID
        extentTest.set(test);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // Log a pass status for the test
        extentTest.get().log(Status.PASS, "Test passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // Log a fail status for the test
        extentTest.get().log(Status.FAIL, "Test failed");
        extentTest.get().log(Status.FAIL, result.getThrowable());

        // Retrieve the driver object from the test result to take a screenshot
        WebDriver driver = (WebDriver) result.getTestContext().getAttribute("WebDriver");

        // TakeScreenshot code
        if (driver != null) {
            String screenshotPath = captureScreenshot(driver, result.getMethod().getMethodName());
            extentTest.get().addScreenCaptureFromPath(screenshotPath);
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        extentTest.get().log(Status.SKIP, "Test skipped");
    }

    @Override
    public void onFinish(ITestContext context) {
        // Flush the ExtentReports to write the report to the file
        extent.flush();
    }

    private String captureScreenshot(WebDriver driver, String screenshotName) {
        String destination = System.getProperty("user.dir") + "\\screenshots\\" + screenshotName + ".png";
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(source, new File(destination));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }
}
