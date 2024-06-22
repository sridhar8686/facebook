package Com.Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFrames {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("Sridhar");
		driver.switchTo().frame("frm1");
		Select Coursename = new Select(driver.findElement(By.id("course")));
		
		Coursename.selectByVisibleText("Java");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.id("frm3")));
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		Select Coursename1 = new Select(driver.findElement(By.id("course")));
		Coursename1.selectByVisibleText("Java");
		Thread.sleep(3000);
		driver.quit();

	}

}
