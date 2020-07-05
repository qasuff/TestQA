package SkipE;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeGroups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;

import org.testng.annotations.AfterMethod;

public class AnnotationTng 
{
	@Test
	public void  testcase1()
	{
		System.out.println("testcase1");
	}

	@BeforeTest
	public void  BeforeMethod()
	{
		System.out.println("BeforeMethod");
	}

	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("BeforeSuite");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("AfterSuite");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest");
	}
	
	@BeforeGroups
	public void BeforeGroups()
	{
		System.out.println("BeforeGroups");
	}
	@AfterGroups
	public void AfterGroups()
	{
		System.out.println("AfterGroups");
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("AfterMethod");
	}
	

}
