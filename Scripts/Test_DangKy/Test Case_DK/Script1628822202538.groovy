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

WebUI.navigateToUrl('http://live.demoguru99.com/index.php/customer/account/create/')

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input__firstname'), FirstName)

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_Middle NameInitial_middlename'), 
    Mid)

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input__lastname'), LastName)

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input__email'), EmailAddress)

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input__password'), Pass)

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input__confirmation'), Confirmpass)

WebUI.click(findTestObject('Object Repository/Page_Create New Customer Account/button_Register'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_My Account/span_Thank you for registering with Main We_9337a1'), 
    'Thank you for registering with Main Website Store.')

