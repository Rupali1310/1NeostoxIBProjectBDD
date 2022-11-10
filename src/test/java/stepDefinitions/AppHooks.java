package stepDefinitions;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.utilities.DriverFactory;
import com.utilities.ReadConfig;
import com.utilities.UtilClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks {
	
	private DriverFactory driverfactory;
	private WebDriver driver;
	private ReadConfig readconfig;
	private UtilClass util;
	
	@Before(order=0)
	public void loggerStart()
	{
		util = new UtilClass(driver);
		util.getLogger();
	}
	
	@After(order=0)
	public void loggerEnd()
	{
//		logger.info("Execution completed");
	}
	
	@Before(order = 1)
	public void start()
	{
		readconfig= new ReadConfig();
		driverfactory = new DriverFactory();
		driver = driverfactory.browserInit(readconfig.getBrowserName());
		//logger.info("Browser Launes");
		driver.get(readconfig.getUrl());
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//logger.info("Browser max, provided implicit wait, and opens url");
		
	}
	
	@After(order = 1)
	public void tearDown()
	{
//		driver.quit();
	}
}
