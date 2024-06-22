package Com.Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSAttributeSelector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
//		AttributeName
		
		System.out.println(driver.findElements(By.cssSelector("input[placeholder]")).size());;
		
//		AttributeValue
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Sridhar");
		
		
		
//		AttributeValue-partilaText-Wholeword
		
		driver.findElement(By.cssSelector("input[placeholder~='question']")).sendKeys("what is your favourite sports");
		
//		AttributeValue-partialtext-Text
		driver.findElement(By.cssSelector("input[placeholder*='ans']")).sendKeys("Cricket");
//		AttributeValue-Starts with - Whole word
		
		System.out.println(driver.findElements(By.cssSelector("p[class|='my']")).size());;
//		AttributeValue-Startswith - Text
		System.out.println(driver.findElements(By.cssSelector("p[class^='my']")).size());
		
//		AttributeValue-Endswith Text
		
		System.out.println(driver.findElements(By.cssSelector("p[class$='lass']")).size());;
		
		driver.quit();
		

	}

}
