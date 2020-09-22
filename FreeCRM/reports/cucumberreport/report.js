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
  "status": "passed"
});
formatter.step({
  "name": "select Assigned To, Type, Priority, Status",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitionCRM.CasesPageStepDefinition.select_Assigned_To_Type_Priority_Status()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input Deadline Date and Close Date",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitionCRM.CasesPageStepDefinition.input_Deadline_Date_and_Close_Date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Export",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitionCRM.CasesPageStepDefinition.export()"
});
formatter.result({
  "status": "passed"
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