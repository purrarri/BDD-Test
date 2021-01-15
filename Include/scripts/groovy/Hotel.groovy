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



class Hotel {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigate to product hotel")
	def loadHotel() {
		//		WebUI.openBrowser(env.URL + 'hotel')
		//		WebUI.maximizeWindow()
	}

	@When("User select Hotel product")
	def selectHotel() {
		WebUI.click(findTestObject(''))
		WebUI.delay(7)
	}

	@Then("Highlight the modal dialog hotel")
	def highlightModalHotel() {
		WebUI.click(findTestObject(''))
		WebUI.delay(7)
	}
	@When("User fill the tujuan field by (.*)")
	def fillTujuanHotel() {
		WebUI.click(findTestObject(''))
		WebUI.delay(7)
	}

	@And("User select top recomendation list")
	def selectTujuan(){
		WebUI.click(findTestObject(''))
		WebUI.delay(7)
	}
	@Then("Return modal calender")
	def returnCalender(){
		WebUI.click(findTestObject(''))
		WebUI.delay(7)
	}
	@When("User select check-in date")
	def checkInHotel(){
		WebUI.click(findTestObject(''))
		WebUI.delay(7)
	}
	@And("User select check-out date")
	def checkOutHotel(){
		WebUI.click(findTestObject(''))
		WebUI.delay(7)
	}

	@And("User select tamu (.*)")
	def countTamu(String tamu){
		for (int i = 0; i < tamu.toInteger(); i++) {
			WebUI.click(findTestObject(''))
		}
	}
	@And("User select kamar (.*)")
	def countKamar(String kamar){
		for (int i = 1; 0 < kamar.toInteger(); i++) {
			WebUI.click(findTestObject(''))
		}
	}
	@And("User select selesai")
	def navigateSelesai(){
		WebUI.click(findTestObject(''))
		WebUI.delay(7)
	}
	@And("User select CARI HOTEL")
	def navigateCariHotel(){
		WebUI.click(findTestObject(''))
		WebUI.delay(7)
	}
	@Then("Navigate to search result")
	def navigateSearchResult(){
		WebUI.click(findTestObject(''))
		WebUI.delay(7)
	}
	@When("User select top result")
	def selectHotelRes(){
		WebUI.click(findTestObject(''))
		WebUI.delay(7)
	}
	@Then("Navigated to detail result")
	def detailHotel(){
		WebUI.click(findTestObject(''))
		WebUI.delay(7)
	}
	@When("User select PILIH")
	def userSelectPilih(){
		WebUI.click(findTestObject(''))
		WebUI.delay(7)
	}
	@Then("User navigated to form pemesanan")
	def transactionHotel(){
		WebUI.click(findTestObject(''))
		WebUI.delay(7)
		WebUI.click(findTestObject(''))
		WebUI.delay(7)
		WebUI.click(findTestObject(''))
		WebUI.delay(7)
		WebUI.click(findTestObject(''))
		WebUI.delay(7)
		WebUI.click(findTestObject(''))
		WebUI.delay(7)
	}
	@When("User select Lanjut ke pembayaran")
	def proccedHotelTransc(){
		WebUI.click(findTestObject(''))
		WebUI.delay(7)
	}
	@Then("Navigated to final BCA Virtual Account")
	def navigatedHotelVA(){
		WebUI.click(findTestObject(''))
		WebUI.delay(7)
	}
	@And("Get the nomor virtual account value")
	def getVAAccount(){
		WebUI.click(findTestObject(''))
		WebUI.delay(7)
	}
}