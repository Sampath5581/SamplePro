package com.qa.ExtentReportListner;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Date;
import java.util.Calendar;





import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
//import org.testng.annotations.Test;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.IReporter;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Test;

public class ExtentReportListner implements IReporter {
	
	ExtentReports Extent;
	ExtentTest test;
	
	public void generateReport(List<XmlSuite> xmlSuites,List<ISuite> Suites, String outputDirectory)
	{
		Extent=new ExtentReports(outputDirectory+File.separator+"sampathReportExtent.html",true);
		
		for(ISuite suite:Suites){
			Map<String,ISuiteResult> result=suite.getResults();
			
			for(ISuiteResult r:result.values()){
				ITestContext context=r.getTestContext();
				
				
				buildTestNodes(context.getPassedTests(),LogStatus.PASS);
				buildTestNodes(context.getFailedTests(),LogStatus.FAIL);
				buildTestNodes(context.getSkippedTests(),LogStatus.SKIP);
				
			}
			
		}
		Extent.flush();
		Extent.close();
		
	}

	
	private void buildTestNodes(IResultMap passedTests, LogStatus pass) {
		// TODO Auto-generated method stub
		if(tests.size()>0){
			for(ISuiteResult result:tests.getAllResults()){
				test=Extent.startTest(result.getMethod().getMethodName());
				test.setStartedTime(getTime(result.getStartMillis()));
				test.setEndedTime(getTime(result.getEndMillis()));
				for(String group:result.getMethod().getGroups())
					test.assignCategory(group);
					if(((ITestResult) result).getThrowable() !=null){
				test.log(status,result.getThrowable());
			}else {
				test.log(LogStatus, "Test"+status.toString().toLowerCase()+"ed");
			}
			Extent.endTest(test);	
			}
		}
	}



		
		private Date getTime(long millis){
			Calendar calendar=calendar.getInstance();
			calendar.setTimeInMillis(millis);
			return calendar.getTime();
			
			
		}
}
	
	


