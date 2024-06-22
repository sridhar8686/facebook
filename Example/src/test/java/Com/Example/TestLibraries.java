package Com.Example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLibraries {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement UsernameBox =  driver.findElement(By.id("email"));
		WebElement PasswordBox = driver.findElement(By.name("pass"));
		
		if (UsernameBox.isDisplayed()) {
			
			if (UsernameBox.isEnabled()) {
				
				UsernameBox.sendKeys("8008386861");
				String enteredUsername = UsernameBox.getAttribute("value");
				System.out.println(enteredUsername);
				Thread.sleep(3000);
				
				UsernameBox.sendKeys("Siddu");
				UsernameBox.clear();
				
				
				
				
			}
			
			else
				System.out.println("Usernamebox is not enabled");
		}
		
		else 
			System.out.println("UserbnameBox is not discplayed");
		
		Thread.sleep(3000);
		
		
		if (PasswordBox.isDisplayed()) {
			
			if (PasswordBox.isEnabled()) {
				
				PasswordBox.sendKeys("Siddu8686@");
				String enteredPassword = PasswordBox.getAttribute("value");
				System.out.println(enteredPassword);
				Thread.sleep(9000);
				PasswordBox.clear();
				
			}
			else
				System.out.println("Passwordbox is not enabled");
			
		}
		else
			System.out.println("passwordbox is  not displyed");
		
		

	}

	
	
}
