package com.InetBanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	 WebDriver driver;

	public Loginpage(WebDriver rdriver)

	{

		PageFactory.initElements(rdriver, this);
	}

	@FindBy (name="uid")@CacheLookup WebElement txtUsername;
	@FindBy(name="password")@CacheLookup WebElement txtPassword;
	@FindBy(name="btnLogin")@CacheLookup WebElement btnLogin;

	public void setUserName(String uname) {


		txtUsername.sendKeys(uname);

	}
	public void setPassWord(String pwd) {


		txtPassword.sendKeys(pwd);

	}
	public void clickSubmit() {


		btnLogin.click();

	}









}
