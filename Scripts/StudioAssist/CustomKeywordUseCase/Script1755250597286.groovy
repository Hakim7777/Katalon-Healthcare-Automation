import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable


WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.G_SiteURL)

WebUI.waitForPageLoad(10)

// Click via custom keyword (classe + méthode correctes, sans "Object Repository/")
CustomKeywords.'example.CustomKeywords.clickElement'('HomePageCURA/HomeMakeAppointment')

// Login
WebUI.setText(findTestObject('LoginPageCURA/InputUsername'), Username)

WebUI.setText(findTestObject('LoginPageCURA/InputPassword'), Password)

// (Si tu as un mot de passe chiffré: WebUI.setEncryptedText(...))
CustomKeywords.'example.CustomKeywords.clickElement'('LoginPageCURA/LoginBtn')

// Vérif post-login
WebUI.waitForElementPresent(findTestObject('Page_CURA Healthcare Service/ApplyForReadmission'), 10)

WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/ApplyForReadmission'), 5)

WebUI.closeBrowser()

