package com.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utils.PropertyFileReader;

public class DriverFactory {

	private static WebDriver driver;
	private static PropertyFileReader config = new PropertyFileReader();

	public static WebDriver init(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver.exe");
			ChromeOptions opt = new ChromeOptions();
			if (config.getProperty("Headless").equalsIgnoreCase("true")) {
				opt.addArguments("--headless", "--window-size=1920,1080");
			}
			driver = new ChromeDriver(opt);
		} else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else {
			System.err.println("No setup has been done for browser- " + browser);
		}
		return driver;
	}

	public static WebDriver getDriver() {
		if (driver == null) {
			return driver;
		} else {
			return driver;
		}
	}
}
