package com.Maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsdemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		options.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		
		
		String act_title = driver.getTitle();
		
		
		if(act_title.equals("Facebook – log in or sign up"))
		{
			
			System.out.println("test passed");
			
		}
		else {
			System.out.println("test failed");
		}
		driver.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle());

	}

}
