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

Mobile.startApplication('/Users/tunlathon/Downloads/app.apk', true)

Mobile.tap(findTestObject('Object Repository/Application/App/bringoo/btn_1stPage'), 0)

Mobile.tap(findTestObject('Object Repository/Application/App/bringoo/btn_2ndPage'), 0)

Mobile.tap(findTestObject('Object Repository/Application/App/bringoo/tap_text'), 0)

Mobile.setText(findTestObject('Application/App/bringoo/tap_text'), 'potikornth@gmail.com', 0)

Mobile.tap(findTestObject('Application/App/bringoo/tap_exit'), 0)

Mobile.tap(findTestObject('Object Repository/Application/App/bringoo/Tap_password4'), 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Application/App/bringoo/android.widget.EditText (3)'), '2nQ344jyefU3AgK8LRYJtA==', 
    0)

Mobile.tap(findTestObject('Object Repository/Application/App/bringoo/btn_login'), 0)

