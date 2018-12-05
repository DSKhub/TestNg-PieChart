package com.java.maven.piechart.report.util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScpTestListener implements ITestListener {
	public static int passCount=0;
	public static int failCount=0;
	public static int skipCount=0;
	
	public void onFinish(ITestContext finish) {
		System.out.println("\n\nPass count:"+passCount);
		System.out.println("Skip count:"+skipCount);
		System.out.println("Failed count:"+failCount+"\n\n");
		
		try {
			ReportGeneraterUtil.generateChart(passCount,failCount,skipCount);
		}  catch (Exception e) {
			e.printStackTrace();
		}
     }
	public void onStart(ITestContext result) {
		System.out.println(result.getOutputDirectory());
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Method Name:"+result.getMethod().getMethodName());
	failCount++;
		
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Method Name:"+result.getMethod().getMethodName());
		skipCount++;
		
	}
	public void onTestStart(ITestResult result) {
	 
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Method Name:"+result.getMethod().getMethodName());
		passCount++;
			
	}

	
	
}
