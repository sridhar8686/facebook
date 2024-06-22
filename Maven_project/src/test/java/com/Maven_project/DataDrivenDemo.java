package com.Maven_project;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenDemo {

	public static void main(String[] args) throws IOException {
		 
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\Data\\myfile.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheetAt(0);
		int NoofRows=sheet.getLastRowNum();
		System.out.println(NoofRows);
		int NoofCells= sheet.getRow(0).getLastCellNum();  
		System.out.println(NoofCells);
		
		for (int r = 0; r <=NoofRows; r++) 
		
		{
			XSSFRow currentrow= sheet.getRow(r);
			
			for (int c = 0; c <=NoofCells; c++)			
			{
				XSSFCell cell = currentrow.getCell(c);
				 System.out.print(cell.toString()+"\t"); 
				
			}
			System.out.println();
		}
workbook.close();
fis.close();
	}

}
