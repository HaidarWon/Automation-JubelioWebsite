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



class loginpositive {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I want to open URL")
	def I_want_to_open_URL() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://app.jubelio.com/login')
	}

	@When("I fill valid (.*) in email field")
	def I_fill_valid_email_in_email_field (String email) {
		WebUI.setText(findTestObject('obj_LoginPage/button_or_field/FieldInput_Email'), email)
	}

	@And("I fill valid (.*) in password field")
	def I_fill_valid_password_in_password_field (String password) {
		WebUI.setText(findTestObject('obj_LoginPage/button_or_field/FieldInput_Password'), password)
	}
	
	@Then("I click button submit")
	def I_click_button_submit() {
		WebUI.click(findTestObject('obj_LoginPage/button_or_field/Button_Masuk'))
		WebUI.waitForElementVisible(findTestObject('obj_Barang_InReview/DropDown_Barang'), 5)
		WebUI.closeBrowser()
	}
}