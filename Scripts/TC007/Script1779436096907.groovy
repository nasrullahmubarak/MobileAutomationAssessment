Mobile.startApplication('path/to/app.apk', false)

// Buka catalogue → apply filter
Mobile.tap(findTestObject('CataloguePage/btnFilter'), 0)
Mobile.tap(findTestObject('CataloguePage/filterCategory'), 0)

// Verify package sesuai kategori
Mobile.verifyElementExist(findTestObject('CataloguePage/filteredPackage'), 0)

// Tidak crash
Mobile.verifyElementNotExist(findTestObject('CataloguePage/errorMessage'), 0)

Mobile.closeApplication()
