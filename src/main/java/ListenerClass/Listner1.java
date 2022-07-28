package ListenerClass;

import org.testng.ITestListener;
import org.testng.ITestResult;
//
//import org.testng.ITestResult;

public class Listner1 implements ITestListener {

	public void onTestStart(ITestResult result)
	{
		System.out.println(result.getName() + " is started");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println(result.getName() + " is passed");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println(result.getName() + " is Failed");
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println(result.getName() + " is skipped");
	}
}
