/**
 * 
 */
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

/**
 * @author sm187t
 *
 */

@RunWith(Suite.class)
@SuiteClasses({Login.class, Dashboard.class, BillDetails.class, BillHistory.class, BillUsageReports.class, Profile.class, Shop.class})
public class WirelessTestSuite {

}
