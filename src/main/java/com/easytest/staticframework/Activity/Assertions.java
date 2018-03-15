package com.easytest.staticframework.Activity;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Assertions {

	public static WebDriver driver;

	public Assertions(WebDriver driver) {
		Assertions.driver = driver;
	}

	public static void checkAlert(String locator, String message) {
		FindElement find = new FindElement(driver);
		String msg = find.targetId(locator).getText();
		Assert.assertEquals(message, msg);
	}

}
