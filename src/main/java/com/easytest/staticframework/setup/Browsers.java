package com.easytest.staticframework.setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

	public WebDriver driver;
	final String dir = System.getProperty("user.dir");

	public void openSite(String browser, String baseurl) {

		if (browser == "Chrome") {
			final String filename = "chromedriver.exe";
			final String path = getClass().getClassLoader().getResource(filename).getPath();
			System.setProperty("webdriver.chrome.driver", path);
			driver = new ChromeDriver();
			driver.get(baseurl);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
		}

		if (browser == "Firefox") {
			final String filename = "geckodriver.exe";
			final String path = getClass().getClassLoader().getResource(filename).getPath();
			System.setProperty("webdriver.gecko.driver", path);
			driver = new FirefoxDriver();
			driver.get(baseurl);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}

		
		
	}
	
	public void closeSite () {
	driver.quit();	
		
	}

}
