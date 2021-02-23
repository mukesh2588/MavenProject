package utility;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTestMethods {
	
	@BeforeMethod
	public void setup()
	{
		DriverBuilder.createDriver();
		//DriverBuilder.createDriver("CHROME");
				
	}
	@AfterMethod
	public void quitBrowser()
	{
		DriverBuilder.quitDriver();
	}
	

}
