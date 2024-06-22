package Com.Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basiccontrols {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		WebElement firstName = driver.findElement(By.id("firstName"));
		
		if (firstName.isDisplayed()) {
			
			if (firstName.isEnabled()) {
				
				firstName.sendKeys("Davalagari");
				
				
				
			}
			else 
				System.out.println("firstname Box is not enabled");
			
		}
		else
			System.out.println("firstnameBox is not Displayed");
		
		Thread.sleep(5000);
		
		WebElement lastName = driver.findElement(By.id("lastName"));
		
		if (lastName.isDisplayed()) {
			
			if (lastName.isEnabled()) {
				
				lastName.sendKeys("Sridhar reddy");
				
				
				
			}else
				System.out.println("lastname box is not enabled");
			
			
		}else
			System.out.println("lastnamebox is not displayed");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(4000);
		WebElement Hindichk = driver.findElement(By.id("hindichbx"));
		Hindichk.click();
		Thread.sleep(4000);
		Hindichk.click();
		Thread.sleep(4000);
		WebElement chinesechk = driver.findElement(By.id("chinesechbx"));
		chinesechk.click();
		Thread.sleep(3000);
		chinesechk.click();
		Thread.sleep(3000);
		driver.findElement(By.id("frenchchbx")).click();
		Thread.sleep(3000);
		
		WebElement emailAddress = driver.findElement(By.id("email"));
		
		if (emailAddress.isDisplayed()) {
			
			if (emailAddress.isEnabled()) {
				
				emailAddress.sendKeys("Siddu8686@gamail.com");
				
			}
			else System.out.println("is not enabled");
			
			
		}
		else System.out.println("email address is not available");
		
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.id("password"));
		
		if(password.isDisplayed()) {
			
			if(password.isEnabled()) {
				
				password.sendKeys("Siddu8686@");
				
			}
			else System.out.println("Password is not enabled");
			
		}
		else System.out.println("Password box isd not displayed");
		
		Thread.sleep(3000);
		driver.findElement(By.id("registerbtn")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("msg")).getText());
		Thread.sleep(3000);
		driver.findElement(By.id("navigateHome")).click();
		
	}

}
