package com.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.factory.DriverFactory;

public class AboutUs extends DriverFactory {

	public WebElement aboutUsLink() {
		return getDriver().findElement(By.xpath("//span[text()='About us']"));
	}

}
