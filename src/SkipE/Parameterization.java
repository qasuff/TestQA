package SkipE;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization 
{
	@Parameters({ "browser" })
	@Test
	public void testcaseOne(String browser)
	{
		System.out.println("Browser pass:-"+browser);
	}
	
	@Parameters({ "user", "pass" })
	@Test
	public void testcaseTwo(String user, String pass)
	{
		System.out.println("Parameter for username:-"+user);
		
		System.out.println("Parameter for pass:-"+pass);
		
		
	}
}
