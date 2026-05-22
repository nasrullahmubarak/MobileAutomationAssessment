Mobile.startApplication('path/to/app.apk', false)

// Pilih package → order
Mobile.tap(findTestObject('CataloguePage/packageName'), 0)
Mobile.tap(findTestObject('PackageDetailPage/btnOrder'), 0)

// Verify order summary
Mobile.verifyElementText(findTestObject('OrderPage/packageName'), 'Internet 10GB')
Mobile.verifyElementText(findTestObject('OrderPage/packagePrice'), 'Rp50.000')
Mobile.verifyElementText(findTestObject('OrderPage/packageQuota'), '10GB')

// Tombol payment & back tersedia
Mobile.verifyElementExist(findTestObject('OrderPage/btnPayment'), 0)
Mobile.verifyElementExist(findTestObject('OrderPage/btnBack'), 0)

Mobile.closeApplication()
