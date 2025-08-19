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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('HomePageCURA/HomeMakeAppointment'))

WebUI.setText(findTestObject('LoginPageCURA/InputUsername'), 'John Doe')

WebUI.setEncryptedText(findTestObject('LoginPageCURA/InputPassword'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('LoginPageCURA/LoginBtn'))

for (def n : (0..2)) {
    WebUI.selectOptionByIndex(findTestObject('Page_CURA Healthcare Service/FacilityEraList'), 1)

    WebUI.click(findTestObject('Page_CURA Healthcare Service/ApplyForReadmission'))

    if (n == 0) {
        WebUI.click(findTestObject('Page_CURA Healthcare Service/Medicare'))

        WebUI.delay(2)
    } else if (n == 1) {
        WebUI.click(findTestObject('Page_CURA Healthcare Service/MediAid'))

        WebUI.delay(2)
    } else {
        WebUI.click(findTestObject('Page_CURA Healthcare Service/None'))

        WebUI.delay(2)
    }
    
    WebUI.setText(findTestObject('Page_CURA Healthcare Service/DATEVisitetxtEra'), '22/08/2025')

    WebUI.setText(findTestObject('Page_CURA Healthcare Service/TxtCommentEra'), 'Hey it\'s Hakim sahraoui alaoui , I want to write Something')

    WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Comment_btn-book-appointment'))

    WebUI.click(findTestObject('Page_CURA Healthcare Service/HomePageBtn'))
}

WebUI.closeBrowser()

