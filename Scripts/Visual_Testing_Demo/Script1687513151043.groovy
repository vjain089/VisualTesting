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

WebUI.navigateToUrl('https://testops.katalon.io/')

WebUI.maximizeWindow()

WebUI.takeScreenshotAsCheckpoint('Screenshot1')

WebUI.setText(findTestObject('Object Repository/Page_Katalon TestOps/input_Sign Up_username'), 'vaibhav.jain@katalon.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Katalon TestOps/input_Sign Up_password'), 'icP23tTPdjsOed6Z/XwIKg==')

WebUI.click(findTestObject('Object Repository/Page_Katalon TestOps/button_Sign in'))

WebUI.takeScreenshotAsCheckpoint('Screenshot2')

WebUI.click(findTestObject('Object Repository/Page_My Organization_01_Vai - Katalon TestOps/div_WAWeb Automation'))

WebUI.takeScreenshotAsCheckpoint('Screenshot3')

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Katalon TestOps/span_Reports'))

WebUI.takeScreenshotAsCheckpoint('Screenshot4')

WebUI.click(findTestObject('Object Repository/Page_Project Web Automation - Overview Test_9ad833/a_Failed Test ResultsBeta'))

WebUI.takeScreenshotAsCheckpoint('Screenshot5')

WebUI.closeBrowser()

