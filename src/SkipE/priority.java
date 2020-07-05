package SkipE;

import org.testng.annotations.Test;

public class priority 
{

	@Test(priority= 1)
	public void A()
	{
		System.out.println("c");
	}
	
	@Test(priority= 2)
	public void B()
	{
       System.out.println("B");
       
	}
	
	@Test(priority= 3)
    public void C()
	{
		System.out.println("A");
	}
	
	
}
