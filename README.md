# Mobile Automation Assessment

Mobile automation testing project using Katalon Studio.

---

# Tech Stack

- Katalon Studio
- Groovy
- Appium
- Android Emulator / Real Device

---

# Project Structure

```bash
mobile-automation-assessment/
├── README.md
├── Test Cases/
│    ├── TC001_HomeScreen
│    ├── TC002_GuestAccess
│    ├── TC003_AccountInfo
│    ├── TC004_QuotaDetails
│    ├── TC005_Logout
│    ├── TC006_PackageCatalogue
│    ├── TC007_PackageFilter
│    └── TC008_OrderConfirmation
├── Object Repository/
├── Test Suites/
│    └── MobileTestSuite
├── Reports/
│    └── TestReport
├── Profiles/
│    └── default
├── Keywords/
│    └── helpers.groovy
└── Include/
```

---

# Test Scenarios

| Test Case ID | Scenario |
|---|---|
| TC001 | Verify Home Screen Display |
| TC002 | Verify Guest Access Functionality |
| TC003 | Verify Account Information |
| TC004 | Verify Quota Details |
| TC005 | Verify Logout Functionality |
| TC006 | Verify Package Catalogue |
| TC007 | Verify Package Filter |
| TC008 | Verify Order Confirmation |

---

# Prerequisites

Before running the automation test, ensure:

- Katalon Studio installed
- Appium installed and running
- Android SDK configured
- Android Emulator or physical device connected
- USB Debugging enabled (for real device)

---

# Installation

## Clone Repository

```bash
git clone https://github.com/nasrullahmubarak/mobile-automation-assessment.git
```

## Open Project

1. Open Katalon Studio
2. Click **Open Project**
3. Select folder `mobile-automation-assessment`

---

# Run Automation Test

## Run All Test Cases

1. Open Test Suite:
   ```bash
   Test Suites/MobileTestSuite
   ```

2. Click:
   ```bash
   Run > Android
   ```

---

# Execute Specific Test Case

Example:

```bash
Test Cases/TC001_HomeScreen
```

Run using:

```bash
Right Click > Run As > Android
```

---

# Reports

Automation reports generated automatically after execution.

Report location:

```bash
Reports/
```

Supported reports:
- HTML Report
- Log Report
- JUnit Report

---

# Environment Configuration

Configuration can be updated inside:

```bash
Profiles/default
```

Example:
- Device Name
- Platform Version
- App Package
- App Activity

---

# Helper Functions

Reusable helper methods stored inside:

```bash
Keywords/helpers.groovy
```

Example helper:
- Wait Element
- Swipe Action
- Tap By Coordinates
- Scroll To Text

---

# Expected Result

- All test cases passed successfully
- Automation report generated
- Mobile application functions validated properly

---

# Notes

- Ensure Appium server is active before execution
- Ensure device detected successfully by Katalon
- Update desired capabilities based on testing device
- Recommended Katalon version: Latest Stable Release

---

# Author

Nasrullah Mubarak
QA Automation Engineer
```
