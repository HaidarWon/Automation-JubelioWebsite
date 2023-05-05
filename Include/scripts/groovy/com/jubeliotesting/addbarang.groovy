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



class addbarang {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I want to open the url jubelio")
	def I_want_to_open_the_url_jubelio() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://app.jubelio.com/login')
	}

	@When("I login to jubelio website")
	def I_login_to_jubelio_website() {
		WebUI.setText(findTestObject('obj_LoginPage/button_or_field/FieldInput_Email'), 'qa.rakamin.jubelio@gmail.com')
		WebUI.setEncryptedText(findTestObject('obj_LoginPage/button_or_field/FieldInput_Password'), 'ES0jYv0n47daknb+JnorMg==')
		WebUI.click(findTestObject('obj_LoginPage/button_or_field/Button_Masuk'))
	}

	@Then("I click dropdown barang")
	def I_click_dropdown_barang() {
		WebUI.click(findTestObject('obj_Barang_InReview/DropDown_Barang'))
	}

	@And("I click dropdown katalog")
	def I_click_dropdown_katalog() {
		WebUI.click(findTestObject('obj_Barang_InReview/Dropdown_Katalog'))
	}

	@Then("I click dropdown in review")
	def I_click_dropdown_in_review() {
		WebUI.click(findTestObject('obj_Barang_InReview/Dropdown_In Review'))
	}

	@And("I click button tambah baru")
	def I_click_button_tambah_baru() {
		WebUI.click(findTestObject('obj_Barang_InReview/button_Tambah_Baru'))
	}
	@Then("I add data barang")
	def I_add_data_barang() {
		WebUI.setText(findTestObject('obj_Barang_InReview/field_Nama_brg'), 'testing -- Tshirt Champion')
		WebUI.click(findTestObject('obj_Barang_InReview/ddown_Pilih kategori1'))
		WebUI.click(findTestObject('obj_Barang_InReview/newOpsiKat1_PakaianPria'))
		WebUI.click(findTestObject('obj_Barang_InReview/ddown_Pilih kategori2'))
		WebUI.waitForElementVisible(findTestObject('obj_Barang_InReview/Opsikat2_Atasan'), 1)
		WebUI.click(findTestObject('obj_Barang_InReview/Opsikat2_Atasan'))
		WebUI.click(findTestObject('obj_Barang_InReview/ddown_Pilih kategori3'))
		WebUI.waitForElementVisible(findTestObject('obj_Barang_InReview/Opsikat3_Kaos'), 1)
		WebUI.click(findTestObject('obj_Barang_InReview/Opsikat3_Kaos'))
		WebUI.setText(findTestObject('obj_Barang_InReview/field_MerekLainnya'), 'Champion')
		WebUI.setText(findTestObject('obj_Barang_InReview/field_SKU_item_code'), '77')
		WebUI.setText(findTestObject('obj_Barang_InReview/field_Deskripsi'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum iaculis metus ut purus accumsan pharetra. Cras ut nisl et velit sollicitudin sodales. In bibendum quam non tortor euismod varius. Nunc eu fringilla velit, vitae congue magna. Aliquam placerat quam orci, sed pharetra libero sagittis sit amet. Aliquam interdum ac est.')
		WebUI.delay(1)
		WebUI.uploadFileWithDragAndDrop(findTestObject('obj_Barang_InReview/button_Pilih Gambar'), 'D:\\imagetesting\\championtees.png')
		WebUI.delay(3)
		WebUI.setText(findTestObject('obj_Barang_InReview/field_BeratPaket-gram'), '100')
		WebUI.setText(findTestObject('obj_Barang_InReview/field_Harga Beli'), '80000')
		WebUI.setText(findTestObject('obj_Barang_InReview/field_Harga Jual'), '90000')
		WebUI.setText(findTestObject('obj_Barang_InReview/field_BatasStok'), '5')
		WebUI.delay(3)
	}
	@And("I save data")
	def I_save_data() {
		WebUI.click(findTestObject('obj_Barang_InReview/span_Simpan'))
		WebUI.closeBrowser()
	}
}