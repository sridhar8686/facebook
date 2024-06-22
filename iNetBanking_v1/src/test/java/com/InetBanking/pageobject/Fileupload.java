package com.InetBanking.pageobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ufile.io/");
		driver.findElement(By.xpath("//form[@id='upload-window']")).click();
		
		Robot rb = new Robot();
		rb.delay(2000);
		
		StringSelection ss= new StringSelection("file:///C:/Users/Ruchi%20and%20Munna/eclipse-workspace/iNetBanking_v1/report.html");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
         rb.keyRelease(KeyEvent.VK_CONTROL);
         rb.keyRelease(KeyEvent.VK_V);
         rb.keyPress(KeyEvent.VK_ENTER);
         
         System.out.println("file uploaded sucessfully");
         
         driver.close();
	}

}
