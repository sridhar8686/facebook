package com.siddu.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/");	
		Actions actions = new Actions(driver);
		actions
		
		.moveToElement(driver.findElement(By.xpath("//ul[@id='nav1']/child::li[4]")))
		.moveToElement(driver.findElement(By.xpath("//ul[@id='nav1']/descendant::a[contains(text(),'XPath Practice')]")))
		.click()
		.perform();

	}

}
