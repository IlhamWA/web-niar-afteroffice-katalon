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

WebUI.scrollToElement(findTestObject('TC04/Page_DEMOQA/h5_Elements'), 0)

WebUI.click(findTestObject('Object Repository/TC04/Page_DEMOQA/h5_Elements'))

WebUI.scrollToElement(findTestObject('TC04/Page_DEMOQA/span_Buttons'), 0)

WebUI.click(findTestObject('Object Repository/TC04/Page_DEMOQA/span_Buttons'))

WebUI.scrollToElement(findTestObject('TC04/Page_DEMOQA/div_ButtonsDouble Click MeRight Click MeClick Me'), 0)

WebUI.doubleClick(findTestObject('Object Repository/TC04/Page_DEMOQA/button_Double Click Me'))

WebUI.verifyElementText(findTestObject('Object Repository/TC04/Page_DEMOQA/p_You have done a double click'), 'You have done a double click')

WebUI.rightClick(findTestObject('Object Repository/TC04/Page_DEMOQA/button_Right Click Me'))

WebUI.verifyElementText(findTestObject('Object Repository/TC04/Page_DEMOQA/p_You have done a right click'), 'You have done a right click')

WebUI.waitForElementVisible(findTestObject('TC04/Page_DEMOQA/button_Click Me'), 0)

WebUI.click(findTestObject('Object Repository/TC04/Page_DEMOQA/button_Click Me'))

WebUI.verifyElementText(findTestObject('Object Repository/TC04/Page_DEMOQA/p_You have done a dynamic click'), 'You have done a dynamic click')

WebUI.closeBrowser()

