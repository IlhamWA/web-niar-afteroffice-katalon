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

WebUI.scrollToElement(findTestObject('LG02/Page_DEMOQA/h5_Elements'), 0)

WebUI.click(findTestObject('LG01/Page_DEMOQA/Page_DEMOQA/h5_Elements'))

WebUI.click(findTestObject('Object Repository/LG01/Page_DEMOQA/li_Text Box'))

WebUI.setText(findTestObject('Object Repository/LG01/Page_DEMOQA/input_Full Name_userName'), 'ilham wafiq')

WebUI.setText(findTestObject('Object Repository/LG01/Page_DEMOQA/input_Email_userEmail'), 'ilham@gmail.com')

WebUI.setText(findTestObject('Object Repository/LG01/Page_DEMOQA/textarea_Current Address_currentAddress'), 'kudus,central java, indonesia')

WebUI.setText(findTestObject('LG01/Page_DEMOQA/textarea_Permanent Address_permanentAddress'), 'kudus')

WebUI.scrollToElement(findTestObject('LG01/Page_DEMOQA/button_Submit'), 0)

WebUI.click(findTestObject('Object Repository/LG01/Page_DEMOQA/button_Submit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/LG01/Page_DEMOQA/div_Nameilham wafiqEmaililhamgmail.comCurre_d3c0ad'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

