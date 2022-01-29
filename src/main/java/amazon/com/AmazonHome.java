package amazon.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utility.PropertyManager;

public class AmazonHome {

	WebDriver driver;
	ExtentTest logger;
	public AmazonHome(WebDriver driver)
	{
		this.driver=driver;
		
	//	PageFactory.initElements(this.driver, this);
	}
	public AmazonHome(WebDriver driver, ExtentTest logger)
	{
		this.driver=driver;
		this.logger=logger;
	//	PageFactory.initElements(this.driver, this);
	}

	/*	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchProduct;
	 */

	PropertyManager prop= new PropertyManager();
	
	public void enterProductToSearch(String enterProduct)
	{
		driver.findElement(By.xpath(prop.getProperty("searchProductProp"))).sendKeys(enterProduct);
	//	logger.log(LogStatus.PASS, "Product"+enterProduct +"entered succesfully");
	}

	/*@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement clickSearch;

	public void clickProductSearch()
	{
		clickSearch.click();
	} */
	
	public void clickProductSearch()
	{
		driver.findElement(By.xpath(prop.getProperty("clickSearchProp"))).click();
	}
	
	public void enterAmazonURL()
	{
		driver.get(prop.getProperty("amzazonURL"));
	}
}
