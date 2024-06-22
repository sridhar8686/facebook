package com.siddu.TakeScreenshots;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	public static WebDriver driver;
	public static String SCreenshotsubfolderName;
	

	@BeforeTest
	
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	
	public void tearDown() {
		driver.quit();
		
	}
	
	@AfterMethod
	public void Screenshotcapture(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			CaptureScreenshot(result.getTestContext().getName()+"_"+result.getMethod().getMethodName()+".jpg");
			
		}
		
		
	}
	public void CaptureScreenshot(String Filename)  {
		
		if(SCreenshotsubfolderName == null) {
			LocalDateTime currentTime = LocalDateTime.now();
			DateTimeFormatter FormatDate = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
			SCreenshotsubfolderName = currentTime.format(FormatDate);
			
		}
		
		TakesScreenshot TS = (TakesScreenshot) driver;
		File Sourcefile = TS.getScreenshotAs(OutputType.FILE);
		File destfile = new File("./Screenshots/"+ SCreenshotsubfolderName+"/"+  Filename);
		
		try {
			FileUtils.copyFile(Sourcefile, destfile);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("Screenshot saved sucessfully");
		
		
	}
	

}
