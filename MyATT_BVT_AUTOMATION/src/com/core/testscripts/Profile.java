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
import com.core.testscripts.wireless.WirelessProfile;
import com.test.helper.LoginType;
import com.test.helper.TestConstants;
import com.thoughtworks.selenium.SeleneseTestBase;


public class Profile extends SeleneseTestBase {

	@Test
	public void testProfileLanding() throws Exception {
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
			WirelessProfile wirelessProfile = new WirelessProfile();
			wirelessProfile.testWirelessProfilePages();
		}
		
		if (loginType.getLoginType().equals(TestConstants.SLID)) {
			WirelessDashboard wirelessDashboard = new WirelessDashboard();
			wirelessDashboard.testWirelessDashboard();
		}

	}
}

