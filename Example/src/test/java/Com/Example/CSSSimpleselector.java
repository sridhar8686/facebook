package Com.Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSimpleselector {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
//		CSS Element selector(tagname)
		System.out.println(driver.findElement(By.cssSelector("button")).getAttribute("id"));
//		CSS id selector
		driver.findElement(By.cssSelector("#firstName")).sendKeys("Sridhar");
//		CSS class selector
		driver.findElement(By.cssSelector(".gender")).sendKeys("Male");
//       Css Universal selector
		System.out.println(driver.findElements(By.cssSelector("*")).size());
		
		
		
		

	}

}
