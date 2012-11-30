/**
 * 
 */
package com.core.testscripts;

import java.io.File;

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
public class BillUsageReports extends SeleneseTestBase {

	Selenium selenium = LoginType.getInstance().getSelenium();

	@Test
	public void testBillUsageReports() throws Exception {

		try {
			selenium.open("/olam/passthroughAction.myworld?actionType=BillingReports");
			Thread.sleep(5000);
			selenium.waitForPageToLoad("40000");
			System.out.println("Checking java compilation error");
			assertFalse(selenium.isTextPresent("*weblogic*"));
			System.out.println("Checking FCU");
			assertFalse(selenium.isTextPresent("Functionality Currently Unavailable"));
			assertTrue(selenium.isTextPresent("Bill*Reports"));
			assertTrue(selenium.isElementPresent("link=View bill details"));
			assertTrue(selenium.isElementPresent("link=Billing history"));
			assertTrue(selenium.isElementPresent("link=View bill & usage reports"));
			assertTrue(selenium.isElementPresent("link=Payment activity"));
			assertTrue(selenium.isElementPresent("link=Change billing address"));
			assertTrue(selenium.isElementPresent("link=Payment options"));
			assertTrue(selenium.isTextPresent("Account"));
			System.out.println("BAN");
			assertTrue(selenium.isElementPresent("css=li.account-number"));
			assertTrue(selenium.isTextPresent("Create a Report"));
			assertTrue(selenium.isTextPresent("Report"));
			assertTrue(selenium.isElementPresent("name=reportType"));
			assertTrue(selenium.isTextPresent("Bill period start date"));
			assertTrue(selenium.isElementPresent("name=billStartDate"));
			assertTrue(selenium.isTextPresent("Bill period end date"));
			assertTrue(selenium.isElementPresent("name=billEndDate"));
			System.out.println("Submit Button");
			assertTrue(selenium.isElementPresent("css=img[alt=\"submit\"]"));
			assertTrue(selenium.isTextPresent("Report View"));
			assertTrue(selenium.isElementPresent("link=Go to Account Overview"));
			
			selenium.captureScreenshot(TestConstants.screenshotsResultsPath + File.separator + "Billing_Usage_Reports_" + LoggingUtils.timeStampForFileName() + ".jpeg");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
