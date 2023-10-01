package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrm.genericUtils.ExcelUtility;

public class DpTest 
{
	@Test(dataProviderClass = DPfromExcel.class,dataProvider = "dataFromExcel")
	
		public void getData(String Pname,String Price,String size)
		{
			System.out.println(Pname+" "+Price+" "+size);
	

	}
	
	
	
	
	
	}


