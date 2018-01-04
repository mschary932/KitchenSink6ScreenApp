/**************************************************************
Project Name			:	Test Automation Sample
Package Name			:	com.kony.appiumtests.Tests
Class Name				:	FrmfiveTest
Purpose of the Class	:	Validating the Functionalities of Form Five which
                            consists of searching a text with browser. 

 **************************************************************/
package com.kony.appiumtests.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.kony.appiumtests.forms.Frm4;
import com.kony.appiumtests.forms.Frm1;
import com.kony.appiumtests.forms.FrmLogin;
import com.kony.appiumtests.forms.Frm2;
import com.kony.appiumtests.forms.Frm3;

public class Frm4Test extends BaseTest {

	private final String CORRECT_USER_NAME = "admin";
	private final String CORRECT_PASSWORD = "123456";

	private Frm1 frmone;
	private FrmLogin frmHome;
	private Frm2 frmtwo;
	private Frm3 frmthree;
	private Frm4 frmfour;

	/**
	 * Creates FrmHome page,Frmtwo page,Frmthree page,Frmfour page,Frmfive page
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
				frmHome.lbl_frm4.click();
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		frmfour = new Frm4(driver);
	}

	@BeforeClass
	@Override
	public void navigateTo() {}

	@Test
	public void testBrowserWidget() throws InterruptedException {

		if (frmfour.isDisplayed()) {
			System.out.println("Starts browserWidgetTest operations");
			frmfour.browserWidget();
			System.out.println("Ends browserWidgetTest Operations");
		}
	}
}
