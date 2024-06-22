package reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Loglevels {

	public static void main(String[] args) throws IOException {
		ExtentReports extentreports = new ExtentReports();
		File file = new File("extentreports.html");
		ExtentSparkReporter Sparkreporter = new ExtentSparkReporter(file);
		extentreports.attachReporter(Sparkreporter);
		
		
		
		extentreports
		.createTest("Test3")
		.log(Status.PASS, "Pass")
		.log(Status.FAIL, "Fail")
		.log(Status.SKIP, "Skip")
		.log(Status.INFO, "info")
		.log(Status.SKIP, "Skip");
		
		
		extentreports.flush();
		Desktop.getDesktop().browse(file.toURI());
	}

}
