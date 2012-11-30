package com.core.testscripts;

import static com.unitedinternet.portal.selenium.utils.logging.LoggingAssert.assertFalse;

import java.io.BufferedWriter;
import java.io.File;
import java.util.Date;
import java.util.StringTokenizer;

import org.junit.Before;
import org.junit.Test;

import com.test.helper.LoginType;
import com.test.helper.SendMail;
import com.test.helper.TestConstants;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.HttpCommandProcessor;
import com.thoughtworks.selenium.Selenium;
import com.unitedinternet.portal.selenium.utils.logging.HtmlResultFormatter;
import com.unitedinternet.portal.selenium.utils.logging.LoggingCommandProcessor;
import com.unitedinternet.portal.selenium.utils.logging.LoggingDefaultSelenium;
import com.unitedinternet.portal.selenium.utils.logging.LoggingResultsFormatter;
import com.unitedinternet.portal.selenium.utils.logging.LoggingSelenium;
import com.unitedinternet.portal.selenium.utils.logging.LoggingUtils;


public class Login /*extends SeleneseTestBase*/ {

	LoginType loginType = LoginType.getInstance();

	@Before
	public void setUp() throws Exception {

		Long startTime = new Date().getTime();
		loginType.setTestStartTime(startTime);
		System.out.println("Test Start Time: " + startTime);

		BufferedWriter loggingWriter = loginType.getLoggingWriter();

		if (!new File(TestConstants.screenshotsResultsPath).exists()) {
			new File(TestConstants.screenshotsResultsPath).mkdirs();
		}

		final String resultHtmlFileName = TestConstants.resultsPath + File.separator + "sampleResultSuccess.html";
		System.err.println("resultHtmlFileName=" + resultHtmlFileName);

		loggingWriter = LoggingUtils.createWriter(resultHtmlFileName, TestConstants.RESULT_FILE_ENCODING, true);

		LoggingResultsFormatter htmlFormatter = new HtmlResultFormatter(loggingWriter, TestConstants.RESULT_FILE_ENCODING);
		htmlFormatter.setScreenShotBaseUri(TestConstants.SCREENSHOT_PATH + "/"); // has to be "/" as this is a URI
		htmlFormatter.setAutomaticScreenshotPath(TestConstants.screenshotsResultsPath);
		LoggingCommandProcessor myProcessor = new LoggingCommandProcessor(new HttpCommandProcessor("localhost", 4444, TestConstants.FIREFOX, TestConstants.TEST_URL), htmlFormatter);
		myProcessor.setExcludedCommands(new String[] {});

		LoggingSelenium loggingSelenium = new LoggingDefaultSelenium(myProcessor);
		loginType.setLoggingSelenium(loggingSelenium);

		DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, TestConstants.FIREFOX, TestConstants.TEST_URL);
		loginType.setSelenium(selenium);

		selenium.start();
		selenium.windowMaximize();
	}

	@Test
	public void testLogin() throws Exception {

		Selenium selenium = loginType.getSelenium();
		LoggingSelenium loggingSelenium = loginType.getLoggingSelenium();
		SendMail sendMail = new SendMail();

		// Opening the Login Page
		selenium.open("/olam/loginAction.olamexecute");
		Thread.sleep(7000);
		selenium.waitForPageToLoad("15000");
		System.out.println("Checking java compilation error");
		System.out.println("Checking FCU");
		assertFalse("Functionality Currently Unavailable", selenium.isTextPresent("Functionality Currently Unavailable"), loggingSelenium);



		selenium.type("id=userID", TestConstants.USER_ID);
		selenium.type("id=password", TestConstants.PASSWORD);

		selenium.click("css=input[type=\"image\"]");
		Thread.sleep(10000);

		// If Passcode Page is presented.
		if (selenium.isTextPresent("Confirm Your Security Passcode")) {
			selenium.type("id=passcode", TestConstants.PASSCODE_1234);
			selenium.captureScreenshot(TestConstants.screenshotsResultsPath + File.separator + "Passcode_Page_" + LoggingUtils.timeStampForFileName() + ".jpeg");
			selenium.click("id=bt_continue");
		} 
		Thread.sleep(5000);

		// If Upgrade Interstitial is shown
		if (selenium.isTextPresent("Would You Like to Check Your Upgrade Eligibility?")) {
			selenium.captureScreenshot(TestConstants.screenshotsResultsPath + File.separator + "Upgrade_Eligibility_Page_" + LoggingUtils.timeStampForFileName() + ".jpeg");
			selenium.click("id=continueLink");
		} 
		Thread.sleep(5000);

		// If SLID Promo Interestitial is shown
		if (selenium.isTextPresent("Create Your AT&T Access ID")) {
			selenium.captureScreenshot(TestConstants.screenshotsResultsPath + File.separator + "SLID_Promo_Interstitial_Page_" + LoggingUtils.timeStampForFileName() + ".jpeg");
			selenium.click("id=remindMe");
		} 
		Thread.sleep(10000);

		// Check Cookie
		String colam_ctn = selenium.getCookieByName(TestConstants.COLAM_CTN);

		StringTokenizer stringTokenizer = new StringTokenizer(colam_ctn, ";");
		while (stringTokenizer.hasMoreTokens()) {
			String value = stringTokenizer.nextToken();
			if (value.contains("lgn")) {				
				String [] temp = value.split("=");
				loginType.setLoginType(temp[1]);
				System.out.println("Login Type: " + temp[1]);
				break;
			}
		}

		// Send BVT Update
		//sendMail.sendMail();
	}

	/*@After
	public void tearDown() throws Exception {
		selenium.stop();
	}*/
}
