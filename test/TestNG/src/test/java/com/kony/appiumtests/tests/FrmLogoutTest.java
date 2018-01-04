/**************************************************************
Project Name			:	Test Automation Sample
Package Name			:	com.kony.appiumtests.Tests
Class Name				:	LogoutTest
Purpose of the Class	:	Validating the Functionalities of Logout which
                            consists signout . 

 **************************************************************/
package com.kony.appiumtests.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.kony.appiumtests.forms.Frm4;
import com.kony.appiumtests.forms.Frm1;
import com.kony.appiumtests.forms.FrmLogin;
import com.kony.appiumtests.forms.FrmLogout;
import com.kony.appiumtests.forms.Frm2;
import com.kony.appiumtests.forms.Frm5;
import com.kony.appiumtests.forms.Frm3;

public class FrmLogoutTest extends BaseTest {

	private final String CORRECT_USER_NAME = "admin";
	private final String CORRECT_PASSWORD = "123456";

	private Frm1 frmone;
	private FrmLogin frmHome;
	private Frm2 frmtwo;
	private Frm3 frmthree;
	private Frm4 frmfour;
	private Frm5 frmfive;
	private FrmLogout logout;

	/**
	 * Creates FrmHome page,Frmtwo page,Frmthree page,Frmfour page,Frmfive
	 * page,Frmsix page,Logout page
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
		try {
			if (frmHome.isDisplayed())
			{
				frmHome.btnLogin.click();
				Thread.sleep(2000);
				frmHome.lbl_frmLogout.click();
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		logout = new FrmLogout(driver);
	}

	@BeforeClass
	@Override
	public void navigateTo() {}

	@Test(groups = "Logout")
	public void testLogout() throws InterruptedException {
		if (logout.isDisplayed()) {
			System.out.println("Starts Logout");
			logout.loginOut();
			System.out.println("Logout Ends");
		}
	}
}
