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

WebUI.selectOptionByValue(findTestObject('Object Repository/CH3 OR CURA HtalthCare/Page_CURA Healthcare Service/select_Facility_combo_facility'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/CH3 OR CURA HtalthCare/Page_CURA Healthcare Service/input_Apply for hospital readmission_chk_ho_9218d5'))

WebUI.click(findTestObject('Object Repository/CH3 OR CURA HtalthCare/Page_CURA Healthcare Service/label_Medicare_radio-inline'))

WebUI.click(findTestObject('Object Repository/CH3 OR CURA HtalthCare/Page_CURA Healthcare Service/span_Visit Date (Required)_glyphicon glyphi_cada34'))

WebUI.click(findTestObject('Object Repository/CH3 OR CURA HtalthCare/Page_CURA Healthcare Service/td_Sa_day'))

WebUI.setText(findTestObject('Object Repository/CH3 OR CURA HtalthCare/Page_CURA Healthcare Service/textarea_Comment_txt_comment'), 
    'Hello uts Hakim')

WebUI.click(findTestObject('Object Repository/CH3 OR CURA HtalthCare/Page_CURA Healthcare Service/form_Make Appointment_form-horizontal'))

WebUI.setText(findTestObject('Object Repository/CH3 OR CURA HtalthCare/Page_CURA Healthcare Service/textarea_Comment_txt_comment'), 
    'Hello its Hakim')

WebUI.click(findTestObject('Object Repository/CH3 OR CURA HtalthCare/Page_CURA Healthcare Service/button_Comment_btn-book-appointment'))

WebUI.click(findTestObject('Object Repository/CH3 OR CURA HtalthCare/Page_CURA Healthcare Service/a_Comment_btn btn-default'))

