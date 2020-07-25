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
  "duration": 28690789800,
  "status": "passed"
});
formatter.match({
  "location": "CRMLoginTestSteps.to_get_title()"
});
formatter.result({
  "duration": 39448800,
  "status": "passed"
});
formatter.match({
  "location": "CRMLoginTestSteps.enter_username_and_password()"
});
formatter.result({
  "duration": 3862587600,
  "status": "passed"
});
formatter.match({
  "location": "CRMLoginTestSteps.clcik_login()"
});
formatter.result({
  "duration": 468143200,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "CasesPage Validation",
  "description": "",
  "id": "validate-crmsite-functionality;casespage-validation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "Clicking on navigation menu",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Click View drop down",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Show Filters",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click New",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Export",
  "keyword": "Then "
});
formatter.match({
  "location": "CasesPageStepDefinition.clicking_on_navigation_menu()"
});
formatter.result({
  "duration": 129500,
  "status": "passed"
});
formatter.match({
  "location": "CasesPageStepDefinition.click_view_drop_down()"
});
formatter.result({
  "duration": 40800,
  "status": "passed"
});
formatter.match({
  "location": "CasesPageStepDefinition.show_filters()"
});
formatter.result({
  "duration": 59400,
  "status": "passed"
});
formatter.match({
  "location": "CasesPageStepDefinition.click_new()"
});
formatter.result({
  "duration": 44900,
  "status": "passed"
});
formatter.match({
  "location": "CasesPageStepDefinition.export()"
});
formatter.result({
  "duration": 44900,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "ContactPage Validation",
  "description": "",
  "id": "validate-crmsite-functionality;contactpage-validation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "to select contact in dashboard",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "select new",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "enter firstname,lastname,email",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "select category",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "select status",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "select zone",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "select date",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "select month",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "select year",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "upload image",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "save the page",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "take screenshot",
  "keyword": "Then "
});
formatter.match({
  "location": "CRM_ContactsTestSteps.to_select_contact_in_dashboard()"
});
formatter.result({
  "duration": 32218196300,
  "status": "passed"
});
formatter.match({
  "location": "CRM_ContactsTestSteps.select_new()"
});
formatter.result({
  "duration": 12275123500,
  "status": "passed"
});
formatter.match({
  "location": "CRM_ContactsTestSteps.enter_firstname_lastname_email()"
});
formatter.result({
  "duration": 4609988800,
  "status": "passed"
});
formatter.match({
  "location": "CRM_ContactsTestSteps.select_category()"
});
formatter.result({
  "duration": 1418372800,
  "status": "passed"
});
formatter.match({
  "location": "CRM_ContactsTestSteps.select_status()"
});
formatter.result({
  "duration": 1554112100,
  "status": "passed"
});
formatter.match({
  "location": "CRM_ContactsTestSteps.select_zone()"
});
formatter.result({
  "duration": 1256508500,
  "status": "passed"
});
formatter.match({
  "location": "CRM_ContactsTestSteps.select_date()"
});
formatter.result({
  "duration": 763779100,
  "status": "passed"
});
formatter.match({
  "location": "CRM_ContactsTestSteps.select_month()"
});
formatter.result({
  "duration": 741108700,
  "status": "passed"
});
formatter.match({
  "location": "CRM_ContactsTestSteps.select_year()"
});
formatter.result({
  "duration": 746021400,
  "status": "passed"
});
formatter.match({
  "location": "CRM_ContactsTestSteps.upload_image()"
});
formatter.result({
  "duration": 1204272400,
  "status": "passed"
});
formatter.match({
  "location": "CRM_ContactsTestSteps.save_the_page()"
});
formatter.result({
  "duration": 5657253000,
  "status": "passed"
});
formatter.match({
  "location": "CRM_ContactsTestSteps.take_screenshot()"
});
formatter.result({
  "duration": 984963100,
  "status": "passed"
});
});