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

WebUI.scrollToElement(findTestObject('forms/Page_DEMOQA/h5_Forms'), 0)

WebUI.click(findTestObject('Object Repository/forms/Page_DEMOQA/h5_Forms'))

WebUI.scrollToElement(findTestObject('forms/Page_DEMOQA/span_Practice Form'), 0)

WebUI.click(findTestObject('Object Repository/forms/Page_DEMOQA/span_Practice Form'))

WebUI.setText(findTestObject('Object Repository/forms/Page_DEMOQA/input_Name_firstName'), 'rendy')

WebUI.setText(findTestObject('Object Repository/forms/Page_DEMOQA/input_Name_lastName'), 'retny')

WebUI.scrollToElement(findTestObject('forms/Page_DEMOQA/input_Email_userEmail'), 0)

WebUI.setText(findTestObject('Object Repository/forms/Page_DEMOQA/input_Email_userEmail'), 'rendyretny@yahoo.com')

WebUI.click(findTestObject('Object Repository/forms/Page_DEMOQA/label_Male'))

WebUI.setText(findTestObject('Object Repository/forms/Page_DEMOQA/input_(10 Digits)_userNumber'), '0987656789')

WebUI.setText(findTestObject('Object Repository/forms/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'), '18 Jun 2025')

WebUI.click(findTestObject('Object Repository/forms/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'))

WebUI.selectOptionByValue(findTestObject('Object Repository/forms/Page_DEMOQA/select_190019011902190319041905190619071908_246ee1'), 
    '2004', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/forms/Page_DEMOQA/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/forms/Page_DEMOQA/div_16'))

WebUI.scrollToElement(findTestObject('forms/Page_DEMOQA/div_Subjects_subjects-auto-complete__value-_d244cf'), 0)

WebUI.click(findTestObject('Object Repository/forms/Page_DEMOQA/div_Subjects_subjects-auto-complete__value-_d244cf'))

WebUI.setText(findTestObject('Object Repository/forms/Page_DEMOQA/input_Subjects_subjectsInput'), 'e')

WebUI.click(findTestObject('Object Repository/forms/Page_DEMOQA/div_English'))

WebUI.click(findTestObject('Object Repository/forms/Page_DEMOQA/label_Reading'))

WebUI.uploadFile(findTestObject('upload/Page_DEMOQA/input_Select picture_uploadPicture'), 'C:\\Users\\user\\Downloads\\sampleFile(1).jpeg')

WebUI.setText(findTestObject('Object Repository/forms/Page_DEMOQA/textarea_Current Address_currentAddress'), 'indonesia')

WebUI.click(findTestObject('Object Repository/forms/Page_DEMOQA/svg_Select State_css-19bqh2r'))

WebUI.click(findTestObject('Object Repository/forms/Page_DEMOQA/div_NCR'))

WebUI.click(findTestObject('Object Repository/forms/Page_DEMOQA/svg_Select City_css-19bqh2r'))

WebUI.scrollToElement(findTestObject('forms/Page_DEMOQA/div_Gurgaon'), 0)

WebUI.click(findTestObject('Object Repository/forms/Page_DEMOQA/div_Gurgaon'))

WebUI.click(findTestObject('Object Repository/forms/Page_DEMOQA/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/forms/Page_DEMOQA/div_Thanks for submitting the form'), 'Thanks for submitting the form')

WebUI.closeBrowser()

