package Com.Example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJavascriptExecutor {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/");
		
		
		
//		driver.get("https://www.facebook.com/");
		
		//ID: document.getElementById("u_0_5_XL")
		//Name:document.getElementsByName("pass")[0]
		//ClassName: document.getElementsByClassName("inputtext _55r1 _6luy")[0]
		//TagName: document.getElementsByTagName("input")[2]
		//CssSelector: document.querySelector('#email')
		//Xpath: document.evaluate(Xpression, contextNode,namespaceResolver,resultType,result).singleNodeValue;
//		document.evaluate("//input[@id='email']",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue;
		
		
		//Find Element
		
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//	WebElement element = (WebElement) jsExecutor.executeScript("return document.getElementById('email')");
//	element.sendKeys("id");
	
	//Write text
	
//	jsExecutor.executeScript("document.getElementById('email').value='Sridhar'");
	
	//click
//	jsExecutor.executeScript("document.getElementsByName('login')[0].click();");
	//Highlight
	
//	jsExecutor.executeScript("document.evaluate(\"//img[@alt='Facebook']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.setAttribute('style','border:2px red solid;background:yellow');");
//	Thread.sleep(3000);
//	jsExecutor.executeScript("document.getElementById('email').setAttribute('style','border:2px red solid;background:yellow;color:white');");
//	Thread.sleep(3000);
//	driver.close();
	
	jsExecutor.executeScript("window.scrollTo(0,500)");

	}

}
