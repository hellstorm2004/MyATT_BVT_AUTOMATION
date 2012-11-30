package com.test.helper;

import java.io.BufferedWriter;

import com.thoughtworks.selenium.Selenium;
import com.unitedinternet.portal.selenium.utils.logging.LoggingSelenium;

public class LoginType {

	private static LoginType instance = null;
	
	protected LoginType() {
		// Exists only to defeat instantiation.
	}
	public static LoginType getInstance() {
		if(instance == null) {
			instance = new LoginType();
		}
		return instance;
	}



	public String loginType = null;
	Selenium selenium = null;
	private BufferedWriter loggingWriter;
	LoggingSelenium loggingSelenium;
	long testStartTime;
	long testEndTime;
	private static TestRunValues testRunValues;
	
	
	
	public long getTestStartTime() {
		return testStartTime;
	}
	public void setTestStartTime(long testStartTime) {
		this.testStartTime = testStartTime;
	}
	public long getTestEndTime() {
		return testEndTime;
	}
	public void setTestEndTime(long testEndTime) {
		this.testEndTime = testEndTime;
	}
	public LoggingSelenium getLoggingSelenium() {
		return loggingSelenium;
	}
	public void setLoggingSelenium(LoggingSelenium loggingSelenium) {
		this.loggingSelenium = loggingSelenium;
	}
	public BufferedWriter getLoggingWriter() {
		return loggingWriter;
	}
	public void setLoggingWriter(BufferedWriter loggingWriter) {
		this.loggingWriter = loggingWriter;
	}
	public Selenium getSelenium() {
		return selenium;
	}
	public void setSelenium(Selenium selenium) {
		this.selenium = selenium;
	}
	public String getLoginType() {
		return loginType;
	}

	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}
	
	public static TestRunValues getTestRunValues() {
		
		if (null == testRunValues) {
			return new TestRunValues();
		} else {
			return testRunValues;
		}
	}
	public static void setTestRunValues(TestRunValues testRunValues) {
		LoginType.testRunValues = testRunValues;
	}

}
