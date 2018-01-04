#TestAutomationSampleTests

The Maven java project created to use the Appium testing capabilities with TestNG framework. This has the sample tests 
for the sample Kony project TestAutomationSampleApp.

-------------------------------------------------------------------------------------------------------------------------------------
| TestAutomationSampleApp                                                                                                      |
-------------------------------------------------------------------------------------------------------------------------------------
|The Kony Visualizer application with two screens having basic widgets. This is used to test the sample test scripts created in the test project TestAutomationSampleTests.                                                                             |
|The Sample app can be found at: https://engie-src.ci.konycloud.com/KonyServices/TestAutomationSampleApp                            |
-------------------------------------------------------------------------------------------------------------------------------------

"TestAutomationSampleTests" consists of the packages with the classes

 In "com.kony.appiumtests.forms" the classes defined under this package are mainly to create a structure and identify the locators for  different methods:
 * BaseForm
 * FrmLogin
 * Frm1
 * Frm2
 * Frm3
 * Frm4
 * Frm5
 * FrmLogout

In BaseForm class, Abstract class is used to create the page structure which is being used within this test in order to separate the page actions from the tests.

In FrmLogin class, the methods used are:
* loginIn()     - Used to Login into the application and to pass the user name and password.
* isDisplayed() - Used for verifying whether the the Controls are displaying or not.

 Locators are saved with the help of @FindBy annotation, and can be used in the corresponding tests by extending the Login class.
 The locators used in this class are:
 * @FindBy(name="Sign In")
 * @FindBy(name="Login")
 
 In Frm1 class,the methods used are:
 * checkboxSelection()  - Used to perform selection of checkboxes.
 * dateselection()      - Used to handle date picker.
 * grid_selection()     - Used to select the grid row.
 * isDisplayed()        - Used for verifying whether the the Controls are displaying or not.
 
 Locators are saved with the help of @FindBy,@AndroidFindBy,@iOSFindBy annotaions, and can be used in the corresponding tests by       extending the Gridselection class.
 The locators used in this class are:
 * @FindBy(name = "Header Template")
 * @FindBy(name = "Calendar")
 * @iOSFindBy(id = "cal")
 * @AndroidFindBy(className = "android.widget.ImageView")
 * @iOSFindBy(className = "UIAButton")
 * @AndroidFindBy(id = "android:id/button1")
 * @iOSFindBy(className = "UIASwitch")
 * @AndroidFindBy(className = "android.widget.CheckBox")
 * @iOSFindBy(xpath = "//UIATableView[@name='dataGrd']/UIATableCell[1]")
 * @AndroidFindBy(xpath = "//android.widget.TextView[@text='RC 11']")
 * @FindBy(name = "Click for more widgets")
	
 In Frm2 class,the methods used are:
 * dropdownValueSelection()  - Used to select value from dropdown menu.
 * radioButtonSelection()    - Used to select value of a radio button.
 * isDisplayed()             - Used for verifying whether the the Controls are displaying or not.
 
 Locators are saved with the help of @FindBy,@AndroidFindBy,@iOSFindBy annotaions, and can be used in the corresponding tests by       extending the Radiobutton class.
 * @FindBy(name = "ListBox")
 * @FindBy(name = "select one value")
 * @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@index='1']")
 * @FindBy(name = "Radio Button Group")
 * @AndroidFindBy(xpath = "//android.widget.RadioButton[@index='2']")
 * @FindBy(name = "Click for more widgets")
 
 In Frm3 class,the methods used are:
 * sliderOperation()   - Used to perform action with slider
 * textOperation()     - Used to pass text to the text area.
 * isDisplayed()             - Used for verifying whether the the Controls are displaying or not.
 
 Locators are saved with the help @FindBy,@AndroidFindBy,@iOSFindBy annotaions, and can be used in the corresponding tests by          extending the Slider class.
 * @FindBy(name = "Slider")
 * @iOSFindBy(className = "UIASlider")
 * @AndroidFindBy(className = "android.widget.SeekBar")
 * @FindBy(name = "TextArea")
 * @iOSFindBy(className = "UIATextView")
 * @AndroidFindBy(className = "android.widget.EditText")
 * @FindBy(name = "Click for more widgets")
	
 In Frm4 class,the methods used are:
 * browserWidget() - Used to search a text in the browser.
 * isDisplayed()   - Used for verifying whether the the Controls are displaying or not.
 
 Locators are saved with the help @FindBy,@AndroidFindBy,@iOSFindBy annotaions, and can be used in the corresponding tests by          extending the Browserwidget class.
 * @FindBy(name = "Browser")
 * @FindBy(name = "Map")
 * @iOSFindBy(xpath="//UIAElement[1]")
 * @AndroidFindBy(xpath = "//android.widget.Spinner[@index='0']")
 * @iOSFindBy(xpath="//UIAButton[2]")
 * @AndroidFindBy(xpath = "//android.widget.Button[@index='2']")
 * @AndroidFindBy(xpath = "//android.view.View[contains(@resource-id,'tsfi')]")
 * @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'tsbb')]")
 * @FindBy(name = "Click for more widgets")
	
 In Frm5 class,the methods used are:
 * selectionDate() - USed to select month and year from picker.
 * isDisplayed()   - Used for verifying whether the the Controls are displaying or not.
 
 Locators are saved with the help @FindBy,@AndroidFindBy,@iOSFindBy annotaions, and can be used in the corresponding tests by          extending the Selection class.
 * @FindBy(name="Picker View")
 * @FindBy(name="2010")
 * @FindBy(name ="Mar")
 * @FindBy(name ="Click for more widgets")
 * @iOSFindBy(className = "UIAPickerWheel")
 

 In FrmLogout class, the methods used are:
 * loginOut()    - Used to perform Logout activity.
 * isDisplayed() - Used for verifying whether the the Controls are displaying or not.
 
 Locators are saved with the help of @FindBy annotation, and can be used in the corresponding tests by extending the FrmLogin class.
 The locators used in this class are:
 * @FindBy(name="Sign Out")
 * @FindBy(name="Post Login Page")

