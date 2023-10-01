package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelTest 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Testyantra.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet("Organization");
		int count=sheet.getLastRowNum();
		int lastCell=sheet.getRow(1).getLastCellNum();
		for(int i=0;i<=count; i++)
		{
			String org=sheet.getRow(i).getCell(0).getStringCellValue();
			String loc=sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(org+"====>>"+loc);
		}
		
		
	}

}
