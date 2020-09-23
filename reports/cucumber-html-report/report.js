$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureCRM.feature");
formatter.feature({
  "line": 1,
  "name": "validate crmsite functionality",
  "description": "",
  "id": "validate-crmsite-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login into site",
  "description": "",
  "id": "validate-crmsite-functionality;login-into-site",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "launch browser and get url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "to get title",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "enter username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "clcik login",
  "keyword": "Then "
});
formatter.match({
  "location": "CRMLoginTestSteps.launch_browser_and_get_url()"
});
formatter.result({
  "duration": 8859482400,
  "status": "passed"
});
formatter.match({
  "location": "CRMLoginTestSteps.to_get_title()"
});
formatter.result({
  "duration": 9832100,
  "status": "passed"
});
formatter.match({
  "location": "CRMLoginTestSteps.enter_username_and_password()"
});
formatter.result({
  "duration": 540409100,
  "status": "passed"
});
formatter.match({
  "location": "CRMLoginTestSteps.clcik_login()"
});
formatter.result({
  "duration": 70739200,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 8,
      "value": "#"
    },
    {
      "line": 9,
      "value": "#Scenario: CasesPage Validation"
    },
    {
      "line": 10,
      "value": "#When Clicking on navigation menu"
    },
    {
      "line": 11,
      "value": "#Then Click View drop down"
    },
    {
      "line": 12,
      "value": "#And Show Filters"
    },
    {
      "line": 13,
      "value": "#Then Click New"
    },
    {
      "line": 14,
      "value": "#Then Export"
    }
  ],
  "line": 16,
  "name": "DealPage Validation",
  "description": "",
  "id": "validate-crmsite-functionality;dealpage-validation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "Click on Deal Menu",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Click on pipeline",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Click on Navbuttons",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Click on New",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Enter Title and company name",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Choose closedate",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "save",
  "keyword": "Then "
});
formatter.match({
  "location": "DealsTest_steps.click_on_deal_menu()"
});
formatter.result({
  "duration": 2489567900,
  "status": "passed"
});
formatter.match({
  "location": "DealsTest_steps.click_on_pipeline()"
});
formatter.result({
  "duration": 651714900,
  "status": "passed"
});
formatter.match({
  "location": "DealsTest_steps.click_on_navbuttons()"
});
formatter.result({
  "duration": 298999900,
  "status": "passed"
});
formatter.match({
  "location": "DealsTest_steps.click_on_new()"
});
formatter.result({
  "duration": 212985400,
  "status": "passed"
});
formatter.match({
  "location": "DealsTest_steps.enter_title_and_company_name()"
});
formatter.result({
  "duration": 402029100,
  "status": "passed"
});
formatter.match({
  "location": "DealsTest_steps.choose_closedate()"
});
formatter.result({
  "duration": 986094300,
  "status": "passed"
});
formatter.match({
  "location": "DealsTest_steps.save()"
});
formatter.result({
  "duration": 30043150900,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027ui checked toggle checkbox\u0027]\"}\n  (Session info: chrome\u003d83.0.4103.116)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.7.0\u0027, revision: \u00272321c73\u0027, time: \u00272017-11-02T22:22:35.584Z\u0027\nSystem info: host: \u0027DESKTOP-674K7K6\u0027, ip: \u0027192.168.1.65\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.7\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\mohan\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:63071}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 7cd780f81ce7493ac6ff375d2214af70\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027ui checked toggle checkbox\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:370)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:472)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat com.PagesCRM.CRMDealsPage.save(CRMDealsPage.java:89)\r\n\tat com.stepDefinitionCRM.DealsTest_steps.save(DealsTest_steps.java:58)\r\n\tat ✽.Then save(FeatureCRM.feature:23)\r\n",
  "status": "failed"
});
});