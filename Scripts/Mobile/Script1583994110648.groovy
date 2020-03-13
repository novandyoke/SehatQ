import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling

import internal.GlobalVariable as GlobalVariable

String App = RunConfiguration.getProjectDir() + '\\SehatQ Doctor Consultation Online Appointment_v1.0.17_apkpure.com.apk'

Mobile.startApplication(App, false)

if (Mobile.verifyElementVisible(findTestObject('Sehatq/android.widget.TextView2 - Skip'), 3, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Sehatq/android.widget.TextView2 - Skip'), GlobalVariable.TimeOut)
}

Mobile.tap(findTestObject('Sehatq/android.widget.Btn_Profile'), GlobalVariable.TimeOut)

Mobile.tap(findTestObject('Sehatq/android.widget.Btn_Login Email'), GlobalVariable.TimeOut)

Mobile.setText(findTestObject('Sehatq/android.widget.input Username'), 'novandy_347@yahoo.co.id', GlobalVariable.TimeOut)

Mobile.setText(findTestObject('Sehatq/android.widget.input Password'), 'No191190', GlobalVariable.TimeOut)

Mobile.tap(findTestObject('Sehatq/android.widget.Button Lanjutkan'), GlobalVariable.TimeOut)

Mobile.tap(findTestObject('Sehatq/android.widget.Btn_Profile'), GlobalVariable.TimeOut)

Mobile.tap(findTestObject('Sehatq/android.widget.Humberger Button'), GlobalVariable.TimeOut)

Mobile.tap(findTestObject('Sehatq/android.widget.Btn_Terapkan'), GlobalVariable.TimeOut)

Mobile.tap(findTestObject('Sehatq/android.widget.Btn_Sign Out'), GlobalVariable.TimeOut)

Mobile.tap(findTestObject('Sehatq/android.widget.Btn_Yes Logout'), GlobalVariable.TimeOut)

