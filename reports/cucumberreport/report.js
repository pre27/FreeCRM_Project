$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/FeatureCRM.feature");
formatter.feature({
  "name": "validate crmsite functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login into site",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "launch browser and get url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinitionCRM.CRMLoginTestSteps.launch_browser_and_get_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to get title",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinitionCRM.CRMLoginTestSteps.to_get_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitionCRM.CRMLoginTestSteps.enter_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clcik login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitionCRM.CRMLoginTestSteps.clcik_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "DealPage Validation",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Click on Deal Menu",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinitionCRM.DealsTest_steps.click_on_deal_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on pipeline",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitionCRM.DealsTest_steps.click_on_pipeline()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Navbuttons",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitionCRM.DealsTest_steps.click_on_navbuttons()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on New",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitionCRM.DealsTest_steps.click_on_new()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Title and company name",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitionCRM.DealsTest_steps.enter_title_and_company_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Choose closedate",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitionCRM.DealsTest_steps.choose_closedate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "save",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitionCRM.DealsTest_steps.save()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "CasesPage Validation",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Clicking on navigation menu",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinitionCRM.CasesPageStepDefinition.clicking_on_navigation_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click View drop down",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitionCRM.CasesPageStepDefinition.click_view_drop_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Show Filters",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitionCRM.CasesPageStepDefinition.show_filters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click New",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitionCRM.CasesPageStepDefinition.click_new()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "NewCasesPage Validation",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Enter Title,Company,Description,Contact,Deal,Identifier,Tags",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitionCRM.CasesPageStepDefinition.enter_Title_Company_Description_Contact_Deal_Identifier_Tags()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"*[name\u003d\u0027title\u0027]\"}\n  (Session info: chrome\u003d86.0.4240.111)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-674K7K6\u0027, ip: \u0027192.168.1.65\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.7\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.111, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\mohan\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:57150}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: aba2ee3f0aeb3d537d4f24dc3e34ee90\n*** Element info: {Using\u003dname, value\u003dtitle}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:404)\r\n\tat org.openqa.selenium.By$ByName.findElement(By.java:284)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.sendKeys(Unknown Source)\r\n\tat com.PagesCRM.NewCases.enter_Title_Company_Description_Contact_Deal_Identifier_Tags(NewCases.java:74)\r\n\tat com.stepDefinitionCRM.CasesPageStepDefinition.enter_Title_Company_Description_Contact_Deal_Identifier_Tags(CasesPageStepDefinition.java:54)\r\n\tat ✽.Enter Title,Company,Description,Contact,Deal,Identifier,Tags(file:///C:/Users/mohan/git/FreeCRM_Project/src/test/resources/Features/FeatureCRM.feature:35)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "select Assigned To, Type, Priority, Status",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitionCRM.CasesPageStepDefinition.select_Assigned_To_Type_Priority_Status()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Input Deadline Date and Close Date",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitionCRM.CasesPageStepDefinition.input_Deadline_Date_and_Close_Date()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Export",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitionCRM.CasesPageStepDefinition.export()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Create New Campaign",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Logged in",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinitionCRM.NewCampaignLoginSteps.logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicking on Campagign menu",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinitionCRM.NewCampaignLoginSteps.clicking_on_Campagign_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click New Campaign",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitionCRM.NewCampaignLoginSteps.click_New_Campaign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter details",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitionCRM.NewCampaignLoginSteps.enter_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Save",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitionCRM.NewCampaignLoginSteps.click_Save()"
});
formatter.result({
  "status": "passed"
});
});