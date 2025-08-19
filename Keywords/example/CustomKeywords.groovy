package example

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

class CustomKeywords {

	@Keyword
	def clickElement(String testObjectId, int timeout = 10) {
		try {
			def to = findTestObject(testObjectId)
			WebUI.waitForElementClickable(to, timeout)
			WebUI.click(to)
			KeywordUtil.markPassed("Clicked element: " + testObjectId)
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Cannot find the element: " + testObjectId)
		} catch (Exception e) {
			KeywordUtil.markFailed("Failed to click element: " + testObjectId + " - " + e.message)
		}
	}
}
