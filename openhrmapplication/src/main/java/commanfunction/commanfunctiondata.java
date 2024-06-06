package commanfunction;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class commanfunctiondata {
	public static WebDriver driver = null;
	public static   Properties properties=null;


	public Properties loadpropertyfile() throws IOException {
		FileInputStream fileInputStream= new FileInputStream("config.properties");
		properties=new Properties();
		properties.load(fileInputStream);
		return properties;
	}	

	@BeforeSuite	
	public void launchbrowser() throws IOException 
	{

		loadpropertyfile();


		String browser=properties.getProperty("browser");
		String Url=properties.getProperty("Url");

		String driverlocation=properties.getProperty("driverlocation");	

		if (browser.equalsIgnoreCase("chrome")) {
			// Set the system property for ChromeDriver
			System.setProperty("webdriver.chrome.driver", driverlocation);
			System.out.println("Browser started successfully");
			driver= new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			// Set the system property for GeckoDriver (Firefox)
			System.setProperty("webdriver.gecko.driver", driverlocation);

			// Initialize FirefoxDriver
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();

		driver.get(Url);
		System.out.println("Browser launch URL");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}


	@AfterSuite
	public void teardown() {

		driver.quit();
		System.out.println("Browser closed successfully");
	}
}


