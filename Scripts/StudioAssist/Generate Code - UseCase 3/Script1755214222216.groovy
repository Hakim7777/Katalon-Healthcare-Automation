import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import internal.GlobalVariable as GlobalVariable

String password = 'ThisIsNotAPassword'

// 1. Ouvrir le navigateur UNE seule fois
WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl(GlobalVariable.G_SiteURL)

// 2. Exécuter le login sans ouvrir/fermer le browser dans ce TC
WebUI.callTestCase(
    findTestCase('StudioAssist/Reusable Test/Login'),
    [('username') : 'John Doe', ('Password') : password],
    FailureHandling.STOP_ON_FAILURE
)

// 3. Continuer le test
if (WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/FacilityEraList'), 10)) {
    WebUI.selectOptionByLabel(findTestObject('Page_CURA Healthcare Service/FacilityEraList'), 'Hongkong CURA Healthcare Center', false)
    WebUI.check(findTestObject('Page_CURA Healthcare Service/Medicare'))
    WebUI.setText(findTestObject('Page_CURA Healthcare Service/DATEVisitetxtEra'), '11/09/2025')
    WebUI.setText(findTestObject('Page_CURA Healthcare Service/TxtCommentEra'), 'Hello it\'s hakim alaoui Sahraoui')
    WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Comment_btn-book-appointment'))
    WebUI.takeScreenshot()
} else {
    WebUI.comment('FacilityEraList dropdown not found.')
}

// 4. Fermer le navigateur à la fin
WebUI.closeBrowser()
