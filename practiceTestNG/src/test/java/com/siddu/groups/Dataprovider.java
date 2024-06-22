package com.siddu.groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;




public class Dataprovider {


	@Test(dataProvider="logindata", dataProviderClass = TestDataExcel.class)

	public void loginToOrangeHrm(String userName, String passWord) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://siddu8686-trials711.orangehrmlive.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(passWord);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();	
		SoftAssert Softassert = new SoftAssert();


		//		VerifyTitle

		String ActualTitle = driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).getAttribute("value");
		String ExpectedTitle = "Log out";
		Softassert.assertEquals(ActualTitle, ExpectedTitle, "Title is mismacthed");		
		driver.quit();
		Softassert.assertAll();




	}





}
