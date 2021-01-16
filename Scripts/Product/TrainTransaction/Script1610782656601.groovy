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

WebUI.navigateToUrl('https://www.tiket.com/kereta-api')

WebUI.click(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/input_Dari_input-airport'))

WebUI.setText(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/input_Dari_input-airport'), 
    'semarang')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/div_SemarangSemua Stasiun'))

WebUI.setText(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/input_Ke_input-airport'), 
    'Jakarta')

WebUI.click(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/div_JakartaSemua Stasiun'))

WebUI.click(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/div_29'))

CucumberKW.runFeatureFile('Include/features/tiket-web/OrderTrain.feature')

WebUI.click(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/button_Selesai'))

WebUI.click(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/button_Cari Kereta Api'))

WebUI.click(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/button_Pilih'))

WebUI.click(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/input_Penumpang 1Dewasa_fullName'))

WebUI.setText(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/input_Penumpang 1Dewasa_fullName'), 
    'Test a')

WebUI.setText(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/input_Titel_identityNumber'), 
    '12311111111111')

WebUI.setText(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/input_Penumpang 1Dewasa_fullName'), 
    'Test B')

WebUI.click(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/input_Titel_birthDate'))

WebUI.click(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/div_2'))

WebUI.click(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/div_Feb'))

WebUI.click(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/input_Titel_birthDate_1'))

WebUI.click(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/div_2018'))

WebUI.setText(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/input_Titel_identityNumber'), 
    '121111111112')

WebUI.click(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/button_Pilih Kursi'))

WebUI.click(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/td'))

WebUI.click(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/div_A_seat                                 _dc5633'))

WebUI.click(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/div_A_seat                                 _dc5633_1'))

WebUI.click(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/div_A_seat                                 _dc5633_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/div_A_seat                                 _dc5633'))

WebUI.click(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/div_2 Tuan Test aPergiKereta Pergi  Kereta 1  6B'))

WebUI.click(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/div_A_seat                                 _dc5633_1'))

WebUI.click(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/button_Lanjutkan ke Pembayaran'))

WebUI.click(findTestObject('Object Repository/Page_Tiket Kereta Api - Pesan Tiket KAI Onl_41d8ab/button_YA LANJUTKAN'))

WebUI.navigateToUrl('https://payment.tiket.com/?order_id=110783461&order_hash=9fabba12-daf1-44f2-9418-48594e96bbf9')

WebUI.click(findTestObject('Object Repository/Page_Metode Pembayaran/span_Bank BCA'))

train_price = WebUI.getText(findTestObject('Object Repository/Page_Bank BCA/div_Harga KAIIDR 530000Biaya Layanan KAIIDR_b3acaa'))
System.out.println(train_price + '***')

WebUI.click(findTestObject('Object Repository/Page_Bank BCA/button_Bayar'))

tot_price = WebUI.getText(findTestObject('Object Repository/Page_Bank BCA/div_IDR 537384'))
System.out.println(tot_price + '***')

WebUI.click(findTestObject('Object Repository/Page_Bank BCA/span_SALIN'))

Page_Bank =WebUI.getText(findTestObject('Object Repository/Page_Bank BCA/span_52 6032 2488'))
System.out.println(Page_Bank + '***')

WebUI.click(findTestObject('Object Repository/Page_Bank BCA/span_SALIN'))

