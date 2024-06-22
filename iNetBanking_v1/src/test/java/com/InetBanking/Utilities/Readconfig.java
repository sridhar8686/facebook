package com.InetBanking.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	
	Properties pro;
	
	
	public Readconfig() {
		
		File src = new File("./Configuration/Config.properties");
		
		try {
			
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
		} catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}
	}

	
	public String getApplication() {
		
		String url = pro.getProperty("baseUrl");
		return url;
	}
	public String getUsername() {
		String UserName = pro.getProperty("UserName");
		return UserName;
		
		
	}
	public String getPassword() {
		
		String Password= pro.getProperty("PassWord");
		return Password;
	}
	
	
	
}
