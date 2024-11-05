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

WebUI.navigateToUrl('https://ecommerce.tealiumdemo.com/')

WebUI.click(findTestObject('Object Repository/Page_Tealium Ecommerce Demo/a_About Us'))

WebUI.click(findTestObject('Object Repository/Page_Tealium Ecommerce Demo/span_Contact us'))

WebUI.click(findTestObject('Object Repository/Page_Tealium Ecommerce Demo/span_Customer Service'))

WebUI.click(findTestObject('Object Repository/Page_Tealium Ecommerce Demo/span_Privacy Policy'))

WebUI.click(findTestObject('Object Repository/Page_Tealium Ecommerce Demo/span_About Tealium'))

WebUI.closeBrowser()

/*
*  This code opens a browser, navigates to a specific URL, clicks on various elements on a webpage, and then closes the browser.
*
*  1. Import necessary classes and packages for Katalon Studio keywords and objects.
*  2. Define aliases for commonly used Katalon Studio classes and keywords.
*  3. Open a browser.
*  4. Navigate to a specific URL.
*  5. Click on different elements on the webpage using predefined test objects.
*  6. Close the browser.
*
*/
