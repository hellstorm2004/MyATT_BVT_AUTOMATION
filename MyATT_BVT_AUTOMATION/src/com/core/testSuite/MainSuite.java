package com.core.testSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.core.testscripts.BillDetails;
import com.core.testscripts.BillHistory;
import com.core.testscripts.BillUsageReports;
import com.core.testscripts.Dashboard;
import com.core.testscripts.Login;
import com.core.testscripts.Profile;
import com.core.testscripts.Shop;
import com.googlecode.junit.ext.JunitExtRunner;
import com.googlecode.junit.ext.RunIf;
import com.googlecode.junit.ext.checkers.Checker;
import com.test.helper.LoginType;
import com.test.helper.TestRunValues;

@RunWith(JunitExtRunner.class)
		
		
public class MainSuite {
	
	public void runTest() {
		LoginType loginType = LoginType.getInstance();
		TestRunValues testRunValues = LoginType.getTestRunValues();
		
		if (null != testRunValues.getWirelessID() && null != testRunValues.getWirelessPassword()) {
			System.out.println("In here!");
		}
		
		if (null != testRunValues.getSlidWithWirelessUserID() && null != testRunValues.getSlidwithWirelessPassword()) {
			
		}
		
		if (null != testRunValues.getuVerseMID() && null != testRunValues.getuVersePassword()) {
			
		}

		if (null != testRunValues.getSlidwithUVerseID() && null != testRunValues.getSlidwithUVersePassword()) {
	
		}

		if (null != testRunValues.getWirelineID() && null != testRunValues.getWirelinePassword()) {
	
		}
		if (null != testRunValues.getSlidWithWirelineUserID() && null != testRunValues.getSlidwithWirelinePassword()) {
	
		}
	}

}

