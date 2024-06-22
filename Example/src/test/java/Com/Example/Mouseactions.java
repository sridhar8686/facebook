package Com.Example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions {

	
	public static void main(String[] args) throws Exception {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver =new ChromeDriver(options);
		
//		Mouseover action:
		
		
		
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div/img[@alt='client brand banner']")).click();
		Actions actions = new Actions(driver);
//		actions
//		.moveToElement(driver.findElement(By.xpath("//div/ul/li[2]/a[@class='nav-link-hed']")))
//		.moveToElement(driver.findElement(By.xpath("//ul[@id='optanon-menu']/li[3]")))
//		.moveToElement(driver.findElement(By.xpath("//h6/a[text()='Recruiter']")))
//		.click()
//		.perform();
		
//		Double click action
//		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//		
//		driver.findElement(By.xpath("//input[@maxlength=10]")).sendKeys("sRIDHAR");
//		
//		actions.doubleClick(driver.findElement(By.xpath("//input[@maxlength=10]"))).perform();
		
//		Right click or context click
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.findElement(By.xpath("//span[.='right click me']"));
		actions.contextClick(driver.findElement(By.xpath("//span[.='right click me']"))).perform();
		
		driver.findElement(By.xpath("//span[.='Edit']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
	
		
		
	}

}