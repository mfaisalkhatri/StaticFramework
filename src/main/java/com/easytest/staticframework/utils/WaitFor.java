package com.easytest.staticframework.utils;

public class WaitFor {

	public static void sleep (int millisecs) {

		try {
			Thread.sleep (millisecs);
		}
		catch (final InterruptedException e) {
			e.printStackTrace ();
		}
	}
	
}
