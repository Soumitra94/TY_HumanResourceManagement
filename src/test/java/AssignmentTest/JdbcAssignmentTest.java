
package AssignmentTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.xdevapi.Statement;

public class JdbcAssignmentTest
{
	public static void main(String[] args) throws Exception {
		
	
	Scanner s= new Scanner(System.in);
	System.out.println("Enter Name to add");
	String name = s.next();
	
	Connection con = null;
	Random ram = new Random();
	int random = ram.nextInt(100);
	
	try
	{
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet51","root","root");
		Statement state = (Statement) con.createStatement();
		
		String query = "select name from tyss;";
		ResultSet res = ((java.sql.Statement) state).executeQuery(query);
		
		boolean flag = false;
		while(res.next())
		{
			String actual = res.getString(1);
			if(actual.equalsIgnoreCase(name))
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("\n "+name+" is present in the table");
		}
		else
		{
			System.out.println("\n"+name+" does not exist the table");
			String query1 = "Insert into hrm1 values("+random+",'"+name+"');";
			
			int res1 = ((java.sql.Statement) state).executeUpdate(query1);			
		}
		}
		catch(Exception e)
		{}
		finally
		{
			con.close();
		}

}
}