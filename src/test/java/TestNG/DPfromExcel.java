	package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import com.hrm.genericUtils.IPathconstants;

public class DPfromExcel 
{
	@DataProvider
	public Object[][] dataFromExcel() throws Throwable
	{
		FileInputStream fis=new FileInputStream(IPathconstants.excelPath);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet("DP");
		int lastRow=sheet.getLastRowNum();
		int lastCell=sheet.getRow(0).getLastCellNum();
		
		Object[][] obj=new Object[lastRow+1][lastCell];
		for(int i=0;i<=lastRow;i++)
		{
			for(int j=0;j<lastCell;j++)
			{
				obj[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj;
		
		
	}

}
