package flipkart.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.PropertyManager;

public class FlipkartHome {
	WebDriver driver;


	public FlipkartHome(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver, driver);
	}
	
	PropertyManager prop = new PropertyManager();
	
	/*
	 * @FindBy(xpath="//input[@type='text'][@class='_2IX_2- VJZDxU']") WebElement
	 * enterEmailOrMobile;
	 */
	
	public void enterUserName(String userName)
	{
		driver.findElement(By.xpath(prop.getProperty("enterEmailOrMobile"))).sendKeys(userName);
		//enterEmailOrMobile.sendKeys(userName);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(By.xpath(prop.getProperty("enterPassword"))).sendKeys(password);
	}
	
	public void clickLoginButton()
	{
		driver.findElement(By.xpath(prop.getProperty("clickLogin"))).click();
	}
	
	public void enterProductToSearch(String enterProduct)
	{
		driver.findElement(By.xpath(prop.getProperty("enterSearchProduct"))).sendKeys(enterProduct);
				
	}
	
	/*public void clkSearchButton()
	{
		driver.findElement(By.xpath(prop.getProperty("clickSearchButton"))).sendKeys(Keys.ENTER);
	}*/

	
	

}
