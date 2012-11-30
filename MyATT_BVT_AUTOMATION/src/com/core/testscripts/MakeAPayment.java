/**
 * 
 */
package com.core.testscripts;

import java.io.BufferedWriter;

import org.junit.Test;

import com.test.helper.LoginType;
import com.thoughtworks.selenium.Selenium;
import com.unitedinternet.portal.selenium.utils.logging.LoggingSelenium;

/**
 * @author sm187t
 *
 */
public class MakeAPayment {

	Selenium selenium = LoginType.getInstance().getSelenium();
	LoggingSelenium loggingSelenium = LoginType.getInstance().getLoggingSelenium();
	BufferedWriter loggingWriter = LoginType.getInstance().getLoggingWriter();

	@Test
	public void testPayment() throws Exception {		
		
		Thread.sleep(5000);
		selenium.open("/olam/passthroughAction.myworld?actionType=MakePayment");
		

		String balance = "0.00";//selenium.getAttribute("css=orange");
		
		if (balance.equals("0.00")) {
			if (selenium.isElementPresent("id=makePaymentForm.paymentRequestsCustomize.paymentRequests[0].paymentItem1.methodNameId")) { 
				selenium.type("name=makePaymentForm.paymentRequestsCustomize.paymentRequests[0].paymentItem1.paymentAmount", selenium.getEval(String.valueOf(Math.floor((Math.random()*100))+1)));
				selenium.select("id=makePaymentForm.paymentRequestsCustomize.paymentRequests[0].paymentItem1.methodNameId", "*Card*");
				
				
				selenium.click("id=idBtnNext");
				selenium.waitForPageToLoad("40000");
				selenium.click("id=submitImg");
				selenium.waitForPageToLoad("70000");
			}
		} else {
			if (selenium.isElementPresent("id=makePaymentForm.paymentRequestsCustomize.paymentRequests[0].paymentItem1.methodNameId")) {
				selenium.click("name=paymentMethodForm.storePaymentProfileInd");
				selenium.click("css=img[alt=\"Continue\"]");
			}
		}
		
		/*//boolean divOpen = selenium.isElementPresent("//form[@id='paymentMethodForm']/p");
		// selenium.gotoIf("${divOpen}==false", "pass_divOpen");
		if (selenium.isElementPresent("*Payment Profile*")) {
			selenium.click("name=paymentMethodForm.storePaymentProfileInd");
			selenium.click("css=img[alt=\"Continue\"]");
		}
		selenium.type("name=paymentMethodForm.newCreditCardCustomerName", "asdfg");
		selenium.type("id=paymentMethodForm.cardNumber", "4127612347841100");
		selenium.type("name=paymentMethodForm.cardVerificationNumber", "123");
		selenium.select("id=paymentMethodForm.expirationMonth", "label=12");
		selenium.select("id=paymentMethodForm.expirationYear", "label=2013");
		selenium.type("name=paymentMethodForm.zip", "12345");
		selenium.click("name=paymentMethodForm.sendAsPinLess");
		
		// selenium.gotoIf("storedVars['payProfile']==false", "pass_payProfile");
		
		// selenium.label("pass_payProfile");
		
		// selenium.label("pass_divOpen");
		boolean cvvDiv = selenium.isElementPresent("//form[@id='paymentMethodForm']/div[2]/p");
		System.out.println(cvvDiv);
		// selenium.gotoIf("${cvvDiv}==false", "pass_cvvDiv");
		selenium.type("id=cardVerificationNumber", "123");
		selenium.click("css=img[alt=\"Continue\"]");
		// selenium.label("pass_cvvDiv");
		Thread.sleep(5000);
		selenium.click("id=idBtnNext");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(10000);
		boolean payAlert = selenium.isTextPresent("Payment Alert");
		// selenium.gotoIf("storedVars['payAlert']==false", "pass_payAlert");
		selenium.click("css=img[alt=\"Continue\"]");
		selenium.waitForPageToLoad("30000");
		// selenium.label("pass_payAlert");
		Thread.sleep(5000);
	
		selenium.click("id=submitImg");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(5000);


		//verifyTrue(selenium.isTextPresent("Payment Complete"));
		boolean fail = selenium.isTextPresent("Payment Failure");
		// selenium.gotoIf("${fail}==false", "passFail");
		String err = selenium.getText("css=p.usageSummaryTable");
		System.out.println(err);
		// selenium.label("passFail");
*/	}

}
