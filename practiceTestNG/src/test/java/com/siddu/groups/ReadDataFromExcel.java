package com.siddu.groups;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		
		
			
		
		 File file = new File("C:\\Users\\Ruchi and Munna\\eclipse-workspace\\practiceTestNG\\Excelfiles\\Book1.xlsx");
		 FileInputStream fis = new FileInputStream(file);
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 XSSFSheet sheet = workbook.getSheetAt(0);
		 
		 int rowcount = sheet.getPhysicalNumberOfRows();
		 for (int i = 0; i < rowcount; i++) {
			 
			 XSSFRow row = sheet.getRow(i);
			 
			 int Cellcount = row.getPhysicalNumberOfCells();
			 for (int j = 0; j < Cellcount; j++) {
				 XSSFCell cell = row.getCell(j);
				 
				 String Cellvalue = getCellvalue(cell);
				 
				 System.out.print("||"+Cellvalue);
				 
				 
				 
				 			}
			 
					 System.out.println();
			
		}
workbook.close();
fis.close();
	}
public static String getCellvalue(XSSFCell cell) {
	
	switch (cell.getCellType()) {
	case NUMERIC:
		return String.valueOf(cell.getNumericCellValue());
		
	case BOOLEAN:
		return String.valueOf(cell.getBooleanCellValue());
	case STRING:
		return cell.getStringCellValue();

	default:
		return cell.getStringCellValue();
	}
	
	
	
}
}
