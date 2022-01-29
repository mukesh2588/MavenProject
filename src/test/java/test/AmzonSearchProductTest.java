package test;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;


import amazon.com.AmazonHome;
import flipkart.com.FlipkartHome;
import utility.BaseTestMethods;
import utility.DriverBuilder;
import utility.PropertyManager;

public class AmzonSearchProductTest extends BaseTestMethods{

	//@Test(invocationCount = 2)
	@Test
	public void searchProductAmazon()
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
	@Test
	public void searchProductFlipkart()
	{
		WebDriver driver= DriverBuilder.getdriver();
		FlipkartHome searchProduct= new FlipkartHome(driver);
		PropertyManager propRead = new PropertyManager();

		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//searchProduct.enterUserName("9960296074");
		searchProduct.enterUserName(propRead.getProperty("UserName"));
		searchProduct.enterPassword(propRead.getProperty("Password"));
		searchProduct.clickLoginButton();
		searchProduct.enterProductToSearch("Samsung F41");
		//searchProduct.clickLoginButton();

	}


}
