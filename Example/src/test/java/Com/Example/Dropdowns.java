
package Com.Example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

//		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
////		WebElement CourseElement = driver.findElement(By.id("course"));
////		Select CourseNamedropDown = new Select(CourseElement);
////		List<WebElement> CourseNameDropdownOptions = CourseNamedropDown.getOptions();
////
////		for (WebElement options : CourseNameDropdownOptions) {
////
////			System.out.println(options.getText());
////
////		}
////		CourseNamedropDown.selectByIndex(1); //Java 
////		Thread.sleep(3000);
////		CourseNamedropDown.selectByValue("net");
////		Thread.sleep(3000);
////		CourseNamedropDown.selectByVisibleText("Javascript");
////		
////		String selectedText = CourseNamedropDown.getFirstSelectedOption().getText();
////		System.out.println("Selected Visible text is " +selectedText);
//		
//		
//		WebElement IdeElement = driver.findElement(By.id("ide"));
//		Select Idedropdown = new Select(IdeElement);
//		
//		List<WebElement> Idedropdownoptions = Idedropdown.getOptions();
//		
//		for (WebElement options : Idedropdownoptions) {
//			System.out.println(options.getText());
//			
//			
//		}
//		
//		Idedropdown.selectByIndex(1);
//		Thread.sleep(3000);
//		Idedropdown.selectByValue("vs");
//		Thread.sleep(3000);
//		Idedropdown.selectByVisibleText("Visual Studio");
//		Thread.sleep(3000);
//		
//		Idedropdown.deselectByIndex(3);
//		
//		Thread.sleep(3000);
//		
//		List<WebElement>slectedOptions= Idedropdown.getAllSelectedOptions();
//		
//		for (WebElement Selectedoption : slectedOptions) {
//			
//			System.out.println("Selected opton is " +Selectedoption.get);
//			
//		}
		
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement Selectcountry = driver.findElement(By.id("yx1njv"));
		Select CountryDropdown = new Select(Selectcountry);
		List<WebElement> CountrydropdownOptions = CountryDropdown.getOptions();
		
		for (WebElement options : CountrydropdownOptions) {
			
			System.out.println(options.getText());
			
			
		}
		CountryDropdown.selectByIndex(0);
		CountryDropdown.selectByValue("ALA");
		CountryDropdown.selectByVisibleText("Albania");
		
		
		


	}

}
