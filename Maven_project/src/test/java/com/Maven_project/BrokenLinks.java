package com.Maven_project;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement>links = driver.findElements(By.tagName("a"));
		System.out.println("Total no oif links on the webpage  "+links.size());
		
		
		int noofbrokenlinks =0;
		int noofnotbrokenlinks=0;
		for (WebElement weblink : links) 
		{
			
			String hrefattValue =weblink.getAttribute("href");
			
			if(hrefattValue==null || hrefattValue.isEmpty()) 
			
			{
				System.out.println("Link is not available and unable to check");
				//continue;
				
				
			}
			
			try 
			
			{
				URL linkurl  = new URL(hrefattValue);//converting String to url
				HttpURLConnection connlinkurl = (HttpURLConnection) linkurl.openConnection();//open connection between url to server
				connlinkurl.connect();//connect server and sent request to the server
				
				if(connlinkurl.getResponseCode()>=400) 
				
				{
					System.out.println(linkurl+"======> broken link");
					noofbrokenlinks++;
					
				}else 
				{
					System.out.println(linkurl+"======> Not broken link");
					noofnotbrokenlinks++;
				}
				
				
			} 
			
			catch (Exception e) 
			{
				System.out.println(e);
			}
			
			
			
			
			
			
		}
             
		System.out.println("no of broken links  "+noofbrokenlinks);
		driver.close();
	}

}
