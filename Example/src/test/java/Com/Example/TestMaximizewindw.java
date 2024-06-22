package Com.Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestMaximizewindw {

	public static void main(String[] args) throws Exception {
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://google.com/");
		Thread.sleep(3000);
		
		

	}

}
