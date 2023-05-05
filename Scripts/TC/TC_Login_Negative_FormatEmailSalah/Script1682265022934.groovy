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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://app.jubelio.com/login')

WebUI.setText(findTestObject('Object Repository/obj_LoginPage/button_or_field/FieldInput_Email'), 'p')

WebUI.verifyElementPresent(findTestObject('obj_LoginPage/alert_or_notification/Alert_Format_Email_tidak_valid'), 5)

WebUI.setText(findTestObject('Object Repository/obj_LoginPage/button_or_field/FieldInput_Password'), 'Jubelio123!')

WebUI.click(findTestObject('Object Repository/obj_LoginPage/button_or_field/button_Masuk'))

WebUI.waitForElementVisible(findTestObject('obj_LoginPage/alert_or_notification/PopupAlert_Password-atau-email-anda-salah'), 5)

//WebUI.delay(3)

WebUI.closeBrowser()

