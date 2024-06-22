package reports;

import java.awt.Desktop;
import java.io.File;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LogDiffTypeofInfo {

	public static void main(String[] args) throws Throwable  {
		ExtentReports extentreport= new ExtentReports();
		File file = new File("report.html");
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter(file);
		extentreport.attachReporter(sparkreporter);
		
		
		
		extentreport
		.createTest("Text based test")
		.log(Status.FAIL, "<b>info1</b>")		
		.log(Status.FAIL, "<strong>info2</strong>")		
		
		.log(Status.PASS, "<i>Info3</i>")
		.log(Status.SKIP, "<em>info4</em>")
		.log(Status.SKIP, "<mark>info5</mark>")
		.log(Status.INFO, "<small>info6</small>")
		.log(Status.WARNING, "<del>info7</del>")
		.log(Status.INFO, "<ins>info8</ins>")
		.log(Status.INFO, "<sub>info9</sub>")
		.log(Status.PASS, "<sup>info10</sup>");
		
		
		
		extentreport.flush();
		Desktop.getDesktop().browse(file.toURI());
		
		

	}

}
