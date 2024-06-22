package com.siddu.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class W3Schools {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void InitializingTheBrowser() {
		
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@AfterTest
	public void TearDown() {
		
		driver.quit();
	}
	@Test
	
	public void VerifyW3schools() throws Exception {
		
		
		driver.get("https://www.hyrtutorials.com/");	
		Thread.sleep(5000);
		
		
		
	}
@Test
	public void VerifyExcercisepage() throws Exception {
	
	
		
		Actions actions = new Actions(driver);
		actions
		
		.moveToElement(driver.findElement(By.xpath("//ul[@id='nav1']/child::li[4]")))
		.moveToElement(driver.findElement(By.xpath("//ul[@id='nav1']/descendant::a[contains(text(),'XPath Practice')]")))
		.click()
		.perform();
		Thread.sleep(5000);
		
		
	}
}
