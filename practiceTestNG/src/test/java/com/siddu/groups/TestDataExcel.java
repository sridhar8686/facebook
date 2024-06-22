package com.siddu.groups;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class TestDataExcel {
	
	@DataProvider(name="logindata", parallel = true)
	
	public String[][] getdata() throws Exception {
		
		 File file = new File("C:\\Users\\Ruchi and Munna\\eclipse-workspace\\practiceTestNG\\Excelfiles\\Orange.xlsx");
		 FileInputStream fis = new FileInputStream(file);		 
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 XSSFSheet sheet = workbook.getSheetAt(0);
		 int noOfRows = sheet.getPhysicalNumberOfRows();
		 int noOfColumns = sheet.getRow(0).getLastCellNum();
		 String[][] data = new String [noOfRows-1][noOfColumns];
		 
		 for (int i = 0; i < noOfRows-1; i++) {
			 for (int j = 0; j < noOfColumns; j++) {
				 
				 DataFormatter df = new DataFormatter();
				 data[i][j]= df.formatCellValue(sheet.getRow(i+1).getCell(j));
				
			}
			workbook.close();
			fis.close();
			
		}
		 return data;
		
	}
	

}
