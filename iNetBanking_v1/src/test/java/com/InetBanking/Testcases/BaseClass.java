package com.InetBanking.Testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.InetBanking.Utilities.Readconfig;

public class BaseClass {

	Readconfig readconfig = new Readconfig();

	public String baseUrl =readconfig.getApplication();
	public String UserName =readconfig.getUsername();
	public String PassWord= readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;

	@Parameters("Browser")
	@BeforeClass
	public void setup(String br) {

		switch (br) {
		case "chrome": driver = new ChromeDriver();

		break;
		case "InternetExplorer": driver = new InternetExplorerDriver();
		break;
		case "Firefox": driver= new FirefoxDriver();
		break;
		case "Edge": driver= new EdgeDriver();
		break;

		default:driver = new ChromeDriver();
		break;
		}

		driver.manage().window().maximize();		


		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");

	}

	@AfterClass
	public void tearDown() {

		driver.quit();
	}
}
