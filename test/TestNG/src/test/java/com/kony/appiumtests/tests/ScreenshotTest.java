/**************************************************************
Project Name			:	Test Automation Sample
Package Name			:	com.kony.appiumtests.Tests
Class Name				:	FrmsixTest
Purpose of the Class	:	Validating the Functionalities of Form Six which
                            consists selection of year and month from a view. 

 **************************************************************/
package com.kony.appiumtests.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.kony.appiumtests.forms.FrmLogin;
import com.kony.appiumtests.forms.Frm5;

public class ScreenshotTest extends BaseTest {

	private final String CORRECT_USER_NAME = "admin";
	private final String CORRECT_PASSWORD = "123456";

	private FrmLogin frmHome;
	private Frm5 frmfive;
	private boolean screenshot;

	/**
	 * Creates FrmHome page,Frmtwo page,Frmthree page,Frmfour page,Frmfive
	 * page,Frmsix page
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
				frmHome.lbl_frm5.click();
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		frmfive = new Frm5(driver);
	}

	@BeforeClass
	@Override
	public void navigateTo() {}

	@Test(enabled = false)
	public void testScreenshot() throws InterruptedException {
		if (frmfive.isDisplayed()) {
			System.out.println("Starts ScreenshotTest Operations");
			screenshot = takeScreenshot("takeScreenshdot");
			if(screenshot)
				assert true;
			else
				assert false;
			System.out.println("Ends ScreenshotTest Operations");
		}

	}
	public boolean takeScreenshot(final String name) {
	       String screenshotDirectory = System.getProperty("appium.screenshots.dir", System.getProperty("java.io.tmpdir", ""));
	       File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	       return screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", name)));
	   }
}