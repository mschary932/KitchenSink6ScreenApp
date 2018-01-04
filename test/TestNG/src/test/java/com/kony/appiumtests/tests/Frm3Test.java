/**************************************************************
Project Name			:	Test Automation Sample
Package Name			:	com.kony.appiumtests.Tests
Class Name				:	FrmfourTest
Purpose of the Class	:	Validating the Functionalities of Form Four which
                            consists of Moving of slider, Scroll segment.  

 **************************************************************/
package com.kony.appiumtests.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.kony.appiumtests.forms.Frm1;
import com.kony.appiumtests.forms.FrmLogin;
import com.kony.appiumtests.forms.Frm2;
import com.kony.appiumtests.forms.Frm3;

public class Frm3Test extends BaseTest {

	private Frm1 frmone;
	private FrmLogin frmHome;
	private Frm2 frmtwo;
	private Frm3 frmthree;

	/**
	 * Creates FrmHome page,Frmtwo page,Frmthree,Frmfour
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
				frmHome.lbl_frm3.click();
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		frmthree = new Frm3(driver);
	}

	@BeforeClass
	@Override
	public void navigateTo() {

	}

	@Test
	public void testSliderOperation() {

		if (frmthree.isDisplayed()) {
			System.out.println("Starts sliderOperation");
			frmthree.sliderOperation();
			System.out.println("Ends sliderOperation");
		}
	}

	@Test
	public void testTextOperation(){
		if (frmthree.isDisplayed()) {
			System.out.println("Starts textOperation");
			frmthree.textOperation();
			System.out.println("Ends textOperation");
		}
	}

}
