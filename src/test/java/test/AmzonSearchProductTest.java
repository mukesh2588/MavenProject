package test;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;


import amazon.com.AmazonHome;
import utility.BaseTestMethods;
import utility.DriverBuilder;
import utility.PropertyManager;

public class AmzonSearchProductTest extends BaseTestMethods{

	@Test(invocationCount = 1)
	public void searchProduct()
	{
		WebDriver driver= DriverBuilder.getdriver();
		AmazonHome searchProduct=new AmazonHome(driver);
		PropertyManager prop= new PropertyManager();
	    driver.get(prop.getProperty("amzazonURL"));
	 

	//	driver.get("https://www.amazon.in/");
		
		//searchProduct.enterAmazonURL();
		driver.manage().window().maximize();
		
		searchProduct.enterProductToSearch("Samsum M51"); 
		searchProduct.clickProductSearch();
	}


}
