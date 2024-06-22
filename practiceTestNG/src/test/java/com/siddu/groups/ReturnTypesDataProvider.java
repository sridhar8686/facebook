package com.siddu.groups;

import org.testng.annotations.Test;

public class ReturnTypesDataProvider {
	@Test(dataProvider="Testdata", dataProviderClass = DataSupplier.class)
	
	public void datatypes(Integer[] s) throws Exception{
		
		System.out.println(s);
	}
	
	
}




