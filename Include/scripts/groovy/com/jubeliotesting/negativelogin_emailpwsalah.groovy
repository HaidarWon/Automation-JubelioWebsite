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



class negativelogin_emailpwsalah {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I go to url")
	def I_go_to_url() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://app.jubelio.com/login')
	}

	@When("I use the wrong (.*)")
	def I_use_the_wrong_email(String email) {
		WebUI.setText(findTestObject('Object Repository/obj_LoginPage/button_or_field/FieldInput_Email'), 'tester@gmail.com')
	}

	@And("I use wrong pw (.*)")
	def I_use_wrong_pw_password(String password) {
		WebUI.setText(findTestObject('Object Repository/obj_LoginPage/button_or_field/FieldInput_Password'), 'testing')
	}
	@Then("I click submit and see alert wrong email and passsword")
	def I_click_submit_and_see_alert_wrong_email_and_passsword() {
		WebUI.click(findTestObject('Object Repository/obj_LoginPage/button_or_field/button_Masuk'))		
		WebUI.waitForElementVisible(findTestObject('obj_LoginPage/alert_or_notification/PopupAlert_Password-atau-email-anda-salah'), 5)	
		WebUI.closeBrowser()
	}
}