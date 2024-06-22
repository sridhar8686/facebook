package Com.Example;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Testscreenshots {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
//		file
		
//		File sourcefile = driver.getScreenshotAs(OutputType.FILE);
//		File destfile = new File("./Screenshots/img1.jpg");
//		Files.copy(sourcefile, destfile);
//		System.out.println("Screenshot saved sucessfully");
//		driver.quit();
		
//		byte array
		
//		byte[] byteArr = driver.getScreenshotAs(OutputType.BYTES);
//		File detsfile = new File("./Screenshots/img2.jpg");
//		FileOutputStream fos = new FileOutputStream(detsfile);
//		fos.write(byteArr);
//		fos.close();
//		System.out.println("Sscreenshot saved successfully");
//		driver.quit();
		
//		base64
		
		String base64code = driver.getScreenshotAs(OutputType.BASE64);
		byte[] byteArr = Base64.getDecoder().decode(base64code);
		File destfile = new File("./Screenshots/img3.jpg");
		FileOutputStream fos = new FileOutputStream(destfile);
		fos.write(byteArr);
		fos.close();
		System.out.println("Sscreenshot saved successfully");
		driver.quit();
		
		
		
		
		

	}

}
