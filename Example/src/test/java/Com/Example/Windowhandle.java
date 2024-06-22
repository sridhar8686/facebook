package Com.Example;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(5000);
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("parent window handle - " +parentWindowHandle + driver.getTitle());
		driver.findElement(By.id("newWindowBtn")).click();
		
		Set<String> Windowhandles = driver.getWindowHandles();
		
		for (String Windowhandle : Windowhandles) {
			
			if (!Windowhandle.equals(parentWindowHandle)) {
				
				driver.switchTo().window(Windowhandle);
				driver.manage().window().maximize();
				
			driver.findElement(By.id("firstName")).sendKeys("Sridhar");
			
			Thread.sleep(300);
			}
			
			driver.switchTo().window(Windowhandle);
			
			System.out.println(Windowhandle + driver.getTitle());
			
		}
		driver.close();
		
		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.id("name")).sendKeys("Davalgari");
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		

	}

}
