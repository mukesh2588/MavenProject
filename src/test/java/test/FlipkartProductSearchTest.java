package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import flipkart.com.FlipkartHome;
import utility.BaseTestMethods;
import utility.DriverBuilder;
import utility.PropertyManager;

public class FlipkartProductSearchTest extends BaseTestMethods {
	
	@Test
	public void searchProduct()
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
