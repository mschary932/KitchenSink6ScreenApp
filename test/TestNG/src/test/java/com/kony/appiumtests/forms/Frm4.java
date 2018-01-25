/**************************************************************
Project Name			:	Test Automation Sample
Package Name			:	com.kony.appiumtests.Forms
Class Name				:	Frmfive
Purpose of the Class	:	To maintain the repository for the locators
 **************************************************************/

package com.kony.appiumtests.forms;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * extends is the keyword used to inherit the properties of a class. In this we
 * are using extends to inherit the properties from BaseForm class.
 */
public class Frm4 extends BaseForm {

	public Frm4(RemoteWebDriver driver) {
		super(driver); // super() is used to invoke immediate parent class
		// constructor.
	}

	// Locators used in Form Five
	/**
	 * Use UIAutomator technique to find elements of a web page. Here we are
	 * using driver.findElementByAndroidUIAutomator() along with UiSelector to
	 * find the Web Element of a page.
	 */

	@FindBy(xpath = "//android.widget.Button[@text='Show Location']")
	public WebElement btn_ShowLocation;	
	
	@FindBy(className = "android.webkit.WebView")
	public WebElement lbl_browser;

	@FindBy(className = "android.view.View")
	public WebElement lbl_map;

	@iOSFindBy(xpath="//UIAElement[1]")
	@AndroidFindBy(xpath = "//android.widget.Spinner[@index='0']")
	public WebElement search_box;

	@iOSFindBy(xpath="//UIAButton[2]")
	@AndroidFindBy(xpath = "//android.widget.Button[@index='2']")
	public WebElement search_btn;

	@AndroidFindBy(xpath = "//android.view.View[contains(@resource-id,'tsfi')]")
	public WebElement srch_box;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'tsbb')]")
	public WebElement srch_btn;

	@FindBy(xpath = "//android.widget.TextView[@text='Click for more widgets']")
	public WebElement navigation_link;

	// Method that performs operations in Form Five
	public void browserWidget() throws InterruptedException {
		Dimension size;
		Thread.sleep(3000);

		// Get the size of screen.
		size = driver.manage().window().getSize();
		// Find swipe start and end point from screen's with and height.
		// Find starty point which is at bottom side of screen.
		int starty = (int) (size.height * 0.40);
		// Find endy point which is at top side of screen.
		int endy = (int) (size.height * 0.20);
		// Find horizontal point where you wants to swipe. It is in middle of
		// screen width.
		int startx = size.width / 6;
		if ("MAC".equalsIgnoreCase("platformName")) {
			iosdriver.swipe(startx, starty, startx, endy, 3000);
		} else {
			androiddriver.swipe(startx, starty, startx, endy, 3000);
		}
		try {
			this.srch_box.sendKeys("Engie");
			this.srch_btn.click();
		} catch (Exception e) {
			this.search_box.sendKeys("Engie");
			this.search_btn.click();

		}

		Thread.sleep(4000);
		this.navigation_link.click();
	}

	/**
	 * isDisplayed() is boolean method i.e, it returns true or false. Basically
	 * this method is used to find whether the element is being displayed.
	 */
	public boolean isDisplayed(){
		return (this.lbl_browser.isDisplayed() || this.lbl_map.isDisplayed());
	}
	
	public void allowShowLocation()
	{
		btn_ShowLocation.click();
	}
}