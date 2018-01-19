/**************************************************************
Project Name			:	Test Automation Sample
Package Name			:	com.kony.appiumtests.Forms
Class Name				:	Logout
Purpose of the Class	:	To maintain the repository for the locators
 **************************************************************/

package com.kony.appiumtests.forms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * extends is the keyword used to inherit the properties of a class.
 * In this we are using extends to inherit the properties from BaseForm class.
 */

public class FrmLogout extends BaseForm
{


	public FrmLogout(RemoteWebDriver driver)
	{
		super(driver);  //super() is used to invoke immediate parent class constructor.
	}

	/**
	 * The page structure is being used within this test in order to separate the
	 * page actions from the tests.
	 *
	 * Locators are saved with the help of @FindBy annotation, and can be used in the 
	 * corresponding tests by extending the FrmLogin class.   
	 * 
	 * logOut() method is used to perform Logout activity. 
	 */


	//Locators_PostLogin Screen
	@FindBy(className="android.widget.Button")
	public WebElement btn_SignOut;

	@FindBy(name="Post Login Page")
	public WebElement postloginpage;

	public void loginOut()
	{
		btn_SignOut.click();
	}

	/**
	 * isDisplayed() is boolean method i.e, it returns true or false.
	 * Basically this method is used to find whether the element is being displayed.
	 */
	public boolean isDisplayed()
	{
		return (btn_SignOut.isDisplayed());
	}
}
