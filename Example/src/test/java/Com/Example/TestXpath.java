
package Com.Example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestXpath {
	private static WebDriver driver;

	public static void main(String[] args) throws Exception

	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);

		chapter6();
	}

	public static void highlight(WebElement element) {

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
				"color: yellow; border: 2px solid red;");
	}

	public static void chapter1() throws Exception {

		// Absolute Xpath

		driver.get("https://www.w3schools.com/");

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/input")).sendKeys("python");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/input")).submit();
	}

	public static void chapter2() {
		// Relative Xpath with attributes

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	public static void chapter3() {

		// Xpath with operators

		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

		driver.findElement(By.xpath("//input[@maxlength=10 and @name='name' and @type='text']")).sendKeys("Sridhar");

		List<WebElement> Elements = driver.findElements(By.xpath("//input[not(@maxlength=10)]"));
		System.out.println(Elements.size());

	}

	public static void chapter4() throws Exception {

		// xpath with index

		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr/td)[1]")).click();
	}

	public static void chapter5() throws Exception
	{

		//			xpath with functions

		//			1.text

		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		Thread.sleep(3000);

		//					highlight(driver.findElement(By.xpath("//a[text()='Sign in']")));

		//			2. contains

		//		highlight(driver.findElement(By.xpath("//div[contains(@class,'signin')]")));
		//		
		//		highlight(driver.findElement(By.xpath("//a[starts-with(text(),'Sign in into')]")));
		//		
		//		highlight(driver.findElement(By.xpath("//label[normalize-space(text())='First Name']")));

		highlight(driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr)[last()]")));

		List<WebElement> Elements = driver.findElements(By.xpath("(//table[@id='contactList']/tbody/tr)[position()>2]"));

		for (WebElement Element : Elements) {

			highlight(Element);
			
		}

		}


		//		xpath with axes

		

	private static void chapter6() {
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
//		Following:


//		highlight(driver.findElement(By.xpath("//label[text()='First Name ']/following-sibling::input[1]")));
		
//		highlight(driver.findElement(By.xpath("//label[.='Repeat Password']/following::input")));
		
		
//		
//		Parent:
//		
//		highlight(driver.findElement(By.xpath("//table[@id='contactList']/parent::div/form/div[2]")));
		
//		Child:
		
          driver.findElement(By.xpath("//div/input[1][@type='password']")).sendKeys("Siddu");
          
          System.out.println(driver.findElement(By.xpath("//div/input[1][@type='password']")).getText());
		
	
//		
//		
		
//		text() -> .
//		child -> /
//		preceding -> 
//		parent -> /..
		
//		highlight(driver.findElement(By.xpath("//div[@class='buttons']/button[.='Register']")));
//		
//		highlight(driver.findElement(By.xpath("//td[text()='Roland Mendel']/preceding::td[1]")));
		
//		preceding:
		
//		driver.findElement(By.xpath("//td[text()='Roland Mendel']/preceding::td[1]/input")).click();
//		highlight(driver.findElement(By.xpath("//label[text()='First Name ']/preceding-sibling::a")));
//		List<WebElement> Elements = driver.findElements(By.xpath("//table[@id='contactList']//td"));
//		
//		
//		
//		for (WebElement Element : Elements) {
//			
//			highlight(Element);
//			System.out.println(Element.getText());
//			
//		}
//		System.out.println(driver.findElements(By.xpath("//table[@id='contactList']//td")).size());
		
//		driver.quit();
		

		
	}
}
