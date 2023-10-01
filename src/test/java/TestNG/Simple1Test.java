package TestNG;

import org.testng.annotations.Test;

import com.hrm.genericUtils.BaseClass;

public class Simple1Test extends BaseClass
{
	@Test(groups="regression")
	public void Simple1Test()
	{
		System.out.println("---Simple1----");
	}


}
