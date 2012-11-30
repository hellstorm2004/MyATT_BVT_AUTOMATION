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
public class BillDetails extends SeleneseTestBase  {

	Selenium selenium = LoginType.getInstance().getSelenium();

	@Test
	public void testBillDetailsPage() throws Exception {

		try {
			selenium.open("/view/billSummary.do?caller=DB");
			Thread.sleep(10000);
			selenium.waitForPageToLoad("40000");
			System.out.println("Checking java compilation error");
			assertFalse(selenium.isTextPresent("*weblogic*"));
			System.out.println("Checking FCU");
			assertFalse(selenium.isTextPresent("Functionality Currently Unavailable"));
			assertTrue(selenium.isTextPresent("Bill Details"));
			assertTrue(selenium.isElementPresent("link=View bill details"));
			assertTrue(selenium.isElementPresent("link=Billing history"));
			assertTrue(selenium.isElementPresent("link=View bill & usage reports"));
			assertTrue(selenium.isElementPresent("link=Payment activity"));
			assertTrue(selenium.isElementPresent("link=Change billing address"));
			assertTrue(selenium.isElementPresent("link=Payment options"));
			assertTrue(selenium.isTextPresent("Account"));
			System.out.println("BAN");
			assertTrue(selenium.isElementPresent("css=li.account-number"));
			assertTrue(selenium.isTextPresent("Billing Period"));
			System.out.println("Period of BIll");
			assertTrue(selenium.isElementPresent("id=account"));
			assertTrue(selenium.isElementPresent("link=Print"));
			assertTrue(selenium.isElementPresent("link=Paper bill (PDF)"));
			System.out.println("Tour my bill link");
			//assertTrue(selenium.isElementPresent("id=4300096_SSO_A_Login_051"));
			assertTrue(selenium.isTextPresent("Bill-At-A-Glance"));
			assertTrue(selenium.isTextPresent("Previous Balance"));
			assertTrue(selenium.isTextPresent("Payment"));
			assertTrue(selenium.isTextPresent("Adjustments"));
			assertTrue(selenium.isTextPresent("Balance"));
			assertTrue(selenium.isTextPresent("New Charges This is the amount due for this account's specific billing period. This amount includes: monthly recurring charges, usage charges, government fees and taxes, credits, adjustments, and other charges."));
			assertTrue(selenium.isTextPresent("Total Amount Due*"));
			assertTrue(selenium.isElementPresent("link=Additional bill information"));
			assertTrue(selenium.isTextPresent("Bill Details"));
			System.out.println("Bill Details Section");
			assertTrue(selenium.isElementPresent("css=h4.serviceName"));
			assertTrue(selenium.isTextPresent("Additional Bill Elements"));
			assertTrue(selenium.isTextPresent("Billing Messages"));
			assertTrue(selenium.isElementPresent("link=Important Information"));
			assertTrue(selenium.isElementPresent("link=Promos from your billing statement"));
			assertTrue(selenium.isTextPresent("Additional Bill Links"));
			assertTrue(selenium.isElementPresent("link=Enroll in AutoPay"));
			assertTrue(selenium.isTextPresent("Enroll in paperless billing"));
			assertTrue(selenium.isElementPresent("link=Parental controls"));
			
			selenium.captureScreenshot(TestConstants.screenshotsResultsPath + File.separator + "Bill_Details_Page_" + LoggingUtils.timeStampForFileName() + ".jpeg");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
