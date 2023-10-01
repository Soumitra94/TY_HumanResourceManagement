package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFileTest 
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		Properties p=new Properties();
		p.load(fis);
		String browser=p.getProperty("browser");
		String url=p.getProperty("url");
		String un=p.getProperty("username");
		String pwd=p.getProperty("password");
		System.out.println(browser);
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
		
		
	}

}
