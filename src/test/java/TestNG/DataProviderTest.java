package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest
{
	@Test(dataProvider = "mobiles")
	public void getData(String product,int price)
	{
		System.out.println(product+" "+price);
	}
	@DataProvider
	public Object[][] mobiles()
	{
		Object[][] obj = new Object[2][2];
		
		obj[0][0]="Samsung";
		obj[0][1]=25000;
		
		obj[1][0]="Iphone";
		obj[1][1]=50000;
		return obj;
		
	}

}
