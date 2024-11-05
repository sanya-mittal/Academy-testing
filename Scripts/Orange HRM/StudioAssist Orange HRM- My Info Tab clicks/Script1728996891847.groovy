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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_My Info'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Personal Details'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Contact Details'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Emergency Contacts'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Dependents'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Immigration'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Job'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Salary'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Report-to'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Qualifications'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Memberships'))

WebUI.closeBrowser()


/*
*  This code performs a series of UI actions on the OrangeHRM website.
*
*  1. Imports necessary classes and packages for Katalon Studio.
*  2. Opens a browser and navigates to the OrangeHRM login page.
*  3. Enters username and password, then clicks on the login button.
*  4. Navigates through various sections like My Info, Personal Details, Contact Details, etc.
*  5. Finally, closes the browser.
*
*/