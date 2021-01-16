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

'Login using facebook\r\n'
CucumberKW.runFeatureFile('Include/features/tiket-web/LoginFacebook.feature')

WebUI.setText(findTestObject('Object Repository/Hotel/Hotel/Page_Booking Hotel Murah Harga Promo Pesan _0a601b/input_Tujuan_destination'), 
    'batam')

WebUI.click(findTestObject('Object Repository/Hotel/Hotel/Page_Booking Hotel Murah Harga Promo Pesan _0a601b/div_BatamKepulauan Riau IndonesiaCITY444 Properti'))

WebUI.click(findTestObject('Object Repository/Hotel/Hotel/Page_Booking Hotel Murah Harga Promo Pesan _0a601b/div_15'))

WebUI.click(findTestObject('Object Repository/Hotel/Hotel/Page_Booking Hotel Murah Harga Promo Pesan _0a601b/div_16'))

CucumberKW.runFeatureFile('Include/features/tiket-web/OrderHotel.feature')

WebUI.click(findTestObject('Object Repository/Hotel/Hotel/Page_Booking Hotel Murah Harga Promo Pesan _0a601b/button_Selesai'))

WebUI.click(findTestObject('Object Repository/Hotel/Hotel/Page_Booking Hotel Murah Harga Promo Pesan _0a601b/button_Cari Hotel'))

WebUI.navigateToUrl('https://www.tiket.com/hotel/search?room=2&adult=2&id=bali-108001534490276212&type=REGION&q=Bali&checkin=2021-02-15&checkout=2021-02-16')

WebUI.click(findTestObject('Object Repository/Hotel/Hotel/Page_Booking Hotel Murah Harga Promo Pesan _0a601b/div_JELAJAH BALI IDR 3331130IDR 2803096per _fbee2a'))

WebUI.switchToWindowTitle('The Apurva Kempinski Bali, Badung Booking Murah di tiket.com')

WebUI.click(findTestObject('Object Repository/Hotel/Hotel/Page_The Apurva Kempinski Bali Badung Booki_2a7ff7/button_Pilih'))

WebUI.click(findTestObject('Object Repository/Hotel/Hotel/Page_Form Pemesanan - tiketcom/div_Sama seperti pemesan_lever'))

WebUI.click(findTestObject('Object Repository/Hotel/Hotel/Page_Form Pemesanan - tiketcom/div_Sama seperti pemesan_lever_1'))

WebUI.click(findTestObject('Object Repository/Hotel/Hotel/Page_Form Pemesanan - tiketcom/button_LANJUT KE PEMBAYARAN'))

WebUI.click(findTestObject('Object Repository/Hotel/Hotel/Page_Metode Pembayaran/i_BCA Virtual Account_tix tixicon tixicon-right'))

WebUI.click(findTestObject('Object Repository/Hotel/Hotel/Page_BCA Virtual Account/button_Lanjutkan'))

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Hotel/Hotel/Page_BCA Virtual Account/p_3947 1001 1077 8008'), 
    '', '', 0)

WebUI.click(findTestObject('Object Repository/Hotel/Hotel/Page_BCA Virtual Account/span_SALIN'))

CucumberKW.runFeatureFile('Include/features/tiket-web/Logout.feature')

