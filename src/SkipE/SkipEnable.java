package SkipE;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class SkipEnable 
{
	@Test(enabled = false)
	public void testmothod()
	{
		
		System.out.println("Testmethod one");
		
		
	}
	
	@Test
	public void testmothod2()
	{
		System.out.println("Testmethod two");
	}
	
	@Test(enabled = false)
	public void testmethod3()
	{
		System.out.println("Testmethodthree");
	}
	
	@Test(enabled = false)
	public void testmethod4()
	{
		System.out.println("Testmethodfoure");
	}

}
