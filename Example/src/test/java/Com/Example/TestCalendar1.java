package Com.Example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCalendar1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		 driver.findElement(By.id("third_date_picker")).click();
//		 driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[.=27]")).click();
		 
//		 String currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
		 
		 
		 
		 
		 
		String targetdate = "05/feb/2030";
		Calendar calendar = Calendar.getInstance();
		
	
		
		SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd/MMM/yyyy");
	    targetDateFormat.setLenient(false);
		targetDateFormat.parse(targetdate);
		
		
		int targetMonth = calendar.get(Calendar.MONTH);
		int targetYear = calendar.get(Calendar.YEAR);
		int targetDay = calendar.get(Calendar.DATE);
		
		String currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(currentDate);
		
		
		
//		WebElement MonthElement = driver.findElement(By.className("ui-datepicker-month"));
//	    Select MonthDropDown = new Select(MonthElement);
//	    calendar.setTimeZone(targetMonth);
	    
//		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']//option[.="+targetMonth+"]")).click();
//		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']//option[.="+targetYear+"]")).click();
//		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[.="+targetDay+"]]")).click();
	    
//	    MonthDropDown.selectByIndex(targetMonth);
		
		
		
		 
		 
		 
		 

	}

}
