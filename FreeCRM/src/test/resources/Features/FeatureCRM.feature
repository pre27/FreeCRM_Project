Feature: validate crmsite functionality

Scenario: Login into site
Given launch browser and get url
When to get title
Then enter username and password
Then clcik login

Scenario: CasesPage Validation
When Clicking on navigation menu
Then Click View drop down 
And Show Filters
Then Click New
Then Export  
