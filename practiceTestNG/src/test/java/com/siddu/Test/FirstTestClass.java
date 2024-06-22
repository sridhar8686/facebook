package com.siddu.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class FirstTestClass {
	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeTest
	public void InitializingtheBrowser(String browsername) {
		
		switch (browsername.toLowerCase()) {
	
	case "chrome" :
		
		driver = new ChromeDriver();
		break;
		
	case "edge":
		
		driver = new EdgeDriver();
		break;
	case "firefox" :
		driver = new FirefoxDriver();
	default :
		System.out.println("Browsername is invalid");	
		}
		
	driver.manage().window().maximize();	
	}
	@AfterTest
	public void TearDown() {
		
		driver.quit();
	}
	@AfterMethod
	public void VerifyAtermethod() {
		
		System.out.println("Mehtod is successfully executed");
	}
	@Parameters("url")
	@Test
	

	public void Testgoogle(String Url) throws Exception {
		
		
		driver.get("Url");
		driver.findElement(By.className("gLFyf")).sendKeys("Hyr Tutorials", Keys.ENTER);
		String ExpectedTitle = "Hyr Tutorials - Google Search";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle, "Title is mismatched");		
		Thread.sleep(5000);
		
		
	}
//	@Test
//	public void facebookLogin() throws Exception {
//		
//		
//		driver.get("https://www.facebook.com/login.php/");
//		driver.findElement(By.id("email")).sendKeys("800838861",Keys.ENTER);
//		System.out.println(driver.getTitle());
//		Thread.sleep(5000);
//		
//	}

}
