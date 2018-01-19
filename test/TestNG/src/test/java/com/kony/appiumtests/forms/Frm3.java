/**************************************************************
Project Name			:	Test Automation Sample
Package Name			:	com.kony.appiumtests.Forms
Class Name				:	Frmfour
Purpose of the Class	:	To maintain the repository for the locators
 **************************************************************/

package com.kony.appiumtests.forms;

import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.remote.HideKeyboardStrategy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * extends is the keyword used to inherit the properties of a class. In this we
 * are using extends to inherit the properties from BaseForm class.
 */
public class Frm3 extends BaseForm {

	public Frm3(RemoteWebDriver driver) {
		super(driver); // super() is used to invoke immediate parent class
		// constructor.
	}

	// Locators used in Form Four.
	@FindBy(name = "Slider")
	public WebElement lbl_slider;

	@iOSFindBy(className = "UIASlider")
	@AndroidFindBy(className = "android.widget.SeekBar")
	public WebElement move_slider;

	@FindBy(className = "android.widget.EditText")
	public WebElement lbl_editfield;

	@iOSFindBy(className = "UIATextView")
	@AndroidFindBy(className = "android.widget.EditText")
	public WebElement enter_text;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Click for more widgets']")
	public WebElement navigation_link;

	public String link_nxtwidgets = "Click for more widgets";

	// Method used to perform operations in Form Four.
	public void sliderOperation() {

		// Locating seekbar using resource id

		// get start co-ordinate of seekbar
		int start = this.move_slider.getLocation().getX();
		// Get width of seekbar
		int end = this.move_slider.getSize().getWidth();
		// get location of seekbar vertically
		int y = this.move_slider.getLocation().getY();

		// Select till which position you want to move the seekbar
		TouchAction action = null;
		if ("MAC".equalsIgnoreCase("platformName")) {
			action = new TouchAction(iosdriver);
		} else {
			action = new TouchAction(androiddriver);
		}

		// Move it will the end
		action.press(start, y).moveTo(end, y).release().perform();
	}
	public void textOperation(){
		if ("MAC".equalsIgnoreCase("platformName")) {
			this.enter_text.sendKeys("welcome to application");
			iosdriver.hideKeyboard(HideKeyboardStrategy.PRESS_KEY, "Cancel");
		} else {
			this.enter_text.sendKeys("welcome to application");
			androiddriver.hideKeyboard();
		}

		this.navigation_link.click();

	}

	/**
	 * isDisplayed() is boolean method i.e, it returns true or false. Basically
	 * this method is used to find whether the element is being displayed.
	 */
	public boolean isDisplayed() {
		return (this.lbl_editfield.isDisplayed());
	}
}
