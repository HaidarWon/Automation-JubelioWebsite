package com.jubeliotesting
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class negativelogin_fieldkosong {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I want navigate to jubelio login page")
	def I_want_navigate_to_jubelio_loginpage() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://app.jubelio.com/login')
	}

	@When("I check alert when username field not fill")
	def I_check_alert_when_usernamefield_not_fill() {
		WebUI.click(findTestObject('Object Repository/obj_LoginPage/button_or_field/button_Masuk'))
		WebUI.verifyElementVisible(findTestObject('obj_LoginPage/alert_or_notification/Alert_Email_harus_diisi'), FailureHandling.STOP_ON_FAILURE)
	}

	@And("I check alert when password field not fill")
	def I_check_alert_when_passwordfield_not_fill() {
		WebUI.click(findTestObject('Object Repository/obj_LoginPage/button_or_field/button_Masuk'))
		WebUI.verifyElementVisible(findTestObject('obj_LoginPage/alert_or_notification/Alert_Email_harus_diisi'), FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I check Popup alert when username and password field in not fill")
	def I_check_Popupalert_when_username_and_passwordfield_is_notfill() {
		WebUI.waitForElementVisible(findTestObject('obj_LoginPage/alert_or_notification/PopupAlert_EmaildanPassword_harus_diisi'), 5)
		WebUI.closeBrowser()
	}
}