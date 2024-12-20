package groups;

import org.testng.annotations.Test;

public class GroupExample 
{
	@Test(groups = {"sanity"})
	public void test1()
	{
	System.out.println("this is testCase 1");
	}
	
	@Test(groups = {"sanity","smoke"})
	public void test2()
	{
		System.out.println("this is testCase 2");
	}
	@Test(groups = {"smoke"})
	public void test3()
	{
	    System.out.println("this is testCase 3");
	}
}
