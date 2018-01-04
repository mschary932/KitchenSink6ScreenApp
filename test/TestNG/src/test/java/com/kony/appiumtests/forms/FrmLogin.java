/**************************************************************
Project Name			:	Test Automation Sample
Package Name			:	com.kony.appiumtests.Forms
Class Name				:	Login
Purpose of the Class	:	To maintain the repository for the locators
 **************************************************************/

package com.kony.appiumtests.forms;

import io.appium.java_client.remote.HideKeyboardStrategy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

public class FrmLogin extends BaseForm {

	/**
	 * The page structure is being used within this test in order to separate
	 * the page actions from the tests
	 * 
	 * Locators are saved with the help of @FindBy annotation, and can be used
	 * in the corresponding tests by extending the FrmHome class.
	 * 
	 * LoginIn() method is used to Login into the application. we can pass the
	 * user name, and password.
	 */

	public FrmLogin(RemoteWebDriver driver) {
		super(driver); // super() is used to invoke immediate parent class
						// constructor.
	}

	// Locators_PreLogin Screen
	/**
	 * @FindBy is just an alternate way of finding elements. It is better used
	 *         to support the PageObject pattern.
	 */

	@FindBy(name = "Sign In")
	private WebElement lbl_SignIn;
	
	@FindBy(name = "Go to frm1")
	public WebElement lbl_frm1;
	
	@FindBy(name = "Go to frm2")
	public WebElement lbl_frm2;
	
	@FindBy(name = "Go to frm3")
	public WebElement lbl_frm3;
	
	@FindBy(name = "Go to frm4")
	public WebElement lbl_frm4;
	
	@FindBy(name = "Go to frm5")
	public WebElement lbl_frm5;
	
	@FindBy(name = "Go to frmLogout")
	public WebElement lbl_frmLogout;

	private WebElement username;

	private WebElement pass_word;

	private void initiaizeElements(){
		System.out.println("textBoxClass for the platform .."+platformName+".. is ... "+textBoxClass);
		List<WebElement> textBoxList = driver.findElements(By.className(textBoxClass));
		this.username = textBoxList.get(0);
		this.pass_word = textBoxList.get(1);
	}

	@FindBy(name = "Login")
	public WebElement btnLogin;

	public void loginIn(String userName, String password) {
		this.initiaizeElements();
		this.username.sendKeys(userName);
		if ("MAC".equalsIgnoreCase(platformName)) {
			iosdriver.hideKeyboard(HideKeyboardStrategy.PRESS_KEY, "Done");
		} else {
			androiddriver.hideKeyboard();
		}
		this.pass_word.sendKeys(password);
		if ("MAC".equalsIgnoreCase(platformName)) {
			iosdriver.hideKeyboard(HideKeyboardStrategy.PRESS_KEY, "Done");
		} else {
			androiddriver.hideKeyboard();
		}
		this.btnLogin.click();
	}

	/**
	 * isDisplayed() is boolean method i.e, it returns true or false. Basically
	 * this method is used to find whether the element is being displayed.
	 */
	public boolean isDisplayed() {
		return (this.lbl_SignIn.isDisplayed() && this.btnLogin.isDisplayed());
	}

}
