package com.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.factory.DriverFactory;

public class Leadership extends DriverFactory {
	
	public WebElement leadershipLink() {
		return getDriver().findElement(By.xpath("//span[text()='Leadership']"));
	}

}
