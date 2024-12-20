package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass implements ITestListener
{
	public void onStart(ITestContext context)//It will be executed before all the test methods execution
	{
		System.out.println("Testcase execution will be starteds");
	}
	public void onTestStart(ITestResult result)
	{
		System.out.println("Testcases execution is started");
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Testcase execution is successful");
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Testcase execution is failure");
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Testcase execution is Skipped");
	}
	public void onFinish(ITestContext context)
	{
		System.out.println("After all the testcases are executed");
	}

}
