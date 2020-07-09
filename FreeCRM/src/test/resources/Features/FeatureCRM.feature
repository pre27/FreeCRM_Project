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

Scenario: NewCasesPage Validation 
When Clicking on New
Then New page opens
Then Enter Title,Company,Description,Contact,Deal,Identifier
And select Assigned To, Type, Priority, Status
Then Click Save



