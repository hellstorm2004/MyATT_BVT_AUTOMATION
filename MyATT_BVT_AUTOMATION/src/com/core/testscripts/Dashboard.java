/**
 * 
 */
package com.core.testscripts;

/**
 * @author sm187t
 *
 */
import org.junit.Test;

import com.core.testscripts.wireless.WirelessDashboard;
import com.test.helper.LoginType;
import com.test.helper.TestConstants;
import com.thoughtworks.selenium.SeleneseTestBase;


public class Dashboard extends SeleneseTestBase {

	@Test
	public void testDashboard() throws Exception {
		LoginType loginType = LoginType.getInstance();
		
		if (loginType.getLoginType().equals(TestConstants.TELCO)) {
			WirelessDashboard wirelessDashboard = new WirelessDashboard();
			wirelessDashboard.testWirelessDashboard();
		}
		
		if (loginType.getLoginType().equals(TestConstants.UVERSE)) {
			WirelessDashboard wirelessDashboard = new WirelessDashboard();
			wirelessDashboard.testWirelessDashboard();
		}
		
		if (loginType.getLoginType().equals(TestConstants.WIRELESS)) {
			WirelessDashboard wirelessDashboard = new WirelessDashboard();
			wirelessDashboard.testWirelessDashboard();
		}
		
		if (loginType.getLoginType().equals(TestConstants.SLID)) {
			WirelessDashboard wirelessDashboard = new WirelessDashboard();
			wirelessDashboard.testWirelessDashboard();
		}

	}
}