In "com.kony.appiumtests.tests" the classes defined under this package are mainly to create a structure and creating testcases:
 * BaseTest
 * FrmLoginTest
 * Frm1Test
 * Frm2Test
 * Frm3Test
 * Frm4Test
 * Frm5Test
 * FrmLogoutTest
 
In BaseTest, the sturucture is defined.
The methods used in this are:
* beforeClass() - The desired capabilities are provided.
* tearDownAppium() - This methods peforms after the completion of a test.

The annotations used are:
* @BeforeSuite - This will be executed before the first test declared within the test.
* @BeforeClass - This will be executed before before the class instance of your test fixture is created.
* @BeforeTest  - This will be executed before the @Test is going to execute.
* @AfterTest   - This will be executed after all the Test's are executed.
* @AfterSuite  - This will be executed after all the tests executed, the mechanishms like quitting from the app are written in this section.

In FrmLoginTest:

The methods are :
* setUpPage() - In this we are calling LoginTest class to use the locators.
* Login()     - In this we are passing the username and password.

The annotations used are:
* @Override we are overriding the abstract methods (setUpPage()), and and customizing the implementation in the inherited classes. 
* @Test annotation is used for writing the test scripts. We can execute the required tests only with the help of Group test mechanism, which is offered by testNG. 

In Frm1Test:

The methods are:
* setUpPage()              - In this we are calling GridselectionTest class to use the locators.
* navigateTo()             - Used for navigating from one screen to another.
* testCheckboxSelection()  - In this we are performing the test for checkboxes.
* testDateSelection()      - In this we are performing the test for date picker.
* testGridSelection()      - In this we are performing the test for selection of grid.

In Frm2Test:

The methods are:
* setUpPage()                  - In this we are calling GridselectionTest class to use the locators.
* navigateTo()                 - Used for navigating from one screen to another.
* testDropdownValueSelection() - Perform testcase for selection of value from dropdown menu.
* testRadioButtonSelection()   - Perform testcase for selection of radio button.

