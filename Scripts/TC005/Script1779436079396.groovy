Mobile.startApplication('path/to/app.apk', false)

// Login → lalu logout
Mobile.tap(findTestObject('HomePage/btnLogout'), 0)

// Verify kembali ke login
Mobile.verifyElementExist(findTestObject('LoginPage/btnLogin'), 0)

// Session terhapus
Mobile.pressBack()
Mobile.verifyElementExist(findTestObject('LoginPage/btnLogin'), 0)

Mobile.closeApplication()
