package com.Maven_project;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.orangehrm.com/en/");
		
		/*TakesScreenshot screenshot = (TakesScreenshot)driver;
		File Sourcefile= screenshot.getScreenshotAs(OutputType.FILE);
		File targetfile = new File("C:\\Users\\Ruchi and Munna\\eclipse-workspace\\Maven_project\\src\\test\\Screenshots\\picture.png");
		Sourcefile.renameTo(targetfile);*/
		
		WebElement PeopleManagement = driver.findElement(By.xpath("//img[@alt='People Management']"));
		File Sourcefile1= PeopleManagement.getScreenshotAs(OutputType.FILE);
		File targetfile1 = new File(System.getProperty("user.dir")+"\\Screenshots\\picture1.png");
		Sourcefile1.renameTo(targetfile1);
		
		
	}

}