In Frm3Test:

The methods are:
* setUpPage()                  - In this we are calling SliderTest class to use the locators.
* navigateTo()                 - Used for navigating from one screen to another.
* testSliderOperation()        - Perform testcase for the seek bar.
* testTextOperation()          - Perform testcase for text field by entering text into it.

In Frm4Test:

The methods are:
* setUpPage()                  - In this we are calling BrowserwidgetTest class to use the locators.
* navigateTo()                 - Used for navigating from one screen to another.
* testBrowserWidget()          - Perform testcase for the search widget.

In Frm5Test:

The methods are:
* setUpPage()                  - In this we are calling SelectionTest class to use the locators.
* navigateTo()                 - Used for navigating from one screen to another.
* testSelection()              - Perform testcase for selection of month and year from Picker view.

In FrmLogoutTest :

The methods used are:
* setUpPage() - In this method we are calling LogoutTest to use the locators.
* Logout()    - Perform the logout testcase.

The annotations used are:
 * @Override we are overriding the abstract methods (setUpPage()), and customizing the implementation in the inherited classes. 
 * @Test annotation is used for writing the test scripts. We can execute the required tests only with the help of Group test     mechanism,  which is offered by testNG.

In "com.kony.appiumtests.common", a BaseConfig class is available. It can be used to place the data files.


## Frameworks
The Frameworks used in this are PageFactory and TestNG.

* Pageobject Factory: The objective of using PageobjectFactory is as follows:
  1.Easy to maintain
  2.Easy Readability of scripts
  3.Re-usability of code
  4.Reliability

 "Factory class can be used to make using Page Objects simpler and easier"

 Page Factory is an inbuilt page object model concept for Selenium WebDriver but it is very optimized.

 Here as well we follow the concept of separation of Page Object repository and Test methods.
 Additionally with the help of PageFactory class we use annotations @FindBy to find WebElement. 
 We use initElements method to initialize web elements

 @FindBy can accept tagName, partialLinkText, name, linkText, id, css, className, xpath as attributes.
 
* TestNG: TestNG is an open source automated testing framework; where NG means Next Generation.
  This is used by Annotations. The different annotations are as @BeforeSuite,@BeforeTest,@AfterTest,@Aftersuite,@Test..etc


## Built With

This is a Maven project. So build by using:

    mvn clean package --DskipTests=true

If you're building on a Mac, use this instead:

    mvn clean package -DskipTests

A zip file while be generated in the **target** folder of the created project.


## Dependencies
The jars in pom.xml are used for this projcet are mentioned as below:

selenium jar files:
----------------------------
URL: http://docs.seleniumhq.org/download/maven.jsp


     <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>3.0.0</version>
     </dependency> 

TestNG Jar:
-----------
URL: http://testng.org/doc/maven.html

  <dependency>
   <groupId>org.testng</groupId>
   <artifactId>testng</artifactId>
   <version>6.8.8</version>
   <scope>test</scope>
  </dependency>


Java-client Jar:
-----------------
URL: https://search.maven.org/remotecontent?filepath=io/appium/java-client/4.1.2/java-client-4.1.2.pom

   <dependency>
  		<groupId>io.appium</groupId>
  		<artifactId>java-client</artifactId>
  		<version>4.1.2</version>
   </dependency>

## To-Do
  Currently the tests for iOS fails for the mentioned operations:
  * Wheel picker - Selection of Year and Month.
  * Radio button - Selection of a Radio button value.
  * Selection of a value from dropdown.
  * Slider - Performing the action with seekbar.
  * Browser widget: Selecting text field.
  * The error that is displaying as "Can't locate an element by this strategy"


## Limitations of AWS DeviceFarm
* Ignores the testng.xml.Basically the testng.xml is helps to run the suite of tests in the defined order.
* AWS considers only @Test annotaion. It ignores @Test(dependsOnGroups),@Test(dependsOnMethods),@Test(groups),@Test(priority)....
* AWS considers each @Test as a new instance as such each test runs in a separate Appium instance.
