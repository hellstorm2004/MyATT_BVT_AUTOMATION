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
public class BillHistory extends SeleneseTestBase {
	
	Selenium selenium = LoginType.getInstance().getSelenium();

	@Test
	public void testBillHistory() throws Exception {

		try {
			selenium.open("/olam/passthroughAction.myworld?actionType=ViewBillHistory&gnLinkId=t1004");
			Thread.sleep(5000);
			selenium.waitForPageToLoad("40000");
			System.out.println("Checking java compilation error");
			verifyFalse(selenium.isTextPresent("*weblogic*"));
			System.out.println("Checking FCU");
			verifyFalse(selenium.isTextPresent("Functionality Currently Unavailable"));
			verifyTrue(selenium.isElementPresent("link=View bill details"));
			verifyTrue(selenium.isElementPresent("link=Billing history"));
			verifyTrue(selenium.isElementPresent("link=View bill & usage reports"));
			verifyTrue(selenium.isElementPresent("link=Payment activity"));
			verifyTrue(selenium.isElementPresent("link=Change billing address"));
			verifyTrue(selenium.isElementPresent("link=Payment options"));
			verifyTrue(selenium.isTextPresent("Account"));
			System.out.println("BAN");
			verifyTrue(selenium.isElementPresent("css=li.account-number"));
			verifyTrue(selenium.isTextPresent("exact:Wireless Bills  What's this?"));
			verifyTrue(selenium.isTextPresent("Bill Period"));
			verifyTrue(selenium.isTextPresent("Total Charges for Bill Period"));
			System.out.println("Billing Period");
			verifyTrue(selenium.isElementPresent("css=nobr"));
			System.out.println("Billing Amount");
			verifyTrue(selenium.isElementPresent("css=td.forceRight.TopBorderSolid2"));
			verifyTrue(selenium.isElementPresent("link=View"));
			
			selenium.captureScreenshot(TestConstants.screenshotsResultsPath + File.separator + "Bill_History_Page_" + LoggingUtils.timeStampForFileName() + ".jpeg");
			
		}  catch (Exception e) {
			e.printStackTrace();
		}
	}

}
