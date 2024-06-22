package Com.Example;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPageloadtimeout {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Instant starttime = Instant.now();
		System.out.println(starttime.toString());
		driver.get("https://www.royalmansour.com/en/");
		
		Instant endtime = Instant.now();
		System.out.println(endtime.toString());
		Duration duration = Duration.between(starttime, endtime);
		System.out.println("pageloadtime: " +duration.toMillis()+ " millisecnds");
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
;
	}

}
