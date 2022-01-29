package utility;


import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;




public class BaseTestMethods {
	
	ExtentReports reports;
	ExtentTest logger;
	
	@BeforeSuite
	public void startReport()
	{
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("ddMMyyyyhhMMss");
		String timeStamp=sdf.format(date);
		
		String filePath=System.getProperty("user.dir")+"\\reports\\"+timeStamp+".html";
		reports=new ExtentReports(filePath);
			
	}
		
	@BeforeMethod
	public void setup(Method method)
	{
		String testMethodName=method.getName();
		DriverBuilder.createDriver();
		//DriverBuilder.createDriver("CHROME");
		logger=reports.startTest(testMethodName);
		logger.log(LogStatus.INFO, "Executing test cases "+testMethodName);
				
	}
	
	/*@BeforeMethod
	public void setup()
	{
		DriverBuilder.createDriver();
		//DriverBuilder.createDriver("CHROME");
				
	}*/
	
	@AfterMethod
	public void quitBrowser()
	{
		DriverBuilder.quitDriver();
		reports.endTest(logger);
	}
	
	@AfterSuite
	public void closeReport()
	{
		reports.flush();
	}
	

}
