package com.hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.utils.PropertyFileReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks {

	private PropertyFileReader config = new PropertyFileReader();
	private WebDriver driver;
	private String browser = config.getProperty("Browser");
	private String url = config.getProperty("URL");

	@Before(order = 0)
	public void launchBrowser() {
		driver = DriverFactory.init(browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Before(order = 1)
	public void navigateToUrl() {
		driver.get(url);
	}

	@After(order = 0)
	public void closeBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}

}
