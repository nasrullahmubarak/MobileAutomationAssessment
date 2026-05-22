Mobile.startApplication('path/to/app.apk', false)

// Login → buka quota page
Mobile.tap(findTestObject('HomePage/btnQuota'), 0)

// Verify quota details
Mobile.verifyElementExist(findTestObject('QuotaPage/quotaCategory'), 0)
Mobile.verifyElementExist(findTestObject('QuotaPage/remainingQuota'), 0)
Mobile.verifyElementExist(findTestObject('QuotaPage/expiryDate'), 0)

// Scroll normal
Mobile.scrollToText('NextQuotaCategory')

Mobile.closeApplication()
