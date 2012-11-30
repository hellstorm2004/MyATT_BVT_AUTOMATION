/**
 * 
 */
package com.core.testscripts;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.Test;

import com.test.helper.LoginType;
import com.test.helper.TestConstants;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;
import com.unitedinternet.portal.selenium.utils.logging.LoggingUtils;

/**
 * @author sm187t
 *
 */
public class Shop extends SeleneseTestBase {

	Selenium selenium = LoginType.getInstance().getSelenium();
	
	@Test
	public void testShop() throws Exception {
		
		try {
			selenium.open("/olam/passthroughAction.myworld?actionType=Shop");
			Thread.sleep(20000);
			selenium.waitForPageToLoad("20000");
			System.out.println("Checking java compilation error");
			verifyFalse(selenium.isTextPresent("*weblogic*"));
			System.out.println("Checking FCU");
			verifyFalse(selenium.isTextPresent("Functionality Currently Unavailable"));
			verifyTrue(selenium.isTextPresent("Shop"));
			verifyTrue(selenium.isTextPresent("Account"));
			verifyTrue(selenium.isElementPresent("css=li.account-number"));
			System.out.println("Big Promo");
			verifyTrue(selenium.isElementPresent("//p/a/img"));
			System.out.println("Promo 1");
			verifyTrue(selenium.isElementPresent("css=div.w346 > a > img"));
			System.out.println("promo 2");
			verifyTrue(selenium.isElementPresent("css=div.last.w346 > a > img"));
			System.out.println("Promo 3");
			verifyTrue(selenium.isElementPresent("//div[@id='primary-content']/div[3]/a/img"));
			System.out.println("Promo 4");
			verifyTrue(selenium.isElementPresent("//div[@id='primary-content']/div[4]/a/img"));
			System.out.println("Footer");
			verifyTrue(selenium.isElementPresent("css=div.logos"));
			System.out.println("RHN");
			verifyTrue(selenium.isElementPresent("link=Shop Support"));
			
			selenium.captureScreenshot(TestConstants.screenshotsResultsPath + File.separator + "Shop_Page_" + LoggingUtils.timeStampForFileName() + ".jpeg");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@After
	public void tearDown() {
		
		BufferedWriter loggingWriter = LoginType.getInstance().getLoggingWriter();
		selenium.stop();
		try {
			if (null != loggingWriter) {
				loggingWriter.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		long endTime = new Date().getTime();
		LoginType.getInstance().setTestEndTime(endTime);

		System.out.println("Total Test Run Time: " + Float.parseFloat(String.valueOf(((endTime - LoginType.getInstance().getTestStartTime())/1000))));

	}

}
