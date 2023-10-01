package TestNG;

import org.testng.annotations.Test;

import com.hrm.genericUtils.BaseClass;

public class Sample1Test extends BaseClass
{
	@Test(groups="smoke")
	public void Sample1Test()
	{
		System.out.println("----Sample1----");
	}
	

}

