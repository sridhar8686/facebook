package Com.Example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcalendars {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		Thread.sleep(3000);
//		
//		int day=30;
//		
//		driver.findElement(By.id("first_date_picker")).click();
//		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[.="+day+"]")).click();
//		
//		driver.findElement(By.id("second_date_picker")).click();
//		
	
		
		driver.findElement(By.id("first_date_picker")).click();
		selectDate(driver, "27/Dec/2015");
		
		driver.findElement(By.id("second_date_picker")).click();
		selectDate(driver, "27/Dec/2030");
	}
		
		
		
		public static void selectDate(WebDriver driver, String date) throws Exception {
			
			Calendar calendar = Calendar.getInstance();
			
			try {
				
				SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd/MMM/yyyy");
			    targetDateFormat.setLenient(false);
				Date formattedTargetDate = targetDateFormat.parse(date);
				calendar.setTime(formattedTargetDate);
				
			} catch (Exception e) {
				throw new Exception("Invalid date is provided");
			}
		
				int targetMonth = calendar.get(Calendar.MONTH);
				int targetYear = calendar.get(Calendar.YEAR);
				int targetDay = calendar.get(Calendar.DATE);
				
//				December 2023
				
				
				String currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
				calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDate));
				int currentMonth = calendar.get(Calendar.MONTH);
				int currentYear = calendar.get(Calendar.YEAR);
				
				 while (currentMonth < targetMonth || currentYear < targetYear)	{
					 
					 driver.findElement(By.className("ui-datepicker-next")).click();
					    currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
						calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDate));
						currentMonth = calendar.get(Calendar.MONTH);
						currentYear = calendar.get(Calendar.YEAR);
					
				 }
				 
	            while (currentMonth > targetMonth || currentYear > targetYear)	{
	            	
	            	driver.findElement(By.xpath("//a/span[.='Prev']")).click();
				    currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
					calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDate));
					currentMonth = calendar.get(Calendar.MONTH);
					currentYear = calendar.get(Calendar.YEAR);
	            }
					 
					 
				 
				 if(currentMonth == targetMonth && currentYear == targetYear) {
					 
					 driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'datepicker-other-month'))]//a[.="+targetDay+"]")).click();
					 
				 }
				 else
					 throw new Exception ("current month and year are mismatched");
				 
		}
			
			
			
			
		
		
		

	
}


