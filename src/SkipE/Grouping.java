package SkipE;

import org.testng.annotations.Test;

public class Grouping 
{
	@Test(groups = { "sanity" })
	public void methodone()
	{
		System.out.println("This method belong to sanity testing");
	}
	
	@Test(groups = { "smoke" })
	public void methodtwo()
	{
		System.out.println("This method belong to smoke tesing");
	}
	
	@Test(groups = { "sanity" })
	public void methodthree()
	{
		System.out.println("This method belong sanity");
	}
	
	@Test(groups= {"regression"})
	public void methodfour()
	{
		System.out.println("This method belong to regression tesing");
	}
	
	@Test(groups= {"regression"})
	public void methodfive()
	{
		System.out.println("This method belong to regression tesing");
	}
	
	@Test(groups= {"regression"})
	public void regressinone()
	{
		
		System.out.println("This is belong to Regression");
	}
	
	@Test
	public void testcases1()
	{
		System.out.println("i am not belong to any group");
	}
	
	
}
