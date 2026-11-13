import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
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

WebUI.openBrowser(null)

WebUI.navigateToUrl('http://127.0.0.1:8000/login')

WebUI.click(findTestObject('T03/Page_Masuk  JosBook/div_JOSBOOK'))

WebUI.click(findTestObject('T03/Page_Masuk  JosBook/div_Selamat Datang'))

WebUI.setText(findTestObject('T03/Page_Masuk  JosBook/input_Masukkan Nama Pengguna atau NIS_NIP'), '19450817')

WebUI.setEncryptedText(findTestObject('T03/Page_Masuk  JosBook/input_Masukkan kata sandi Anda'), '/5S6MFFLcE7DwdGq+5ZqDg==')

WebUI.click(findTestObject('T03/Page_Masuk  JosBook/button_Masuk'))

WebUI.click(findTestObject('T03/Page_Dashboard  JosBook/div_Perlu dilengkapi'))

WebUI.click(findTestObject('T03/Page_Dashboard  JosBook/a_Form Pendataan'))

WebUI.click(findTestObject('T03/Page_Form Pendataan  Siswa Baru  JosBook Admin/span_Kenaikan Kelas'))

WebUI.click(findTestObject('T03/Page_Kenaikan Kelas  JosBook/a_Mutasi Siswa'))

