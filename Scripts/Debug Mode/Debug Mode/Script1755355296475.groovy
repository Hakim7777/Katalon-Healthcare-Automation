import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

// Make Appointment
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_We Care About Your Health_btn-make-appointment'))

// Login
WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_txt-username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_txt-password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Password_btn-login'))

// Appel du Keyword (Medicare → Medicaid → None)
CustomKeywords.'utilities.RunTimeTestObject.selectHealthcarePrograms'()

WebUI.click(findTestObject('Debug Mode OBJ/Page_CURA Healthcare Service/OPENCalendar'))

WebUI.setText(findTestObject('Debug Mode OBJ/Page_CURA Healthcare Service/SelectDate'), '')

WebUI.click(findTestObject('Debug Mode OBJ/Page_CURA Healthcare Service/td_Sa_day'))

WebUI.click(findTestObject('Debug Mode OBJ/Page_CURA Healthcare Service/textarea_Comment_txt_comment'))

// Commentaire
WebUI.setText(findTestObject('Object Repository/Debug Mode OBJ/Page_CURA Healthcare Service/textarea_Comment_txt_comment'), 'Hello its Hakim')

// Soumettre
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Comment_btn-book-appointment'))

//fermeture du navigateur
WebUI.closeBrowser()

