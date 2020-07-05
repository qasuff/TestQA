package SkipE;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProvider1 
{
    @Test
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(dataProvider="getData")
	public void test2(String username,String password)
	{
		System.out.println("test2");
		System.out.println(username);
	    System.out.println(password);
	}
	@Test
	public void test3()
	{
		System.out.println("test3");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		
		//1st
		data[0][0]="Firstusername";
		data[0][1]="FirstPassword";
		
		//2st
		data[1][0]="Secondusername";
		data[1][1]="secondpassword";
		
		
		//3rd
		data[2][0]="Thirdsuername";
		data[2][1]="Thirdpassword";
		return data;
	}
	
}
