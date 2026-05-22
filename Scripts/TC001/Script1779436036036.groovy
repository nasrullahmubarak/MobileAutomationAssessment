import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

Mobile.startApplication('path/to/app.apk', false)

// Login
Mobile.setText(findTestObject('LoginPage/txtUsername'), 'testuser', 0)
Mobile.setText(findTestObject('LoginPage/txtPassword'), 'password123', 0)
Mobile.tap(findTestObject('LoginPage/btnLogin'), 0)

// Verify Home Screen
Mobile.verifyElementExist(findTestObject('HomePage/banner'), 0)
Mobile.verifyElementExist(findTestObject('HomePage/activeNumber'), 0)
Mobile.verifyElementExist(findTestObject('HomePage/quotaBalance'), 0)
Mobile.verifyElementExist(findTestObject('HomePage/bottomNav'), 0)
Mobile.verifyElementNotExist(findTestObject('HomePage/errorMessage'), 0)
Mobile.verifyElementNotExist(findTestObject('HomePage/loadingSpinner'), 0)

Mobile.closeApplication()
