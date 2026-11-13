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

WebUI.callTestCase(findTestCase('T01'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('T02 Dashboard/Page_Dashboard  JosBook/a_Data Siswa'))

WebUI.click(findTestObject('T02 Dashboard/Page_Data Siswa  JosBook Admin/span_Form Pendataan'))

WebUI.click(findTestObject('T02 Dashboard/Page_Form Pendataan  Siswa Baru  JosBook Admin/span_Kenaikan Kelas'))

WebUI.click(findTestObject('T02 Dashboard/Page_Kenaikan Kelas  JosBook/span_Mutasi Siswa'))

WebUI.click(findTestObject('T02 Dashboard/Page_Mutasi Siswa  JosBook Admin/span_Data Guru'))

