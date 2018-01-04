/**************************************************************
Project Name			:	Test Automation Sample
Package Name			:	com.kony.appiumtests.Tests
Class Name				:	FrmthreeTest
Purpose of the Class	:	Validating the Functionalities of Form Three which
                            consists of Selection of value from drop down list,selecting value of a radio button.  

 **************************************************************/
package com.kony.appiumtests.tests;

import io.appium.java_client.AppiumDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.kony.appiumtests.forms.Frm1;
import com.kony.appiumtests.forms.FrmLogin;
import com.kony.appiumtests.forms.Frm2;

public class Frm2Test extends BaseTest {

	private final String CORRECT_USER_NAME = "admin";
	private final String CORRECT_PASSWORD = "123456";

	private Frm2 frmtwo;
	private Frm1 frmone;
	private FrmLogin frmHome;

	/**
	 * Creates FrmHome page,Frmtwo page,Frmthree
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
				frmHome.lbl_frm2.click();
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		frmtwo = new Frm2(driver);
	}

	@BeforeClass
	@Override
	public void navigateTo()
	{

	}

	@Test
	public void testDropdownValueSelection() throws InterruptedException
	{
		if (frmtwo.isDisplayed()) 
		{
			System.out.println("Starts dropdownValueSelection Opearation");
			frmtwo.dropdownValueSelection();
			System.out.println("Ends dropdownValueSelection Opearation");
		}
	}
	@Test
	public void testRadioButtonSelection() throws InterruptedException
	{
		if (frmtwo.isDisplayed())
		{
			System.out.println("Starts radioButtonSelection Opearation");
			frmtwo.radioButtonSelection();
			System.out.println("Ends radioButtonSelection Opearation");
		}
	}
}



