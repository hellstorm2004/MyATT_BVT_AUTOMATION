package com.core.testscripts;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestCase;
import com.thoughtworks.selenium.Selenium;

@SuppressWarnings("deprecation")
public class NewTest extends SeleneseTestCase {
	
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "https://mwmonitor34.stage.att.com:8442");

	}
	
	public void testLogin() throws Exception {
		Selenium seleniumTest = selenium;
		seleniumTest.start();
		seleniumTest.windowMaximize();
		seleniumTest.open("/olam/loginAction.olamexecute");
		seleniumTest.type("userID", "qay1210_2034018081");
		seleniumTest.type("password", "test1ng");
		seleniumTest.click("css=input[type=\"image\"]");
		seleniumTest.waitForPageToLoad("200000");
		if (seleniumTest.isElementPresent("passCond")) {
			seleniumTest.type("userPasscode", "7777");
			seleniumTest.click("id=bt_continue");
		} 
		
		if (seleniumTest.isElementPresent("Create Your AT&amp;T Access ID")) {
			
		}

	}
}