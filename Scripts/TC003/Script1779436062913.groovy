Mobile.startApplication('path/to/app.apk', false)

// Login
Mobile.setText(findTestObject('LoginPage/txtUsername'), 'testuser', 0)
Mobile.setText(findTestObject('LoginPage/txtPassword'), 'password123', 0)
Mobile.tap(findTestObject('LoginPage/btnLogin'), 0)

// Verify account info
Mobile.verifyElementText(findTestObject('AccountPage/phoneNumber'), '08123456789')
Mobile.verifyElementExist(findTestObject('AccountPage/expiryDate'), 0)
Mobile.verifyElementNotExist(findTestObject('AccountPage/uiBroken'), 0)

Mobile.closeApplication()
