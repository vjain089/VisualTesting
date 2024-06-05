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

WebUI.navigateToUrl('https://www.incredibleindia.org/content/incredible-india-v2/en/destinations.html')

WebUI.setText(findTestObject('Object Repository/Page_Destinations  Incredible India/input_Name_txtUserName'), 'vaibhav')

WebUI.setText(findTestObject('Object Repository/Page_Destinations  Incredible India/input_Email ID_txtEmail'), 'vjain089@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Destinations  Incredible India/button_Submit'))

WebUI.takeScreenshotAsCheckpoint('Screenshot1')

WebUI.click(findTestObject('Object Repository/Page_Destinations  Incredible India/span_'))

WebUI.click(findTestObject('Object Repository/Page_Destinations  Incredible India/h2_Siliguri'))

WebUI.takeScreenshotAsCheckpoint('Screenshot2')

WebUI.closeBrowser()

