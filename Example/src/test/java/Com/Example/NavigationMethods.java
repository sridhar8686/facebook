package Com.Example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NavigationMethods {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("APjFqb")).sendKeys("Facebook");
		Thread.sleep(3000);
		
		driver.findElement(By.id("APjFqb")).submit();
		Thread.sleep(3000);

		driver.navigate().to("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		
		WebElement CourseElement = driver.findElement(By.id("course"));
		Select CourseNameDropdwn = new Select (CourseElement);
		
//		List<WebElement> CourseNameDropdownOptions = CourseNameDropdwn.getOptions();
		
				CourseNameDropdwn.selectByIndex(1); //Java 
		
	Thread.sleep(3000);
	CourseNameDropdwn.selectByValue("net");
	Thread.sleep(3000);
	CourseNameDropdwn.selectByVisibleText("Javascript");
	Thread.sleep(3000);
	
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.quit();
	
		
		
		
		
	}

}
