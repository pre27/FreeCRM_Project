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
});