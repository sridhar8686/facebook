package Com.Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CssCombinatorSelectors {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		
//		Descendant selector
		
		System.out.println(driver.findElements(By.cssSelector(".container select")).size());
		
//		child Selector
		System.out.println(driver.findElements(By.cssSelector(".container>input")).size());
		

		
//		general sibling selector
		
		System.out.println(driver.findElements(By.cssSelector(".mytest~p")).size());
		
		Thread.sleep(3000);
		
//		Adjacent sibling selector
		
		driver.findElement(By.cssSelector(".mytest+p"));
		
		actions.doubleClick(driver.findElement(By.cssSelector(".mytest+p"))).perform();
		
		

	}

}
