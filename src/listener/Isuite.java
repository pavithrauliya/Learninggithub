package listener;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class Isuite implements ISuiteListener{

	@Override
	public void onStart(ISuite suite) {
		System.out.println("test case:" + suite.getName()+"is start");
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("test case:" + suite.getName()+"is start");	
	}

}
