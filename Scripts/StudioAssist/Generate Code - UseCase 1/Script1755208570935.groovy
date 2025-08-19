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
Write a Katalon Studio tests case to perform those following Steps : 
*1.Open the browser to the URL stored in the GlobalVariable
*2.Click on makeappointment
*3.Fill in Username
*4.fill in passWord
*5.click login button with the id
*6.Verify that the appointment div exists with timeout 10s
*7.close the brower
*/
// Open the browser to the URL stored in the GlobalVariable
WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

// Click on makeappointment
WebUI.click(findTestObject('Object Repository/HomePageCURA/HomeMakeAppointment'))

// Fill in Username
WebUI.setText(findTestObject('Object Repository/LoginPageCURA/InputUsername'), 'John Doe')

// Fill in passWord
WebUI.setEncryptedText(findTestObject('Object Repository/LoginPageCURA/InputPassword'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

// Click login button with the id
WebUI.click(findTestObject('Object Repository/LoginPageCURA/LoginBtn'))

// Verify that the appointment div exists with timeout 10s
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/ApplyForReadmission'), 10)

// Close the browser
WebUI.closeBrowser()

