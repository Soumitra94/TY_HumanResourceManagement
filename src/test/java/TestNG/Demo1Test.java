
package TestNG;

import org.testng.annotations.Test;

import com.hrm.genericUtils.BaseClass;

public class Demo1Test extends BaseClass
{
	@Test(groups= {"smoke","regression"})
	public void Demo1Test()
	{
		System.out.println("----Demo1-----");
	}
	

}
