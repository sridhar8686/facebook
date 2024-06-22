package com.siddu.groups;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWorkbook {

	public static void main(String[] args) throws Exception {
		
//		HSSFWorkbook workbook = new HSSFWorkbook();
//		HSSFSheet sheet = workbook.createSheet("siddu");
//		sheet.createRow(0);
//		sheet.getRow(0).createCell(0).setCellValue("Hello");
//		sheet.getRow(0).createCell(1).setCellValue("World");
//		
//		sheet.createRow(1);
//		sheet.getRow(1).createCell(0).setCellValue("Siddu");
//		sheet.getRow(1).createCell(1).setCellValue("Sridhar");
//		
//		File file = new File("C:\\Users\\Ruchi and Munna\\eclipse-workspace\\practiceTestNG\\Excelfiles\\Test1.xls");
//		workbook.write(file);
//		workbook.close();
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("siddu");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Hello");
		sheet.getRow(0).createCell(1).setCellValue("World");
		
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("Siddu");
		sheet.getRow(1).createCell(1).setCellValue("Sridhar");
		
		File file = new File("C:\\Users\\Ruchi and Munna\\eclipse-workspace\\practiceTestNG\\Excelfiles\\Test2.xlsx");
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();
		
		

	}

}
