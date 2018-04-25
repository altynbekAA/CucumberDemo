package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;



public class Driver {

	private static WebDriver driver;

	/**
	 *  WebDriver factory 
	 *  takes String as an input and returns the implementation of he WebDriver based on that
	 */
	public static WebDriver getDriver(String browser ) {

		String driverType = driver==null ? Config.getProperty("browser"):browser;
		
		if(driver==null ) {

			switch (driverType.toLowerCase()) {

			case "chrome":
				System.setProperty("webdriver.chrome.driver", Config.getProperty("chromePath"));
				driver= new ChromeDriver();
				break;

			case"firefox":
				System.setProperty("webdriver.gecko.driver", Config.getProperty("ffpath"));
				driver= new FirefoxDriver();
				break;

			case"safari":

				driver= new SafariDriver();
				break;


			default:
				System.setProperty("webdriver.chrome.driver", Config.getProperty("chromepath"));
				driver= new ChromeDriver();
				break;
			}
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}
	
}
