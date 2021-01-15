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

import internal.GlobalVariable as env

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



class Auth {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigate to web application")
	def loadApp() {
		WebUI.openBrowser(env.URL + 'login')
		WebUI.maximizeWindow()
	}

	@When("User insert credential such as (.*)")
	def fillEmail(String email){
		WebUI.setText(findTestObject('Object Repository/Login/Page_Log in/username_field'), email)
	}
	@And("User Select Lanjutkan button")
	def tapLanjutkan(){
		WebUI.click(findTestObject('Object Repository/Login/Page_Log in/button_Lanjutkan'))
		WebUI.delay(7)
	}
	@Then("User navigated to sub login-register page")
	def navigateSubLogin(){
		//WebUI.navigateToUrl(env.URL + 'login')
	}
	@When("User insert credential pass as (.*)")
	def fillPass(String password){
		WebUI.setText(findTestObject('Object Repository/Login/Page_Log in/password_field'), password)
	}
	@And("User Select LOG IN button")
	def tapLogin(){
		WebUI.click(findTestObject('Object Repository/Login/Page_Log in/button_Log in'))
		WebUI.delay(7)
	}
	@Then("Navigated to dashboard user")
	def navigateToDashboard(){
		WebUI.navigateToUrl(env.URL)
	}
	@Then("Navigated to login user")
	def renavigateToLogin(){
		WebUI.navigateToUrl(env.URL + 'login')
		WebUI.maximizeWindow()
	}
	@Given("User navigate to facebook")
	def loadFB() {
		WebUI.openBrowser(env.URL_fb + 'login')
		WebUI.maximizeWindow()
	}
	
	@When("User Masuk dengan facebook")
	def tapFacebook(){
		WebUI.click(findTestObject('Object Repository/Login/Page_Log in/button_Facebook'))
		WebUI.delay(7)
	}
	@Then("Return modal dialog indicate using Facebook account")
	def navigateFacebook(){
		// navigate to modal dialog facebook to procced login
	}
	@When("User insert credential as (.*) and (.*)")
	def fillFacebook(String email, String password) {
		WebUI.setText(findTestObject('Object Repository/Login/Page_Masuk Facebook/input_Login ke Facebook_email'), email)
		WebUI.setText(findTestObject('Object Repository/Login/Page_Masuk Facebook/input_Login ke Facebook_pass'), password)
	}
	@And("User select login button facebook")
	def tapLoginFacebook(){
		WebUI.click(findTestObject('Object Repository/Login/Page_Masuk Facebook/button_Login'))
		WebUI.delay(7)
	}
	@And("Procced to logout")
	def navigateOut(){
		WebUI.navigateToUrl(env.URL + 'logout')
		WebUI.maximizeWindow()
	}
}