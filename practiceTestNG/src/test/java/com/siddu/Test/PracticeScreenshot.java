package com.siddu.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeScreenshot {

	public static void main(String[] args) throws IOException, Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(6000);
		driver.findElement(By.id("navbtn_exercises")).click();
		TakesScreenshot Ts = (TakesScreenshot)driver;
//		File file = Ts.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file, new File("./Screenshots/Image.png" ));
//		String base64code = Ts.getScreenshotAs(OutputType.BASE64);
//		byte[] byteArr = Base64.getDecoder().decode(base64code);
//		File destfile = new File ("./Screenshots/Image.png" );
//		FileOutputStream fos = new FileOutputStream(destfile);
//		fos.write(byteArr);
		
		byte[] byteArr = Ts.getScreenshotAs(OutputType.BYTES);
		File destfile = new File ("./Screenshots/Image.png" );
		FileOutputStream fos = new FileOutputStream(destfile);
		fos.write(byteArr);	
		
		driver.close();
		
		

	}

}
