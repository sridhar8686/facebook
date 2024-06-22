package Com.Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetUrlTitlePagesource {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.seleniumhq.org");
		
		String Currenturl = driver.getCurrentUrl();
		
		System.out.println("Current URL" +Currenturl);
		
		String Title = driver.getTitle();
		
		System.out.println("Title " +Title);
		
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);
		
		driver.quit();
		
		
		

	}

}
