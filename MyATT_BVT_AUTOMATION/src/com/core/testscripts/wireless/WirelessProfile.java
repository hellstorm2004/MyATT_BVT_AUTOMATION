/**
 * 
 */
package com.core.testscripts.wireless;

import java.io.File;

import com.test.helper.LoginType;
import com.test.helper.TestConstants;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;
import com.unitedinternet.portal.selenium.utils.logging.LoggingUtils;

/**
 * @author sm187t
 *
 */
public class WirelessProfile extends SeleneseTestBase {

	Selenium selenium = LoginType.getInstance().getSelenium();

	public void testWirelessProfilePages() {

		try {
			selenium.open("/olam/passthroughAction.myworld?actionType=ViewProfile");
			Thread.sleep(20000);
			selenium.waitForPageToLoad("60000");
			System.out.println("Checking java compilation error");
			System.out.println();
			assertFalse(selenium.isTextPresent("Functionality Currently Unavailable"));
			verifyFalse(selenium.isTextPresent("ACCOUNT\nINFORMATION"));
			System.out.println(selenium.isTextPresent("ACCOUNT\nINFORMATION"));
			verifyFalse(selenium.isTextPresent("USER\nINFORMATION"));
			System.out.println(selenium.isTextPresent("USER\nINFORMATION"));
			verifyFalse(selenium.isTextPresent("MARKETING\nPREFERENCES"));
			System.out.println(selenium.isTextPresent("MARKETING\nPREFERENCES"));
			verifyFalse(selenium.isTextPresent("Account Information"));
			System.out.println(selenium.isTextPresent("Account Information"));
			verifyFalse(selenium.isTextPresent("Billing Contact Information"));
			System.out.println(selenium.isTextPresent("Billing Contact Information"));
			verifyFalse(selenium.isTextPresent("Billing ?ame"));
			System.out.println(selenium.isTextPresent("Billing ?ame"));
			verifyFalse(selenium.isElementPresent("//div[@id='primary-content']/div/div[3]/div[5]/form/div/div[3]/label"));
			System.out.println(selenium.isElementPresent("//div[@id='primary-content']/div/div[3]/div[5]/form/div/div[3]/label"));
			verifyFalse(selenium.isTextPresent("Address ?ine 1"));
			System.out.println(selenium.isTextPresent("Address ?ine 1"));
			verifyFalse(selenium.isElementPresent("//div[@id='primary-content']/div/div[3]/div[5]/form/div[3]/div[3]/label"));
			System.out.println(selenium.isElementPresent("//div[@id='primary-content']/div/div[3]/div[5]/form/div[3]/div[3]/label"));
			verifyFalse(selenium.isTextPresent("City"));
			System.out.println(selenium.isTextPresent("City"));
			verifyFalse(selenium.isElementPresent("//div[@id='primary-content']/div/div[3]/div[5]/form/div[5]/div[3]/label"));
			System.out.println(selenium.isElementPresent("//div[@id='primary-content']/div/div[3]/div[5]/form/div[5]/div[3]/label"));
			verifyFalse(selenium.isTextPresent("State"));
			System.out.println(selenium.isTextPresent("State"));
			verifyFalse(selenium.isElementPresent("//div[@id='primary-content']/div/div[3]/div[5]/form/div[6]/div[3]/label"));
			System.out.println(selenium.isElementPresent("//div[@id='primary-content']/div/div[3]/div[5]/form/div[6]/div[3]/label"));
			verifyFalse(selenium.isTextPresent("ZIP Code"));
			System.out.println(selenium.isTextPresent("ZIP Code"));
			verifyFalse(selenium.isElementPresent("//div[@id='primary-content']/div/div[3]/div[5]/form/div[7]/div[3]/label"));
			System.out.println(selenium.isElementPresent("//div[@id='primary-content']/div/div[3]/div[5]/form/div[7]/div[3]/label"));
			verifyFalse(selenium.isTextPresent("Home Phone"));
			System.out.println(selenium.isTextPresent("Home Phone"));
			verifyFalse(selenium.isElementPresent("//div[@id='primary-content']/div/div[3]/div[5]/form/div[8]/div[3]/label"));
			System.out.println(selenium.isElementPresent("//div[@id='primary-content']/div/div[3]/div[5]/form/div[8]/div[3]/label"));
			verifyFalse(selenium.isTextPresent("Billing Email Address"));
			System.out.println(selenium.isTextPresent("Billing Email Address"));
			verifyFalse(selenium.isElementPresent("//div[@id='primary-content']/div/div[3]/div[5]/form/div[11]/div[3]/label"));
			System.out.println(selenium.isElementPresent("//div[@id='primary-content']/div/div[3]/div[5]/form/div[11]/div[3]/label"));
			verifyFalse(selenium.isTextPresent("Payment Options"));
			System.out.println(selenium.isTextPresent("Payment Options"));
			verifyFalse(selenium.isTextPresent("AutoPay Status"));
			System.out.println(selenium.isTextPresent("AutoPay Status"));
			verifyFalse(selenium.isTextPresent("Paper Bill Option"));
			System.out.println(selenium.isTextPresent("Paper Bill Option"));
			verifyFalse(selenium.isTextPresent("Bill Language"));
			System.out.println(selenium.isTextPresent("Bill Language"));
			verifyFalse(selenium.isTextPresent("Paper Bill Setting"));
			System.out.println(selenium.isTextPresent("Paper Bill Setting"));
			verifyFalse(selenium.isElementPresent("link=Change setting"));
			System.out.println(selenium.isElementPresent("link=Change setting"));
			
			selenium.captureScreenshot(TestConstants.screenshotsResultsPath + File.separator + "Profile_Account_Information_Page_" + LoggingUtils.timeStampForFileName() + ".jpeg");

			selenium.click("id=userInfo");
			Thread.sleep(15000);

			verifyFalse(selenium.isElementPresent("css=div.hover-row"));
			verifyFalse(selenium.isTextPresent("Login Information"));
			verifyFalse(selenium.isTextPresent("Current Password"));
			verifyFalse(selenium.isElementPresent("//div[@id='primary-tab-content']/div[4]/div/div[2]"));
			verifyFalse(selenium.isTextPresent("Manage Login Information"));
			verifyFalse(selenium.isTextPresent("Contract Information"));
			verifyFalse(selenium.isTextPresent("Contract end date"));
			verifyFalse(selenium.isElementPresent("//div[@id='primary-tab-content']/div[10]/div/div[2]"));
			verifyFalse(selenium.isTextPresent("*alued customer since"));
			verifyFalse(selenium.isElementPresent("//div[@id='primary-tab-content']/div[10]/div[3]/div[2]"));
			verifyFalse(selenium.isElementPresent("link=Customer Service Summary & Contract"));
			verifyFalse(selenium.isTextPresent("Primary User"));
			verifyFalse(selenium.isTextPresent("First Name"));
			verifyFalse(selenium.isElementPresent("css=div.float-left > div.form_row > div.text"));
			verifyFalse(selenium.isTextPresent("Middle Initial"));
			verifyFalse(selenium.isElementPresent("//div[@id='primary-tab-content']/div[13]/div/div[2]"));
			verifyFalse(selenium.isTextPresent("Last Name"));
			verifyFalse(selenium.isElementPresent("//div[@id='primary-tab-content']/div[13]/div/div[3]/div[2]"));
			verifyFalse(selenium.isTextPresent("E-mail address"));
			verifyFalse(selenium.isElementPresent("//div[@id='primary-tab-content']/div[13]/div/div[4]/div[2]"));
			verifyFalse(selenium.isTextPresent("Gender"));
			verifyFalse(selenium.isElementPresent("//div[@id='primary-tab-content']/div[13]/div/div[5]/div[2]"));
			verifyFalse(selenium.isTextPresent("Browser Language"));
			verifyFalse(selenium.isElementPresent("//div[@id='primary-tab-content']/div[13]/div/div[6]/div[2]"));
			verifyFalse(selenium.isElementPresent("link=Edit User Information"));
			
			selenium.captureScreenshot(TestConstants.screenshotsResultsPath + File.separator + "Profile_User_Information_Page_" + LoggingUtils.timeStampForFileName() + ".jpeg");
			
			selenium.click("css=img.btn-pad");
			selenium.waitForPageToLoad("30000");
			Thread.sleep(5000);
			
			selenium.captureScreenshot(TestConstants.screenshotsResultsPath + File.separator + "Profile_Marketing_Preference_Page_" + LoggingUtils.timeStampForFileName() + ".jpeg");
			
			selenium.click("id=DNS");
			selenium.waitForPageToLoad("30000");
			Thread.sleep(5000);
			selenium.waitForPageToLoad("40000");
			
			verifyFalse(selenium.isElementPresent("link=View Account Level Preferences"));
			System.out.println("Checking for errors on page");
			assertFalse(selenium.isElementPresent("css=div.error"));
			boolean error = selenium.isElementPresent("css=div.error");
			if (error) {
				System.out.println(selenium.getText("css=div.error"));
			} else {
				System.out.println("Profile page loaded properly!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
