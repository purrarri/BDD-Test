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

CucumberKW.runFeatureFile('Include/features/tiket-web/LoginEmail.feature')

WebUI.navigateToUrl('https://www.tiket.com/pesawat')

WebUI.click(findTestObject('Object Repository/Flight/Page_Harga Tiket Pesawat Murah - Cari  Pesa_be6459/label_Pulang-Pergi'))

WebUI.setText(findTestObject('Object Repository/Flight/Page_Harga Tiket Pesawat Murah - Cari  Pesa_be6459/input_Dari_input-airport'), 
    'medan')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Flight/Page_Harga Tiket Pesawat Murah - Cari  Pesa_be6459/div_Batam IndonesiaHang NadimBTH'))

WebUI.setText(findTestObject('Object Repository/Flight/Page_Harga Tiket Pesawat Murah - Cari  Pesa_be6459/input_Dari_input-airport'), 
    'jakarta')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Flight/Page_Harga Tiket Pesawat Murah - Cari  Pesa_be6459/div_Jakarta IndonesiaJakartaJKTC'))

WebUI.click(findTestObject('Object Repository/Flight/Page_Harga Tiket Pesawat Murah - Cari  Pesa_be6459/div_22'))

WebUI.click(findTestObject('Object Repository/Flight/Page_Harga Tiket Pesawat Murah - Cari  Pesa_be6459/div_24'))

WebUI.click(findTestObject('Object Repository/Flight/Page_Harga Tiket Pesawat Murah - Cari  Pesa_be6459/button_SELESAI'))

WebUI.click(findTestObject('Object Repository/Flight/Page_Harga Tiket Pesawat Murah - Cari  Pesa_be6459/button_CARI PENERBANGAN'))

WebUI.click(findTestObject('Object Repository/Flight/Page_Harga Tiket Pesawat Murah - Cari  Pesa_be6459/div_Mengerti'))

CucumberKW.runFeatureFile('Include/features/tiket-web/OrderFlight.feature')

WebUI.delay(5)

