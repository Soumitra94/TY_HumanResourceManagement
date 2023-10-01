package com.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrm.genericUtils.BaseClass;

public class SampleRetryTest extends BaseClass
{
	@Test(retryAnalyzer = com.hrm.genericUtils.RetryImp.class)
	public void retryTest()
	{
		Assert.assertEquals("A", "B");
		
	}
	

}
