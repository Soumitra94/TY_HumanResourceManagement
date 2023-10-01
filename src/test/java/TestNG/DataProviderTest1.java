package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrm.genericUtils.ExcelUtility;

public class DataProviderTest1 
{
	

	@Test(dataProvider = "mobiles")
	public void getData(String Pname,String Price,String size)
	{
	
		System.out.println(Pname+" "+Price+" "+size);
	}
	@DataProvider
	public Object[][] dataFromExcel() throws Throwable
	{
		ExcelUtility eLib=new ExcelUtility();
		Object[][] value = eLib.getMultipleSetData("DP");
		return value;
	}

}
