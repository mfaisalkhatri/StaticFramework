package com.easytest.staticframework.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TypeinField {

	public WebDriver driver;
	
	public TypeinField(WebDriver driver) {
	
		this.driver = driver;
	}
	
	public static void SendKeys(WebElement element , String value){
	    String val = value; 
	    element.clear();

	    for (int i = 0; i < val.length(); i++){
	        char c = val.charAt(i);
	        String s = new StringBuilder().append(c).toString();
	        element.sendKeys(s);
	    }       
	}
	
	
	
	
}
