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

WebUI.navigateToUrl('https://demoqa.com/')

WebUI.scrollToElement(findTestObject('LG05/Page_DEMOQA/h5_Elements'), 0)

WebUI.click(findTestObject('LG05/Page_DEMOQA/h5_Elements'))

WebUI.scrollToElement(findTestObject('LG05/Page_DEMOQA/span_Upload and Download'), 0)

WebUI.click(findTestObject('LG05/Page_DEMOQA/span_Upload and Download'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('LG05/Page_DEMOQA/a_Download'), 0)

WebUI.click(findTestObject('Object Repository/LG05/Page_DEMOQA/a_Download'))

WebUI.uploadFile(findTestObject('LG05/Page_DEMOQA/Page_DEMOQA/input_Select a file_uploadFile'), 'C:\\Users\\user\\Downloads\\sampleFile(1).jpeg')

//WebUI.verifyElementText(findTestObject('Object Repository/LG05/Page_DEMOQA/p_Cfakepath6.png'), 'C:\\fakepath\\6.png')

WebUI.closeBrowser()

