/**************************************************************
Project Name			:	Test Automation Sample
Package Name			:	com.kony.appiumtests.Test
Class Name				:	FrmHomeTest
Purpose of the Class	:	Validating the Login functionality.  

 **************************************************************/
package com.kony.appiumtests.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.kony.appiumtests.forms.FrmLogin;

public class FrmLoginTest extends BaseTest {

	private final String CORRECT_USER_NAME = "admin";
	private final String CORRECT_PASSWORD = "123456";

	private FrmLogin frmHome;

	/**
	 * Creates FrmHome page
	 * 
	 * @Override we are overriding the abstract methods (setUpPage()), and and
	 *           customizing the implementation in the inherited classes.
	 * 
	 * @Test annotation is used for writing the test scripts. We can execute the
	 *       required tests only with the help of Group test mechanism, which is
	 *       offered by testNG.
	 * 
	 */

	@BeforeTest
	@Override
	public void setUpPage() {
		frmHome = new FrmLogin(driver);
	}

	@BeforeClass
	@Override
	public void navigateTo() {

	}

	@Test(groups = "Login")
	public void testLogin() throws InterruptedException {
			System.out.println("Login Starts");
			frmHome.loginIn(CORRECT_USER_NAME, CORRECT_PASSWORD);
			System.out.println("Login Ends");
	}

}
