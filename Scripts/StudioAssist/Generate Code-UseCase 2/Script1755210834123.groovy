import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

/*
*This use Case is for generating the code with studioAssist by separating the objects and variables with the action
*/
/*
 * I have a list of test objects as Blow!
 * -Make appointment button :Page_CURA Healthcare Service/HomeMakeAppointment
 * -UserName :Page_CURA Healthcare Service/InputUsername
 * -Password :Page_CURA Healthcare Service/InputPassword
 * -Login Button : Page_CURA Healthcare Service/LoginBtn
 * -Appointment div element : Page_CURA Healthcare Service/div_Appointment
 *
 *I also have a url : https://katalon-demo-cura.herokuapp.com/ , and two local variables 'Username and 'Password'
 *
 *Write me a test case to perform the following steps.
 *1.open browser to the URL stored in G-SiteURL
 *2.Click the make appointment button 
 *3.fill in the username and password fiels based on the variables
 *4.click the login button
 *5.Verify that the appointment div exists with timeout 10s
 *6.Close Browser
 *
 
 */
// Open browser to the URL stored in G-SiteURL
WebUI.openBrowser(GlobalVariable.G_SiteURL)

// Click the make appointment button
WebUI.click(findTestObject('HomePageCURA/HomeMakeAppointment'))

// Fill in the username field based on the variable Username
WebUI.setText(findTestObject('LoginPageCURA/InputUsername'), Username)

// Fill in the password field based on the variable Password
WebUI.setText(findTestObject('LoginPageCURA/InputPassword'), Password)

// Click the login button
WebUI.click(findTestObject('LoginPageCURA/LoginBtn'))

// Verify that the appointment div exists with timeout 10s
WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/ApplyForReadmission'), 10)

// Close Browser
WebUI.closeBrowser()

