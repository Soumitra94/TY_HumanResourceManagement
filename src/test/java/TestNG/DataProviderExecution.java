package TestNG;

import org.testng.annotations.Test;

public class DataProviderExecution 
{
	@Test(dataProviderClass = DPfromExcel.class)
	
	public void getData(String name,int price)
	{
		System.out.println(name+" "+price);
	}

}
