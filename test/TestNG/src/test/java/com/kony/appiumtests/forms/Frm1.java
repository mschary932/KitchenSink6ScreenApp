/**************************************************************
Project Name			:	Test Automation Sample
Package Name			:	com.kony.appiumtests.Forms
Class Name				:	Gridselection
Purpose of the Class	:	To maintain the repository for the locators
 **************************************************************/

package com.kony.appiumtests.forms;

import java.util.List;

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

public class Frm1 extends BaseForm {
	Dimension size;
	public Frm1(RemoteWebDriver driver) {
		super(driver); // super() is used to invoke immediate parent class
						// constructor.
	}

	// Locators in Form Two
	@FindBy(name = "Header Template")
	public WebElement lbl_header;

	@FindBy(name = "Calendar")
	public WebElement lbl_calendar;

	@iOSFindBy(id = "cal")
	@AndroidFindBy(className = "android.widget.ImageView")
	public WebElement date_picker;

	@iOSFindBy(className = "UIAButton")
	@AndroidFindBy(id = "android:id/button1")
	public WebElement btn_click;

	@iOSFindBy(className = "UIASwitch")
	@AndroidFindBy(className = "android.widget.CheckBox")
	public List<WebElement> checkBoxGroup;

	public WebElement first_checkbox;

	public WebElement second_checkbox;

	public WebElement third_checkbox;

	@iOSFindBy(xpath = "//UIATableView[@name='dataGrd']/UIATableCell[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='RC 11']")
	public WebElement grid_selection;

	@FindBy(xpath = "//android.widget.TextView[@text='Click for more widgets']")
	public WebElement navigation_link;

	public String link_nxtwidgets = "Click for more widgets";

	// Method that performs operations in Form two.
	public void checkboxSelection() {
		first_checkbox = checkBoxGroup.get(0);
		second_checkbox = checkBoxGroup.get(1);
		third_checkbox = checkBoxGroup.get(2);

		// These perform the selection of checkboxes.
		this.first_checkbox.click();
		this.second_checkbox.click();
		this.third_checkbox.click();
	}

	public void dateselection() {
		// These perform the actions of datepicker widget.
		this.date_picker.click();
		this.btn_click.click();
	}

	public void grid_selection() {
		// This perform the selection of grid.
		this.grid_selection.click();
		this.navigation_link.click();
	}

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
		return (this.lbl_calendar.isDisplayed());
	}
}
