package com.easytest.staticframework.tests;

import com.easytest.staticframework.Activity.FindElement;
import com.easytest.staticframework.setup.Browsers;
import static com.easytest.staticframework.utils.TypeinField.SendKeys;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test1 extends Browsers {

	@Test
	public void googleTest() {

		String baseurl = "http://www.google.co.in";
		Browsers browser = new Browsers();
		browser.openSite("Chrome", baseurl);

		FindElement find = new FindElement(browser.driver);
		WebElement txtbox = find.targetId("lst-ib");
		SendKeys(txtbox, "abc");
		txtbox.sendKeys(Keys.TAB);
		WebElement submit = find.targetName("btnK");
		submit.click();
		
		closeSite();
	}

}
