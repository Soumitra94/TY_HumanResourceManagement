package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;




public class WriteTheDataInExcel {

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\Testyantra.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet("Organization");
		sheet.createRow(12).createCell(0).setCellValue("QSpider");
		
		
		sheet.getRow(12).createCell(1).setCellValue("Chennai");
		
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\Testyantra.xlsx");
		book.write(fos);
		}
		
		
		

	}


