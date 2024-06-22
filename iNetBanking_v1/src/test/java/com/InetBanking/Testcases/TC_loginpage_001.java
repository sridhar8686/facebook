package com.InetBanking.Testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.InetBanking.pageobject.Loginpage;

public class TC_loginpage_001 extends BaseClass {
	@Test
	
	public void LoginTest() {
		
		driver.get(baseUrl);
		
		Loginpage lp = new Loginpage(driver); 
		lp.setUserName(UserName);
		logger.info("Username entered");
		lp.setPassWord(PassWord);
		logger.info("Password entered");
		lp.clickSubmit();
		logger.info("clicked on login button");

		
		if(driver.getTitle().equals("GTPL Bank Manager HomePage")) {
			
			Assert.assertTrue(true);
			logger.info("Successfully logged in");
		}
		
		else {
			Assert.assertTrue(false);
		}
	}
	
	

}
