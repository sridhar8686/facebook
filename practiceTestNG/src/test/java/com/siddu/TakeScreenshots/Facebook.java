package com.siddu.TakeScreenshots;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Facebook extends BaseTest{

	@Test

	public void Facebooklogin() throws Exception {

		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("800838861",Keys.ENTER);
		Thread.sleep(3000);

		SoftAssert Softassert = new SoftAssert();


		//		VerifyTitle

		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Log in to Facebook";
		Softassert.assertEquals(ActualTitle, ExpectedTitle, "Title is mismacthed");

		//		VerifyUrl

		String ActulaUrl = driver.getCurrentUrl();
		String ExpectedUrl = "https://www.facebook.com/login.php/";
		Softassert.assertNotEquals(ActulaUrl, ExpectedUrl, "Url is mismatched");


		//		VerifyText

		String ActualText = driver.findElement( By.name("email")).getAttribute("value");
		String Expectedtext = "";
		Softassert.assertEquals(ActualText, Expectedtext,"Username Text is mismatched");

		//		VerifyError message

		String ActualError = driver.findElement(By.xpath("(//div[@id='email_container']/div)[last()]")).getText();
		String ExpectedError = "The mobile number you entered isn't connected to an account. Create a new Facebook account.\r\n";
		Softassert.assertEquals(ActualError, ExpectedError, "Error mssage is mismatched");



		//		VerifyBorder
		String ActualBorder = driver.findElement(By.name("email")).getCssValue("border");
		String ExpectedBorder = "1px solid rgb(240,40,73)";
		Softassert.assertEquals(ActualBorder, ExpectedBorder, "Border is mismatched");		
		Softassert.assertAll();
		}

@Test
		public void HrmLogin() throws Exception {
			driver.get("https://siddu8686-trials711.orangehrmlive.com/");

			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("R@KeyW6Sf2");
			driver.findElement(By.xpath("//img[@class='icon login-icon']")).click();
			Thread.sleep(5000);
		}
@Test
		public void Testgoogle() throws Exception {


				driver.get("https://www.google.co.in/");
				driver.findElement(By.className("gLFyf")).sendKeys("Hyr Tutorials", Keys.ENTER);
				String ExpectedTitle = "Hyr Tutorial - Google Search";
				String ActualTitle = driver.getTitle();
				Assert.assertEquals(ActualTitle, ExpectedTitle, "Title is mismatched");		
				Thread.sleep(5000);






















			}





		}
