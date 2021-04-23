package com.saucedemo.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	public XSSFWorkbook workbook;
	public ExcelDataProvider() {
	
		File file= new File("./TestData/SauceData.xlsx");
		
		FileInputStream fis;
		
		try {
			 fis = new FileInputStream(file);
					
			workbook= new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			
			System.out.println("Enable to load excelSheet" +e.getMessage());
			
		}
		
	}
		
			public String getUserName(String sheetName, int row, int collumn) {
				
				return workbook.getSheet(sheetName).getRow(row).getCell(collumn).getStringCellValue();	
				
					}
			
			public String getUserPassword(String sheetName, int row, int collumn) {
				return workbook.getSheet(sheetName).getRow(row).getCell(collumn).getStringCellValue();
				
			}
}
