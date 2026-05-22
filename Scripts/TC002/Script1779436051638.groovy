Mobile.startApplication('path/to/app.apk', false)

// Launch tanpa login → langsung ke guest homepage
Mobile.verifyElementExist(findTestObject('GuestPage/homeBanner'), 0)
Mobile.verifyElementNotExist(findTestObject('GuestPage/personalData'), 0)

// Restricted page harus redirect ke login
Mobile.tap(findTestObject('GuestPage/btnRestricted'), 0)
Mobile.verifyElementExist(findTestObject('LoginPage/btnLogin'), 0)

// Tidak crash
Mobile.verifyElementNotExist(findTestObject('GuestPage/errorMessage'), 0)

Mobile.closeApplication()
