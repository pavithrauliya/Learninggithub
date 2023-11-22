package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestlisnter implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test case:" + result.getName()+"is start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test case:" + result.getName()+"is sucess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test case:" + result.getName()+"is faile");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test case:" + result.getName()+"is skipped");
	}

	@Override
	public void onStart(ITestContext context) {
	System.out.println("test case:" + context.getCurrentXmlTest().getName()+"onstart");
			}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test case:" + context.getCurrentXmlTest().getName()+"onfinish");
	}

}
