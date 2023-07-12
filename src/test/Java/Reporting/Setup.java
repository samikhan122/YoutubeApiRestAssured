package Reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Setup implements ITestListener {
    public static ExtentReports extentReports;

    public void onStart(ITestContext context) {
        String fileName = ExtentReportManager.getReportNameWithTimeStamp();
        String fullReportPath = System.getProperty("user-dir") + "\\reports\\" + fileName;
        ExtentReportManager.createInstance(fullReportPath, "Test Automation Report", "Test ExecutionReport");
    }

    public void onFinish(ITestContext context) {
        if (extentReports != null) {
            extentReports.flush();

        }
    }

    public void onTestSkipped(ITestResult result) {
      ExtentTest test = extentReports.createTest("Test Name" + result.getClass().getName()+result.getMethod().getMethodName());
        System.out.println(test);
    }





}
