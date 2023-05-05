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

WebUI.setText(findTestObject('obj_LoginPage/button_or_field/FieldInput_Email'), 'qa.rakamin.jubelio@gmail.com')

WebUI.setEncryptedText(findTestObject('obj_LoginPage/button_or_field/FieldInput_Password'), 'ES0jYv0n47daknb+JnorMg==')

WebUI.click(findTestObject('obj_LoginPage/button_or_field/Button_Masuk'))

WebUI.click(findTestObject('obj_Barang_InReview/DropDown_Barang'))

WebUI.click(findTestObject('obj_Barang_InReview/Dropdown_Katalog'))

WebUI.click(findTestObject('obj_Barang_InReview/Dropdown_In Review'))

WebUI.click(findTestObject('obj_Barang_InReview/button_Tambah_Baru'))

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

WebUI.click(findTestObject('obj_Barang_InReview/span_Simpan'))

WebUI.closeBrowser()

