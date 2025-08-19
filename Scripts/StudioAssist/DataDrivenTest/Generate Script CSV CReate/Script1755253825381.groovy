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

/**
*The following use case is for generating the script that creates csv test data with StudioAssist
*/

/*
 * - Create a CSV file named 'Data Files/MYDATA.csv' using java.io , listout libraries need to import 
 * - Add MYDATA.csv file with 3 columns : Facility , Visit_Date ,  Commentwith 5 rows that comply with the rules as follows :
 * +'facility' must be one of the following values: 'Tokyo CURA Healthcare Center','Hongkong CURA Healthcare Center','Seoul CURA Healthcare Center'
 * +'Visit_Date' in dd/mm/yy format 
 * +'comment' is a sentence describing issue regarding making appointment 
 */
import java.io.FileWriter
import java.io.BufferedWriter
import java.io.IOException

// Define the file path for the CSV file
String filePath = 'Data Files/MYDATA.csv'

// Define the CSV header
String header = 'Facility,Visit_Date,Comment'

// Define the data rows complying with the rules
List<String> dataRows = [
    'Tokyo CURA Healthcare Center,12/06/24,Need to reschedule my appointment due to work.',
    'Hongkong CURA Healthcare Center,15/06/24,Requesting a follow-up visit for my treatment.',
    'Seoul CURA Healthcare Center,18/06/24,Need to confirm the availability of the specialist.',
    'Tokyo CURA Healthcare Center,20/06/24,Want to change the appointment time to afternoon.',
    'Hongkong CURA Healthcare Center,22/06/24,Inquiry about the required documents for appointment.'
]

try {
    // Create BufferedWriter to write to the CSV file
    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))
    
    // Write the header line
    writer.write(header)
    writer.newLine()
    
    // Write each data row
    for (String row : dataRows) {
        writer.write(row)
        writer.newLine()
    }
    
    // Close the writer
    writer.close()
} catch (IOException e) {
    // Print the exception if any IO error occurs
    e.printStackTrace()
}