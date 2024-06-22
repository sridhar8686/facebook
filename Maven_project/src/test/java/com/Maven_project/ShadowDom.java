package com.Maven_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDom {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://practice.expandtesting.com/shadowdom");
		
		SearchContext ShadowHost=driver.findElement(By.cssSelector("#shadow-host")).getShadowRoot();
		String text = ShadowHost.findElement(By.cssSelector("#my-btn")).getText();
		System.out.println(text);
	}

}
