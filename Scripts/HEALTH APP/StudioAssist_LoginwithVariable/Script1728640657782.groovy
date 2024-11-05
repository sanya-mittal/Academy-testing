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


// Open a browser
// Navigate to a specific URL 'https://katalon-demo-cura.herokuapp.com/'
// Click on a 'Make Appointment' link
//  input the Username from the variable 'Username'
//  input the Password from the variable 'Password'
// Close the browser
// Open a browser
WebUI.openBrowser('')

// Navigate to a specific URL 'https://katalon-demo-cura.herokuapp.com/'
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

// Click on a 'Make Appointment' link
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

// input the Username from the variable 'Username'
WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'), Username)

// input the Password from the variable 'Password'
WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), Password)

// Close the browser
WebUI.closeBrowser()