package reports;

import java.awt.Desktop;
import java.io.File;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreports {

	public static void main(String[] args) throws Exception  {
		ExtentReports extentreports = new ExtentReports();
		File file = new File("extentreports.html");
		ExtentSparkReporter Sparkreporter = new ExtentSparkReporter(file);
		extentreports.attachReporter(Sparkreporter);
		
		ExtentTest test1= extentreports.createTest("Test1");
		test1.pass("This test is passed");
		
		ExtentTest test2 = extentreports.createTest("Test2");
		test2.log(Status.FAIL, "This Test is Failed");
		
		extentreports.createTest("Test3").skip("This Test is skipped");
		
		
		extentreports.flush();
		Desktop.getDesktop().browse(file.toURI());

	}

}
