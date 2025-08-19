import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

/**
 * The folowing  use case is for generating script that uses CSV file with StudioAssist
 */
/**
 * I have a list of test objects 
 * - Facility dropdown : 'Page_CURA Healthcare Service/FacilityEraList'
 * - Health Program checkbox : 'Page_CURA Healthcare Service/MediAid'
 * - Date input : 'Page_CURA Healthcare Service/DATEVisitetxtEra'
 * - Comment textarea : 'Page_CURA Healthcare Service/TxtCommentEra'
 * - Make Appointment button : 'HomePageCURA/HomeMakeAppointment'
 *
 *Write me a script to perform the steps as follows: 
 *-Find and call the 'StudioAssist/Reusable tests/Login' test case with the variable 'Username' and 'Password' as the local variables 
 *- Select the option with the variable 'Facility' and the label is not a regex
 * - Check the health program option
 *Set the date with the "visit_Date" variable
 *-Write comment with the variable 'comment' variable
 *-Submit the appointment 
 *-Capture the screenshot of the page 
 *-Close the browser
**/
// Call the 'StudioAssist/Reusable tests/Login' test case with 'Username' and 'Password' as local variables
WebUI.callTestCase(findTestCase('StudioAssist/Reusable tests/Login'), [('Username') : Username, ('Password') : Password])

// Select the option with the variable 'Facility' in the dropdown without using regex
WebUI.selectOptionByLabel(findTestObject('Page_CURA Healthcare Service/FacilityEraList'), Facility, false)

// Check the health program option
WebUI.check(findTestObject('Page_CURA Healthcare Service/MediAid'))

// Set the date with the "visit_Date" variable
WebUI.setText(findTestObject('Page_CURA Healthcare Service/DATEVisitetxtEra'), visit_Date)

// Write comment with the variable 'comment'
WebUI.setText(findTestObject('Page_CURA Healthcare Service/TxtCommentEra'), comment)

// Submit the appointment by clicking the Make Appointment button
WebUI.click(findTestObject('HomePageCURA/HomeMakeAppointment'))

// Capture the screenshot of the page
WebUI.takeScreenshot()

// Close the browser
WebUI.closeBrowser()