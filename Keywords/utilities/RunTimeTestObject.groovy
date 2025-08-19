package utilities

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class RunTimeTestObject {

    @Keyword
    def selectHealthcarePrograms() {
        // Medicare
        TestObject medicare = new TestObject("dynamicMedicare")
        medicare.addProperty("xpath", ConditionType.EQUALS, "//input[@id='radio_program_medicare']")
        WebUI.click(medicare)

        // Medicaid
        TestObject medicaid = new TestObject("dynamicMedicaid")
        medicaid.addProperty("xpath", ConditionType.EQUALS, "//input[@id='radio_program_medicaid']")
        WebUI.click(medicaid)

        // None
        TestObject none = new TestObject("dynamicNone")
        none.addProperty("xpath", ConditionType.EQUALS, "//input[@id='radio_program_none']")
        WebUI.click(none)
    }
}
