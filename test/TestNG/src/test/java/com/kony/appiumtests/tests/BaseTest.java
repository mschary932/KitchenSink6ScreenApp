/**************************************************************
Project Name			:	Test Automation Sample
Package Name			:	com.kony.appiumtests.Tests
Class Name				:	BaseTest
Purpose of the Class	:	To maintain desired capabilities, 
 							communiting with Appium server. 
 **************************************************************/
package com.kony.appiumtests.tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest {

	/**
	 * A base constructor that sets the page's driver
	 * 
	 * The page structure is being used within this test in order to separate
	 * the page actions from the tests.
	 * 
	 * @BeforeTest block will be before the @Test is going to execute.
	 * 
	 * @AfterTest block will be executed after all the Test's are executed.
	 * 
	 * @AfterSuite will be executed after all the tests executed, the mechanisms
	 *             like Closing DB connection, Quitting from the app are written
	 *             in this section.
	 */
	public static String platformName;
	public static AndroidDriver androiddriver;
	public static IOSDriver iosdriver;
	public static RemoteWebDriver driver; // AppiumDriver class contains all
											// methods shared by iOS and Android

	@BeforeSuite
	// To Launch App on device.
	public void beforeSuite() throws Exception {

		System.out.println("initializing is starting..........");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		// The commented section is used when try to work in local Environment.

		
		//Capabilities for Android platform
		/*  capabilities.setCapability("deviceName", "4d00962cd43212ad");
		  capabilities.setCapability("platformVersion","4.4.2");
		  capabilities.setCapability("platformName", "Android" );
		  capabilities.setCapability("appPackage", "com.orgname.NovartisDemo");
		  capabilities.setCapability("appActivity",
		 "com.orgname.NovartisDemo.KssampleAG");
		 */

		  platformName = capabilities.getCapability("platformName").toString();

		if ("MAC".equalsIgnoreCase(platformName)) {
			System.out.println("Inside platform MAC............");
			if (iosdriver == null) {
				iosdriver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
			}
			driver = iosdriver;
		} else {
			if (driver != null) {
				driver.quit();
				driver = null;
			}
			if (androiddriver != null) {
				androiddriver.quit();
				androiddriver = null;
			}
			if (iosdriver != null) {
				iosdriver.quit();
				iosdriver = null;
			}

			System.out.println("Inside platform ANDROID............");
			androiddriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver = androiddriver;
		}

	}

	@BeforeClass
	public void navigateTo() {

	}

	@BeforeTest
	public abstract void setUpPage();

	@AfterTest
	public void afterTest() {

	}

	@AfterSuite
	// App close
	public void tearDownAppium() {
		if (driver != null)
			driver.quit();
		if (androiddriver != null)
			androiddriver.quit();
		if (iosdriver != null)
			iosdriver.quit();
	}

}
