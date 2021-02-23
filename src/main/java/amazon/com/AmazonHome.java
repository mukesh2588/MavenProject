package amazon.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.PropertyManager;

public class AmazonHome {

	WebDriver driver;
	public AmazonHome(WebDriver driver)
	{
		this.driver=driver;
	//	PageFactory.initElements(this.driver, this);
	}

	/*	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchProduct;
	 */

	PropertyManager prop= new PropertyManager();
	
	public void enterProductToSearch(String enterProduct)
	{
		driver.findElement(By.xpath(prop.getProperty("searchProductProp"))).sendKeys(enterProduct);
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
