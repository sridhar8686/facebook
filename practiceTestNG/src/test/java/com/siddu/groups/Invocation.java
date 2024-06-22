package com.siddu.groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invocation {
	@Test (invocationCount = 10, invocationTimeOut = 2000, threadPoolSize = 5)
	public void getdata() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://randomuser.me/");
		driver.findElement(By.xpath("//li[@data-label=\"name\"]")).click();
		Thread.sleep(3000);
		System.out.println("user name:" +driver.findElement(By.id("user_value")).getText());
		driver.findElement(By.xpath("//li[@data-label=\"email\"]")).click();
		System.out.println("Email:" +driver.findElement(By.id("user_value")).getText());
		driver.quit();
		
	}
	
	
	
	

}
