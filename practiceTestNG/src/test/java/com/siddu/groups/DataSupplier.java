package com.siddu.groups;

import org.testng.annotations.DataProvider;

public class DataSupplier {
@DataProvider (indices = {1})
	
	public Integer[] Testdata() {
		
		Integer[] data = new Integer[] { 
				
				123,
				456,
				789
				
				
				
		};
		
		
		
		return data;
		
		
		
		
	}

}
