package com.siddu.TakeScreenshots;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerClass extends BaseTest implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		CaptureScreenshot(result.getTestContext().getName()+"_"+result.getMethod().getMethodName()+".jpg");
	}
	
	

}
