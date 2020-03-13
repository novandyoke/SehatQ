package login
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



class MyStepDefinition {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I navigate to homepage sehatq")
	def I_navigate_to_homepage_sehatq() {

		WebUI.openBrowser("")
		WebUI.navigateToUrl("http://sehatq.com")
		WebUI.maximizeWindow()
	}

	@When("I click Login button and Click Continue with Email")
	def I_click_Login_button() {
		WebUI.click(findTestObject('Object Repository/Login/Home_login'))

		WebUI.delay(2)


		WebUI.click(findTestObject('Object Repository/Login/a_Continue with Email'))
	}

	@And("I enter email (.*) and password (.*)")
	def I_enter_valid_email_password(String email, String password) {
		WebUI.setText(findTestObject('Object Repository/Login/input_Email_email'), email)
		WebUI.setText(findTestObject('Object Repository/Login/input_password'), password)
	}

	@And("I click Log in button")
	def I_click_login_btn() {
		WebUI.click(findTestObject('Object Repository/Login/button_Continue'))
	}

	@Then("I should be able to login successfully")
	def I_login_successfully() {
		WebUI.waitForElementVisible(findTestObject('Object Repository/Edit Profile/Notice'), 30)

		def Login_berhasil = WebUI.getText(findTestObject('Object Repository/Edit Profile/Notice'))
		WebUI.verifyMatch(Login_berhasil, 'Welcome to SehatQ | Tanya Dokter dan Tips Keluarga Sehat', false)
		//WebUI.closeBrowser()
	}

	@And("I click New to SehatQ Sign up")
	def I_click_New_to_SehatQ_Sign_up() {
		if (WebUI.verifyElementPresent(findTestObject('Object Repository/Login/a_Lain kali'), 5, FailureHandling.OPTIONAL)) {
			WebUI.click(findTestObject('Object Repository/Login/a_Lain kali'))
		}

		WebUI.waitForElementPresent(findTestObject('Object Repository/Login/a_Sign Up'), 30)

		WebUI.click(findTestObject('Object Repository/Login/a_Sign Up'))
	}

	@And("I enter name (.*) email (.*) and password (.*)")
	def I_enter_name_email_password(String Nama_Lengkap,String email, String password) {
		WebUI.setText(findTestObject('Object Repository/Login/input_Nama Lengkap'), Nama_Lengkap)
		WebUI.setText(findTestObject('Object Repository/Login/input_Email_email'), email)
		WebUI.setText(findTestObject('Object Repository/Login/input_password'), password)

		WebUI.delay(2)
	}

	@And("I check Aggrement")
	def I_check_Aggrement() {
		WebUI.click(findTestObject('Object Repository/Login/Check_Agree'))
	}

	@When("I click Image profile and click profile")
	def I_click_Image_profile_and_click_profile() {

		WebUI.click(findTestObject('Object Repository/Edit Profile/a_Img Profile'))
		WebUI.click(findTestObject('Object Repository/Edit Profile/a_Btn_Profile'))
	}

	@And("I click detail and click edit")
	def I_click_detail_and_click_edit() {

		WebUI.click(findTestObject('Object Repository/Edit Profile/a_Detail Profile'))
		WebUI.click(findTestObject('Object Repository/Edit Profile/a_Edit Profile'))
	}

	@And("I edit nama_lengkap (.*) tanggal_lahir (.*) tinggi badan (.*) berat (.*) and alamat (.*)")
	def I_edit_name_tglLahir_tinggiBadan_berat_alamat(String name, String tgl_lahir, String tinggi_badan,String berat, String alamat) {
		WebUI.setText(findTestObject('Object Repository/Login/input_Nama Lengkap'), name)
		WebUI.setText(findTestObject('Object Repository/Login/input_DOB'), tgl_lahir)
		WebUI.setText(findTestObject('Edit Profile/input_Tinggi'), tinggi_badan)
		WebUI.setText(findTestObject('Edit Profile/input_Berat'), berat)
		WebUI.setText(findTestObject('Edit Profile/input_alamat'), alamat)
	}

	@Then("I click Simpan button")
	def I_click_Simpan_button() {
		WebUI.click(findTestObject('Object Repository/Edit Profile/Btn_Simpan'))
		def Edit_Berhasil = WebUI.getText(findTestObject('Object Repository/Edit Profile/Notice'))

		WebUI.verifyMatch(Edit_Berhasil, "Edit profile berhasil", false)
	}
}