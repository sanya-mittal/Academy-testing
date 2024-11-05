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

/* Studio Assist Prompt
 *  1. Open Browser
 *  2. Navigate to "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
 *  3. Set the object input_Username_username as "admin"
 *  4. Set the object input_Password_password as "admin123"
 *  5. Click the object button_Login 
 *  6. close the browser
  * 
 */

// Open Browser
WebUI.openBrowser('')

// Navigate to "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

// Set the object input_Username_username as "admin"
WebUI.setText(findTestObject('Page_ORANGEHRM/input_Username_username'), 'admin')

// Set the object input_Password_password as "admin123"
WebUI.setText(findTestObject('Page_ORANGEHRM/input_Password_password'), 'admin123')

// Click the object button_Login
WebUI.click(findTestObject('Page_ORANGEHRM/button_Login'))

// Close the browser
WebUI.closeBrowser()
