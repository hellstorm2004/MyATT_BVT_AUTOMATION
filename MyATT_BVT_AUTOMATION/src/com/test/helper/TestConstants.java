package com.test.helper;

import java.io.File;


public class TestConstants {
	
	// Test Setup Details
	public static final String CHROME = "*chrome";
	public static final String INTERNET_EXPLORER = "*iehta";
	public static final String FIREFOX = "*firefox";
	public static final String SAFARI = "*safari";
	public static final String TEST_URL = "https://mwmonitor18.stage.att.com:8442/";
	
	// Logging Information
	public static final String RESULT_FILE_ENCODING = "UTF-8";
	public static final String SCREENSHOT_PATH = "screenshots";
	private static final String RESULTS_BASE_PATH = "target" + File.separator + "loggingResults";
	public static String resultsPath = new File(RESULTS_BASE_PATH).getAbsolutePath();
	public static final String screenshotsResultsPath = new File(RESULTS_BASE_PATH + File.separator + SCREENSHOT_PATH).getAbsolutePath();
	
	
	//Login Details
	public static final String USER_ID = "7854243855";
	//public static final String USER_ID = "qay1210_2034018081";

	public static final String PASSWORD = "tester";
	public static final String PASSWORD_TEST1NG = "test1ng";
	public static final String PASSWORD_TESTER = "tester";
	public static final String PASSWORD_987321a = "987321a";

	public static final String PASSCODE_1111 = "1111";
	public static final String PASSCODE_1234 = "1234";
	
	// Cookie Name
	public static final String COLAM_CTN = "colam_ctn";
	
	// LoginTypes
	public static final String TELCO = "T";
	public static final String UVERSE = "U";
	public static final String WIRELESS = "W";
	public static final String SLID = "S";
	

}
