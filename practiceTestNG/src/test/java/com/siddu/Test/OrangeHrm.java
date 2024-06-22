package com.siddu.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OrangeHrm {
	
	WebDriver driver;
	@Parameters("browserName")
	
	@BeforeTest
	public void InitializingBrowser(String browsername) {
		
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
	public void teardown() {
		
		driver.quit();
	}
	
	
	
	SoftAssert softassert = new SoftAssert();
	
	@Parameters("url")
	

	@Test
	
	public void OpenHrmportal(String Url) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("Url");
		Thread.sleep(10000);
	}
	
	@Test
	 public void HrmLogin() throws Exception {
		 
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("R@KeyW6Sf2");
		 driver.findElement(By.xpath("//img[@class='icon login-icon']")).click();
		 Thread.sleep(5000);
	 }
	 @Test
	 public void verifyLoogin() throws Exception {
		 
		String ActualProfile =  driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).getText();
		String ExpectedProfile = "Log Out";
		softassert.assertEquals(ActualProfile, ExpectedProfile, "Profile is mismatched");
		Thread.sleep(5000);
		 
	 }
	 @Test
	 public void VerifyMyinfo() throws Exception {
		 
		 String Actunalname = driver.findElement(By.xpath("//div[@class=\"job-title\"]/preceding::a[@class='name']")).getText();
		 String Expectedname = "Jacqueline Wagner";
		 softassert.assertEquals(Actunalname, Expectedname, "Profilename is mismatched");
		 Thread.sleep(5000);
		 
		 
	 }
	 
	 
	
	

}
