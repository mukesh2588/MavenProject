package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

public class DriverBuilder {


	static String driverPath=System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\";

	static WebDriver driver;

	public static void createDriver(String browser)
	{

		switch(browser.toUpperCase())
		{
		case "CHROME" :
			System.setProperty("webdriver.chrome.drive",driverPath+"chromedriver.exe");
			driver=new ChromeDriver();
			break;
		case "FIREFOX" :
			System.setProperty("webdriver.gecko.driver", driverPath+"geckodriver.exe");
			driver=new FirefoxDriver();
			break;

		default:
			System.out.println("Browser "+browser+" Not found");

		}

	}
	
	public static void createDriver()
	{

		
		  System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		  driver=new ChromeDriver();
		 
			/*
			 * System.setProperty("webdriver.gecko.driver", driverPath+"geckodriver.exe");
			 * driver=new FirefoxDriver();
			 */

	}

	public static WebDriver getdriver()
	{
		return driver;
	}

	public static void quitDriver()
	{
		driver.quit();
	}


}
