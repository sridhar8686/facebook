package Com.Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElementProperties {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.findElement(By.id("pass")).getAttribute("value"));
		
		System.out.println(driver.findElement(By.xpath("//input[@id='email']/proceeding-sibling::label")).getText());
driver.quit();		
		
		
		

	}

}
