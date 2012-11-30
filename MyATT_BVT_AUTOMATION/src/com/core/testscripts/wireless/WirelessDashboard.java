package com.core.testscripts.wireless;

import static com.unitedinternet.portal.selenium.utils.logging.LoggingAssert.assertFalse;
import static com.unitedinternet.portal.selenium.utils.logging.LoggingAssert.assertTrue;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Test;

import com.test.helper.LoginType;
import com.test.helper.TestConstants;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;
import com.unitedinternet.portal.selenium.utils.logging.LoggingSelenium;
import com.unitedinternet.portal.selenium.utils.logging.LoggingUtils;

public class WirelessDashboard {

	Selenium selenium = LoginType.getInstance().getSelenium();
	LoggingSelenium loggingSelenium = LoginType.getInstance().getLoggingSelenium();
	BufferedWriter loggingWriter = LoginType.getInstance().getLoggingWriter();

	@Test
	public void testWirelessDashboard() throws Exception {
		
		try {

			
			//Thread.sleep(15000);
			System.out.println("Checking java compilation error");
			System.out.println("Checking FCU");
			assertFalse("Functionality Currently Unavailable", selenium.isTextPresent("Functionality Currently Unavailable"), loggingSelenium);
			
			System.out.println("Welcome message");
			assertTrue("Welcome Back Message", selenium.isTextPresent("Welcome back"), loggingSelenium);
			
			
			System.out.println("Customer Since");
			assertTrue("Valued Customer Since", selenium.isTextPresent("Thank you for being a valued customer since"), loggingSelenium);
			
			System.out.println("Balance");
			String balance = selenium.getAttribute("css=span.colorOrange.font30imp");
			if (balance != null) {
				assertTrue("Balance", selenium.isTextPresent(balance), loggingSelenium);
			}			
			
			System.out.println("View Bill Details Link");
			assertTrue("View Bill Details Link", selenium.isElementPresent("link=View bill details"), loggingSelenium);
			
			System.out.println("Make a Payment Button");
			assertTrue("Make A Payment Button", selenium.isElementPresent("css=img[alt=\"Make a Payment\"]"), loggingSelenium);
			
			System.out.println("My Plans");
			assertTrue("Plans", selenium.isTextPresent("My Plans"), loggingSelenium);
			
			System.out.println("Phone Section");
			assertTrue("Phone Section", selenium.isElementPresent("//div[@id='servicecontent']/div[2]/div/div[2]/div/div/div[3]/div/div/div/div/div/div[2]/div"), loggingSelenium);
			
			System.out.println("Promotion Section");
			assertTrue("Promotion Section", selenium.isElementPresent("//div[@id='promoContainer']/ul/li[2]/a/img"), loggingSelenium);
			
			selenium.captureScreenshot(TestConstants.screenshotsResultsPath + File.separator + "Wireless_Dashboard_Page_" + LoggingUtils.timeStampForFileName() + ".jpeg");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
