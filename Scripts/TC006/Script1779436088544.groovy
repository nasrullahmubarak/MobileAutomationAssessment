Mobile.startApplication('path/to/app.apk', false)

// Buka catalogue
Mobile.tap(findTestObject('HomePage/btnCatalogue'), 0)

// Verify list package
Mobile.verifyElementExist(findTestObject('CataloguePage/packageName'), 0)
Mobile.verifyElementExist(findTestObject('CataloguePage/packagePrice'), 0)
Mobile.verifyElementExist(findTestObject('CataloguePage/packageQuota'), 0)

// Detail package terbuka normal
Mobile.tap(findTestObject('CataloguePage/packageName'), 0)
Mobile.verifyElementExist(findTestObject('PackageDetailPage/detailInfo'), 0)

Mobile.closeApplication()
