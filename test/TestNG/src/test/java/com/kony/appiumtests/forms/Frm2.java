/**************************************************************
Project Name			:	Test Automation Sample
Package Name			:	com.kony.appiumtests.Forms
Class Name				:	Radiobutton
Purpose of the Class	:	To maintain the repository for the locators
 **************************************************************/

package com.kony.appiumtests.forms;

import java.util.List;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.remote.HideKeyboardStrategy;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * extends is the keyword used to inherit the properties of a class. In this we
 * are using extends to inherit the properties from BaseForm class.
 */
public class Frm2 extends BaseForm {
	Dimension size;

	public Frm2(RemoteWebDriver driver) {
		super(driver); // super() is used to invoke immediate parent class
		// constructor.
	}

	// Locators in Form Three
	@FindBy(name = "ListBox")
	public WebElement lbl_list;

	@FindBy(name = "select one value")
	public WebElement list_selection;

	@FindBy(name = "lstBx")
	public WebElement list_select;

	@FindBy(className="UIAElement")
	public List<WebElement> dropdownGroup;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@index='1']")
	public WebElement list_value;

	@FindBy(name = "Radio Button Group")
	public WebElement radiobuttons_header;

	@AndroidFindBy(xpath = "//android.widget.RadioButton[@index='2']")
	public WebElement select_radiobutton;

	@iOSFindBy(id="select one value")
	public WebElement radioGroup;

	@FindBy(name="RadioButtonGroup")
	public List<WebElement> radiobtnGroup;

	@FindBy(name = "Click for more widgets")
	public WebElement navigation_link;

	public String link_nxtwidgets = "Click for more widgets";

	// Method that performs operations in Form three.
	public void dropdownValueSelection() 
	{
		if ("MAC".equalsIgnoreCase("platformName")) {
			list_select.click();
			dropdownGroup.get(2).click();
			iosdriver.hideKeyboard(HideKeyboardStrategy.PRESS_KEY, "Cancel");
		} else {
			this.list_selection.click(); // To get the list selection menu
			this.list_value.click(); // To select value from list.
		}

	}
	public void radioButtonSelection() throws InterruptedException
	{
		if ("MAC".equalsIgnoreCase("platformName")) {
			radioGroup.click();
			radiobtnGroup.get(2).click();
			iosdriver.hideKeyboard(HideKeyboardStrategy.PRESS_KEY, "Cancel");
		} else {
			this.select_radiobutton.click(); // To select radio button value
		}

	}
	/*
	 * this.driver.scrollTo(link_nxtwidgets); // scrollTo is used to move to
	 * the given string.
	 */
	public void next() throws InterruptedException{
		// Get the size of screen.
		size = driver.manage().window().getSize();
		// Find swipe start and end point from screen's with and height.
		// Find starty point which is at bottom side of screen.
		int starty = (int) (size.height * 0.80);
		// Find endy point which is at top side of screen.
		int endy = (int) (size.height * 0.20);
		// Find horizontal point where you wants to swipe. It is in middle of
		// screen width.
		int startx = size.width / 2;
		if ("MAC".equalsIgnoreCase("platformName")) {
			iosdriver.swipe(startx, starty, startx, endy, 3000);
		} else {
			androiddriver.swipe(startx, starty, startx, endy, 3000);
		}
		Thread.sleep(2000);
		this.navigation_link.click();

	}

	/**
	 * isDisplayed() is boolean method i.e, it returns true or false. Basically
	 * this method is used to find whether the element is being displayed.
	 */
	public boolean isDisplayed() {
		return (this.lbl_list.isDisplayed() && this.radiobuttons_header
				.isDisplayed());
	}
}
