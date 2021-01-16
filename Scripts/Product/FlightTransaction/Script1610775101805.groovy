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

CucumberKW.runFeatureFile('Include/features/tiket-web/OrderFlight.feature')

WebUI.click(findTestObject('Object Repository/Flight/Page_Harga Tiket Pesawat Murah - Cari  Pesa_be6459/div_PILIH'))

WebUI.acceptAlert()

CucumberKW.runFeatureFile('Include/features/tiket-web/OrderFlight.feature')

WebUI.click(findTestObject('Object Repository/Flight/Page_Harga Tiket Pesawat Murah - Cari  Pesa_be6459/div_PILIH'))

WebUI.click(findTestObject('Object Repository/Flight/Page_Harga Tiket Pesawat Murah - Cari  Pesa_be6459/span_Sama dengan pemesan_switch'))

WebUI.click(findTestObject('Object Repository/Flight/Page_Harga Tiket Pesawat Murah - Cari  Pesa_be6459/span_Sama dengan pemesan_thumb'))

WebUI.click(findTestObject('Object Repository/Flight/Page_Harga Tiket Pesawat Murah - Cari  Pesa_be6459/span_Sama dengan pemesan_switch'))

WebUI.click(findTestObject('Object Repository/Flight/Page_Harga Tiket Pesawat Murah - Cari  Pesa_be6459/i_Kewarganegaraan_tix tix-chevron-down'))

WebUI.click(findTestObject('Object Repository/Flight/Page_Harga Tiket Pesawat Murah - Cari  Pesa_be6459/li_Indonesia'))

WebUI.click(findTestObject('Object Repository/Flight/Page_Harga Tiket Pesawat Murah - Cari  Pesa_be6459/button_LANJUTKAN KE PEMBAYARAN'))

WebUI.click(findTestObject('Object Repository/Flight/Page_Harga Tiket Pesawat Murah - Cari  Pesa_be6459/button_YA LANJUTKAN'))

WebUI.navigateToUrl('https://payment.tiket.com/?order_id=110781341&order_hash=2e5027e8090473947753bf033361e66018dba2f8')

WebUI.click(findTestObject('Object Repository/Flight/Page_Metode Pembayaran/span_BCA Virtual Account'))

WebUI.click(findTestObject('Page_BCA Virtual Account/button_Lanjutkan'))

va_flight = WebUI.getText(findTestObject('Object Repository/Flight/Page_BCA Virtual Account/div_Nomor Virtual Account 3947 1001 1078 1341SALIN'))

System.out.println(va_flight + '***')

price_flight = WebUI.getText(findTestObject('Object Repository/Flight/Page_BCA Virtual Account/div_Total PembayaranIDR 875700'))

System.out.println(price_flight + '***')

WebUI.click(findTestObject('Page_BCA Virtual Account/span_SALIN'))

CucumberKW.runFeatureFile('Include/features/tiket-web/Logout.feature')

